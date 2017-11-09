package crossValidation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.interpreter.UnitApplication;
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl;
import org.eclipse.emf.henshin.interpreter.impl.EngineImpl;
import org.eclipse.emf.henshin.interpreter.impl.ProfilingApplicationMonitor;
import org.eclipse.emf.henshin.interpreter.impl.UnitApplicationImpl;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;
import org.eclipse.uml2.uml.UMLPackage;

public class HenshinVisualContracts {


	private HenshinResourceSet resourceSet=null;
	protected UnitApplication nanoXMLApplication=null;
	protected Module module=null;
	private Engine engine = null;
	private EGraph graph =null;
	private ProfilingApplicationMonitor pam = new ProfilingApplicationMonitor();
	protected static String strFolder="xmlDocFiles" + File.separator;


	protected String stateHashTable;	

	// for report and summary
	protected ArrayList<String> testReport=new ArrayList<String>();
	protected HashSet<Integer> listOfCorrectRules=new HashSet<Integer>();
	protected HashSet<Integer> listOfInApplicableRulesCase2=new HashSet<Integer>();
	protected HashSet<String> listOfNotFoundRules=new HashSet<String>();
	protected ArrayList<Integer> listOfNotExecutedRules=new ArrayList<Integer>(); 




	// for report lines
	protected String strTestCase;
	protected String strRuleSignature;
	protected String strRuleId;
	protected String isHenshinApplicable;
	protected String isDaikonValid;
	protected String strAction;









	protected EObject eObject_myXML = null;
	protected EObject eObject_myXMLXMLElement1 = null;
	protected EObject eObject_myXMLXMLElement2 = null;
	protected EObject eObject_myXMLXMLElement3 = null;
	protected EObject eObject_myXMLXMLElement4 = null;
	protected EObject eObject_myXMLXMLElementNotExist = null;
	protected EObject eObject_XMLElementTestNew = null;
	protected EObject[] eObject_xmlElmentForMO = null;
	protected EObject[] eObject_xmlElmentForMO2 = null;





	public HenshinVisualContracts(){
		this.iniHenshin();
	}



	private void iniHenshin(){

		// Create a resource set with a base directory:		
		this.resourceSet = new HenshinResourceSet();

		// Load the module:
		this.module = resourceSet.getModule(strFolder + "nanoXML.henshin", false);

		
		this.resourceSet.getPackageRegistry().put("NanoXML", UMLPackage.eINSTANCE);		


		// Load the example model into an EGraph:
		this.graph = new EGraphImpl(resourceSet.getResource(strFolder + "nanoXML.xmi"));
		


		// Create an engine and a rule application:
		this.engine = new EngineImpl();
		this.nanoXMLApplication = new UnitApplicationImpl(engine);
		this.nanoXMLApplication.setEGraph(graph);



		// fill list of not executed rules
		for (int iRule=0; iRule<this.module.getUnits().size(); iRule++){
			this.listOfNotExecutedRules.add(iRule);
		}
		
	}



	protected int getCase1InApplicable(){


		if (this.listOfCorrectRules.size()==0 && this.listOfInApplicableRulesCase2.size()== 0){
			return 0;
		}

		return this.module.getUnits().size()- 
				this.listOfNotExecutedRules.size()-
				this.listOfCorrectRules.size() - 
				this.listOfInApplicableRulesCase2.size();

	}



	protected void saveFinalStats(){

		this.resourceSet.saveEObject(
				graph.getRoots().get(
						graph.getRoots().size()-1), 
				strFolder + "FinalExampResult.xmi");

	}



	protected void addTestCaseReportLine(){

		if (strTestCase.length()<1){
			return;
		}

		this.testReport.add(
				"<tr><td>" + 
						strTestCase + "</td><td>" +
						strRuleSignature + "</td><td>" +
						strRuleId + "</td><td>" +
						isHenshinApplicable + "</td><td>" +
						isDaikonValid + "</td><td>" + 
						strAction + "</td></tr>" + System.lineSeparator());
	}



	private String getStringTestCasesRows(){

		String strRows="";

		for (int i=0; i<this.testReport.size(); i++){
			strRows+= this.testReport.get(i);
		}

		return strRows;
	}


	private String getStringNotExecuted(){

		String strNotExecuted="";

		for (int i=0; i<this.listOfNotExecutedRules.size(); i++){
			strNotExecuted+="<li>" + 
					this.module.getUnits().get(
							this.listOfNotExecutedRules.get(i)).getName() +  
							"</li>" + System.lineSeparator();
		}

		return strNotExecuted;

	}


	private String getStringNotFound(){

		String strNotFound="";
		Iterator<String> iterator = this.listOfNotFoundRules.iterator(); 

		while (iterator.hasNext()){

			strNotFound+="<li>" + iterator.next() +  "</li>" + System.lineSeparator();
		}

		return strNotFound;
	}



	protected void generateHTMLReport(){

		// read template file

		String strReport="";
		try {

			Scanner ReadTemplateFile = new Scanner(new FileReader(new File(strFolder +"template.htm")));
			strReport = ReadTemplateFile.useDelimiter("\\Z").next();
			ReadTemplateFile.close();	

		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());		
		} 


