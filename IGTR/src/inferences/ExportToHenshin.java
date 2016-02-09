package inferences;

import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.commons.codec.digest.DigestUtils;

import com.sun.rowset.CachedRowSetImpl;

public class ExportToHenshin {

	private String ecoreName=null;
	private String encryptedXmiId= this.getEncryptedXmiId();
	
	private PrintWriter henshinWriter=null;	
	private ArrayList<String> attributeConstraints= new ArrayList<String>();


	public boolean exportHenshinModel(String strLocation, String ecoreFileName) throws Exception{


		// get all abstract rule attributes based on mapped abstract node IDs	
		System.out.println("preparing all abstract rules for exporting to Henshin tool ..");				
		this.ecoreName=ecoreFileName;
		this.henshinWriter = new PrintWriter(strLocation, "UTF-8");



		this.printHeaderAndFooterFile(true);



		// get all abstract rules that [isAbstract=true] ...		
		CachedRowSetImpl crsAllAbstractRule= DBRecord.getByQueryStatement(
				"select RuleName, Observation_IDREFF from TblBasicRule "
						+ "where isAbstract=true and isApplicable=true;");

		try {

			while (crsAllAbstractRule.next()){

				this.printRule(crsAllAbstractRule.getString(1), crsAllAbstractRule.getInt(2));

			}			

		}
		catch (SQLException e) {		
			e.printStackTrace();
			return false;
		}




		this.printHeaderAndFooterFile(false);
		this.henshinWriter.close();



		// get all abstract rule attributes based on mapped abstract node IDs	
		System.out.println("Generating henshin file completed");		




		return true;
	}





