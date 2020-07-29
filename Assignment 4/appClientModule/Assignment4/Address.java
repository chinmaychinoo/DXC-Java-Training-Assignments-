package Assignment4;

public class Address {
	
	private String addressLine;
	private String city;
	
	
	



	public Address(String addressLine, String city) {
		// TODO Auto-generated constructor stub
		this.addressLine=addressLine;
		this.city=city;
	}





	@Override
	public String toString() {
		return "Address [addressLine=" + addressLine + ", city=" + city + "]";
	}





	public String getAddressLine() {
		return addressLine;
	}



	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}

	public String getAddressDetails() {
		
		 String str= addressLine + " , " + city;
		 return str;
	}
	
}


