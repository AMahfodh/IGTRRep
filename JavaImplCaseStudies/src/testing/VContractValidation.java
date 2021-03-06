package testing;

import org.junit.Before;

import java.io.File;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

import org.junit.After;
import org.junit.Test;

import henshinRentalModel.RentalModel;
import inferences.AttributeInferenceFromJavaTracing;
import inferences.DBRecord;
import inferences.RuleInferenceFromJavaTracing;
import rentalService.Branch;
import rentalService.Car;
import rentalService.Rental;



public class VContractValidation {
	
	

	private strSplit splitPercent = null;
	private static final boolean TRAINING= false;
	private static final boolean VALIDATING= true;
	private int iInvocationCount=0;
	private PrintWriter testWriter=null;
	private boolean HasRuleBeenExportedToHenshin=false;
	private ArrayList<String> setOfDecisions= new ArrayList<String>();
	private ArrayList<String> setOfDecisionsForFinalPrinting= new ArrayList<String>();
	DecimalFormat dF = new DecimalFormat("##.##");
	
	private Rental rentalService = null;
	private RentalModel henshinRentalModel=null;
	private String clientReg1_Abdullah=null;
	private String clientReg2_Reiko=null;
	private String makeRes1=null;
	private String makeRes2=null;
	
	@Before
	public void setUp() throws Exception {


		this.splitPercent= strSplit.p20;
		
		this.testWriter = new PrintWriter("ValidationOutput_" + this.splitPercent.name(), "UTF-8");
		
		String strStartStatement = "Validating the extracted visual contract using Henshin engine based on " + this.splitPercent.name().substring(1) + "% cross-validation split ..";

		System.out.println(strStartStatement);
		this.testWriter.println();
	}
	
	
	
	
	
	@Test
	public void trainingByTestingIn5Rounds() {
		
		
		/*
		 * Training to learn visual contracts with splitting tests based on 5 cross-validation rounds 
		 */
		this.round1(); this.round1(); this.printRoundPlusPrecisionAndRecallValues("#Round 1");	
		this.round2(); this.round2(); this.printRoundPlusPrecisionAndRecallValues("#Round 2");
		this.round3(); this.round3(); this.printRoundPlusPrecisionAndRecallValues("#Round 3");
		this.round4(); this.round4(); this.printRoundPlusPrecisionAndRecallValues("#Round 4");
		this.round5(); this.round5(); this.printRoundPlusPrecisionAndRecallValues("#Round 5");
	}
	
	

	private void round1(){

		System.out.println("#Round 1");		
		this.clearAllStoredRules(1);
		
		switch (splitPercent) {
		case p20:  
			this.testCaseA(1, TRAINING);
			this.testCaseB(1, VALIDATING);
			this.testCaseC(1, VALIDATING);
			this.testCaseD(1, VALIDATING);
			this.testCaseE(1, VALIDATING);
			break;

		case p40:  
			this.testCaseA(1, TRAINING);
			this.testCaseB(1, TRAINING);
			this.testCaseC(1, VALIDATING);
			this.testCaseD(1, VALIDATING);
			this.testCaseE(1, VALIDATING);
			break;

		case p60:  
			this.testCaseA(1, TRAINING);
			this.testCaseB(1, TRAINING);
			this.testCaseC(1, TRAINING);
			this.testCaseD(1, VALIDATING);
			this.testCaseE(1, VALIDATING);
			break;

		case p80:  
			this.testCaseA(1, TRAINING);
			this.testCaseB(1, TRAINING);
			this.testCaseC(1, TRAINING);
			this.testCaseD(1, TRAINING);
			this.testCaseE(1, VALIDATING);
			break;

		case p100:  
			this.testCaseA(1, TRAINING);
			this.testCaseB(1, TRAINING);
			this.testCaseC(1, TRAINING);
			this.testCaseD(1, TRAINING);
			this.testCaseE(1, TRAINING);
			break;

		default: System.err.println("Invalid split option"); 
		break;
		}
	}

	private void round2(){
		
		System.out.println("#Round 2");		
		this.clearAllStoredRules(2);
		
		switch (splitPercent) {
		case p20:  
			this.testCaseB(2, TRAINING);
			this.testCaseA(2, VALIDATING);			
			this.testCaseC(2, VALIDATING);
			this.testCaseD(2, VALIDATING);
			this.testCaseE(2, VALIDATING);
			break;

		case p40:  
			this.testCaseB(2, TRAINING);
			this.testCaseC(2, TRAINING);
			this.testCaseA(2, VALIDATING);
			this.testCaseD(2, VALIDATING);
			this.testCaseE(2, VALIDATING);
			break;

		case p60:  

			this.testCaseB(2, TRAINING);
			this.testCaseC(2, TRAINING);
			this.testCaseD(2, TRAINING);
			this.testCaseA(2, VALIDATING);
			this.testCaseE(2, VALIDATING);
			break;

		case p80:  
			this.testCaseA(2, TRAINING);
			this.testCaseB(2, TRAINING);
			this.testCaseC(2, TRAINING);		
			this.testCaseE(2, TRAINING);
			this.testCaseD(2, VALIDATING);
			break;

		case p100: return;
		
		default: System.err.println("Invalid split option"); 
		break;
		}
	}

