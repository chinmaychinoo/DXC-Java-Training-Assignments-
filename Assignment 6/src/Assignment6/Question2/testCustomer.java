package Assignment6;

public class testCustomer  {
	
	public static void main(String[] args) throws InvalidInputException  {
		
		Customer c1= new Customer("C302","Chinmay","Platinum");
		
		

		
		if ((c1.getCustNo().startsWith("C")) || (c1.getCustNo().startsWith("c"))) {
			
			System.out.println("Customer Number :" + c1.getCustNo());
		}
		else {
			System.out.println("Customer Number is Invalid. ");
			System.out.println("It must start with ‘C’ or ‘c’");
			throw new InvalidInputException("Invalid number");	
		}
		
		
		
		if((c1.getCustName().length())>=4) {
			
			System.out.println("Customer Name :" + c1.getCustName());
		}
		else {
			System.out.println("Customer Name is Invalid. ");
			System.out.println("It must be atleast of 4 characters");
			throw new InvalidInputException("Invalid name");	
		}
	
if((c1.getCategory()=="Platinum") || (c1.getCategory()=="Silver" || (c1.getCategory()=="Gold"))) {
			
			System.out.println("Category :" + c1.getCategory());
		}
		else {
			System.out.println("Customer Category is Invalid. ");
			System.out.println("It must be either ‘Platinum’, ‘Gold’ or ‘Silver ‘ ");
			throw new InvalidInputException("Invalid Category");	
		}
		
		
		
		
		
	}
}
