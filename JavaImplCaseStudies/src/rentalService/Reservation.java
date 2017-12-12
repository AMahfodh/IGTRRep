package rentalService;

public class Reservation {

	public String reference;
	public Client made=null;	
	public Branch pickup=null;
	public Branch dropoff=null;
	public Car For=null;

	public Reservation(
			String Reference, 
			Client Made, 
			Branch Pickup, 
			Branch Dropoff, 
			Car CarFor){
		
		this.reference=Reference;
		this.made=Made;
		this.pickup=Pickup;
		this.dropoff=Dropoff;
		this.For=CarFor;		
	}
}
