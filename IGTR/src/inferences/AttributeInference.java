package inferences;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Scanner;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.ExecuteException;
import org.apache.commons.io.FileUtils;

import com.sun.rowset.CachedRowSetImpl;

import daikon.Daikon;
import daikon.DaikonSimple;


public class AttributeInference {


	private String strPathDirectory=null;
	private String charSeparator = String.valueOf(((char)007));


	public AttributeInference(){

		this.strPathDirectory= new File("").getAbsolutePath() + 
				File.separator + "Perl" + File.separator + "DaikonOutput" + File.separator;		
	}


	public void commit(){
		this.generateCSVToBeUsedByPerl();
		this.generateCSVforNAC();
		this.exeDaikon();
		this.storeDaikonOutputBackToDB();
	}





	/**
	 * generate CSV to be used by Perl for only maximal rules
	 * generate CSV for NAC instances
	 * Print CVS row
	 * Print CVS NAC row
	 * Get paremeters and return
	 * Check int attrintue type
	 * run Perl to convert CVS to Daikon input
	 * delete generated files if something goes wrong 	 
	 * */


	private void generateCSVToBeUsedByPerl(){


		// clear directory
		try {
			FileUtils.cleanDirectory(new File(this.strPathDirectory));
		} catch (IOException e1) {			
			e1.printStackTrace();
		}


		// open connection
		DBRecord.openConnection();



		// get all abstract rule attributes based on mapped abstract node IDs	
		System.out.println("preparing all abstract rule attributes based on mapped abstract node IDs ..");		



		// get all abstract rules that [isAbstract=true] ...		
		CachedRowSetImpl crsAllAbstractRule= DBRecord.getByQueryStatement(
				"select Observation_IDREFF, RuleName from TblBasicRule "
						+ "where isAbstract=true and isApplicable=true and hasEffect=true "
						+ "and Observation_IDREFF NOT IN "
						+ "	(select Observation_ID from TblObservationOutput "
						+ "	 where RuleAttributeConditions is not null "
						+ "	   and RuleAttributeConditions <>'') "
						+ "order by Observation_IDREFF ;", true);

		try {

			while (crsAllAbstractRule.next()){

				String csvPath = strPathDirectory + 
						crsAllAbstractRule.getInt(1) + "_" +
						crsAllAbstractRule.getString(2) + ".csv";


				PrintWriter csvWriter = new PrintWriter(csvPath, "UTF-8");								

				if (!this.printCVSLines(
						crsAllAbstractRule.getInt(1), 
						crsAllAbstractRule.getString(2), 
						csvWriter)){

					csvWriter.close();

					new File(csvPath).delete();

					System.out.println(
							"Deleting an empty (*.csv) file : " + 
									crsAllAbstractRule.getInt(1) + "_" +
									crsAllAbstractRule.getString(2) + ".csv");

					continue;
				}


				csvWriter.close();


				if (!this.convertCVStoDaikonInput(csvPath)){
					// delete csv file as well as all daikon files
					this.deleteGeneratedFiles(
							crsAllAbstractRule.getInt(1) + "_" +
									crsAllAbstractRule.getString(2));
				}

			}			

		}
		catch (SQLException | IOException e) {		
			e.printStackTrace();
			return ;
		}



		System.out.println("Generating CSVs for all maximal rules completed");		

	}


	private void generateCSVforNAC(){


		System.out.println("preparing to generat CSVs for all NACs instances..");		


		// get all NACs that [isApplicable=false ..]		
		CachedRowSetImpl crsAllNACs= DBRecord.getByQueryStatement(
				"select Observation_IDREFF, RuleName, parentRuleId from TblBasicRule "
						+ "where isApplicable=false and hasEffect=false "
						+ "and parentRuleId>0 "
						+ "and Observation_IDREFF NOT IN "
						+ "	(select Observation_ID from TblObservationOutput "
						+ "	 where RuleAttributeConditions is not null "
						+ "	   and RuleAttributeConditions <>'') "
						+ "order by Observation_IDREFF ;", true);

		try {

			while (crsAllNACs.next()){

				String csvPath = strPathDirectory + 
						crsAllNACs.getInt(1) + "_" +
						crsAllNACs.getString(2) + ".csv";


				PrintWriter csvWriter = new PrintWriter(csvPath, "UTF-8");								

				if (!this.printCVSNACLines(
						crsAllNACs.getInt(1),
						crsAllNACs.getInt(3),
						crsAllNACs.getString(2), 
						csvWriter)){

					csvWriter.close();

					new File(csvPath).delete();

					System.out.println(
							"Deleting an empty (*.csv) file : " + 
									crsAllNACs.getInt(1) + "_" +
									crsAllNACs.getString(2) + ".csv");

					continue;
				}


				csvWriter.close();


				if (!this.convertCVStoDaikonInput(csvPath)){
					// delete csv file as well as all daikon files
					this.deleteGeneratedFiles(
							crsAllNACs.getInt(1) + "_" +
									crsAllNACs.getString(2));
				}

			}			

		}
		catch (SQLException | IOException e) {		
			e.printStackTrace();
		}




		// close connection		
		DBRecord.closeConnection();
		
		System.out.println("Generating CSVs for all NACs instances completed");		

	}


