package rentalService;

public class Reservation {

	protected String reference;
	protected Client made=null;	
	protected Branch pickup=null;
	protected Branch dropoff=null;
	protected Car For=null;

	protected Reservation(
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
