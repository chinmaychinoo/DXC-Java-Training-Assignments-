package Assignment1q13;

import java.util.Scanner;

public class assignment1q13 {
	public static void main( String[] args) {

		
		Scanner sc=new Scanner (System.in);
		
		
		System.out.println("Enter the number");
		int i=sc.nextInt();
		int j;
		int k=1;
		
		sc.close();
		
		for(j=1;j<=i;j++) {
			
			k=j*k;
		}
		System.out.println("The factorial is" +  k);
	}
}