	private boolean printCVSLines(int O_ID, String strMethodName , PrintWriter csvWriter){

		System.out.println(" ------------- " + O_ID + " " + strMethodName + " ----------------");



		// [1] set CVS column headers 
		CachedRowSetImpl crsAllAttributeInstances= DBRecord.getByQueryStatement(
				" select "+
						"	AbstractID, " +
						"	concat(AbstractID," +
						"		if(graphType = false, '_Pre_', '_Post_')," + 
						" 		AttributeName) as Att" +
						" from" +
						"	TblGraph inner join TblNode ON TblGraph.GraphID = TblNode.Graph_IDREFF" +
						"   inner join  TblNodeAttributes ON (TblNode.Graph_IDREFF = TblNodeAttributes.Graph_IDREFF"+
						"   	and TblNode.nodeID = TblNodeAttributes.node_IDREFF) "+
						" where isObjectRelation=false and " + 
						" MappedAbstractID is not null and " +
						" isToBeDeleted is null and " +
						" Observation_IDREFF =" + O_ID +				
						" order by Observation_IDREFF , graphType , AbstractID , AttributeName", true);

		try {


			String strAbstractIDs="";
			String strHeaderLine="";



			// create header line
			while (crsAllAttributeInstances.next()){				
				strAbstractIDs +=",'" + crsAllAttributeInstances.getString(1) + "'";
				strHeaderLine +="," + crsAllAttributeInstances.getString(2);
			}



			// check if header is being filled out
			if (strHeaderLine.length()==0 || strAbstractIDs.length()==0){
				return false;
			}



			//----------------------------------
			// add headers for passed parameters and return (if any) 
			strHeaderLine +=this.getPassedParemetersAndReturn(O_ID, true);




			// print header --------------------
			csvWriter.println(strHeaderLine.substring(1));





			// [2] get values of all attributes instances that are IN [strAbstractIDs]	
			// 	   set initial value for observation id		
			O_ID=-1; 		
			String strInstanceLine="";

			crsAllAttributeInstances= DBRecord.getByQueryStatement(
					"select Observation_IDREFF, AttributeValue "
							+ "from "
							+ "    TblGraph "
							+ "        inner join "
							+ "    TblNode ON TblGraph.GraphID = TblNode.Graph_IDREFF "
							+ "        inner join "
							+ "    TblNodeAttributes ON (TblNode.Graph_IDREFF = TblNodeAttributes.Graph_IDREFF "
							+ "        and TblNode.nodeID = TblNodeAttributes.node_IDREFF) "
							+ "where isObjectRelation=false and "
							+ "MappedAbstractID is not null and "
							+ "isToBeDeleted is null and "
							+ "MappedAbstractID in (" + strAbstractIDs.substring(1) + ") "
							+ "order by Observation_IDREFF , graphType , MappedAbstractID , AttributeName", true);


			while (crsAllAttributeInstances.next()){


				// check to separate and then create new row in CSV 
				if (crsAllAttributeInstances.getInt(1)!=O_ID){

					System.out.println("   Observation ID: " + crsAllAttributeInstances.getInt(1));


					// print out valid line
					if (strInstanceLine.length()!=0){	

						// add values for passed parameters and return (if any) 
						strInstanceLine +=this.getPassedParemetersAndReturn(O_ID, false);						
						csvWriter.println(strInstanceLine.substring(1));
					}


					strInstanceLine="";
					O_ID=crsAllAttributeInstances.getInt(1);
				}

				strInstanceLine +="," + this.strCheckIntType(crsAllAttributeInstances.getString(2));
			}




			// print out last line if it's valid
			if (strInstanceLine.length()!=0){	

				// add values for passed parameters and return (if any) 
				strInstanceLine +=this.getPassedParemetersAndReturn(O_ID, false);						
				csvWriter.println(strInstanceLine.substring(1));
			}

		}
		catch (SQLException e) {		
			e.printStackTrace();			
		}


		System.out.println();
		return true;
	}

	
	private boolean printCVSNACLines(int iNAC_ID, int iInstance_ID,  String strMethodName , PrintWriter csvWriter){
		

		System.out.println(" ------------- NAC: " + iNAC_ID + " " + strMethodName + " - with rule instance: " + iInstance_ID);



		// CVS column header with only a single row 
		// NAC attributes with only LHS instance ..
		CachedRowSetImpl crsAllNACAttributewithInstances= DBRecord.getByQueryStatement(
				" (select concat(nodeID, '_', nodeType, '_', AttributeName) as sHeader, "
				+ "		 	AttributeValue as sValue, 0 "
				+ "		from TblGraph  inner join TblNode ON TblGraph.GraphID = TblNode.Graph_IDREFF "
				+ "			inner join TblNodeAttributes ON (TblNode.Graph_IDREFF = TblNodeAttributes.Graph_IDREFF"
				+ " 		and TblNode.nodeID = TblNodeAttributes.node_IDREFF) "
				+ "		where Observation_IDREFF =" + iNAC_ID
				+ "		and graphType=0 "
				+ "		and isUnnecessaryContext=false "
				+ "		order by nodeType , nodeID, AttributeName) "
								
				+ " union all "
				
				+ "(select concat(MappedAbstractID, if(graphType = false, '_Pre_', '_Post_'), AttributeName) as sHeader, "
				+ "		 	AttributeValue as sValue, 1 "
				+ "		from TblGraph  inner join TblNode ON TblGraph.GraphID = TblNode.Graph_IDREFF "
				+ "			inner join TblNodeAttributes ON (TblNode.Graph_IDREFF = TblNodeAttributes.Graph_IDREFF"
				+ " 		and TblNode.nodeID = TblNodeAttributes.node_IDREFF) "
				+ "		where Observation_IDREFF =" + iInstance_ID
				+ "		and MappedAbstractID is not null "
				+ "		and isToBeDeleted is null"
				+ "		and isUnnecessaryContext=false"
				+ "		order by nodeType , nodeID, AttributeName);", true);

		try {


			boolean isInstanceAttributeExists=false;
			boolean isNacAtt=false;
			boolean isPreInsAtt=false;
			
			String strHeaderLine="";
			String strValues="";
			
			
			// create header and strValues lines
			while (crsAllNACAttributewithInstances.next()){				
				
				strHeaderLine +="," + crsAllNACAttributewithInstances.getString(1);
				strValues +="," + this.strCheckIntType(crsAllNACAttributewithInstances.getString(2));
				
				if (!isInstanceAttributeExists){
					
					if (isNacAtt && isPreInsAtt){
						isInstanceAttributeExists=true;
						continue;
					}
					
					if (crsAllNACAttributewithInstances.getInt(3)==0){
						isNacAtt=true;
					}
					if (crsAllNACAttributewithInstances.getInt(3)==1){
						isPreInsAtt=true;
					}
				}
			}


			
			// confirm the existence of (NAC and LHS instance) attributes ..
			if (!isInstanceAttributeExists){
				return false;
			}
			
			
			
			// print header and values --------------------
			csvWriter.println(strHeaderLine.substring(1));
			csvWriter.println(strValues.substring(1));


		}
		catch (SQLException e) {		
			e.printStackTrace();			
		}

		
		return true;
	}
	

