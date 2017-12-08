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


		this.splitPercent= strSplit.p80;
		
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
		this.clearAllStoredRules();
		
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
		this.clearAllStoredRules();
		
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
		this.clearAllStoredRules();
		
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
		this.clearAllStoredRules();
		
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
		this.clearAllStoredRules();
		
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
	

	
	
	
		
	private void clearAllStoredRules(){
		
		this.HasRuleBeenExportedToHenshin=false;
		this.initialiseTestSetUp();
		this.henshinRentalModel= new RentalModel(this.rentalService);
		
		
		// clear all last generated rules
		DBRecord.removeObservation("");
	}
		
	
	private void ValidationDecisionTree (
			int iRound, String strTestCaseA_E,
			Object IsThrownException,
			String strRuleName, String par1){
		this.ValidationDecisionTree(iRound, strTestCaseA_E, IsThrownException, strRuleName, par1, null, null);
	}
	
	private void ValidationDecisionTree (
			int iRound, String strTestCaseA_E,
			Object IsThrownException,
			String strRuleName, String par1, String par2){
		this.ValidationDecisionTree(iRound, strTestCaseA_E, IsThrownException, strRuleName, par1, par2, null);
	}
	
	private void ValidationDecisionTree (
			int iRound, String strTestCaseA_E,
			Object IsThrownException,
			String strRuleName, String par1, String par2, String par3){
		
		String strDec="";		
		Boolean isThrownException = null;
		
		
		if (IsThrownException!=null){
			if (IsThrownException instanceof Boolean){
				isThrownException=(Boolean)IsThrownException;
			}
			else if (IsThrownException instanceof String){
				isThrownException=((String)IsThrownException).length()>0;
			}
		}
		
		
		if (isThrownException==null || isThrownException==false){
			
			/* check if rule-applicable without changing model state: FN if (Yes), TN  otherwise */
			if (this.henshinRentalModel.isRuleApplicableWithoutUpdatingModelState(strRuleName, par1, par2, par3)){
				strDec="FN\tincorrect: rule shouldn't be applicable";
			}
			else {
				strDec="TN\tcomplete";
			}			
		}
		else if (this.isLastContractInstanceAddedMatched()){
			
			/*	check if the minimal rule exists in inferred contracts
				then, check the applicability of maximal rule TP (Yes), FP (No)*/
				
			if (this.henshinRentalModel.isRuleApplicable(strRuleName, par1, par2, par3)){
				strDec="TP\tcorrect";
			} 
			else {
				strDec="FP\tincomplete: maxRule isn't applicable";
			}
		} 
		else {
			
			/*FP (No)*/
			strDec="FP\tincomplete: minRule doesn't exists";
		}
		
		
		
		
		this.setOfDecisions.add(strDec);
				
		this.testWriter.println(
				"r" + iRound + "-tc" + strTestCaseA_E + (++this.iInvocationCount) + "\t" + 
				strRuleName + "\t" +
				strDec);
		
		this.testWriter.flush();		
	}
	
	
	/*
	private void printTestInvocation(
			int iRound, 
			String strTestCaseA_E,			
			String strMethodName , 
			boolean isPassed,
			Boolean isRuleApplicable){
				
		
		String strDecision="";
		
		if (isPassed && isRuleApplicable){
			strDecision="TP(correct)";
		}
		else if (isPassed && !isRuleApplicable){
			strDecision="FN(incorrect)";
		} 
		else if (!isPassed && isRuleApplicable){
			strDecision="FP(incomplete)";
		}
		else{
			strDecision="TN(complete)";
		}
		
		this.setOfDecisions.add(strDecision);
		
		
		this.testWriter.println(
				"r" + iRound + "-tc" + strTestCaseA_E + (++this.iInvocationCount) + "\t" + 
				strMethodName + "\t" +
				isPassed + "\t" + 
				isRuleApplicable + "\t" + 
				strDecision);
		
		this.testWriter.flush();
	}
	*/
	
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
		
	private boolean isLastContractInstanceAddedMatched(){		
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
			
			// TODO  Henshin export ..
		}
	}
	
	private void initialiseTestSetUp(){
		
		Branch b1 = new Branch("Leicester", 0, 0);
		Branch b2 = new Branch("Nottingham", 1, 1);
		Branch b3 = new Branch("Birmingham", 2, 2);
		
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
			this.clientReg2_Reiko = this.rentalService.registerClient("Leicester", "Reiko");
						
			RunToTest.endStartSeparation("RegisterClient");
			this.clientReg1_Abdullah = this.rentalService.registerClient("Birmingham", "Abdullah");
			
			RunToTest.endStartSeparation("makeReservation");
			this.makeRes1= this.rentalService.makeReservation(clientReg1_Abdullah, "Leicester", "Nottingham");
						
			RunToTest.endStartSeparation("makeReservation");
			this.makeRes2= this.rentalService.makeReservation(clientReg1_Abdullah, "Birmingham", "Leicester");
			
			RunToTest.endStartSeparation("pickupCar");
			this.rentalService.pickupCar(this.makeRes2);
			
			RunToTest.endStartSeparation("cancelReservation");
			this.rentalService.cancelReservation(makeRes1);
						
			RunToTest.endStartSeparation("cancelReservation");
			this.rentalService.cancelReservation(makeRes2);
						
			RunToTest.endStartSeparation("makeReservation");
			this.makeRes1= this.rentalService.makeReservation(clientReg1_Abdullah, "Leicester", "Birmingham");			
						
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
		this.clientReg2_Reiko = this.rentalService.registerClient("Leicester", "Reiko");
		RunToTest.endStartSeparation("#doStop");					
		this.ValidationDecisionTree(iRound, "A", this.clientReg2_Reiko, "registerClient", "Leicester", "Reiko");
		
		
		
		RunToTest.endStartSeparation("#doStart");
		RunToTest.endStartSeparation("RegisterClient");
		this.clientReg1_Abdullah = this.rentalService.registerClient("Birmingham", "Abdullah");
		RunToTest.endStartSeparation("#doStop");
		this.ValidationDecisionTree(iRound, "A", clientReg1_Abdullah, "registerClient", "Leicester", "Abdullah");
		
		
		
		RunToTest.endStartSeparation("#doStart");
		RunToTest.endStartSeparation("makeReservation");
		this.makeRes1= this.rentalService.makeReservation(clientReg1_Abdullah, "Leicester", "Nottingham");
		RunToTest.endStartSeparation("#doStop");					
		this.ValidationDecisionTree(iRound, "A", makeRes1, "makeReservation", clientReg1_Abdullah, "Leicester", "Nottingham");
		
		
		
		RunToTest.endStartSeparation("#doStart");
		RunToTest.endStartSeparation("makeReservation");
		this.makeRes2= this.rentalService.makeReservation(clientReg1_Abdullah, "Birmingham", "Leicester");
		RunToTest.endStartSeparation("#doStop");
		this.ValidationDecisionTree(iRound, "A", makeRes2, "makeReservation", clientReg1_Abdullah, "Birmingham", "Leicester");
		
		
		
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
		this.makeRes1= this.rentalService.makeReservation(clientReg1_Abdullah, "Leicester", "Birmingham");			
		RunToTest.endStartSeparation("#doStop");
		this.ValidationDecisionTree(iRound, "A", makeRes1, "makeReservation", clientReg1_Abdullah, "Leicester", "Birmingham");
		
		
		
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
			clientReg2_Reiko = this.rentalService.registerClient("Nottingham", "Reiko");


			RunToTest.endStartSeparation("makeReservation");
			makeRes1=this.rentalService.makeReservation(clientReg2_Reiko, "Nottingham", "Nottingham");


			RunToTest.endStartSeparation("RegisterClient");
			clientReg2_Reiko = this.rentalService.registerClient("Nottingham", "Reiko");


			RunToTest.endStartSeparation("dropoffCar");
			this.rentalService.dropoffCar(makeRes1);


			RunToTest.endStartSeparation("RegisterClient");
			rentalService.registerClient("Nottingham2", "Reiko");


			RunToTest.endStartSeparation("makeReservation");
			makeRes1=this.rentalService.makeReservation(clientReg2_Reiko, "Leicester", "Nottingham");


			RunToTest.endStartSeparation("makeReservation");
			makeRes2=this.rentalService.makeReservation(clientReg2_Reiko, "Nottingham", "Nottingham");


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
		clientReg2_Reiko = this.rentalService.registerClient("Nottingham", "Reiko");
		RunToTest.endStartSeparation("#doStop");
		this.ValidationDecisionTree(iRound, "B", clientReg2_Reiko, "RegisterClient", "Nottingham", "Reiko");
		
		
		RunToTest.endStartSeparation("#doStart");
		RunToTest.endStartSeparation("makeReservation");
		makeRes1=this.rentalService.makeReservation(clientReg2_Reiko, "Nottingham", "Nottingham");
		RunToTest.endStartSeparation("#doStop");
		this.ValidationDecisionTree(iRound, "B", makeRes1, "makeReservation", clientReg2_Reiko, "Nottingham", "Nottingham");
		
		
		RunToTest.endStartSeparation("#doStart");
		RunToTest.endStartSeparation("RegisterClient");
		clientReg2_Reiko = this.rentalService.registerClient("Nottingham", "Reiko");
		RunToTest.endStartSeparation("#doStop");		
		this.ValidationDecisionTree(iRound, "B", clientReg2_Reiko, "RegisterClient", "Nottingham", "Reiko");
		
		
		RunToTest.endStartSeparation("#doStart");
		RunToTest.endStartSeparation("dropoffCar");
		this.oReturn=this.rentalService.dropoffCar(makeRes1);
		RunToTest.endStartSeparation("#doStop");					
		this.ValidationDecisionTree(iRound, "B", this.oReturn, "dropoffCar", makeRes1);
		
		
		RunToTest.endStartSeparation("#doStart");
		RunToTest.endStartSeparation("RegisterClient");
		this.clientReg1_Abdullah=rentalService.registerClient("Nottingham2", "Reiko");
		RunToTest.endStartSeparation("#doStop");
		this.ValidationDecisionTree(iRound, "B", clientReg1_Abdullah, "RegisterClient", "Nottingham2", "Reiko");
		
		
		RunToTest.endStartSeparation("#doStart");
		RunToTest.endStartSeparation("makeReservation");
		makeRes1=this.rentalService.makeReservation(clientReg2_Reiko, "Leicester", "Nottingham");
		RunToTest.endStartSeparation("#doStop");			
		this.ValidationDecisionTree(iRound, "B", makeRes1, "makeReservation", clientReg2_Reiko, "Leicester", "Nottingham");
		
		
		RunToTest.endStartSeparation("#doStart");
		RunToTest.endStartSeparation("makeReservation");
		makeRes2=this.rentalService.makeReservation(clientReg2_Reiko, "Nottingham", "Nottingham");
		RunToTest.endStartSeparation("#doStop");			
		this.ValidationDecisionTree(iRound, "B", makeRes2, "makeReservation", clientReg2_Reiko, "Nottingham", "Nottingham");
		

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
			clientReg2_Reiko = this.rentalService.registerClient("Leicester", "Reiko");


			RunToTest.endStartSeparation("RegisterClient");
			clientReg1_Abdullah = this.rentalService.registerClient("Leicester", "Abdullah");


			RunToTest.endStartSeparation("makeReservation");
			makeRes1=this.rentalService.makeReservation(clientReg2_Reiko, "Leicester", "Birmingham");


			RunToTest.endStartSeparation("makeReservation");
			makeRes2=this.rentalService.makeReservation(clientReg1_Abdullah, "Leicester", "Leicester");


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
		clientReg2_Reiko = this.rentalService.registerClient("Leicester", "Reiko");
		RunToTest.endStartSeparation("#doStop");			
		this.ValidationDecisionTree(iRound, "C", clientReg2_Reiko, "RegisterClient", "Leicester", "Reiko");
		
		
		RunToTest.endStartSeparation("#doStart");
		RunToTest.endStartSeparation("RegisterClient");
		clientReg1_Abdullah = this.rentalService.registerClient("Leicester", "Abdullah");
		RunToTest.endStartSeparation("#doStop");			
		this.ValidationDecisionTree(iRound, "C", clientReg1_Abdullah, "RegisterClient", "Leicester", "Abdullah");
		
		
		RunToTest.endStartSeparation("#doStart");
		RunToTest.endStartSeparation("makeReservation");
		makeRes1=this.rentalService.makeReservation(clientReg2_Reiko, "Leicester", "Birmingham");
		RunToTest.endStartSeparation("#doStop");			
		this.ValidationDecisionTree(iRound, "C", makeRes1, "makeReservation", clientReg2_Reiko, "Leicester", "Birmingham");
		
		
		RunToTest.endStartSeparation("#doStart");
		RunToTest.endStartSeparation("makeReservation");
		makeRes2=this.rentalService.makeReservation(clientReg1_Abdullah, "Leicester", "Leicester");
		RunToTest.endStartSeparation("#doStop");					
		this.ValidationDecisionTree(iRound, "C", makeRes2, "makeReservation", clientReg1_Abdullah, "Leicester", "Leicester");
		
		
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
			clientReg2_Reiko = this.rentalService.registerClient("Nottingham", "Reiko");

			RunToTest.endStartSeparation("makeReservation");
			makeRes1=this.rentalService.makeReservation(clientReg2_Reiko, "Nottingham", "Nottingham");

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
		clientReg2_Reiko = this.rentalService.registerClient("Nottingham", "Reiko");
		RunToTest.endStartSeparation("#doStop");			
		this.ValidationDecisionTree(iRound, "D", clientReg2_Reiko, "registerClient", "Nottingham", "Reiko");
		
		
		RunToTest.endStartSeparation("#doStart");
		RunToTest.endStartSeparation("makeReservation");
		makeRes1=this.rentalService.makeReservation(clientReg2_Reiko, "Nottingham", "Nottingham");
		RunToTest.endStartSeparation("#doStop");					
		this.ValidationDecisionTree(iRound, "D", this.makeRes1, "makeReservation", clientReg2_Reiko, "Nottingham", "Nottingham");
		
		
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
			clientReg2_Reiko = this.rentalService.registerClient("Nottingham", "Reiko");

			RunToTest.endStartSeparation("makeReservation");
			makeRes1=this.rentalService.makeReservation(clientReg2_Reiko, "Nottingham", "Birmingham");

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
		clientReg2_Reiko = this.rentalService.registerClient("Nottingham", "Reiko");
		RunToTest.endStartSeparation("#doStop");			
		this.ValidationDecisionTree(iRound, "E", clientReg2_Reiko, "registerClient", "Nottingham", "Reiko");
		
		
		RunToTest.endStartSeparation("#doStart");
		RunToTest.endStartSeparation("makeReservation");
		makeRes1=this.rentalService.makeReservation(clientReg2_Reiko, "Nottingham", "Birmingham");
		RunToTest.endStartSeparation("#doStop");	
		this.ValidationDecisionTree(iRound, "E", makeRes1, "makeReservation", clientReg2_Reiko, "Nottingham", "Birmingham");
		
		
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
