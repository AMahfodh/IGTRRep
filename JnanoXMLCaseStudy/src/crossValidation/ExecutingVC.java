package crossValidation;

import java.util.ArrayList;





public class ExecutingVC  {



	private HenshinVisualContracts ExeVCs=null;	
	private JXMLInstances ExeImpl=null;	
	private ArrayList<Object> listOfPassedObjectPars = new ArrayList<Object>();




	private void runSimulater() throws Exception{

		this.ExeVCs= new HenshinVisualContracts();
		this.ExeImpl=new JXMLInstances();
		this.testSuit();

		this.ExeVCs.saveFinalStats();
		this.ExeVCs.generateHTMLReport();
	}


	public static void main(String[] args) throws Exception {

		System.out.println("\n start simulation process ------------\n\n");

		ExecutingVC simVC= new ExecutingVC();
		simVC.runSimulater();
		simVC.printSummary();	
		System.out.println("\n\n\n Simulation completed ------------");

	}


	private void exeuteRule(ArrayList<Integer> iRuleIndexs){

		// check if there is no rule found
		if (iRuleIndexs.size()<1){

			this.ExeVCs.strRuleId=" ~ ~ ";
			this.ExeVCs.isHenshinApplicable=" ~ ~ ";
			this.ExeVCs.isDaikonValid=" ~ ~ ";
			this.ExeVCs.strAction="<font color=\"blue\">case 1</font>";	


			// add report line
			this.ExeVCs.addTestCaseReportLine();

			return;
		}



		boolean isRuleFound=false;



		// check if there is at least one applicable rule !		
		for (int iR=0; iR<iRuleIndexs.size(); iR++){


			int iRuleID = iRuleIndexs.get(iR);


			// set rule id
			this.ExeVCs.nanoXMLApplication.setUnit(this.ExeVCs.module.getUnits().get(iRuleID));


			
			// check parameter size
			if (this.ExeVCs.nanoXMLApplication.getUnit().getParameters().size()!=this.listOfPassedObjectPars.size()){
				continue;
			}
			
			
			isRuleFound=true;
			
			
			// set mapped parameters
			this.setMappedParameters();			



			// for report line
			this.ExeVCs.strRuleId= iRuleID + "_" + this.ExeVCs.nanoXMLApplication.getUnit().getName();


			// check applicability of the rule			
			if (this.ExeVCs.applyRule(iRuleID)){



				this.ExeVCs.isHenshinApplicable="true";

				if (checkDaikonInv()){

					this.ExeVCs.isDaikonValid=" ? ";//"true";
					this.ExeVCs.strAction="<font color=\"green\">correct</font>";										


					// to calculate correct executed rules
					this.ExeVCs.listOfCorrectRules.add(iRuleID);


					// add report line and break
					this.ExeVCs.addTestCaseReportLine();
					return;

				}



				else {

					this.ExeVCs.isDaikonValid="<font color=\"OrangeRed\">false</font>";
					this.ExeVCs.strAction="<font color=\"blue\">case 1</font>";
				}




			}
			else {	

				this.ExeVCs.isHenshinApplicable="<font color=\"OrangeRed\">false</font>";
				this.ExeVCs.isDaikonValid=" ~ ~ ";
				this.ExeVCs.strAction="<font color=\"Crimson\">case 2</font>";		

				this.ExeVCs.listOfInApplicableRulesCase2.add(iRuleID);
			}



			// add report line and go for the next found rule
			this.ExeVCs.addTestCaseReportLine();

		}

		
		
		
		// rule name has been found but it failed to match the number of parameters
		if (!isRuleFound){

			this.ExeVCs.strRuleId=" ~ ~ ";
			this.ExeVCs.isHenshinApplicable=" ~ ~ ";
			this.ExeVCs.isDaikonValid=" ~ ~ ";
			this.ExeVCs.strAction="<font color=\"blue\">case 1</font>";	


			// add report line
			this.ExeVCs.addTestCaseReportLine();			
		}

	}


	private void setMappedParameters(){
		
		for (int iPar=0; iPar<this.listOfPassedObjectPars.size(); iPar++){
			this.ExeVCs.nanoXMLApplication.setParameterValue(
					"Par" + (iPar+1), 
					this.listOfPassedObjectPars.get(iPar));
		}

	}


	// TODO 
	private boolean checkDaikonInv(){
		
		/*
		// run Daikon JAR				
		try {

			ProcessBuilder builder = new ProcessBuilder(
					"cmd.exe", "/c", 
					"java -cp E:\\PhD\\Works\\daikon\\daikon.jar daikon.Daikon --nohierarchy " + 
					strDaikonCommand + ".decls " + 
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
		*/
		
		return true;
	}






















