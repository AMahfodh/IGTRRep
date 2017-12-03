package testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import rentalService.Branch;
import rentalService.Car;
import rentalService.Rental;



public class TrainingtestCoverage {

	private strSplit splitPercent = null;
	private static final boolean TRAINING= false;
	private static final boolean VALIDATING= true;
	private Rental rentalService = null;
	private String clientReg1_Abdullah=null;
	private String clientReg2_Reiko=null;
	private String makeRes1=null;
	private String makeRes2=null;


	@Before
	public void setUp() throws Exception {
		this.splitPercent= strSplit.p20;
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
	
	@Test
	public void trainingByTestingIn5Rounds() {


		/*
		 * Training to learn visual contracts with splitting tests based on 5 cross-validation rounds 
		 */
		
		//this.round1();
		//this.round2();
		//this.round3();
		//this.round4();
		//this.round5(); 
	}



	private void round1(){

		System.out.println("#Round 1");
		this.initialiseTestSetUp();
		
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
		this.initialiseTestSetUp();
		
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
		this.initialiseTestSetUp();
		
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
		this.initialiseTestSetUp();
		
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
		this.initialiseTestSetUp();
		
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





	/**
	 * 
	 * Test cases [A-E]
	 */


	private void testCaseA(int iRound, boolean isForValidation){

		if (isForValidation){
			return;
		}

		System.out.println("\t testCaseA \t");

		this.clientReg2_Reiko = this.rentalService.registerClient("Leicester", "Reiko");

		this.clientReg1_Abdullah = this.rentalService.registerClient("Leicester", "Abdullah");

		this.makeRes1= this.rentalService.makeReservation(clientReg1_Abdullah, "Leicester", "Nottingham");

		this.makeRes2= this.rentalService.makeReservation(clientReg1_Abdullah, "Birmingham", "Leicester");

		this.rentalService.cancelReservation(makeRes1);

		this.rentalService.cancelReservation(makeRes2);

		this.makeRes1= this.rentalService.makeReservation(clientReg1_Abdullah, "Leicester", "Birmingham");			

		this.rentalService.cancelReservation(makeRes1);

		this.rentalService.cancelClientReservation(clientReg2_Reiko);

		this.rentalService.cancelClientReservation(clientReg1_Abdullah);


	}

	private void testCaseB(int iRound, boolean isForValidation){

		if (isForValidation){
			return;
		}

		System.out.println("\t testCaseB \t");

		clientReg2_Reiko = this.rentalService.registerClient("Nottingham", "Reiko");

		makeRes1=this.rentalService.makeReservation(clientReg2_Reiko, "Nottingham", "Nottingham");

		clientReg2_Reiko = this.rentalService.registerClient("Nottingham", "Reiko");

		this.rentalService.dropoffCar(makeRes1);

		rentalService.registerClient("Nottingham2", "Reiko");

		makeRes1=this.rentalService.makeReservation(clientReg2_Reiko, "Leicester", "Nottingham");

		makeRes2=this.rentalService.makeReservation(clientReg2_Reiko, "Nottingham", "Nottingham");

		this.rentalService.cancelReservation(makeRes1);

		this.rentalService.dropoffCar(makeRes1);

		this.rentalService.cancelReservation(makeRes1);

		this.rentalService.dropoffCar(makeRes1);

	}

	private void testCaseC(int iRound, boolean isForValidation){

		if (isForValidation){
			return;
		}


		System.out.println("\t testCaseC \t");

		clientReg2_Reiko = this.rentalService.registerClient("Leicester", "Reiko");

		clientReg1_Abdullah = this.rentalService.registerClient("Leicester", "Abdullah");

		makeRes1=this.rentalService.makeReservation(clientReg2_Reiko, "Leicester", "Birmingham");

		makeRes2=this.rentalService.makeReservation(clientReg1_Abdullah, "Leicester", "Leicester");

		this.rentalService.pickupCar(makeRes1);

		this.rentalService.cancelReservation(makeRes1);

		this.rentalService.dropoffCar(makeRes2);

		this.rentalService.pickupCar(makeRes1);

		this.rentalService.dropoffCar(makeRes1);		

		this.rentalService.cancelClientReservation(clientReg2_Reiko);

		this.rentalService.cancelClientReservation(clientReg1_Abdullah);


	}

	private void testCaseD(int iRound, boolean isForValidation){

		if (isForValidation){
			return;
		}

		System.out.println("\t testCaseD \t");

		clientReg2_Reiko = this.rentalService.registerClient("Nottingham", "Reiko");

		makeRes1=this.rentalService.makeReservation(clientReg2_Reiko, "Nottingham", "Nottingham");

		this.rentalService.dropoffCar(makeRes1);

		this.rentalService.pickupCar(makeRes1);

		this.rentalService.pickupCar(makeRes1);

		this.rentalService.dropoffCar(makeRes1);

		this.rentalService.dropoffCar(makeRes1);

		this.rentalService.pickupCar(makeRes1);

		this.rentalService.dropoffCar(makeRes1);

	}

	private void testCaseE(int iRound, boolean isForValidation){

		if (isForValidation){
			return;
		}

		System.out.println("\t testCaseE \t");

		clientReg2_Reiko = this.rentalService.registerClient("Nottingham", "Reiko");

		makeRes1=this.rentalService.makeReservation(clientReg2_Reiko, "Nottingham", "Birmingham");

		this.rentalService.pickupCar(makeRes1);		

		this.rentalService.pickupCar(makeRes1);		

		this.rentalService.dropoffCar(makeRes1);		

		this.rentalService.dropoffCar(makeRes1);		

		this.rentalService.pickupCar(makeRes1);		

		this.rentalService.dropoffCar(makeRes1);

	}





	@After
	public void tearDown() throws Exception {
	}



}
