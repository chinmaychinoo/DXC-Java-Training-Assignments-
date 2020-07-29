package Assignment4;

import java.util.Scanner;

public class testCustomer {
	
	public static void main() {
		
		Scanner sc=new Scanner(System.in);
		
		Address add1=new Address( "IST Main HSR Layout", "Banglore");
		System.out.println(add1.getAddressDetails());
		
		customer c1 = new customer();
		c1.setCustomerName("John");
		c1.setResidentialAddress(add1);
		
		System.out.println(c1.getCustomerDetails());
		sc.close();
	}

}
