package as.model;

public class Reservation {
	
	private int reservationID;
	private int customerID;
	private int routeID;
	private String pnr;
	private String seatClass;
	private String reservedDate;
	
	public Reservation(){
		
	}
	
	public String getPnr(){
		return this.pnr;
	}
	
	public String getSeatClass(){
		return this.seatClass;
	}
	public String getReservedDate(){
		return this.reservedDate;
	}

}
