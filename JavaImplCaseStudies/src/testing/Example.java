package testing;

import org.junit.Before;
import org.junit.Test;

import rentalService.*;

public class Example {

	
	Rental myRentalService = null;
	String clientReg1_Abdullah=null;
	String clientReg2_Reiko=null;
	String makeRes1=null;
	String makeRes2=null;
	String makeRes3=null;
	
	
	
	@Before
	public void setUp() throws Exception {
		
		//this.initialiseDB();
	}
	
	
	private void initialiseDB(){
		
		Branch b1 = new Branch("Leicester", 0, 0);  b1.at.add(new Car("A1"));
		Branch b2 = new Branch("Nottingham", 1, 1); b2.at.add(new Car("B2"));
		Branch b3 = new Branch("Birmingham", 2, 2); b2.at.add(new Car("C3"));
		
		Branch[] ServiceBranches = new Branch[3];
		ServiceBranches[0]=b1; ServiceBranches[1]=b2; ServiceBranches[2]=b3;

		// Initialize Rental service
		myRentalService = new Rental();				
		myRentalService.initialise(ServiceBranches);
	}
	
	
	@Test
	public void test() {
		
		this.exeTestCase1();
		this.exeTestCase2();
		this.exeTestCase3();
		this.exeTestCase4();
		this.exeTestCase5();
		//this.exeTestCaseNullInputs6();
	}
	
	
	
	private void exeTestCase1(){
		
		initialiseDB();
		
		RunToTest.endStartSeparation("#doStart");
	
		
		RunToTest.endStartSeparation("RegisterClient");
		clientReg2_Reiko = myRentalService.registerClient("Leicester", "Reiko");
		
		
		RunToTest.endStartSeparation("RegisterClient");
		clientReg1_Abdullah = myRentalService.registerClient("Leicester", "Abdullah");

		
		RunToTest.endStartSeparation("makeReservation");
		makeRes1=myRentalService.makeReservation(clientReg1_Abdullah, "Leicester", "Nottingham");
		
		
		RunToTest.endStartSeparation("makeReservation");
		myRentalService.makeReservation(clientReg1_Abdullah, "Birmingham", "Leicester");
		
		
		RunToTest.endStartSeparation("cancelReservation");
		myRentalService.cancelReservation(makeRes1);
		
		
		RunToTest.endStartSeparation("#doStop");
		
	}
	
	
	private void exeTestCase2(){
		
		initialiseDB();
		
		RunToTest.endStartSeparation("#doStart");
		
		
		RunToTest.endStartSeparation("RegisterClient");
		clientReg2_Reiko = myRentalService.registerClient("Nottingham", "Reiko");
		
		
		
		RunToTest.endStartSeparation("makeReservation");
		makeRes1=myRentalService.makeReservation(clientReg2_Reiko, "Nottingham", "Leicester");
		
		
		//RunToTest.endStartSeparation("makeReservation");
		//makeRes1=myRentalService.makeReservation(clientReg2_Reiko, "Nottingham", "Leicester");
		
		
		
		RunToTest.endStartSeparation("makeReservation");
		makeRes1=myRentalService.makeReservation(clientReg2_Reiko, "Nottingham", "Leicester");
		
				
		
		RunToTest.endStartSeparation("makeReservation");
		makeRes1=myRentalService.makeReservation(clientReg2_Reiko, "Nottingham", "Leicester");
		
		
		RunToTest.endStartSeparation("makeReservation");
		makeRes1=myRentalService.makeReservation(clientReg2_Reiko, "Nottingham", "Leicester");
		
		
		
		RunToTest.endStartSeparation("makeReservation");
		makeRes1=myRentalService.makeReservation(clientReg2_Reiko, "Nottingham", "Leicester");
		
		
		RunToTest.endStartSeparation("cancelClientReservation");
		myRentalService.cancelClientReservation(clientReg2_Reiko);
		
		RunToTest.endStartSeparation("makeReservation");
		makeRes2=myRentalService.makeReservation(clientReg2_Reiko, "Leicester", "Nottingham");
		
		
		
		
		RunToTest.endStartSeparation("cancelReservation");
		myRentalService.cancelReservation(makeRes1);
		
				
		RunToTest.endStartSeparation("#doStop");
	}
	
	
	private void exeTestCase3(){
		
		initialiseDB();
		
		RunToTest.endStartSeparation("#doStart");
		
		
		RunToTest.endStartSeparation("RegisterClient");
		clientReg2_Reiko = myRentalService.registerClient("Leicester", "Reiko");
		
		
		RunToTest.endStartSeparation("RegisterClient");
		clientReg1_Abdullah = myRentalService.registerClient("Leicester", "Abdullah");
		

		
		RunToTest.endStartSeparation("makeReservation");
		makeRes1=myRentalService.makeReservation(clientReg2_Reiko, "Leicester", "Birmingham");
		
		
		
		
		RunToTest.endStartSeparation("makeReservation");
		makeRes2=myRentalService.makeReservation(clientReg1_Abdullah, "Birmingham", "Leicester");
		
		
		
		RunToTest.endStartSeparation("cancelReservation");
		myRentalService.cancelReservation(makeRes1);
				
		
		
		//RunToTest.endStartSeparation("showClientReservations");
		//myRentalService.showClientReservations(makeRes2);
				
		
		RunToTest.endStartSeparation("#doStop");
	}

	
	
