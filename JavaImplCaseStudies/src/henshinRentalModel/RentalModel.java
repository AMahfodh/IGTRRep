package henshinRentalModel;

import java.io.File;
import java.util.ArrayList;

import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.interpreter.UnitApplication;
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl;
import org.eclipse.emf.henshin.interpreter.impl.EngineImpl;
import org.eclipse.emf.henshin.interpreter.impl.ProfilingApplicationMonitor;
import org.eclipse.emf.henshin.interpreter.impl.UnitApplicationImpl;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.Unit;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;
import org.eclipse.uml2.uml.UMLPackage;

import rentalService.*;


public class RentalModel {

	
	
	//FIXME 
	private String henshinDirectory = "modelFiles" + File.separator;
			//new File("").getAbsolutePath() + File.separator + 
			//".." + File.separator +
			//"IGTR" + File.separator + 
			//"HenshinOutput" + File.separator;
	
	private String strExportedHenshinFileName= "allRules.henshin";
	
	private String strStartGraphFileName="rentalService.xmi";
	
	
	
	private HenshinResourceSet resourceSet=null;
	protected UnitApplication carRentalApplication=null;
	protected Module module=null;
	private Engine engine = null;
	private EGraph graph =null;
	private ProfilingApplicationMonitor pam = null;//new ProfilingApplicationMonitor();
	
	
	public RentalModel(Rental rentalService){		
		this.loadExportedHModel();
	}
	
	
	private void loadExportedHModel(){

		// Create a resource set with a base directory:		
		this.resourceSet = new HenshinResourceSet();

		// Load the module:
		this.module = resourceSet.getModule(this.henshinDirectory + this.strExportedHenshinFileName, false);


		// Load the started initialized object graph into an EGraph:
		this.resourceSet.getPackageRegistry().put("http://www.eclipse.org/emf/rentalService", UMLPackage.eINSTANCE);
		
		this.graph = new EGraphImpl(this.resourceSet.getResource(this.henshinDirectory + this.strStartGraphFileName));
		


		// Create an engine and rule-applications:
		this.engine = new EngineImpl();
		this.carRentalApplication = new UnitApplicationImpl(this.engine);
		this.carRentalApplication.setEGraph(this.graph);
		for (Unit u: this.module.getUnits()){
			System.out.println(u.getName());
		}
	}
	
	
	
	public void saveFinalStats(){

		this.resourceSet.saveEObject(
				graph.getRoots().get(
						graph.getRoots().size()-1), 
				this.henshinDirectory + "FinalExampResult.xmi");
	}
	
	
	
	

	
	public Boolean isRuleApplicable(String strRuleName, String strPar1){		
		return this.isRuleApplicable(strRuleName, strPar1, null, null);
	}
	
	public Boolean isRuleApplicable(String strRuleName, String strPar1, String strPar2){		
		return this.isRuleApplicable(strRuleName, strPar1, strPar2, null);
	}
	
	
	
	// FIXME 
	boolean isRandom=false;
	public Boolean isRuleApplicable(
			String strRuleName,
			String strPar1,
			String strPar2,
			String strPar3){
		

		// *** dummy code .. just for testing the return of the method .. **** 
		this.isRandom = (!isRandom);
		if (this.isRandom || !this.isRandom){ return this.isRandom;}
		
		
		
		// set parameter size from [1 to 3]
		int iParSize =3;
		if (strPar3==null){
			iParSize=2;
			if (strPar2==null){
				iParSize=1;
			}
		}

		
		// get all units (rules) that have the same [strRuleName] in addition to the number of parameters 
		ArrayList<Unit> RuleWithSameName = this.getRuleWithSameNames(strRuleName, iParSize);
		
		
		// check if there is at least one applicable rule in this list[RuleWithSameName]		
		for (Unit u: RuleWithSameName){


			this.carRentalApplication.setUnit(u);


			// set parameters			
			this.carRentalApplication.setParameterValue(u.getParameters().get(0).getName(), strPar1);

			if (iParSize>1){
				this.carRentalApplication.setParameterValue(u.getParameters().get(1).getName(), strPar2);
			}
			if (iParSize==3){
				this.carRentalApplication.setParameterValue(u.getParameters().get(2).getName(), strPar3);
			}


			// check rule applicability ..
			if (this.carRentalApplication.execute(this.pam)){
				return true;
			}
		}
		
		return false;
	}
	
	
	
	public Boolean isRuleApplicableWithoutUpdatingModelState(
			String strRuleName,
			String strPar1,
			String strPar2,
			String strPar3){
		
		// *** dummy code .. just for testing the return of the method .. **** 
		this.isRandom = (!isRandom);		
		return this.isRandom;
	}
	
	
	private ArrayList<Unit> getRuleWithSameNames(String ruleName, int iParameterSize){
		
		ArrayList<Unit> listOfUnits= new ArrayList<Unit>();
		
		for (Unit u: this.module.getUnits()){
			if (u.getParameters().size() != iParameterSize ||
				!u.getName().contains(ruleName)){
				continue;
			}
			listOfUnits.add(u);
		}
		
		return listOfUnits;
	}
	
	
	
	
	public static void main (String[] args){
		
		new RentalModel(null);		
	}
	
	
}
