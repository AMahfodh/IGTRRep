package rentalService;

import java.util.ArrayList;
import java.util.Random;



public class Rental implements IRental{

	protected Branch[] branches=null;			

	protected ArrayList<Reservation> reservations=new ArrayList<Reservation>();		

	public void initialise(Branch Branches[]){

		this.branches = Branches;
	}




	/**
	 * 
	 * 
	 * Main operations
	 *  - registerClient (..)
	 *  - makeReservation (..)
	 *  - cancelReservation (..)
	 *  - cancelClientReservation (..)
	 *  - pickupCar (..)
	 *  - dropoffCar (..)
	 */

	public String registerClient(String city, String clientName){

		Branch cBranch = this.getBranch(city);
		if (cBranch !=null){

			Client newClient = new Client();			
			newClient.cName =clientName;
			newClient.cID = cBranch.city + "_" + cBranch.cMax++;						
			cBranch.of.add(newClient);

			return newClient.cID;
		}
		return null;
	}


	public String makeReservation(String ClientID, String pickup, String dropoff){

		Branch pickupBranch = this.getBranch(pickup);
		Branch dropOffBranch = this.getBranch(dropoff);

		// check if the pickup and drop-off branches exists
		if (pickupBranch==null || 
			dropOffBranch==null){ 
			return null; 
		}


		// check if the client is registered at the pickup branch
		Client client = this.getClient(pickupBranch, ClientID);
		if (client==null){ 
			return null; 
		}


		// check if there is a car at the at pickup branch
		Car car = this.getCar(pickupBranch);		
		if (car==null){ 
			return null; 
		}


		Reservation mReservation = new Reservation(
				pickupBranch.city + "_" + (pickupBranch.rMax++),
				client,
				pickupBranch,
				dropOffBranch,
				car);	
		
		this.reservations.add(mReservation);

		return mReservation.reference;
	}


	public void cancelReservation(String Reference){		

		int iIndex = this.getReservationIndex(Reference);

		if (iIndex!=-1){
			this.reservations.remove(iIndex);
		}
	}


	public void cancelClientReservation(String clientID){		

		for (int iIndex=this.reservations.size()-1; iIndex>=0; iIndex--){

			if (this.reservations.get(iIndex).made.cID.equalsIgnoreCase(clientID)){
				this.reservations.remove(iIndex);
			}
		}
	}


	public void pickupCar(String Reference){

		int iIndex = this.getReservationIndex(Reference);

		if (iIndex==-1){
			return;			
		}
		
		
		Reservation reservation = this.reservations.get(iIndex);



		// check if this reservation hasn't been picked up already
		if (reservation.pickup==null){
			return;
		}


		// check if the reserved car still exist in the pick-up branch
		iIndex=-1;
		boolean isCarExist=false;
		for (Car car: reservation.pickup.at){
			iIndex++;
			if (car.registration.equalsIgnoreCase(reservation.For.registration)){
				isCarExist=true;
				break;
			}
		}

		if (!isCarExist){
			return;
		}


		// remove car from the pick up branch
		reservation.pickup.at.remove(iIndex);

		// remove pickup branch link from reservation object
		reservation.pickup=null;
	}

	

	public void dropoffCar(String Reference){

		int iIndex = this.getReservationIndex(Reference);

		if (iIndex==-1){
			return;			
		}

		Reservation reservation = this.reservations.get(iIndex);

		// check if the reserved car has been picked up already
		if (reservation.pickup!=null){
			return;
		}

		// return reserved car to the drop of branch
		Car car = reservation.For;		
		reservation.dropoff.at.add(car);


		// remove reservation object
		this.reservations.remove(iIndex);
	}






	public ArrayList<Reservation> showClientReservations(String clientID){

		ArrayList<Reservation> getClientReservations = new ArrayList<Reservation>();
		for (Reservation reservation: reservations){
			if (reservation.made.cID.equalsIgnoreCase(clientID)){
				getClientReservations.add(reservation);
			}
		}			
		return getClientReservations;			
	}


	public ArrayList<Client> showClients (String city){

		Branch clientsInBranch = this.getBranch(city);

		if (clientsInBranch!=null){
			return clientsInBranch.of;
		}

		return null;
	}


	public ArrayList<Car> showCars (String city){

		Branch carsInBranch = this.getBranch(city);

		if (carsInBranch!=null){
			return carsInBranch.at;		
		}

		return null;
	}


	private Client getClient(Branch branch, String ClientID){

		if (branch==null) {
			return null;
		}

		for (Client client: branch.of){
			if (client.cID.equalsIgnoreCase(ClientID)){
				return client;
			}
		}

		return null;
	}


	private Branch getBranch(String City){

		City = City.trim();
		if (City.length()==0){
			return null;
		}

		for (Branch branch: branches){
			if (branch.city.equalsIgnoreCase(City)){
				return branch;
			}
		}

		return null;
	}


	private Car getCar(Branch branch){

		if (branch==null || branch.at.size()<1){
			return null;
		}

		Random randomCar = new Random();
		int iCar = randomCar.nextInt(branch.at.size());
		if (iCar>= branch.at.size() || iCar<0){
			iCar=0;
		}
		return branch.at.get(iCar);
	}


	private int getReservationIndex(String Reference){

		for (int iIndex=0; iIndex<this.reservations.size(); iIndex++){

			if (this.reservations.get(iIndex).reference.equalsIgnoreCase(Reference)){
				return iIndex;
			}
		}

		return -1;
	}

	
}
