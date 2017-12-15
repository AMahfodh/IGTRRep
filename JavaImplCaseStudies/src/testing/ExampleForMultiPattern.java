package testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import rentalService.Branch;
import rentalService.Car;
import rentalService.Rental;

public class ExampleForMultiPattern {

	

	private Rental myRentalService = null;

	
	
	
	@Before
	public void setUp() throws Exception {
		
		Branch b1 = new Branch("Leicester", 0, 0);  
		b1.at.add(new Car("A1")); 
		b1.at.add(new Car("B2"));
		b1.at.add(new Car("C3"));
		Branch b2 = new Branch("Nottingham", 1, 1); 
		Branch b3 = new Branch("Birmingham", 2, 2); 
		
		
		Branch[] ServiceBranches = new Branch[3];
		ServiceBranches[0]=b1; 
		ServiceBranches[1]=b2; 
		ServiceBranches[2]=b3;

		
		// Initialize Rental service
		myRentalService = new Rental();				
		myRentalService.initialise(ServiceBranches);
	}
	
	
	
	@Test
	public void testTerminatingAndMovingABranch(){
		
		String clientReg1_Abdullah=null;
		String clientReg2_Reiko=null;
		String clientReg3_Timo=null;
		
		
		RunToTest.endStartSeparation("#doStart");
		
		

		RunToTest.endStartSeparation("RegisterClient");
		clientReg1_Abdullah = this.myRentalService.registerClient("Leicester", "Abdullah");
					
		RunToTest.endStartSeparation("makeReservation");
		this.myRentalService.makeReservation(clientReg1_Abdullah, "Leicester", "Birmingham");
		
		RunToTest.endStartSeparation("makeReservation");
		this.myRentalService.makeReservation(clientReg1_Abdullah, "Leicester", "Nottingham");
		
		
		
		RunToTest.endStartSeparation("RegisterClient");
		clientReg2_Reiko = this.myRentalService.registerClient("Leicester", "Reiko");
				
		RunToTest.endStartSeparation("makeReservation");
		this.myRentalService.makeReservation(clientReg2_Reiko, "Leicester", "Birmingham");
			
		RunToTest.endStartSeparation("makeReservation");
		this.myRentalService.makeReservation(clientReg2_Reiko, "Leicester", "Nottingham");
		
		
		/*********************/
		RunToTest.endStartSeparation("movingABranch");
		this.myRentalService.movingABranch("Leicester", "Nottingham");
		
		
		
		
		RunToTest.endStartSeparation("RegisterClient");
		clientReg3_Timo = myRentalService.registerClient("Nottingham", "Timo");
		
		RunToTest.endStartSeparation("makeReservation");
		myRentalService.makeReservation(clientReg3_Timo, "Nottingham", "Birmingham");
		
		RunToTest.endStartSeparation("makeReservation");
		myRentalService.makeReservation(clientReg3_Timo, "Nottingham", "Nottingham");
		
		
		
		/*********************/
		RunToTest.endStartSeparation("movingABranch");
		this.myRentalService.movingABranch("Nottingham", "Birmingham");
		
		
		RunToTest.endStartSeparation("#doStop");
	}




}
