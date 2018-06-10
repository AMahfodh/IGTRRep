package rentalService;

import java.io.Serializable;
import java.util.ArrayList;



public interface IRental extends Serializable{
	
	public void initialise(Branch Branches[]);
	
	public String registerClient(String city, String clientName);
	
	public String makeReservation(String ClientID, String pickup, String dropoff);
	
	public void cancelReservation(String Reference);
	
	public void cancelClientReservation(String clientID);
		
	public void pickupCar(String Reference);
	
	public void dropoffCar(String Reference);
		
	public ArrayList<Reservation> showClientReservations(String clientID);
	
	public ArrayList<Client> showClients (String city);
	
	public ArrayList<Car> showCars (String city);
	 
}
