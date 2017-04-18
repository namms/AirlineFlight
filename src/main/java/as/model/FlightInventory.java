package as.model;

public class FlightInventory {
	
	private int inventoryID;
	private String flightNumber;
	private int airlineID;
	private int flightCapacity;
	
	public FlightInventory(){
		
	}
	public String getFlightNumber(){
		return this.flightNumber;
	}
	public int getFlightCapacity(){
		return this.flightCapacity;
	}
	
	public int getAirlineID(){
		return this.airlineID;
	}

}