	private void printHeaderAndFooterFile(boolean isHeader){

		if (isHeader){
			this.henshinWriter.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + System.lineSeparator());
			this.henshinWriter.write("<henshin:Module xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:ecore=\"http://www.eclipse.org/emf/2002/Ecore\"  xmlns:henshin=\"http://www.eclipse.org/emf/2011/Henshin\" xmi:id=\"_qWu8UPNUEeS14" + this.encryptedXmiId + "\">" + System.lineSeparator());
			this.henshinWriter.write("<imports href=\"" + this.ecoreName + ".ecore#/\"/>" + System.lineSeparator());
		}
		else {
			this.henshinWriter.write("</henshin:Module>" + System.lineSeparator());
		}
	}



	private void printRule(String ruleName, int iObservation){

		System.out.println(ruleName + " " + iObservation);
		//this.printAttributeConstants(iObservation);

		this.henshinWriter.write("<units xsi:type=\"henshin:Rule\" xmi:id=\"_X" + iObservation + "" + this.encryptedXmiId + "\" name=\"" + iObservation + "_" + ruleName + "\">" + System.lineSeparator());

		this.printRuleParameters(iObservation);


		int iLHSGraphID=-1;
		int iRHSGraphID=-1;

		CachedRowSetImpl crsGraphsIDAndRuleName = DBRecord.getByQueryStatement(
				"select graphType, GraphID  from TblGraph  "
						+ "where Observation_IDREFF=" + iObservation + ";");

		try {

			while (crsGraphsIDAndRuleName.next()){

				if (!crsGraphsIDAndRuleName.getBoolean(1)){						
					iLHSGraphID = crsGraphsIDAndRuleName.getInt(2);						
				}
				else{	

					iRHSGraphID = crsGraphsIDAndRuleName.getInt(2);
				}
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}


		this.printNodesWithAttributes(new GraphT(iLHSGraphID, true, false, true), false);

		this.printNodesWithAttributes(new GraphT(iRHSGraphID, true, false, true), true);

		this.henshinWriter.write("</units>" + System.lineSeparator());
	}







	private void printRuleParameters(int iObservation){

		System.out.println("\t printing rule parameters .." );


		String[] listOfParameters =null;
		CachedRowSetImpl crsRuleParameters = DBRecord.getByQueryStatement(
				"select RuleParameters from TblObservationOutput  "
						+ "where Observation_ID=" + iObservation + " and RuleParameters <>'';");

		try {
			if (crsRuleParameters.next()){
				listOfParameters=crsRuleParameters.getString(1).split(",");				
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}



		if (listOfParameters==null){
			return;			
		}	


		for (int i=0; i<listOfParameters.length; i++){

			int iEqualIndex= listOfParameters[i].indexOf("=");

			if (iEqualIndex==-1 || listOfParameters[i].toLowerCase().contains("return")){
				continue;
			}

			String[] par= listOfParameters[i].substring(0, iEqualIndex).trim().split(" ");

			if (par.length!=2){
				System.out.println("\t\tSkipping parameter " + listOfParameters[i]);
				continue;
			}



			//	par[1]
			this.henshinWriter.write("	<parameters xmi:id=\"_XF7_P" + i + "" + iObservation + "" + this.encryptedXmiId + "\" name=\"Par" + (i+1)  + "\"/>" + System.lineSeparator());
			/*
			par[0]=par[0].trim();

			if (par[0].equalsIgnoreCase("int")){
				this.henshinWriter.write("		<type xsi:type=\"ecore:EDataType\" href=\"http://www.eclipse.org/emf/2002/Ecore#//EInt\"/>" + System.lineSeparator());
			}
			else if (par[0].equalsIgnoreCase("string")){
				this.henshinWriter.write("		<type xsi:type=\"ecore:EDataType\" href=\"http://www.eclipse.org/emf/2002/Ecore#//EString\"/>" + System.lineSeparator());
			}
			else if (par[0].toLowerCase().contains(("xmlelement"))){				
				this.henshinWriter.write("		<type xsi:type=\"ecore:EClass\" href=\"" + this.ecoreName + ".ecore#//XMLElement\"/>" + System.lineSeparator());
			}
			else {
				System.out.println("\t\tundefined parameter type in eCore " + par[0]);
			}

			this.henshinWriter.write("	</parameters>" + System.lineSeparator());
 			*/
		}

	}






	private void printNodesWithAttributes(GraphT lrhs, boolean isRHS){

		System.out.println("\t node and attributes for side .. " + isRHS);
		String side="";

		// opening tage
		if (isRHS){
			this.henshinWriter.write("<rhs xmi:id=\"_XR" + lrhs.graphID + "" + this.encryptedXmiId + "\" name=\"RHS\">" + System.lineSeparator());
			side="R";
		}
		else {
			this.henshinWriter.write("<lhs xmi:id=\"_XL" + lrhs.graphID + "" + this.encryptedXmiId + "\" name=\"LHS\">" + System.lineSeparator());
			side="L";
		}




		// print nodes		
		for (int i=0; i<lrhs.gNodes.size(); i++){

			GNode printNode = lrhs.gNodes.get(i);

			String incomingOutgoingEdges=this.getIncomingOutgoingConnectedEdges(printNode, lrhs);

			String nodeIdName="";
			if (printNode.iParameterIndex>0){
				nodeIdName=" name=\"Par" + printNode.iParameterIndex + "\"";
			}
			

			this.henshinWriter.write("      <nodes xmi:id=\"_" + side + printNode.nodeID + "" + this.encryptedXmiId + "\"" + nodeIdName + incomingOutgoingEdges + ">" + System.lineSeparator());


			if (printNode.nodeType.trim().equalsIgnoreCase("XMLElement")){
				this.henshinWriter.write("        <type href=\"" + this.ecoreName + ".ecore#//XMLElement\"/>" + System.lineSeparator());
			}
			else if (printNode.nodeType.trim().equalsIgnoreCase("Vector")){
				this.henshinWriter.write("        <type href=\"" + this.ecoreName + ".ecore#//Vector\"/>" + System.lineSeparator());
			}
			else if (printNode.nodeType.trim().equalsIgnoreCase("XMLAttribute")){
				this.henshinWriter.write("        <type href=\"" + this.ecoreName + ".ecore#//XMLAttribute\"/>" + System.lineSeparator());
			}
			else {
				System.out.println("\t\t Error undefined node type in eCore " + printNode.nodeID + " and type is " + printNode.nodeType);
			}


			// print attributes
			//this.printNodesAttributes(printNode);


			this.henshinWriter.write("      </nodes>" + System.lineSeparator());
		}




		// print edges		
		for (int i=0; i<lrhs.gEdges.size(); i++){

			GEdge printEdge = lrhs.gEdges.get(i);

			this.henshinWriter.write("      <edges xmi:id=\"_edg" + lrhs.graphID + "" + i + "" + this.encryptedXmiId + "\" source=\"_" + side + printEdge.sourceID + "" + this.encryptedXmiId + "\" target=\"_" + side + printEdge.targetID + "" + this.encryptedXmiId + "\">" + System.lineSeparator());
			
			
			String edgeType=printEdge.sourceTargetType.trim();
			
						
			if (edgeType.equalsIgnoreCase("Vector_XMLElement")){
				edgeType="Vector/children";
			} 
			else if (edgeType.equalsIgnoreCase("Vector_XMLAttribute")){
				edgeType="Vector/attributes";
			}
			else if (edgeType.equalsIgnoreCase("XMLElement_XMLElement")){
				edgeType="XMLElement/parent";
			}
			else if (edgeType.equalsIgnoreCase("XMLElement_Vector")){
				edgeType = printEdge.edgeType.toLowerCase().trim();
				if (edgeType.startsWith("chi")){
					edgeType="XMLElement/children";
				}
				else if (edgeType.startsWith("att")){
					edgeType="XMLElement/attributes";
				}
			}
			
			
			
			this.henshinWriter.write("      	<type href=\"" + this.ecoreName + ".ecore#//" + edgeType + "\"/>" + System.lineSeparator());
			this.henshinWriter.write("      </edges>" + System.lineSeparator());

		}






		// closing tage
		if (isRHS){
			this.henshinWriter.write("</rhs>" + System.lineSeparator());
			this.printNodesMappings(lrhs);
		}
		else {
			this.henshinWriter.write("</lhs>" + System.lineSeparator());
		}

	}


	private String getIncomingOutgoingConnectedEdges(GNode gNode, GraphT lrhs){

		//incoming="_XHCLQH_5EeKZZICbS5P5TQ" outgoing="_XHCyUH_5EeKZZICbS5P5TQ"
		// \"_edg" + lrhs.graphID + "" + i + "" + this.encryptedXmiId + "\"
		
		
		String incoming="";
		String outgoing="";
		
		for (int i=0; i<lrhs.gEdges.size(); i++){

			GEdge printEdge = lrhs.gEdges.get(i);
			
			String edgeID= "_edg" + lrhs.graphID + "" + i + "" + this.encryptedXmiId;			
			
			if (gNode.nodeID.equalsIgnoreCase(printEdge.targetID)){
				incoming+= edgeID + " ";
			}
			
			if (gNode.nodeID.equalsIgnoreCase(printEdge.sourceID)){
				outgoing+= edgeID + " ";
			}
		}
		
		if (incoming.length()!=0){
			incoming = "incoming=\"" + incoming.trim() + "\"";
		}
		
		if (outgoing.length()!=0){
			outgoing = "outgoing=\"" + outgoing.trim() + "\"";
		}
		
		
		incoming = " " + incoming + " " + outgoing;
		
		if (incoming.trim().length()==0){
			return "";
		}
		else {
			return incoming;
		}
		
	}


	private void printNodesAttributes(GNode gNode){


		if (gNode.gAttribute.size()<1){
			return;
		}


		for (int j=0; j<gNode.gAttribute.size(); j++){

			GAttribute nodeAttribute = gNode.gAttribute.get(j);

			// avoid ref attributes
			if (nodeAttribute.attIsObjectRelation){
				continue;
			}

			//this.henshinWriter.write("        <attributes xmi:id=\"_ATT" + gNode.nodeID + "" + j + this.encryptedXmiId + "\" value=\"\">" + System.lineSeparator());			
			//this.henshinWriter.write("          <type href=\"" + this.ecoreName + ".ecore#//" + gNode.nodeType + "/" + nodeAttribute.attName + "\"/>" + System.lineSeparator());
			//this.henshinWriter.write("        </attributes>" + System.lineSeparator());

		}
	}






	private void printNodesMappings(GraphT rhs){

		System.out.println("\t set mapping between nodes .. ");

		for (int i=0; i<rhs.gNodes.size(); i++){

			GNode printNode = rhs.gNodes.get(i);

			// mapping only nodes that exists in the both graphs
			if (printNode.isInitialized){
				continue;
			}

			this.henshinWriter.write("<mappings xmi:id=\"_XG" + rhs.graphID + "" + i + "" + this.encryptedXmiId + "\" origin=\"_L" + printNode.nodeID + "" + this.encryptedXmiId + "\" image=\"_R" + printNode.nodeID + "" + this.encryptedXmiId + "\"/>" + System.lineSeparator());

		}
	}






	private void printAttributeConstants(int iObservationID){

		System.out.println("\t filling attribute constraints .." );

		this.attributeConstraints.clear();

		// load invariants from database    		
		CachedRowSetImpl crsAttributeConstants = DBRecord.getByQueryStatement(
				"select RuleAttributeConditions from TblObservationOutput "
						+ "where (RuleAttributeConditions is not null or RuleAttributeConditions='') and Observation_ID="
						+ iObservationID + ";");

		try {

			if (crsAttributeConstants.next()){

				char chars[] = crsAttributeConstants.getString(1).toCharArray();

				String strLineCollection="";
				for(int i=0; i<chars.length; i++){

					if (chars[i]=='\n'){
						attributeConstraints.add(strLineCollection);
						strLineCollection="";
						continue;
					}

					strLineCollection+=chars[i];
				}
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}

	}




	private String getEncryptedXmiId(){		
		return "_" + DigestUtils.sha1Hex(System.nanoTime()+"").substring(0, 8);
	}


}