	private void testSuit(){

		this.testCase01();
		this.testCase02();
		this.testCase03();
		this.testCase04();
		this.testCase05();

		this.testCase06();
		this.testCase07();
		this.testCase08();
		this.testCase09();
		this.testCase10();

		this.testCase11();
		this.testCase12();
		this.testCase13();
		this.testCase14();
		this.testCase15();

		this.testCase16();
		this.testCase17();
		this.testCase18();
		this.testCase19();
		this.testCase20();

		this.testCase21();
		this.testCase22();
		this.testCase23();
		this.testCase24();
		this.testCase25();

		this.testCase26();
		this.testCase27();
		this.testCase28();
		this.testCase29();
		this.testCase30();

		this.testCase31();
		this.testCase32();
		this.testCase33();
		this.testCase34();
		this.testCase35();
		this.testCase36();
		this.testCase37();
		this.testCase38();
		this.testCase39();
		/**/
	}




	private void testCase01(){

		// 1- implementation  [addChild]		
		this.ExeVCs.strTestCase="tc01";
		this.ExeVCs.strRuleSignature="void net.n3.nanoxml.XMLElement.addChild(IXMLElement)";
		this.ExeImpl.myXML.addChild(this.ExeImpl.myXMLXMLElement1);





		// 2- check if rule exists (get index[] rules by rule name)
		ArrayList<Integer> iRuleIndexs= this.ExeVCs.getRuleIndex("addChild");





		// 3- set list of passed set mapped parameters (objects) 
		this.listOfPassedObjectPars.clear();
		this.listOfPassedObjectPars.add(this.ExeVCs.eObject_myXMLXMLElement1);




		// 4- execute rule and generate reports
		this.exeuteRule(iRuleIndexs);

	}


	private void testCase02(){

		// 1- implementation  [insertChild]		
		this.ExeVCs.strTestCase="tc02";
		this.ExeVCs.strRuleSignature="void net.n3.nanoxml.XMLElement.insertChild(IXMLElement, int)";
		this.ExeImpl.myXML.insertChild(this.ExeImpl.myXMLXMLElement2, 2);





		// 2- check if rule exists (get index[] rules by rule name)
		ArrayList<Integer> iRuleIndexs= this.ExeVCs.getRuleIndex("insertChild");





		// 3- set list of passed set mapped parameters (objects) 
		this.listOfPassedObjectPars.clear();
		this.listOfPassedObjectPars.add(this.ExeVCs.eObject_myXMLXMLElement2);
		this.listOfPassedObjectPars.add(2);




		// 4- execute rule and generate reports
		this.exeuteRule(iRuleIndexs);
	}


	private void testCase03(){

		// 1- implementation  [addChildren]		
		this.ExeVCs.strTestCase="tc03";
		this.ExeVCs.strRuleSignature="void net.n3.nanoxml.XMLElement.addChildren(IXMLElement[])";
		//this.ExeImpl.myXML.addChildren(this.ExeImpl.xmlElmentForMO);





		// 2- check if rule exists (get index[] rules by rule name)
		ArrayList<Integer> iRuleIndexs= this.ExeVCs.getRuleIndex("addChildren");





		// 3- set list of passed set mapped parameters (objects) 
		this.listOfPassedObjectPars.clear();
		this.listOfPassedObjectPars.add(this.ExeVCs.eObject_xmlElmentForMO);




		// 4- execute rule and generate reports
		this.exeuteRule(iRuleIndexs);
	}


	private void testCase04(){

		// 1- implementation  [removeChild]		
		this.ExeVCs.strTestCase="tc04";
		this.ExeVCs.strRuleSignature="void net.n3.nanoxml.XMLElement.removeChild(IXMLElement)";
		this.ExeImpl.myXML.removeChild(this.ExeImpl.myXMLXMLElement1);
		




		// 2- check if rule exists (get index[] rules by rule name)
		ArrayList<Integer> iRuleIndexs= this.ExeVCs.getRuleIndex("removeChild");





		// 3- set list of passed set mapped parameters (objects) 
		this.listOfPassedObjectPars.clear();
		this.listOfPassedObjectPars.add(this.ExeVCs.eObject_myXMLXMLElement1);




		// 4- execute rule and generate reports
		this.exeuteRule(iRuleIndexs);
	}


