package Assignment1q8;

import java.util.Scanner;



public class assignment1q8 {
	public static void main ( String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int j;
		int k;
		
		System.out.println("Enter the number and you will get its table");
		int i=sc.nextInt();
		sc.close();
		for(j=1; j<=10 ; j++) {
			k=i*j;
			System.out.println(k);
			
		}
	}}