	private void round3(){
		
		System.out.println("#Round 3");
		this.clearAllStoredRules(3);
		
		switch (splitPercent) {
		case p20:
			this.testCaseC(3, TRAINING);
			this.testCaseA(3, VALIDATING);
			this.testCaseB(3, VALIDATING);			
			this.testCaseD(3, VALIDATING);
			this.testCaseE(3, VALIDATING);
			break;

		case p40:  
			this.testCaseC(3, TRAINING);
			this.testCaseD(3, TRAINING);
			this.testCaseA(3, VALIDATING);
			this.testCaseB(3, VALIDATING);
			this.testCaseE(3, VALIDATING);
			break;

		case p60:  
			this.testCaseC(3, TRAINING);
			this.testCaseD(3, TRAINING);
			this.testCaseE(3, TRAINING);
			this.testCaseA(3, VALIDATING);
			this.testCaseB(3, VALIDATING);
			break;

		case p80:  
			this.testCaseA(3, TRAINING);
			this.testCaseB(3, TRAINING);			
			this.testCaseD(3, TRAINING);
			this.testCaseE(3, TRAINING);
			this.testCaseC(3, VALIDATING);
			break;

		case p100: return;
		
		default: System.err.println("Invalid split option"); 
		break;
		}
	}

	private void round4(){
		
		System.out.println("#Round 4");
		this.clearAllStoredRules(4);
		
		switch (splitPercent) {
		case p20:
			this.testCaseD(4, TRAINING);
			this.testCaseA(4, VALIDATING);
			this.testCaseB(4, VALIDATING);
			this.testCaseC(4, VALIDATING);			
			this.testCaseE(4, VALIDATING);
			break;

		case p40:  
			this.testCaseD(4, TRAINING);
			this.testCaseE(4, TRAINING);
			this.testCaseA(4, VALIDATING);
			this.testCaseB(4, VALIDATING);
			this.testCaseC(4, VALIDATING);
			break;

		case p60:  
			this.testCaseA(4, TRAINING);
			this.testCaseD(4, TRAINING);
			this.testCaseE(4, TRAINING);
			this.testCaseB(4, VALIDATING);
			this.testCaseC(4, VALIDATING);
			break;

		case p80:  
			this.testCaseA(4, TRAINING);			
			this.testCaseC(4, TRAINING);
			this.testCaseD(4, TRAINING);
			this.testCaseE(4, TRAINING);
			this.testCaseB(4, VALIDATING);
			break;

		case p100: return;
		
		default: System.err.println("Invalid split option"); 
		break;
		}
	}

	private void round5(){
		
		System.out.println("#Round 5");
		this.clearAllStoredRules(5);
		
		switch (splitPercent) {
		case p20:  
			this.testCaseE(5, TRAINING);
			this.testCaseA(5, VALIDATING);
			this.testCaseB(5, VALIDATING);
			this.testCaseC(5, VALIDATING);
			this.testCaseD(5, VALIDATING);
			
			break;

		case p40:  
			this.testCaseA(5, TRAINING);
			this.testCaseE(5, TRAINING);
			this.testCaseB(5, VALIDATING);
			this.testCaseC(5, VALIDATING);
			this.testCaseD(5, VALIDATING);			
			break;

		case p60:  
			this.testCaseA(5, TRAINING);
			this.testCaseB(5, TRAINING);
			this.testCaseE(5, TRAINING);
			this.testCaseC(5, VALIDATING);
			this.testCaseD(5, VALIDATING);
			break;

		case p80:  			
			this.testCaseB(5, TRAINING);
			this.testCaseC(5, TRAINING);
			this.testCaseD(5, TRAINING);
			this.testCaseE(5, TRAINING);
			this.testCaseA(5, VALIDATING);
			break;

		case p100: return;
		
		default: System.err.println("Invalid split option"); 
		break;
		}
	}
	
	private enum strSplit {
		p20, p40, p60, p80, p100
	}
	

	
	
	
		
	private void clearAllStoredRules(int iRound){
		
		this.HasRuleBeenExportedToHenshin=false;
		this.initialiseTestSetUp(iRound);
		this.henshinRentalModel= new RentalModel(this.rentalService);
		
		
		// clear all last generated rules
		DBRecord.removeObservation("");
	}
		
	
	private void ValidationDecisionTree (
			int iRound, String strTestCaseA_E,
			Object IsThrownExceptionPlusExpectedResult,
			String strRuleName, String par1){
		this.ValidationDecisionTree(iRound, strTestCaseA_E, IsThrownExceptionPlusExpectedResult, strRuleName, par1, null, null);
	}
	
	private void ValidationDecisionTree (
			int iRound, String strTestCaseA_E,
			Object IsThrownExceptionPlusExpectedResult,
			String strRuleName, String par1, String par2){
		this.ValidationDecisionTree(iRound, strTestCaseA_E, IsThrownExceptionPlusExpectedResult, strRuleName, par1, par2, null);
	}
	
	private void ValidationDecisionTree (
			int iRound, String strTestCaseA_E,
			Object IsThrownExceptionPlusExpectedResult,
			String strRuleName, String par1, String par2, String par3){
		
		
		boolean expectedResult = false;
		String strDec="";
		
		
		if (IsThrownExceptionPlusExpectedResult!=null){
			if (IsThrownExceptionPlusExpectedResult instanceof Boolean){
				expectedResult=(Boolean)IsThrownExceptionPlusExpectedResult;
			}
			else if (IsThrownExceptionPlusExpectedResult instanceof String){
				expectedResult=((String)IsThrownExceptionPlusExpectedResult).length()>0;
			}
		}
		
		
		
		if (!expectedResult){
			
			/* This includes thrown-exception cases or false expectedResult representing failed tests
			 * check if rule-applicable without changing model state: FP if (Yes), TN  otherwise */
			if (this.henshinRentalModel.onlyCheckRuleApplicability("", strRuleName, par1, par2, par3, expectedResult)){
				strDec="FP\tincorrect: rule shouldn't be applicable";
			}
			else {
				strDec="TN\tcomplete";
			}			
		}
		else {
			
			/*  - test has passed 	
			 *  - check if the minimal rule exists in the inferred contracts
			 *  - return max-rule id if yes, and negative value if false
			 *  - check the applicability of maximal rule if max-rule id>0 */
			
			int iMaxID= this.isLastContractInstanceAddedMatched();
			
			if (iMaxID!=-1){
				
				if (this.henshinRentalModel.checkAndApplyRule(iMaxID+"", strRuleName, par1, par2, par3, expectedResult)){
					strDec="TP\tcorrect";
				} 
				else {
					strDec="FN\tincomplete: maxRule isn't applicable";
					
					/**
					 * For debugging ..*/
					  this.henshinRentalModel.printHenshinRulesAndObjectModel(
					  "r" + iRound + "-tc" + strTestCaseA_E  + "-MaxID-" + iMaxID + "-"+ (this.iInvocationCount+1));					 
				}
			} 
			else {
				
				/*FP (No)*/
				strDec="FN\tincomplete: minRule doesn't exists";
			}

		}
		
		
		
		
		this.setOfDecisions.add(strDec);
				
		this.testWriter.println(
				"r" + iRound + "-tc" + strTestCaseA_E + (++this.iInvocationCount) + "\t" + 
				strRuleName + "\t" +
				strDec);
		
		this.testWriter.flush();		
	}
	
		
	