	private void testCase05(){

		// 1- implementation  [removeChildAtIndex]		
		this.ExeVCs.strTestCase="tc05";
		this.ExeVCs.strRuleSignature="void net.n3.nanoxml.XMLElement.removeChildAtIndex(int)";
		this.ExeImpl.myXML.removeChildAtIndex(0);
		




		// 2- check if rule exists (get index[] rules by rule name)
		ArrayList<Integer> iRuleIndexs= this.ExeVCs.getRuleIndex("removeChildAtIndex");





		// 3- set list of passed set mapped parameters (objects) 
		this.listOfPassedObjectPars.clear();
		this.listOfPassedObjectPars.add(0);




		// 4- execute rule and generate reports
		this.exeuteRule(iRuleIndexs);
	}


	
	
	

	private void testCase06(){

		// 1- implementation  [enumerateChildren]		
		this.ExeVCs.strTestCase="tc06";
		this.ExeVCs.strRuleSignature="Enumeration net.n3.nanoxml.XMLElement.enumerateChildren()";
		this.ExeImpl.myXML.enumerateChildren();





		// 2- check if rule exists (get index[] rules by rule name)
		ArrayList<Integer> iRuleIndexs= this.ExeVCs.getRuleIndex("enumerateChildren");





		// 3- set list of passed set mapped parameters (objects) 
		this.listOfPassedObjectPars.clear();




		// 4- execute rule and generate reports
		this.exeuteRule(iRuleIndexs);		
	}


	private void testCase07(){
		
		// 1- implementation  [hasChildren]		
		this.ExeVCs.strTestCase="tc07";
		this.ExeVCs.strRuleSignature="boolean net.n3.nanoxml.XMLElement.hasChildren()";
		this.ExeImpl.myXML.hasChildren();





		// 2- check if rule exists (get index[] rules by rule name)
		ArrayList<Integer> iRuleIndexs= this.ExeVCs.getRuleIndex("hasChildren");





		// 3- set list of passed set mapped parameters (objects) 
		this.listOfPassedObjectPars.clear();




		// 4- execute rule and generate reports
		this.exeuteRule(iRuleIndexs);
	}


	private void testCase08(){
		
		// 1- implementation  [isLeaf]		
		this.ExeVCs.strTestCase="tc08";
		this.ExeVCs.strRuleSignature="boolean net.n3.nanoxml.XMLElement.isLeaf()";
		this.ExeImpl.myXML.isLeaf();





		// 2- check if rule exists (get index[] rules by rule name)
		ArrayList<Integer> iRuleIndexs= this.ExeVCs.getRuleIndex("isLeaf");





		// 3- set list of passed set mapped parameters (objects) 
		this.listOfPassedObjectPars.clear();




		// 4- execute rule and generate reports
		this.exeuteRule(iRuleIndexs);		
	}


	private void testCase09(){
		
		// 1- implementation  [getChildAtIndex]		
		this.ExeVCs.strTestCase="tc09";
		this.ExeVCs.strRuleSignature="IXMLElement net.n3.nanoxml.XMLElement.getChildAtIndex(int)";
		this.ExeImpl.myXML.getChildAtIndex(0);





		// 2- check if rule exists (get index[] rules by rule name)
		ArrayList<Integer> iRuleIndexs= this.ExeVCs.getRuleIndex("getChildAtIndex");





		// 3- set list of passed set mapped parameters (objects) 
		this.listOfPassedObjectPars.clear();
		this.listOfPassedObjectPars.add(0);




		// 4- execute rule and generate reports
		this.exeuteRule(iRuleIndexs);			
	}


	private void testCase10(){
		
		// 1- implementation  [getChildrenCount]		
		this.ExeVCs.strTestCase="tc10";
		this.ExeVCs.strRuleSignature="int net.n3.nanoxml.XMLElement.getChildrenCount()";
		this.ExeImpl.myXML.getChildrenCount();





		// 2- check if rule exists (get index[] rules by rule name)
		ArrayList<Integer> iRuleIndexs= this.ExeVCs.getRuleIndex("getChildrenCount");





		// 3- set list of passed set mapped parameters (objects) 
		this.listOfPassedObjectPars.clear();




		// 4- execute rule and generate reports
		this.exeuteRule(iRuleIndexs);			
	}







	
	
	private void testCase11(){
		
		// 1- implementation  [getParent]		
		this.ExeVCs.strTestCase="tc11";
		this.ExeVCs.strRuleSignature="IXMLElement net.n3.nanoxml.XMLElement.getParent()";
		this.ExeImpl.myXML.getParent();





		// 2- check if rule exists (get index[] rules by rule name)
		ArrayList<Integer> iRuleIndexs= this.ExeVCs.getRuleIndex("getParent");





		// 3- set list of passed set mapped parameters (objects) 
		this.listOfPassedObjectPars.clear();




		// 4- execute rule and generate reports
		this.exeuteRule(iRuleIndexs);		
	}