	private String getPassedParemetersAndReturn(int iObservationID, boolean isHeader){

		String strPassedAndReturn="";

		CachedRowSetImpl crsStrReturn= DBRecord.getByQueryStatement(
				"select RuleParameters from TblObservationOutput "
						+ "where Observation_ID=" + iObservationID, true);

		try {

			if (crsStrReturn.next()){

				String[] arrayPassedAndReturn = crsStrReturn.getString(1).split(this.charSeparator);

				for (int i=0; i<arrayPassedAndReturn.length; i++){

					int iEqualIndex= arrayPassedAndReturn[i].lastIndexOf("=");

					if (iEqualIndex<=0){
						return "";
					}


					String strHolder="";

					// to return headers					
					if (isHeader){

						strHolder = arrayPassedAndReturn[i].substring(0, iEqualIndex).trim();

						// to remove type from header
						iEqualIndex= strHolder.lastIndexOf(" ");
						if (iEqualIndex>0){
							strHolder= strHolder.substring(iEqualIndex).trim();
						}

						// to numerate parameters indexes						
						//if (!strHolder.toLowerCase().contains("return")){
						//	strHolder +="_Par" + (i+1);
						//}

					}

					// to return values	
					else {

						strHolder = arrayPassedAndReturn[i].substring(iEqualIndex+1).trim();						
						if (strHolder.startsWith("[") || 
								strHolder.endsWith("]")){
							strHolder="objectRef[]";
						}
						else if (strHolder.contains("@")){
							strHolder="objectRef";
						}
					}


					// collect set of holders values
					strPassedAndReturn +="," + strHolder;


					// break from return list of references
					if (arrayPassedAndReturn[i].toLowerCase().contains("return = ")){
						break;
					}

				}

			}


			return strPassedAndReturn;

		}
		catch (SQLException e) {		
			e.printStackTrace();
			return strPassedAndReturn;
		}

	}