	private void printRoundPlusPrecisionAndRecallValues(String strRound){

		if (this.setOfDecisions.isEmpty()){
			return;
		}

		int iTP=0, iFP=0,iFN=0;

		for (String strDec: this.setOfDecisions){
			if (strDec.startsWith("TP")) {iTP++;}
			else if (strDec.startsWith("FP")) {iFP++;}
			else if (strDec.startsWith("FN")) {iFN++;}
		}
		
		double dPrecision=.0;
		if (iTP+iFP !=0){ dPrecision = iTP/(iTP+iFP+.0);}

		double dRecall = .0;
		if (iTP+iFN!=0){dRecall = iTP/(iTP+iFN+.0);}

		
		this.testWriter.println(strRound + "\tPrecision\t " + this.dF.format(dPrecision) + "\tRecall\t" + this.dF.format(dRecall));
		this.setOfDecisionsForFinalPrinting.add(strRound + "\tPrecision\t " + this.dF.format(dPrecision) + "\tRecall\t" + this.dF.format(dRecall));
		this.testWriter.println();
		this.setOfDecisions.clear();
	}

	
	private String getIsTrainingOrValidation(boolean isForValidation){
		
		if (!isForValidation){
			return "Training";
		}		
		return "Validation";
	}
		
	private int isLastContractInstanceAddedMatched(){		
		/*
		 *  - if the rule is empty or no minimal rule found then the return will be FALSE, TRUE otherwise.
		 *  - Delete last added rule after checking 
		 */	
		return new RuleInferenceFromJavaTracing().isMinRuleMatched();
	}
		
	private void LearningActionsBeforeValidationProcess(){
		
		if (!this.HasRuleBeenExportedToHenshin){			
			
			this.HasRuleBeenExportedToHenshin=true;			
			
			new RuleInferenceFromJavaTracing().generaliseRuleInstance(1);			
			//new AttributeInferenceFromJavaTracing().commit();
			
			// for importing rules from DB
			this.henshinRentalModel.deriveHenshinRulesFromDB();
		}
	}
	
	
	
	private String strParLeicester = "Leicester";
	private String strParNottingham = "Nottingham";
	private String strParBirmingham = "Birmingham";
	private String strParReiko = "Reiko";
	private String strParAbdullah = "Abdullah";
	
	private void updateAllTestInputs(int iRound){
		
		this.strParLeicester+=iRound;
		this.strParNottingham+=iRound;
		this.strParBirmingham+=iRound;
		this.strParReiko+=iRound;
		this.strParAbdullah+=iRound;
	}
		
	private void initialiseTestSetUp(int iRound){
		
		this.updateAllTestInputs(iRound);
		
		Branch b1 = new Branch(strParLeicester, 0, 0);
		Branch b2 = new Branch(strParNottingham, 1, 1);
		Branch b3 = new Branch(strParBirmingham, 2, 2);
		
		b1.at.add(new Car("A1"));
		b2.at.add(new Car("B2"));
		b2.at.add(new Car("C3"));
		
		
		Branch[] ServiceBranches = new Branch[3];
		ServiceBranches[0]=b1;
		ServiceBranches[1]=b2;
		ServiceBranches[2]=b3;

		// Initialize Rental Service
		this.rentalService = new Rental();				
		this.rentalService.initialise(ServiceBranches);
		
		this.clientReg1_Abdullah=null;
		this.clientReg2_Reiko=null;
		this.makeRes1=null;
		this.makeRes2=null;
	}
	
	
	
	

	
	/**
	 * 
	 * Test cases [A-E]
	 */
	private Boolean oReturn=null;
	
