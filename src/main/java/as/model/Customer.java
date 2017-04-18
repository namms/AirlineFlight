package as.model;

public class Customer {

	private int customerID;
	private String name;
	private String address;
	private String email;
	private String phone;
	private String username;
	private String password;
	
	public Customer(){
	}
	public int getCustomerID(){
		return this.customerID;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
	public void setAddress(String address){
		this.address=address;
	}
	public String getAddress(){
		return this.address;
	}
	public void setEmail(String email){
		this.email=email;
	}
	public String getEmail(){
		return this.email;
	}
	public void setPhone(String phone){
		this.phone=phone;
	}
	public String getPhone(){
		return this.phone;
	}
	public String getUsername(){
		return this.username;
	}
	public String getPassword(){
		return this.password;
	}
}