	private String strCheckIntType(String strAttributeValue){

		strAttributeValue=strAttributeValue.trim().replace(",", ";");

		if (strAttributeValue.length()>3){

			boolean isNumeric=true;
			char chars[] = strAttributeValue.toCharArray();

			for(int i=0; i<chars.length; i++){

				if (!Character.isDigit(chars[i])){
					isNumeric=false;
					break;
				}
			}

			if (isNumeric){
				strAttributeValue = strAttributeValue+ "_";
			}
		}

		return strAttributeValue;
	}


	private boolean convertCVStoDaikonInput(String csvPath) throws ExecuteException, IOException {

		CommandLine cmdLine = new CommandLine("perl");
		cmdLine.addArgument(new File("").getAbsolutePath() +  File.separator + "Perl" + File.separator + "convertcsv.pl ");
		cmdLine.addArgument(csvPath);

		DefaultExecutor executor = new DefaultExecutor();
		//executor.setExitValue(1);

		if(executor.execute(cmdLine) == 0)
		{
			System.out.println("Perl-command successful");
			return true;
		}
		else
		{
			System.out.println("Perl-command failure");
			return false;			
		}
	}


	private void deleteGeneratedFiles(String ruleName){


		try {

			// csv file
			File file = new File(this.strPathDirectory + ruleName + ".csv");			
			if(file.delete()){
				System.out.println("deleting " + ruleName + ".csv !");
			}
			else if(file.exists()){
				System.out.println("deleting " + ruleName + ".csv is failed.");
			}



			// daikon decls file
			file = new File(this.strPathDirectory + ruleName + ".decls");			
			if(file.delete()){
				System.out.println("deleting " + ruleName + ".decls !");
			}
			else if(file.exists()){
				System.out.println("deleting " + ruleName + ".decls is failed.");
			}



			// daikon dtrace
			file = new File(this.strPathDirectory + ruleName + ".dtrace");			
			if(file.delete()){
				System.out.println("deleting " + ruleName + ".dtrace !");
			}
			else if(file.exists()){
				System.out.println("deleting " + ruleName + ".dtrace is failed.");
			}


		}
		catch(Exception e){
			e.printStackTrace();
		}
	}


















	/** 
	 * 	Executing daikon engine exeDaikon() 
	 * 	Recording daikon output in DB  ..
	 * 	Gget Observation Id
	 * 	Check Daikon output
	 * 
	 * */