	private void testCaseA(int iRound, boolean isForValidation){
		
		System.out.println("\t testCaseA \t" + this.getIsTrainingOrValidation(isForValidation));
		
		
		/**
		 * 
		 * 
		 * 1 - Training 
		 */
		if (!isForValidation){
			
			
			RunToTest.endStartSeparation("#doStart");
					
			RunToTest.endStartSeparation("RegisterClient");
			this.clientReg2_Reiko = this.rentalService.registerClient(strParLeicester, strParReiko);
						
			RunToTest.endStartSeparation("RegisterClient");
			this.clientReg1_Abdullah = this.rentalService.registerClient(strParBirmingham, strParAbdullah);
			
			RunToTest.endStartSeparation("makeReservation");
			this.makeRes1= this.rentalService.makeReservation(clientReg1_Abdullah, strParLeicester, strParNottingham);
						
			RunToTest.endStartSeparation("makeReservation");
			this.makeRes2= this.rentalService.makeReservation(clientReg1_Abdullah, strParBirmingham, strParLeicester);
			
			RunToTest.endStartSeparation("pickupCar");
			this.rentalService.pickupCar(this.makeRes2);
			
			RunToTest.endStartSeparation("cancelReservation");
			this.rentalService.cancelReservation(makeRes1);
						
			RunToTest.endStartSeparation("cancelReservation");
			this.rentalService.cancelReservation(makeRes2);
						
			RunToTest.endStartSeparation("makeReservation");
			this.makeRes1= this.rentalService.makeReservation(clientReg1_Abdullah, strParLeicester, strParBirmingham);			
						
			RunToTest.endStartSeparation("cancelReservation");
			this.rentalService.cancelReservation(makeRes1);
						
			RunToTest.endStartSeparation("cancelClientReservation");
			this.rentalService.cancelClientReservation(clientReg2_Reiko);
						
			RunToTest.endStartSeparation("cancelClientReservation");
			this.rentalService.cancelClientReservation(clientReg1_Abdullah);
						
			RunToTest.endStartSeparation("makeReservation");
			this.rentalService.makeReservation(this.clientReg1_Abdullah, "London", "London");
			
			RunToTest.endStartSeparation("#doStop");
			
			return;
		}
		
		
		
		
		/*
		 * 2 - Learning observed instances before validation process  
		 */
		this.LearningActionsBeforeValidationProcess();
		
		
		
		
		/*
		 *  3 - validation by v-contract extraction and the execution of Henshin engine
		 */
		
		RunToTest.endStartSeparation("#doStart");		
		RunToTest.endStartSeparation("RegisterClient");
		this.clientReg2_Reiko = this.rentalService.registerClient(strParLeicester, strParReiko);
		RunToTest.endStartSeparation("#doStop");					
		this.ValidationDecisionTree(iRound, "A", this.clientReg2_Reiko, "registerClient", strParLeicester, strParReiko);
		
		
		
		RunToTest.endStartSeparation("#doStart");
		RunToTest.endStartSeparation("RegisterClient");
		this.clientReg1_Abdullah = this.rentalService.registerClient(strParBirmingham, strParAbdullah);
		RunToTest.endStartSeparation("#doStop");
		this.ValidationDecisionTree(iRound, "A", clientReg1_Abdullah, "registerClient", strParLeicester, strParAbdullah);
		
		
		
		RunToTest.endStartSeparation("#doStart");
		RunToTest.endStartSeparation("makeReservation");
		this.makeRes1= this.rentalService.makeReservation(clientReg1_Abdullah, strParLeicester, strParNottingham);
		RunToTest.endStartSeparation("#doStop");					
		this.ValidationDecisionTree(iRound, "A", makeRes1, "makeReservation", clientReg1_Abdullah, strParLeicester, strParNottingham);
		
		
		
		RunToTest.endStartSeparation("#doStart");
		RunToTest.endStartSeparation("makeReservation");
		this.makeRes2= this.rentalService.makeReservation(clientReg1_Abdullah, strParBirmingham, strParLeicester);
		RunToTest.endStartSeparation("#doStop");
		this.ValidationDecisionTree(iRound, "A", makeRes2, "makeReservation", clientReg1_Abdullah, strParBirmingham, strParLeicester);
		
		
		
		RunToTest.endStartSeparation("#doStart");
		RunToTest.endStartSeparation("pickupCar");
		this.oReturn=this.rentalService.pickupCar(this.makeRes2);
		RunToTest.endStartSeparation("#doStop");
		this.ValidationDecisionTree(iRound, "A", oReturn, "pickupCar", this.makeRes2);
		
		
		
		RunToTest.endStartSeparation("#doStart");
		RunToTest.endStartSeparation("cancelReservation");
		this.oReturn=this.rentalService.cancelReservation(makeRes1);
		RunToTest.endStartSeparation("#doStop");
		this.ValidationDecisionTree(iRound, "A", this.oReturn, "cancelReservation", makeRes1);
		
		
		
		RunToTest.endStartSeparation("#doStart");
		RunToTest.endStartSeparation("cancelReservation");
		this.oReturn=this.rentalService.cancelReservation(makeRes2);
		RunToTest.endStartSeparation("#doStop");
		this.ValidationDecisionTree(iRound, "A", this.oReturn, "cancelReservation", makeRes2);
		
		
		
		RunToTest.endStartSeparation("#doStart");
		RunToTest.endStartSeparation("makeReservation");
		this.makeRes1= this.rentalService.makeReservation(clientReg1_Abdullah, strParLeicester, strParBirmingham);			
		RunToTest.endStartSeparation("#doStop");
		this.ValidationDecisionTree(iRound, "A", makeRes1, "makeReservation", clientReg1_Abdullah, strParLeicester, strParBirmingham);
		
		
		
		RunToTest.endStartSeparation("#doStart");
		RunToTest.endStartSeparation("cancelReservation");
		this.oReturn=this.rentalService.cancelReservation(makeRes1);
		RunToTest.endStartSeparation("#doStop");
		this.ValidationDecisionTree(iRound, "A", this.oReturn, "cancelReservation", makeRes1);
		
		
		
		RunToTest.endStartSeparation("#doStart");
		RunToTest.endStartSeparation("cancelClientReservation");
		this.oReturn=this.rentalService.cancelClientReservation(clientReg2_Reiko);
		RunToTest.endStartSeparation("#doStop");
		this.ValidationDecisionTree(iRound, "A", this.oReturn, "cancelClientReservation", clientReg2_Reiko);
		
		
		
		RunToTest.endStartSeparation("#doStart");
		RunToTest.endStartSeparation("cancelClientReservation");
		this.oReturn=this.rentalService.cancelClientReservation(clientReg1_Abdullah);					
		RunToTest.endStartSeparation("#doStop");
		this.ValidationDecisionTree(iRound, "A", this.oReturn, "cancelClientReservation", clientReg1_Abdullah);
		
		
		
		RunToTest.endStartSeparation("#doStart");
		RunToTest.endStartSeparation("makeReservation");
		this.makeRes2= this.rentalService.makeReservation(clientReg1_Abdullah, "London", "London");
		RunToTest.endStartSeparation("#doStop");
		this.ValidationDecisionTree(iRound, "A", makeRes2, "makeReservation", clientReg1_Abdullah, "London", "London");
		
	}
	