	private void exeTestCase4(){
		
		initialiseDB();		
		RunToTest.endStartSeparation("#doStart");
		
		RunToTest.endStartSeparation("RegisterClient");
		clientReg2_Reiko = myRentalService.registerClient("Nottingham", "Reiko");
		
		
		RunToTest.endStartSeparation("makeReservation");
		makeRes1=myRentalService.makeReservation(clientReg2_Reiko, "Nottingham", "Birmingham");
		
		
		RunToTest.endStartSeparation("pickupCar");
		myRentalService.pickupCar(makeRes1);
		
		
		RunToTest.endStartSeparation("dropoffCar");
		myRentalService.dropoffCar(makeRes1);
		
		
		RunToTest.endStartSeparation("#doStop");
	
	}
	
	
	private void exeTestCase5(){

		initialiseDB();
		
		RunToTest.endStartSeparation("#doStart");
		
		
		RunToTest.endStartSeparation("RegisterClient");
		clientReg2_Reiko = myRentalService.registerClient("Birmingham", "Reiko");
		
		
		RunToTest.endStartSeparation("RegisterClient");
		clientReg1_Abdullah = myRentalService.registerClient("Birmingham", "Abdullah");
		
	
		RunToTest.endStartSeparation("makeReservation");
		makeRes1=myRentalService.makeReservation(clientReg2_Reiko, "Birmingham", "Birmingham");
	
		
		RunToTest.endStartSeparation("makeReservation");
		makeRes1=myRentalService.makeReservation(clientReg1_Abdullah, "Birmingham", "Leicester");
	
		
		
		RunToTest.endStartSeparation("#doStop");
	}
	
	
	
	private void exeTestCaseNullInputs6(){
		
		initialiseDB();
		
		RunToTest.endStartSeparation("#doStart");
		
		
		RunToTest.endStartSeparation("RegisterClient");
		myRentalService.registerClient("", "");
		
	
		RunToTest.endStartSeparation("makeReservation");
		makeRes1=myRentalService.makeReservation("", "", "");
	
		
		
		RunToTest.endStartSeparation("pickupCar");
		myRentalService.pickupCar("");
		
		
		RunToTest.endStartSeparation("dropoffCar");
		myRentalService.dropoffCar("");
		
		
		RunToTest.endStartSeparation("cancelReservation");
		myRentalService.cancelReservation("");
		
		
		RunToTest.endStartSeparation("#doStop");
	}
	
	
	
	
	
	


}