	private void exeDaikon(){

		System.out.println("\n -----------------------------");
		System.out.println("Executing daikon engine ..");

		File folderDirectory = new File(this.strPathDirectory);
		File[] listOfFiles = folderDirectory.listFiles();

		for (int i = 0; i < listOfFiles.length; i++) {

			if (listOfFiles[i].isFile() && listOfFiles[i].getName().endsWith(".csv")) {


				String strDaikonCommand= listOfFiles[i].getName();
				strDaikonCommand=  strDaikonCommand.substring(0,strDaikonCommand.length()-4);




				// check if daikon already generate archive rule.inv file
				if (!new File(this.strPathDirectory + strDaikonCommand + ".dtrace").exists()){
					System.out.println("Error: missing daikon file [" + strDaikonCommand + ".dtrace]");	
					continue;
				}



				// run Daikon JAR
				try {

					ProcessBuilder builder = new ProcessBuilder(
							"java", "-classpath",
							new File("daikon.jar").getAbsolutePath(),
							"daikon.Daikon", 
							"--nohierarchy", 
							//"--suppress_redundant",
							//"--config=" + new File("DaikonSettings.txt").getAbsolutePath(),
							"--format=Daikon", // other available format are : Java, JML, DBC, ESC..
							"--conf_limit=0.99",							
							strDaikonCommand + ".decls",
							strDaikonCommand + ".dtrace");

					builder.directory(new File(this.strPathDirectory));
					builder.redirectErrorStream(true);

					Process p = builder.start();
					BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));


					PrintWriter writeDaikonOutput = new PrintWriter(this.strPathDirectory + strDaikonCommand + "_DaikonOutput.txt", "UTF-8");


					String line;
					while (true) {
						line = r.readLine();
						if (line == null) { break; }

						writeDaikonOutput.println(line);
						System.out.println(line);
					}

					p.waitFor();
					if(p.exitValue() == 0)
					{
						System.out.println("Daikon-command [" + strDaikonCommand + "] successful");						
					}
					else
					{
						System.out.println("Daikon-command [" + strDaikonCommand + "] failure");
					}
					writeDaikonOutput.close();

				} 
				catch (IOException | InterruptedException e) {

					e.printStackTrace();
					System.out.println("Daikon-command [" + strDaikonCommand + "] failure");
				}

			}


		}

	}


	private void storeDaikonOutputBackToDB(){


		System.out.println("\n -----------------------------");
		System.out.println("Recording daikon output in DB  ..");


		// open connection
		DBRecord.openConnection();


		File folderDirectory = new File(this.strPathDirectory);
		File[] listOfFiles = folderDirectory.listFiles();

		for (int i = 0; i < listOfFiles.length; i++) {

			if (listOfFiles[i].isFile() && listOfFiles[i].getName().endsWith(".txt")) {

				String strRuleAttributesConditions= listOfFiles[i].getName();	
				int iIndexAndObservationId= strRuleAttributesConditions.indexOf("_");

				if (iIndexAndObservationId<=0){
					continue;
				}

				iIndexAndObservationId= this.getParsedObservationId(
						strRuleAttributesConditions.substring(0, iIndexAndObservationId).trim());

				strRuleAttributesConditions = "";
				try {

					Scanner FileRead = new Scanner(new FileReader(listOfFiles[i].getAbsolutePath()));
					boolean isDaikonMeta=true;
					while (FileRead.hasNextLine()) 
					{

						String strLine= FileRead.nextLine();

						if (!isDaikonMeta){
							strRuleAttributesConditions +=this.strCheckDaikonLineOutput(strLine);
						}

						if (strLine.startsWith("================")){
							isDaikonMeta=false;
						}
					}

					FileRead.close();					

				} 
				catch (FileNotFoundException e) {
					e.printStackTrace();
					System.out.println(listOfFiles[i].getName().replace(".txt", "") + " - recording failed");
					continue;
				}



				// store in DB
				DBRecord.updateLearnedRuleAttributes(
						iIndexAndObservationId, 
						strRuleAttributesConditions, 
						true);


				System.out.println(listOfFiles[i].getName().replace(".txt", "") + " - recording successful");
			}

		}


		// close connection		
		DBRecord.closeConnection();


		System.out.println("\n\n ----------------------------- \n finish learning rule attribute conditions.");

	}


	private int getParsedObservationId(String strObservationId){

		try {
			return Integer.parseInt(strObservationId);
		}
		catch (Exception e) {
			return -1;
		}

	}


	private String strCheckDaikonLineOutput(String strDaikonLine){

		strDaikonLine=strDaikonLine.trim();


		if (strDaikonLine.length()<1 ||
				strDaikonLine.startsWith("aprogram.point:::") ||
				strDaikonLine.startsWith("Exiting Daikon")){
			return "";
		}



		strDaikonLine += System.lineSeparator();


		return strDaikonLine;
	}

}