	private void testCaseB(int iRound, boolean isForValidation){
		
		System.out.println("\t testCaseB \t" + this.getIsTrainingOrValidation(isForValidation));
		
		
		/**
		 * 
		 * 
		 * 1 - Training 
		 */
		if (!isForValidation){

			RunToTest.endStartSeparation("#doStart");


			RunToTest.endStartSeparation("RegisterClient");
			clientReg2_Reiko = this.rentalService.registerClient(strParNottingham, strParReiko);


			RunToTest.endStartSeparation("makeReservation");
			makeRes1=this.rentalService.makeReservation(clientReg2_Reiko, strParNottingham, strParNottingham);


			RunToTest.endStartSeparation("RegisterClient");
			clientReg2_Reiko = this.rentalService.registerClient(strParNottingham, strParReiko);


			RunToTest.endStartSeparation("dropoffCar");
			this.rentalService.dropoffCar(makeRes1);


			RunToTest.endStartSeparation("RegisterClient");
			rentalService.registerClient("Nottingham2", strParReiko);


			RunToTest.endStartSeparation("makeReservation");
			makeRes1=this.rentalService.makeReservation(clientReg2_Reiko, strParLeicester, strParNottingham);


			RunToTest.endStartSeparation("makeReservation");
			makeRes2=this.rentalService.makeReservation(clientReg2_Reiko, strParNottingham, strParNottingham);


			RunToTest.endStartSeparation("cancelReservation");
			this.rentalService.cancelReservation(makeRes1);


			RunToTest.endStartSeparation("dropoffCar");
			this.rentalService.dropoffCar(makeRes1);


			RunToTest.endStartSeparation("cancelReservation");
			this.rentalService.cancelReservation(makeRes1);


			RunToTest.endStartSeparation("dropoffCar");
			this.rentalService.dropoffCar(makeRes1);


			RunToTest.endStartSeparation("#doStop");
			
			return;
		}
		
		
		/*
		 * 2 - Learning observed instances before validation process  
		 */
		this.LearningActionsBeforeValidationProcess();
		
		
		/*
		 *  3 - validation by v-contract extraction and the execution of Henshin engine
		 */
		
		RunToTest.endStartSeparation("#doStart");
		RunToTest.endStartSeparation("RegisterClient");
		clientReg2_Reiko = this.rentalService.registerClient(strParNottingham, strParReiko);
		RunToTest.endStartSeparation("#doStop");
		this.ValidationDecisionTree(iRound, "B", clientReg2_Reiko, "RegisterClient", strParNottingham, strParReiko);
		
		
		RunToTest.endStartSeparation("#doStart");
		RunToTest.endStartSeparation("makeReservation");
		makeRes1=this.rentalService.makeReservation(clientReg2_Reiko, strParNottingham, strParNottingham);
		RunToTest.endStartSeparation("#doStop");
		this.ValidationDecisionTree(iRound, "B", makeRes1, "makeReservation", clientReg2_Reiko, strParNottingham, strParNottingham);
		
		
		RunToTest.endStartSeparation("#doStart");
		RunToTest.endStartSeparation("RegisterClient");
		clientReg2_Reiko = this.rentalService.registerClient(strParNottingham, strParReiko);
		RunToTest.endStartSeparation("#doStop");		
		this.ValidationDecisionTree(iRound, "B", clientReg2_Reiko, "RegisterClient", strParNottingham, strParReiko);
		
		
		RunToTest.endStartSeparation("#doStart");
		RunToTest.endStartSeparation("dropoffCar");
		this.oReturn=this.rentalService.dropoffCar(makeRes1);
		RunToTest.endStartSeparation("#doStop");					
		this.ValidationDecisionTree(iRound, "B", this.oReturn, "dropoffCar", makeRes1);
		
		
		RunToTest.endStartSeparation("#doStart");
		RunToTest.endStartSeparation("RegisterClient");
		this.clientReg1_Abdullah=rentalService.registerClient("Nottingham2", strParReiko);
		RunToTest.endStartSeparation("#doStop");
		this.ValidationDecisionTree(iRound, "B", clientReg1_Abdullah, "RegisterClient", "Nottingham2", strParReiko);
		
		
		RunToTest.endStartSeparation("#doStart");
		RunToTest.endStartSeparation("makeReservation");
		makeRes1=this.rentalService.makeReservation(clientReg2_Reiko, strParLeicester, strParNottingham);
		RunToTest.endStartSeparation("#doStop");			
		this.ValidationDecisionTree(iRound, "B", makeRes1, "makeReservation", clientReg2_Reiko, strParLeicester, strParNottingham);
		
		
		RunToTest.endStartSeparation("#doStart");
		RunToTest.endStartSeparation("makeReservation");
		makeRes2=this.rentalService.makeReservation(clientReg2_Reiko, strParNottingham, strParNottingham);
		RunToTest.endStartSeparation("#doStop");			
		this.ValidationDecisionTree(iRound, "B", makeRes2, "makeReservation", clientReg2_Reiko, strParNottingham, strParNottingham);
		

		RunToTest.endStartSeparation("#doStart");
		RunToTest.endStartSeparation("cancelReservation");
		this.oReturn=this.rentalService.cancelReservation(makeRes1);
		RunToTest.endStartSeparation("#doStop");			
		this.ValidationDecisionTree(iRound, "B", this.oReturn, "cancelReservation", makeRes1);
		
		
		RunToTest.endStartSeparation("#doStart");
		RunToTest.endStartSeparation("dropoffCar");
		this.oReturn=this.rentalService.dropoffCar(makeRes1);
		RunToTest.endStartSeparation("#doStop");			
		this.ValidationDecisionTree(iRound, "B", this.oReturn, "dropoffCar", makeRes1);
		
				
		RunToTest.endStartSeparation("#doStart");
		RunToTest.endStartSeparation("cancelReservation");
		this.oReturn=this.rentalService.cancelReservation(makeRes1);
		RunToTest.endStartSeparation("#doStop");			
		this.ValidationDecisionTree(iRound, "B", this.oReturn, "cancelReservation", makeRes1);
		
		
		RunToTest.endStartSeparation("#doStart");
		RunToTest.endStartSeparation("dropoffCar");
		this.oReturn=this.rentalService.dropoffCar(makeRes1);
		RunToTest.endStartSeparation("#doStop");			
		this.ValidationDecisionTree(iRound, "B", this.oReturn, "dropoffCar", makeRes1);
		
	}

