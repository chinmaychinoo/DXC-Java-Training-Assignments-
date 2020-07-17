package Assignment1q7;

import java.util.Scanner;

public class assignment1q7 {
	public static void main( String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a positive number");
		
		
		int i = sc.nextInt();
		sc.close();
		
		
		if(i<10) {
			System.out.println("Number lies between 0 and 9");
		}
		else if(i<100)
			System.out.println("Number lies between 10 and 99");
		else if(i<200)
			System.out.println("Number lies between 100 and 199");
		else if(i<501)
			System.out.println("Number lies between 200 and 500");
		else {
				System.out.println("Number lies beyond 500");
		}
		}
		

		
		

}
