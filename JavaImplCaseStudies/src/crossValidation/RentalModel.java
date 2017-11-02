package crossValidation;

import java.util.ArrayList;

import org.eclipse.emf.henshin.interpreter.UnitApplication;
import org.eclipse.emf.henshin.interpreter.impl.ProfilingApplicationMonitor;
import org.eclipse.emf.henshin.model.Unit;

import rentalService.*;


public class RentalModel implements IRental{

	
	protected UnitApplication rentalCarApplication=null;
	private ProfilingApplicationMonitor pam = new ProfilingApplicationMonitor();
	
	
	protected Branch[] branches=null;			

	protected ArrayList<Reservation> reservations=new ArrayList<Reservation>();		

	
	
	public RentalModel(){
		
		
		// TODO load Henshin model with start graph .. here
		
		
	}
	
		
	public void initialise(Branch Branches[]){

		// find and get rule from module.getUnits("initialise") ...
		Unit ruleU = null; 
		this.rentalCarApplication.setUnit(ruleU);
		
		
		// add parameters
		this.rentalCarApplication.setParameterValue("Branches", Branches);
		
		
		// apply rule
		this.applyRule();
		
	}
	
	public String registerClient(String city, String clientName){
		System.out.println(" registerClient ");
		return null;
	}
	
	public String makeReservation(String ClientID, String pickup, String dropoff){
		System.out.println(" makeReservation ");
		return null;
	}
	
	public void cancelReservation(String Reference){
		System.out.println(" cancelReservation ");
		
	}
	
	public void cancelClientReservation(String clientID){
		System.out.println(" cancelClientReservation ");
	}
		
	public void pickupCar(String Reference){
		System.out.println(" pickupCar ");
	}
	
	public void dropoffCar(String Reference){
		System.out.println(" dropoffCar ");
	}
		
	public ArrayList<Reservation> showClientReservations(String clientID){
		return null;
	}
	
	public ArrayList<Client> showClients (String city){
		return null;
	}
	
	public ArrayList<Car> showCars (String city){
		return null;
	}
	
	
	// applying rule
	protected boolean applyRule(){
		
		return this.rentalCarApplication.execute(pam);
	}
	
	
}
