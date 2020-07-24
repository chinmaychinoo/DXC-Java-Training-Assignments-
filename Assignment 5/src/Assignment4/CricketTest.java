package Assignment4;

import java.util.Scanner;

public class CricketTest {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter target score: ");
		int targetScore=sc.nextInt();
		sc.close();
		
		 
		
		OneDayCricket odifinals=new OneDayCricket();
		
		
		
		odifinals.setcurrentOver(40);
		odifinals.setcurrentScore(180);
	
		odifinals.calcReqdRunrate(targetScore);
	

		System.out.println("Current run rate is " + odifinals.calcCurrentRunrate());
		System.out.println("Required run rate is " + odifinals.calcReqdRunrate());
	
		
	}
	
}
