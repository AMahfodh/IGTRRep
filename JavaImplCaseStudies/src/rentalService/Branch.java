package rentalService;

import java.util.ArrayList;


public class Branch {
	
	public ArrayList<Car> at =new ArrayList<Car>();	// at => car at a branch	
	public ArrayList<Client> of =new ArrayList<Client>();	//of => of Clients
	
	public String city=null;
	public int cMax=0;
	public int rMax=0;

	public Branch (String City, int CMax, int RMax){
		this.city = City;
		this.cMax=CMax;
		this.rMax=RMax;
	}
}

