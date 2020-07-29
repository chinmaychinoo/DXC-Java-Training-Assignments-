package Assignment4;

public class customer{
	
	private Address residentialAddress;
	private String customerName;
	
	
	

@Override
public String toString() {
	return "customer [residentialAddress=" + residentialAddress + ", customerName=" + customerName + "]";
}
 


public Address getResidentialAddress() {
	return residentialAddress;
}



public void setResidentialAddress(Address residentialAddress) {
	this.residentialAddress = residentialAddress;
}



public String getCustomerName() {
	return customerName;
}



public void setCustomerName(String customerName) {
	this.customerName = customerName;
}



public String getCustomerDetails() {
	
	 String str= customerName  + " , " + residentialAddress;
	 return str;
	

}
}