	private void testCase12(){
		
		// 1- implementation  [getName]		
		this.ExeVCs.strTestCase="tc12";
		this.ExeVCs.strRuleSignature="String net.n3.nanoxml.XMLElement.getName()";
		this.ExeImpl.myXML.getName();





		// 2- check if rule exists (get index[] rules by rule name)
		ArrayList<Integer> iRuleIndexs= this.ExeVCs.getRuleIndex("getName");





		// 3- set list of passed set mapped parameters (objects) 
		this.listOfPassedObjectPars.clear();




		// 4- execute rule and generate reports
		this.exeuteRule(iRuleIndexs);			
	}


	private void testCase13(){
		
		// 1- implementation  [getFullName]		
		this.ExeVCs.strTestCase="tc13";
		this.ExeVCs.strRuleSignature="String net.n3.nanoxml.XMLElement.getFullName()";
		this.ExeImpl.myXML.getFullName();





		// 2- check if rule exists (get index[] rules by rule name)
		ArrayList<Integer> iRuleIndexs= this.ExeVCs.getRuleIndex("getFullName");





		// 3- set list of passed set mapped parameters (objects) 
		this.listOfPassedObjectPars.clear();




		// 4- execute rule and generate reports
		this.exeuteRule(iRuleIndexs);			
	}


	private void testCase14(){
		
		// 1- implementation  [getChildren]		
		this.ExeVCs.strTestCase="tc14";
		this.ExeVCs.strRuleSignature="Vector net.n3.nanoxml.XMLElement.getChildren()";
		this.ExeImpl.myXML.getChildren();





		// 2- check if rule exists (get index[] rules by rule name)
		ArrayList<Integer> iRuleIndexs= this.ExeVCs.getRuleIndex("getChildren");





		// 3- set list of passed set mapped parameters (objects) 
		this.listOfPassedObjectPars.clear();




		// 4- execute rule and generate reports
		this.exeuteRule(iRuleIndexs);		
	}


	private void testCase15(){

		// 1- implementation  [setName]		
		this.ExeVCs.strTestCase="tc15";
		this.ExeVCs.strRuleSignature="void net.n3.nanoxml.XMLElement.setName(String)";
		this.ExeImpl.myXML.setName("Abdullah");





		// 2- check if rule exists (get index[] rules by rule name)
		ArrayList<Integer> iRuleIndexs= this.ExeVCs.getRuleIndex("setName");





		// 3- set list of passed set mapped parameters (objects) 
		this.listOfPassedObjectPars.clear();
		this.listOfPassedObjectPars.add("Abdullah");




		// 4- execute rule and generate reports
		this.exeuteRule(iRuleIndexs);		
	}

	
	



	
	
	private void testCase16(){

		// 1- implementation  [setName]		
		this.ExeVCs.strTestCase="tc16";
		this.ExeVCs.strRuleSignature="void net.n3.nanoxml.XMLElement.setName(String, String)";
		this.ExeImpl.myXML.setName("Abdullah1", "Abdullah2");





		// 2- check if rule exists (get index[] rules by rule name)
		ArrayList<Integer> iRuleIndexs= this.ExeVCs.getRuleIndex("setName");





		// 3- set list of passed set mapped parameters (objects) 
		this.listOfPassedObjectPars.clear();
		this.listOfPassedObjectPars.add("Abdullah1");
		this.listOfPassedObjectPars.add("Abdullah2");




		// 4- execute rule and generate reports
		this.exeuteRule(iRuleIndexs);
	}
	
	private void testCase17(){

		// 1- implementation  [createElement]		
		this.ExeVCs.strTestCase="tc17";
		this.ExeVCs.strRuleSignature="IXMLElement net.n3.nanoxml.XMLElement.createElement(String)";
		this.ExeImpl.myXML.createElement("Abdullah1");





		// 2- check if rule exists (get index[] rules by rule name)
		ArrayList<Integer> iRuleIndexs= this.ExeVCs.getRuleIndex("createElement");





		// 3- set list of passed set mapped parameters (objects) 
		this.listOfPassedObjectPars.clear();
		this.listOfPassedObjectPars.add("Abdullah1");




		// 4- execute rule and generate reports
		this.exeuteRule(iRuleIndexs);		
	}
	
