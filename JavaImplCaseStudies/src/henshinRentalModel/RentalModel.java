package henshinRentalModel;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
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
import org.eclipse.emf.henshin.model.Parameter;
import org.eclipse.uml2.uml.UMLPackage;

import rentalService.*;


public class RentalModel {

	
	private RentalModelImpl rmi = null;	
	
	
	public RentalModel(Rental rental){		
				
		this.rmi = new RentalModelImpl();
		
		// Initializing 'Rental' objects 
		this.rmi.initObjectModel(rental);		
	}
	
	
	public void deriveHenshinRulesFromDB(){
		this.rmi.initRulesFromVCs();
	}
	
	
	public Boolean onlyCheckRuleApplicability(
			String strRuleName,
			String strPar1,
			String strPar2,
			String strPar3){
				
	//	List<RuleArgument> strArgs = this.getArgs(strRuleName, strPar1, strPar2, strPar3);
		
		return false;
	}
		
	
	public Boolean checkAndApplyRule(
			String strRuleName,
			String strPar1,
			String strPar2,
			String strPar3){
		
//		List<RuleArgument> strArgs = this.getArgs(strRuleName, strPar1, strPar2, strPar3);
//		
//		if (this.rmi.isRuleApplicable(strRuleName, strArgs)){
//			this.rmi.applyRule(strRuleName, strArgs);
//			return true;
//		}

		return false;
	}
	

	
//	private List<RuleArgument> getArgs(String strRuleName, String strPar1, String strPar2, String strPar3){
//
//
//		//FIXME to get the unit (rule) from Module object
//		Unit u= this.rmi.getModule().getUnit(strRuleName);
//		
//		if (u==null){
//			return null;
//		}
//		
//		List<RuleArgument> args = new ArrayList<RuleArgument>();		
//		EList<Parameter> parameterNames = u.getParameters();
//
//		if (parameterNames.size()>0 && strPar1!=null){
//
//			args.add(new RuleArgument(parameterNames.get(0).getName(), strPar1));
//
//			if (parameterNames.size()>1 && strPar2!=null){
//
//				args.add(new RuleArgument(parameterNames.get(1).getName(), strPar2));
//
//				if (parameterNames.size()>2 && strPar3!=null){
//					args.add(new RuleArgument(parameterNames.get(2).getName(), strPar3));
//				}
//			}
//		}
//
//		return args;
//	}
	
	
}