	private void testCaseC(int iRound, boolean isForValidation){
		
		System.out.println("\t testCaseC \t" + this.getIsTrainingOrValidation(isForValidation));
		
		
		/**
		 * 
		 * 
		 * 1 - Training 
		 */
		if (!isForValidation){

			RunToTest.endStartSeparation("#doStart");


			RunToTest.endStartSeparation("RegisterClient");
			clientReg2_Reiko = this.rentalService.registerClient(strParLeicester, strParReiko);


			RunToTest.endStartSeparation("RegisterClient");
			clientReg1_Abdullah = this.rentalService.registerClient(strParLeicester, strParAbdullah);


			RunToTest.endStartSeparation("makeReservation");
			makeRes1=this.rentalService.makeReservation(clientReg2_Reiko, strParLeicester, strParBirmingham);


			RunToTest.endStartSeparation("makeReservation");
			makeRes2=this.rentalService.makeReservation(clientReg1_Abdullah, strParLeicester, strParLeicester);


			RunToTest.endStartSeparation("pickupCar");
			this.rentalService.pickupCar(makeRes1);


			RunToTest.endStartSeparation("cancelReservation");
			this.rentalService.cancelReservation(makeRes1);


			RunToTest.endStartSeparation("dropoffCar");
			this.rentalService.dropoffCar(makeRes2);


			RunToTest.endStartSeparation("pickupCar");
			this.rentalService.pickupCar(makeRes1);


			RunToTest.endStartSeparation("dropoffCar");
			this.rentalService.dropoffCar(makeRes1);		


			RunToTest.endStartSeparation("cancelClientReservation");
			this.rentalService.cancelClientReservation(clientReg2_Reiko);


			RunToTest.endStartSeparation("cancelClientReservation");
			this.rentalService.cancelClientReservation(clientReg1_Abdullah);


			RunToTest.endStartSeparation("#doStop");
			
			return;
		}
		
		
		/*
		 * 2 - Learning observed instances before validation process  
		 */
		this.LearningActionsBeforeValidationProcess();
		
		
		/*
		 *  3 - validation by v-contract extraction and the execution of Henshin engine
		 */
		
		RunToTest.endStartSeparation("#doStart");
		RunToTest.endStartSeparation("RegisterClient");
		clientReg2_Reiko = this.rentalService.registerClient(strParLeicester, strParReiko);
		RunToTest.endStartSeparation("#doStop");			
		this.ValidationDecisionTree(iRound, "C", clientReg2_Reiko, "RegisterClient", strParLeicester, strParReiko);
		
		
		RunToTest.endStartSeparation("#doStart");
		RunToTest.endStartSeparation("RegisterClient");
		clientReg1_Abdullah = this.rentalService.registerClient(strParLeicester, strParAbdullah);
		RunToTest.endStartSeparation("#doStop");			
		this.ValidationDecisionTree(iRound, "C", clientReg1_Abdullah, "RegisterClient", strParLeicester, strParAbdullah);
		
		
		RunToTest.endStartSeparation("#doStart");
		RunToTest.endStartSeparation("makeReservation");
		makeRes1=this.rentalService.makeReservation(clientReg2_Reiko, strParLeicester, strParBirmingham);
		RunToTest.endStartSeparation("#doStop");			
		this.ValidationDecisionTree(iRound, "C", makeRes1, "makeReservation", clientReg2_Reiko, strParLeicester, strParBirmingham);
		
		
		RunToTest.endStartSeparation("#doStart");
		RunToTest.endStartSeparation("makeReservation");
		makeRes2=this.rentalService.makeReservation(clientReg1_Abdullah, strParLeicester, strParLeicester);
		RunToTest.endStartSeparation("#doStop");					
		this.ValidationDecisionTree(iRound, "C", makeRes2, "makeReservation", clientReg1_Abdullah, strParLeicester, strParLeicester);
		
		
		RunToTest.endStartSeparation("#doStart");
		RunToTest.endStartSeparation("pickupCar");
		this.oReturn=this.rentalService.pickupCar(makeRes1);
		RunToTest.endStartSeparation("#doStop");			
		this.ValidationDecisionTree(iRound, "C", this.oReturn, "pickupCar", makeRes1);
		
		
		RunToTest.endStartSeparation("#doStart");
		RunToTest.endStartSeparation("cancelReservation");
		this.oReturn=this.rentalService.cancelReservation(makeRes1);
		RunToTest.endStartSeparation("#doStop");			
		this.ValidationDecisionTree(iRound, "C", this.oReturn, "cancelReservation", makeRes1);
		
		
		RunToTest.endStartSeparation("#doStart");
		RunToTest.endStartSeparation("dropoffCar");
		this.oReturn=this.rentalService.dropoffCar(makeRes2);
		RunToTest.endStartSeparation("#doStop");			
		this.ValidationDecisionTree(iRound, "C", this.oReturn, "dropoffCar", makeRes2);
		
		
		RunToTest.endStartSeparation("#doStart");
		RunToTest.endStartSeparation("pickupCar");
		this.oReturn=this.rentalService.pickupCar(makeRes1);
		RunToTest.endStartSeparation("#doStop");
		this.ValidationDecisionTree(iRound, "C", this.oReturn, "pickupCar", makeRes1);
		
		
		RunToTest.endStartSeparation("#doStart");
		RunToTest.endStartSeparation("dropoffCar");
		this.oReturn=this.rentalService.dropoffCar(makeRes1);		
		RunToTest.endStartSeparation("#doStop");					
		this.ValidationDecisionTree(iRound, "C", this.oReturn, "dropoffCar", makeRes1);
		
		
		RunToTest.endStartSeparation("#doStart");
		RunToTest.endStartSeparation("cancelClientReservation");
		this.oReturn=this.rentalService.cancelClientReservation(clientReg2_Reiko);
		RunToTest.endStartSeparation("#doStop");			
		this.ValidationDecisionTree(iRound, "C", this.oReturn, "cancelClientReservation", clientReg2_Reiko);
		
		
		RunToTest.endStartSeparation("#doStart");
		RunToTest.endStartSeparation("cancelClientReservation");
		this.oReturn=this.rentalService.cancelClientReservation(clientReg1_Abdullah);
		RunToTest.endStartSeparation("#doStop");		
		this.ValidationDecisionTree(iRound, "C", this.oReturn, "cancelClientReservation", clientReg1_Abdullah);	
	}