	private void testCase18(){

		// 1- implementation  [createElement]		
		this.ExeVCs.strTestCase="tc18";
		this.ExeVCs.strRuleSignature="IXMLElement net.n3.nanoxml.XMLElement.createElement(String, String)";
		this.ExeImpl.myXML.createElement("Abdullah1", "Abdullah2");





		// 2- check if rule exists (get index[] rules by rule name)
		ArrayList<Integer> iRuleIndexs= this.ExeVCs.getRuleIndex("createElement");





		// 3- set list of passed set mapped parameters (objects) 
		this.listOfPassedObjectPars.clear();
		this.listOfPassedObjectPars.add("Abdullah1");
		this.listOfPassedObjectPars.add("Abdullah2");




		// 4- execute rule and generate reports
		this.exeuteRule(iRuleIndexs);			
	}
	
	private void testCase19(){
		
		// 1- implementation  [createElement]		
		this.ExeVCs.strTestCase="tc19";
		this.ExeVCs.strRuleSignature="IXMLElement net.n3.nanoxml.XMLElement.createElement(String, String, int)";
		this.ExeImpl.myXML.createElement("Abdullah1", "Abdullah2", 1);





		// 2- check if rule exists (get index[] rules by rule name)
		ArrayList<Integer> iRuleIndexs= this.ExeVCs.getRuleIndex("createElement");





		// 3- set list of passed set mapped parameters (objects) 
		this.listOfPassedObjectPars.clear();
		this.listOfPassedObjectPars.add("Abdullah1");
		this.listOfPassedObjectPars.add("Abdullah2");
		this.listOfPassedObjectPars.add(1);




		// 4- execute rule and generate reports
		this.exeuteRule(iRuleIndexs);
	}
	
	private void testCase20(){
		
		// 1- implementation  [createElement]		
		this.ExeVCs.strTestCase="tc20";
		this.ExeVCs.strRuleSignature="IXMLElement net.n3.nanoxml.XMLElement.createElement(String, String, String, int)";
		this.ExeImpl.myXML.createElement("Abdullah1", "Abdullah2", "Abdullah3", 1);





		// 2- check if rule exists (get index[] rules by rule name)
		ArrayList<Integer> iRuleIndexs= this.ExeVCs.getRuleIndex("createElement");





		// 3- set list of passed set mapped parameters (objects) 
		this.listOfPassedObjectPars.clear();
		this.listOfPassedObjectPars.add("Abdullah1");
		this.listOfPassedObjectPars.add("Abdullah2");
		this.listOfPassedObjectPars.add("Abdullah3");
		this.listOfPassedObjectPars.add(1);




		// 4- execute rule and generate reports
		this.exeuteRule(iRuleIndexs);
	}
	
	
	
	
	
	
	
	private void testCase21(){

		// 1- implementation  [createPCDataElement]		
		this.ExeVCs.strTestCase="tc21";
		this.ExeVCs.strRuleSignature="IXMLElement net.n3.nanoxml.XMLElement.createPCDataElement()";
		this.ExeImpl.myXML.createPCDataElement();





		// 2- check if rule exists (get index[] rules by rule name)
		ArrayList<Integer> iRuleIndexs= this.ExeVCs.getRuleIndex("createPCDataElement");





		// 3- set list of passed set mapped parameters (objects) 
		this.listOfPassedObjectPars.clear();




		// 4- execute rule and generate reports
		this.exeuteRule(iRuleIndexs);		
	}
	
	private void testCase22(){

		// 1- implementation  [setAttribute]		
		this.ExeVCs.strTestCase="tc22";
		this.ExeVCs.strRuleSignature="void net.n3.nanoxml.XMLElement.setAttribute(String, String)";
		this.ExeImpl.myXML.setAttribute("att1", "att_abrar1");





		// 2- check if rule exists (get index[] rules by rule name)
		ArrayList<Integer> iRuleIndexs= this.ExeVCs.getRuleIndex("setAttribute");





		// 3- set list of passed set mapped parameters (objects) 
		this.listOfPassedObjectPars.clear();
		this.listOfPassedObjectPars.add("att1");
		this.listOfPassedObjectPars.add("att_abrar1");




		// 4- execute rule and generate reports
		this.exeuteRule(iRuleIndexs);		
	}
	
	private void testCase23(){

		// 1- implementation  [setAttribute]		
		this.ExeVCs.strTestCase="tc23";
		this.ExeVCs.strRuleSignature="void net.n3.nanoxml.XMLElement.setAttribute(String, String, String)";
		this.ExeImpl.myXML.setAttribute("att2", "att_abrar2", "att_abrar3");





		// 2- check if rule exists (get index[] rules by rule name)
		ArrayList<Integer> iRuleIndexs= this.ExeVCs.getRuleIndex("setAttribute");





		// 3- set list of passed set mapped parameters (objects) 
		this.listOfPassedObjectPars.clear();
		this.listOfPassedObjectPars.add("att2");		
		this.listOfPassedObjectPars.add("att_abrar2");
		this.listOfPassedObjectPars.add("att_abrar3");




		// 4- execute rule and generate reports
		this.exeuteRule(iRuleIndexs);		
	}
	
