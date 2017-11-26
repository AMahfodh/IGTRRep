package crossValidation;

import java.util.ArrayList;



import rentalService.*;


public class RentalModel {

	/*
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
		System.out.println(" registerClient :\t" + this.strCleanPar(city) + "\t" + this.strCleanPar(clientName));
		return null;
	}
	
	public String makeReservation(String ClientID, String pickup, String dropoff){
		System.out.println(" makeReservation :" + this.strCleanPar(ClientID) + "\t" + this.strCleanPar(pickup) + "\t"  + this.strCleanPar(dropoff));
		return null;
	}
	
	public void cancelReservation(String Reference){
		System.out.println(" cancelReservation: " + this.strCleanPar(Reference));
		
	}
	
	public void cancelClientReservation(String clientID){
		System.out.println(" cancelClientReservation: " + this.strCleanPar(clientID));
	}
		
	public void pickupCar(String Reference){
		System.out.println(" pickupCar : " + this.strCleanPar(Reference));
	}
	
	public void dropoffCar(String Reference){
		System.out.println(" dropoffCar : " + this.strCleanPar(Reference));
	}
		
	
	private String strCleanPar(String strPar){
		
		strPar = strPar.trim();
		
		if (strPar.length()==0){
			strPar="null";
		}
		return strPar;
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
	
	*/
}
