package as.model;

public class FlightRoute {
	
	private int routeID;
	private String source;
	private String destination;
	private String flightNumber;
	private String departureDate;
	private String arrivalDate;
	
	public FlightRoute(){
		
	}
	
	public String getSource(){
		return this.source;
	}
	public String getDestination(){
		return this.destination;
	}
	public String getFlightNumber(){
		return this.flightNumber;
	}
	public String getDepartureDate(){
		return this.departureDate;
	}
	public String arrivalDate(){
		return this.arrivalDate;
	}

}