	private void testCaseD(int iRound, boolean isForValidation){
		
		System.out.println("\t testCaseD \t" + this.getIsTrainingOrValidation(isForValidation));
		
		
		/**
		 * 
		 * 
		 * 1 - Training 
		 */
		if (!isForValidation){


			RunToTest.endStartSeparation("#doStart");


			RunToTest.endStartSeparation("RegisterClient");
			clientReg2_Reiko = this.rentalService.registerClient(strParNottingham, strParReiko);

			RunToTest.endStartSeparation("makeReservation");
			makeRes1=this.rentalService.makeReservation(clientReg2_Reiko, strParNottingham, strParNottingham);

			RunToTest.endStartSeparation("dropoffCar");
			this.rentalService.dropoffCar(makeRes1);

			RunToTest.endStartSeparation("pickupCar");
			this.rentalService.pickupCar(makeRes1);

			RunToTest.endStartSeparation("pickupCar");
			this.rentalService.pickupCar(makeRes1);

			RunToTest.endStartSeparation("dropoffCar");
			this.rentalService.dropoffCar(makeRes1);

			RunToTest.endStartSeparation("dropoffCar");
			this.rentalService.dropoffCar(makeRes1);

			RunToTest.endStartSeparation("pickupCar");
			this.rentalService.pickupCar(makeRes1);

			RunToTest.endStartSeparation("dropoffCar");
			this.rentalService.dropoffCar(makeRes1);


			RunToTest.endStartSeparation("#doStop");
			
			return;
		}
		
		
		/*
		 * 2 - Learning observed instances before validation process  
		 */
		this.LearningActionsBeforeValidationProcess();
		
		
		/*
		 *  3 - validation by v-contract extraction and the execution of Henshin engine
		 */
		
		RunToTest.endStartSeparation("#doStart");
		RunToTest.endStartSeparation("RegisterClient");
		clientReg2_Reiko = this.rentalService.registerClient(strParNottingham, strParReiko);
		RunToTest.endStartSeparation("#doStop");			
		this.ValidationDecisionTree(iRound, "D", clientReg2_Reiko, "registerClient", strParNottingham, strParReiko);
		
		
		RunToTest.endStartSeparation("#doStart");
		RunToTest.endStartSeparation("makeReservation");
		makeRes1=this.rentalService.makeReservation(clientReg2_Reiko, strParNottingham, strParNottingham);
		RunToTest.endStartSeparation("#doStop");					
		this.ValidationDecisionTree(iRound, "D", this.makeRes1, "makeReservation", clientReg2_Reiko, strParNottingham, strParNottingham);
		
		
		RunToTest.endStartSeparation("#doStart");
		RunToTest.endStartSeparation("dropoffCar");
		this.oReturn=this.rentalService.dropoffCar(makeRes1);
		RunToTest.endStartSeparation("#doStop");					
		this.ValidationDecisionTree(iRound, "D", this.oReturn, "dropoffCar", makeRes1);
		
		
		RunToTest.endStartSeparation("#doStart");
		RunToTest.endStartSeparation("pickupCar");
		this.oReturn=this.rentalService.pickupCar(makeRes1);
		RunToTest.endStartSeparation("#doStop");							
		this.ValidationDecisionTree(iRound, "D", this.oReturn, "pickupCar", makeRes1);
		
		
		RunToTest.endStartSeparation("#doStart");
		RunToTest.endStartSeparation("pickupCar");
		this.oReturn=this.rentalService.pickupCar(makeRes1);
		RunToTest.endStartSeparation("#doStop");							
		this.ValidationDecisionTree(iRound, "D", this.oReturn, "pickupCar", makeRes1);
		
		
		RunToTest.endStartSeparation("#doStart");
		RunToTest.endStartSeparation("dropoffCar");
		this.oReturn=this.rentalService.dropoffCar(makeRes1);
		RunToTest.endStartSeparation("#doStop");			
		this.ValidationDecisionTree(iRound, "D", this.oReturn, "dropoffCar", makeRes1);
		
		
		RunToTest.endStartSeparation("#doStart");
		RunToTest.endStartSeparation("dropoffCar");
		this.oReturn=this.rentalService.dropoffCar(makeRes1);
		RunToTest.endStartSeparation("#doStop");							
		this.ValidationDecisionTree(iRound, "D", this.oReturn, "dropoffCar", makeRes1);
		
		
		RunToTest.endStartSeparation("#doStart");
		RunToTest.endStartSeparation("pickupCar");
		this.oReturn=this.rentalService.pickupCar(makeRes1);
		RunToTest.endStartSeparation("#doStop");						
		this.ValidationDecisionTree(iRound, "D", this.oReturn, "pickupCar", makeRes1);
		
		
		RunToTest.endStartSeparation("#doStart");
		RunToTest.endStartSeparation("dropoffCar");
		this.oReturn=this.rentalService.dropoffCar(makeRes1);
		RunToTest.endStartSeparation("#doStop");			
		this.ValidationDecisionTree(iRound, "D", this.oReturn, "dropoffCar", makeRes1);
	}