	private void testCase24(){

		// 1- implementation  [getAttributeType]		
		this.ExeVCs.strTestCase="tc24";
		this.ExeVCs.strRuleSignature="String net.n3.nanoxml.XMLElement.getAttributeType(String)";
		this.ExeImpl.myXML.getAttributeType("att1");





		// 2- check if rule exists (get index[] rules by rule name)
		ArrayList<Integer> iRuleIndexs= this.ExeVCs.getRuleIndex("getAttributeType");





		// 3- set list of passed set mapped parameters (objects) 
		this.listOfPassedObjectPars.clear();
		this.listOfPassedObjectPars.add("att1");



		// 4- execute rule and generate reports
		this.exeuteRule(iRuleIndexs);				
	}
	
	private void testCase25(){

		// 1- implementation  [getAttributeType]		
		this.ExeVCs.strTestCase="tc25";
		this.ExeVCs.strRuleSignature="String net.n3.nanoxml.XMLElement.getAttributeType(String, String)";
		this.ExeImpl.myXML.getAttributeType("att2", "att_abrar2");





		// 2- check if rule exists (get index[] rules by rule name)
		ArrayList<Integer> iRuleIndexs= this.ExeVCs.getRuleIndex("getAttributeType");





		// 3- set list of passed set mapped parameters (objects) 
		this.listOfPassedObjectPars.clear();
		this.listOfPassedObjectPars.add("att2");		
		this.listOfPassedObjectPars.add("att_abrar2");



		// 4- execute rule and generate reports
		this.exeuteRule(iRuleIndexs);				
	}
	
	
	
	
	
	
	
	
	private void testCase26(){

		// 1- implementation  [getAttributes]		
		this.ExeVCs.strTestCase="tc26";
		this.ExeVCs.strRuleSignature="Properties net.n3.nanoxml.XMLElement.getAttributes()";
		this.ExeImpl.myXML.getAttributes();





		// 2- check if rule exists (get index[] rules by rule name)
		ArrayList<Integer> iRuleIndexs= this.ExeVCs.getRuleIndex("getAttributes");





		// 3- set list of passed set mapped parameters (objects) 
		this.listOfPassedObjectPars.clear();




		// 4- execute rule and generate reports
		this.exeuteRule(iRuleIndexs);			
	}
	
	
	private void testCase27(){

		// 1- implementation  [getAttribute]		
		this.ExeVCs.strTestCase="tc27";
		this.ExeVCs.strRuleSignature="int net.n3.nanoxml.XMLElement.getAttribute(String, String, int)";
		this.ExeImpl.myXML.getAttribute("att2", "att_abrar3", 1);





		// 2- check if rule exists (get index[] rules by rule name)
		ArrayList<Integer> iRuleIndexs= this.ExeVCs.getRuleIndex("getAttribute");





		// 3- set list of passed set mapped parameters (objects) 
		this.listOfPassedObjectPars.clear();
		this.listOfPassedObjectPars.add("att2");		
		this.listOfPassedObjectPars.add("att_abrar2");
		this.listOfPassedObjectPars.add(1);



		// 4- execute rule and generate reports
		this.exeuteRule(iRuleIndexs);		
	}
	
	
	private void testCase28(){

		// 1- implementation  [getAttribute]		
		this.ExeVCs.strTestCase="tc28";
		this.ExeVCs.strRuleSignature="String net.n3.nanoxml.XMLElement.getAttribute(String, String))";
		this.ExeImpl.myXML.getAttribute("att2", "att_abrar3");





		// 2- check if rule exists (get index[] rules by rule name)
		ArrayList<Integer> iRuleIndexs= this.ExeVCs.getRuleIndex("getAttribute");





		// 3- set list of passed set mapped parameters (objects) 
		this.listOfPassedObjectPars.clear();
		this.listOfPassedObjectPars.add("att2");		
		this.listOfPassedObjectPars.add("att_abrar2");



		// 4- execute rule and generate reports
		this.exeuteRule(iRuleIndexs);			
	}
	
	
	private void testCase29(){

		// 1- implementation  [getAttribute]		
		this.ExeVCs.strTestCase="tc29";
		this.ExeVCs.strRuleSignature="String net.n3.nanoxml.XMLElement.getAttribute(String, String, String)";
		this.ExeImpl.myXML.getAttribute("att2", "att_abrar2", "att_abrar3");





		// 2- check if rule exists (get index[] rules by rule name)
		ArrayList<Integer> iRuleIndexs= this.ExeVCs.getRuleIndex("getAttribute");





		// 3- set list of passed set mapped parameters (objects) 
		this.listOfPassedObjectPars.clear();
		this.listOfPassedObjectPars.add("att2");		
		this.listOfPassedObjectPars.add("att_abrar2");
		this.listOfPassedObjectPars.add("att_abrar3");



		// 4- execute rule and generate reports
		this.exeuteRule(iRuleIndexs);	
	}
	
	
	private void testCase30(){

		// 1- implementation  [enumerateAttributeNames]		
		this.ExeVCs.strTestCase="tc30";
		this.ExeVCs.strRuleSignature="Enumeration net.n3.nanoxml.XMLElement.enumerateAttributeNames()";
		this.ExeImpl.myXML.enumerateAttributeNames();





		// 2- check if rule exists (get index[] rules by rule name)
		ArrayList<Integer> iRuleIndexs= this.ExeVCs.getRuleIndex("enumerateAttributeNames");





		// 3- set list of passed set mapped parameters (objects) 
		this.listOfPassedObjectPars.clear();



		// 4- execute rule and generate reports
		this.exeuteRule(iRuleIndexs);			
	}
	
	
	
	
	
	
	
	
	private void testCase31(){
		
		// 1- implementation  [hasAttribute]		
		this.ExeVCs.strTestCase="tc31";
		this.ExeVCs.strRuleSignature="boolean net.n3.nanoxml.XMLElement.hasAttribute(String)";
		this.ExeImpl.myXML.hasAttribute("id");





		// 2- check if rule exists (get index[] rules by rule name)
		ArrayList<Integer> iRuleIndexs= this.ExeVCs.getRuleIndex("hasAttribute");





		// 3- set list of passed set mapped parameters (objects) 
		this.listOfPassedObjectPars.clear();
		this.listOfPassedObjectPars.add("id");



		// 4- execute rule and generate reports
		this.exeuteRule(iRuleIndexs);		
	}
	
	
	private void testCase32(){

		// 1- implementation  [getAttributeCount]		
		this.ExeVCs.strTestCase="tc32";
		this.ExeVCs.strRuleSignature="int net.n3.nanoxml.XMLElement.getAttributeCount()";
		this.ExeImpl.myXML.getAttributeCount();





		// 2- check if rule exists (get index[] rules by rule name)
		ArrayList<Integer> iRuleIndexs= this.ExeVCs.getRuleIndex("getAttributeCount");





		// 3- set list of passed set mapped parameters (objects) 
		this.listOfPassedObjectPars.clear();



		// 4- execute rule and generate reports
		this.exeuteRule(iRuleIndexs);			
	}
	
	
	private void testCase33(){

		// 1- implementation  [getAttributeNamespace]		
		this.ExeVCs.strTestCase="tc33";
		this.ExeVCs.strRuleSignature="String net.n3.nanoxml.XMLElement.getAttributeNamespace(String)";
		this.ExeImpl.myXML.getAttributeNamespace("att2");





		// 2- check if rule exists (get index[] rules by rule name)
		ArrayList<Integer> iRuleIndexs= this.ExeVCs.getRuleIndex("getAttributeNamespace");





		// 3- set list of passed set mapped parameters (objects) 
		this.listOfPassedObjectPars.clear();
		this.listOfPassedObjectPars.add("att2");


		// 4- execute rule and generate reports
		this.exeuteRule(iRuleIndexs);	
	}
	
	
	private void testCase34(){

		// 1- implementation  [getAttributesInNamespace]		
		this.ExeVCs.strTestCase="tc34";
		this.ExeVCs.strRuleSignature="Properties net.n3.nanoxml.XMLElement.getAttributesInNamespace(String)";
		this.ExeImpl.myXML.getAttributeNamespace("att2");





		// 2- check if rule exists (get index[] rules by rule name)
		ArrayList<Integer> iRuleIndexs= this.ExeVCs.getRuleIndex("getAttributesInNamespace");





		// 3- set list of passed set mapped parameters (objects) 
		this.listOfPassedObjectPars.clear();
		this.listOfPassedObjectPars.add("att2");


		// 4- execute rule and generate reports
		this.exeuteRule(iRuleIndexs);			
	}
	
	
	private void testCase35(){

		// 1- implementation  [removeAttribute]		
		this.ExeVCs.strTestCase="tc35";
		this.ExeVCs.strRuleSignature="void net.n3.nanoxml.XMLElement.removeAttribute(String)";
		this.ExeImpl.myXML.removeAttribute("att1");





		// 2- check if rule exists (get index[] rules by rule name)
		ArrayList<Integer> iRuleIndexs= this.ExeVCs.getRuleIndex("removeAttribute");





		// 3- set list of passed set mapped parameters (objects) 
		this.listOfPassedObjectPars.clear();
		this.listOfPassedObjectPars.add("att1");




		// 4- execute rule and generate reports
		this.exeuteRule(iRuleIndexs);		
	}
	
	
	private void testCase36(){

		// 1- implementation  [removeAttribute]		
		this.ExeVCs.strTestCase="tc36";
		this.ExeVCs.strRuleSignature="void net.n3.nanoxml.XMLElement.removeAttribute(String, String)";
		this.ExeImpl.myXML.removeAttribute("att2");
		




		// 2- check if rule exists (get index[] rules by rule name)
		ArrayList<Integer> iRuleIndexs= this.ExeVCs.getRuleIndex("removeAttribute");





		// 3- set list of passed set mapped parameters (objects) 
		this.listOfPassedObjectPars.clear();
		this.listOfPassedObjectPars.add("att2");
		this.listOfPassedObjectPars.add("att_abrar2");




		// 4- execute rule and generate reports
		this.exeuteRule(iRuleIndexs);		
	}
	
	
	
