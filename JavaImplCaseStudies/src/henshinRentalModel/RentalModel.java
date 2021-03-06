package henshinRentalModel;


import java.util.List;


import rentalService.*;


public class RentalModel {

	
	private Rental rental=null;
	private RentalModelImpl rmi = null;	
	
	
	public RentalModel(Rental setRental){		
				
		this.rental= setRental;
		this.rmi = new RentalModelImpl();
		
		// Initializing 'Rental' objects 
		this.refreshEMFObjectModel();		
	}
	
	
	private void refreshEMFObjectModel(){
		this.rmi.initObjectModel(this.rental);
	}
	
	
	public void deriveHenshinRulesFromDB(){
		this.rmi.initRulesFromVCs();
	}
	
	
	public Boolean onlyCheckRuleApplicability(
			String strRuleID,
			String strRuleName,
			String strPar1,
			String strPar2,
			String strPar3,
			boolean expectedResult){
				
		List<RuleArgument> args = this.rmi.createArgumentList(strPar1, strPar2, strPar3);
		
		this.refreshEMFObjectModel();
		
		return this.rmi.isRuleApplicable(strRuleID, strRuleName, args, expectedResult);
	}
		
	
	public Boolean checkAndApplyRule(
			String strRuleID,
			String strRuleName,
			String strPar1,
			String strPar2,
			String strPar3,
			boolean expectedResult){
		
//		List<RuleArgument> args = this.rmi.createArgumentList(strPar1, strPar2, strPar3);
//
//		if (this.rmi.isRuleApplicable(strRuleName, args)){
//			this.rmi.applyRule(strRuleName, args);
//			return true;
//		}
//
//		return false;
		return this.onlyCheckRuleApplicability(strRuleID, strRuleName, strPar1, strPar2, strPar3, expectedResult);
	}	
	
	
	public void printHenshinRulesAndObjectModel(String strTestCaseAsModelName){
		this.rmi.dumpHenshinRules(strTestCaseAsModelName);
		this.rmi.dumpObjectModel(strTestCaseAsModelName);
	}
	
	
}