	private void testCaseE(int iRound, boolean isForValidation){
		
		System.out.println("\t testCaseE \t" + this.getIsTrainingOrValidation(isForValidation));
		
		
		/**
		 * 
		 * 
		 * 1 - Training 
		 */
		if (!isForValidation){

			RunToTest.endStartSeparation("#doStart");


			RunToTest.endStartSeparation("RegisterClient");
			clientReg2_Reiko = this.rentalService.registerClient(strParNottingham, strParReiko);

			RunToTest.endStartSeparation("makeReservation");
			makeRes1=this.rentalService.makeReservation(clientReg2_Reiko, strParNottingham, strParBirmingham);

			RunToTest.endStartSeparation("pickupCar");
			this.rentalService.pickupCar(makeRes1);		

			RunToTest.endStartSeparation("pickupCar");
			this.rentalService.pickupCar(makeRes1);		

			RunToTest.endStartSeparation("dropoffCar");
			this.rentalService.dropoffCar(makeRes1);		

			RunToTest.endStartSeparation("dropoffCar");
			this.rentalService.dropoffCar(makeRes1);		

			RunToTest.endStartSeparation("pickupCar");
			this.rentalService.pickupCar(makeRes1);		

			RunToTest.endStartSeparation("dropoffCar");
			this.rentalService.dropoffCar(makeRes1);


			RunToTest.endStartSeparation("#doStop");
			
			return;
		}
		
		
		/*
		 * 2 - Learning observed instances before validation process  
		 */
		this.LearningActionsBeforeValidationProcess();
		
		
		/*
		 *  3 - validation by v-contract extraction and the execution of Henshin engine
		 */
		
		RunToTest.endStartSeparation("#doStart");
		RunToTest.endStartSeparation("RegisterClient");
		clientReg2_Reiko = this.rentalService.registerClient(strParNottingham, strParReiko);
		RunToTest.endStartSeparation("#doStop");			
		this.ValidationDecisionTree(iRound, "E", clientReg2_Reiko, "registerClient", strParNottingham, strParReiko);
		
		
		RunToTest.endStartSeparation("#doStart");
		RunToTest.endStartSeparation("makeReservation");
		makeRes1=this.rentalService.makeReservation(clientReg2_Reiko, strParNottingham, strParBirmingham);
		RunToTest.endStartSeparation("#doStop");	
		this.ValidationDecisionTree(iRound, "E", makeRes1, "makeReservation", clientReg2_Reiko, strParNottingham, strParBirmingham);
		
		
		RunToTest.endStartSeparation("#doStart");
		RunToTest.endStartSeparation("pickupCar");
		this.oReturn=this.rentalService.pickupCar(makeRes1);		
		RunToTest.endStartSeparation("#doStop");					
		this.ValidationDecisionTree(iRound, "E", this.oReturn, "pickupCar", makeRes1);
		
		
		RunToTest.endStartSeparation("#doStart");
		RunToTest.endStartSeparation("pickupCar");
		this.oReturn=this.rentalService.pickupCar(makeRes1);		
		RunToTest.endStartSeparation("#doStop");			
		this.ValidationDecisionTree(iRound, "E", this.oReturn, "pickupCar", makeRes1);
		
		
		RunToTest.endStartSeparation("#doStart");
		RunToTest.endStartSeparation("dropoffCar");
		this.oReturn=this.rentalService.dropoffCar(makeRes1);		
		RunToTest.endStartSeparation("#doStop");							
		this.ValidationDecisionTree(iRound, "E", this.oReturn, "dropoffCar", makeRes1);
		
		
		RunToTest.endStartSeparation("#doStart");
		RunToTest.endStartSeparation("dropoffCar");
		this.oReturn=this.rentalService.dropoffCar(makeRes1);		
		RunToTest.endStartSeparation("#doStop");			
		this.ValidationDecisionTree(iRound, "E", this.oReturn, "dropoffCar", makeRes1);
		
		
		RunToTest.endStartSeparation("#doStart");
		RunToTest.endStartSeparation("pickupCar");
		this.oReturn=this.rentalService.pickupCar(makeRes1);		
		RunToTest.endStartSeparation("#doStop");	
		this.ValidationDecisionTree(iRound, "E", this.oReturn, "pickupCar", makeRes1);
		
		
		RunToTest.endStartSeparation("#doStart");
		RunToTest.endStartSeparation("dropoffCar");
		this.oReturn=this.rentalService.dropoffCar(makeRes1);
		RunToTest.endStartSeparation("#doStop");
		this.ValidationDecisionTree(iRound, "E", this.oReturn, "dropoffCar", makeRes1);
		
	}

	
	
	
	
	
	@After
	public void tearDown() throws Exception {
		
		this.testWriter.close();
		
		String strAllTestingResults = "";		
		Scanner fReader = new Scanner(new File("ValidationOutput_" + this.splitPercent.name())).useDelimiter("\\Z");
		strAllTestingResults = fReader.next();
		fReader.close();

		this.testWriter = new PrintWriter("ValidationOutput_" + this.splitPercent.name(), "UTF-8");
		for (String strDec: this.setOfDecisionsForFinalPrinting){
			this.testWriter.println(strDec);
		}
		this.testWriter.println(strAllTestingResults);
		this.testWriter.close();
		
		
		this.setOfDecisionsForFinalPrinting.clear();
		System.out.println("\n\n##### Done -----------------");		
	}

}