	private void testCase37(){
		
		// test not exists rule	
		this.ExeVCs.strTestCase="tc37";
		this.ExeVCs.strRuleSignature="Test a non-existent rule";
		
		
		
		// 2- check if rule exists (get index[] rules by rule name)
		ArrayList<Integer> iRuleIndexs= this.ExeVCs.getRuleIndex("TestAnonExistentRule");





		// 3- set list of passed set mapped parameters (objects) 
		this.listOfPassedObjectPars.clear();




		// 4- execute rule and generate reports
		this.exeuteRule(iRuleIndexs);	
		
	}
	
	
	
	private void testCase38(){

		// 1- implementation  [setContent]		
		this.ExeVCs.strTestCase="tc38";
		this.ExeVCs.strRuleSignature="void net.n3.nanoxml.XMLElement.setContent(String)";
		this.ExeImpl.myXML.setContent("Abdullah");





		// 2- check if rule exists (get index[] rules by rule name)
		ArrayList<Integer> iRuleIndexs= this.ExeVCs.getRuleIndex("setContent");





		// 3- set list of passed set mapped parameters (objects) 
		this.listOfPassedObjectPars.clear();
		this.listOfPassedObjectPars.add("Abdullah");




		// 4- execute rule and generate reports
		this.exeuteRule(iRuleIndexs);		
	}
	
	
	
	
	private void testCase39(){

		// 1- implementation  [XMLElement]		
		this.ExeVCs.strTestCase="tc39";
		this.ExeVCs.strRuleSignature="void net.n3.nanoxml.XMLElement()";
		this.ExeImpl.XMLElement();





		// 2- check if rule exists (get index[] rules by rule name)
		ArrayList<Integer> iRuleIndexs= this.ExeVCs.getRuleIndex("XMLElement");





		// 3- set list of passed set mapped parameters (objects) 
		this.listOfPassedObjectPars.clear();




		// 4- execute rule and generate reports
		this.exeuteRule(iRuleIndexs);		
	}
	
	
	
	
	
	
	
	
	
	

	private void printSummary(){

		System.out.println("----------- Summary ----------------------------------");
		System.out.println("  ==> Correct rules \t\t\t\t\t: " + this.ExeVCs.listOfCorrectRules.size());

		System.out.println("  ==> Case2 -not applicable (unmatched structure) rules\t: " + this.ExeVCs.listOfInApplicableRulesCase2.size());

		System.out.println("  ==> Case1 -not applicable (invalid constraints) rules\t: " + this.ExeVCs.getCase1InApplicable());

		System.out.println("  ==> Not found rules \t\t\t\t\t: " + this.ExeVCs.listOfNotFoundRules.size());

		System.out.println("  ==> Not executed rules \t\t\t\t: " + this.ExeVCs.listOfNotExecutedRules.size());

		System.out.println("\n Total rules \t\t\t\t\t\t: " + this.ExeVCs.module.getUnits().size());
		System.out.println("-----------------------------------------------------\n");

		//for (int i=0; i<this.ExeVCs.module.getUnits().size(); i++){			
		//	System.out.println(i + "\t" + this.ExeVCs.module.getUnits().get(i).getName());
		//}
	}

}
