package as.service;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class AirlineService {
	Properties p = new Properties();
	Connection conn;
	
	public AirlineService() throws IOException, ClassNotFoundException, SQLException{
		p.load(getClass().getClassLoader().getResourceAsStream("dbconn.properties"));
		System.out.println(p.getProperty("JDBC_DRIVER"));
		//Class.forName(p.getProperty("JDBC_DRIVER")); 
		 conn = DriverManager.getConnection(p.getProperty("DB_URL"), p.getProperty("user"),
				p.getProperty("password"));
		
	}
	
	/**
	 * checks if the user is logged in
	 * @param username
	 * @param password
	 * @return
	 */
	public boolean validateUser(String username, String password){
		
		
		return false;
	}
	/**
	 * adding customer after registration
	 */
	public void addCustomer(){
		
	}
	
	/**
	 * search the flight
	 */
	public void searchFlights(){
		
	}
	/**
	 * need for booking the flight
	 */
	
	public void bookFlight(){
		
	}
	/**
	 * check reservation given the pnr
	 * @param pan
	 */
	public void checkReservation(String pnr){
		
	}
	/**
	 * check reservation based on customer id
	 * @param customerID
	 */
	public void checkReservation(int customerID){
		
	}
	

}