		if (strReport.length()==0){
			System.err.println("Error: can't generate reports!");
			return;
		}




		// update fields

		strReport = strReport.replace("###A###", "" + this.listOfCorrectRules.size());
		strReport = strReport.replace("###B###", "" + this.listOfInApplicableRulesCase2.size());
		strReport = strReport.replace("###C###", "" + this.getCase1InApplicable());
		strReport = strReport.replace("###D###", "" + this.listOfNotFoundRules.size());
		strReport = strReport.replace("###E###", "" + this.listOfNotExecutedRules.size());		
		strReport = strReport.replace("###TOTAL###", "" + this.module.getUnits().size());
		strReport = strReport.replace("###TestCasesRows###", this.getStringTestCasesRows());
		strReport = strReport.replace("###NOTExecuted###", this.getStringNotExecuted());
		strReport = strReport.replace("###NOTFound###", this.getStringNotFound());




		// save file
		try {
			PrintWriter reportWriter = new PrintWriter(strFolder + "report.htm", "UTF-8");
			reportWriter.println(strReport);
			reportWriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 






		// display the generated report .. 
		Runtime View_Report = Runtime.getRuntime();  
		try {
			View_Report.exec("explorer.exe report.htm");
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("\nReport generated\n");


	}



















	// TODO find (this object) and all passed (object parameters)
	private void checkPreConditions(){

	}

















	// applying rule
	protected boolean applyRule(int iRuleId){


		// remove accessed rule from list to recognise not executed rules
		int iRemoveRule= this.listOfNotExecutedRules.indexOf(iRuleId);
		if (iRemoveRule!=-1){
			this.listOfNotExecutedRules.remove(iRemoveRule);
		}



		return this.nanoXMLApplication.execute(pam);

	}










	private void printCurrentTesting(
			boolean isNanoAPI, 
			String ruleName, 
			String henshinAPI, 
			String isValid){

		if (isNanoAPI){
			System.out.print("\n\n\t#nano_API\t[pass] " + ruleName);
		}
		else {
			System.out.print("\n" + "\t#henshin_API\t[" + henshinAPI + "] " + this.nanoXMLApplication.getUnit().toString());
			System.out.print("\n\t\t ====> " + isValid);
		}



		//System.out.println("\n\t pam.printStats ... ---------------------------------\n\n");


		// print states
		//pam.printStats();

		/**
		1	Rule addChild(child:XMLElement)
		2	Rule XMLElement
		3	Rule createElement(fullName:EString, systemID:EString, lineNr:EInt)
		4	Rule createElement(fullName:EString, namespace:EString, systemID:EString, lineNr:EInt)
		5	Rule createPCDataElement
		6	Rule enumerateChildren
		7	Rule setAttribute(fullName:EString, namespace:EString, value:EString)
		8	Rule getAttributes
		9	Rule enumerateAttributeNames
		10	Rule getAttributeType(name:EString)
		11	Rule getAttributeType(name:EString, namespace:EString)
		12	Rule getAttribute(name:EString, defaultValue:EString)
		13	Rule getAttribute(name:EString, namespace:EString, defaultValue:EString)
		14	Rule getAttribute(name:EString, namespace:EString, defaultValue:EInt)
		15	Rule getAttributeNamespace(name:EString)
		16	Rule getAttributesInNamespace(namespace:EString)
		17	Rule setName(fullName:EString, namespace:EString)
		18	Rule setContent(content:EString)
		19	Rule getChildAtIndex(index:EInt)
		20	Rule hasAttribute(name:EString)
		21	Rule hasChildren
		22	Rule isLeaf
		23	Rule getChildrenCount
		24	Rule getAttributeCount
		25	Rule getParent
		26	Rule getName
		27	Rule getFullName
		28	Rule getChildren
		29	Rule insertChild(child:XMLElement, index:EInt)
		30	Rule removeChildAtIndex(index:EInt)
		31	Rule addChildren(child:XMLElement)
		32	Rule createElement(fullName:EString, namespace:EString)
		33	Rule setAttribute(name:EString, value:EString)
		34	Rule removeAttribute(name:EString)
		35	Rule removeAttribute(name:EString, namespace:EString)
		36	Rule removeChild(child:XMLElement)
		37	Rule createElement(fullName:EString)
		38	Rule setName(name:EString)
		39	Rule addChildren(child:XMLElement)
		 */
	}






	protected ArrayList<Integer> getRuleIndex(String ruleSignature){

		ArrayList<Integer> indexRules = new ArrayList<Integer>();

		for (int i=0; i<this.module.getUnits().size(); i++){

			if (this.module.getUnits().get(i).getName().split("_")[1].equalsIgnoreCase(ruleSignature)){

				indexRules.add(i);
			}
		}



		// add this name in list [listOfNotFoundRules] if no rule found
		if (indexRules.size()==0) {
			this.listOfNotFoundRules.add(ruleSignature);
		}


		return indexRules;
	}









}
