package Assignment6;

public class Customer {

	private String custNo;
	private String custName;
	private String category;

	public Customer(String custNo, String custName, String category) {
		
		this.custNo= custNo;
		this.custName= custName;
		this.category=category;	
	}

	public String getCustNo() {
		return custNo;
	}
	public String getCustName() {
		return custName;
	}
	public String getCategory() {
		return category;
	}

	}


