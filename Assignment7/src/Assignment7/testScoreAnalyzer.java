package Assignment7;

import java.util.Scanner;

public class testScoreAnalyzer {

	public static void main(String[] args) {
		
		ScoreAnalyzer obj =new ScoreAnalyzer();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number of batsmen?");
		int n = sc.nextInt();
		
	
		
		for (int i=0;i<n;i++)
		{
			System.out.println("Enter batsman run "+(i+1));
			obj.addRunsToList(sc.nextInt());
		}
		
		
		
		obj.displayRuns();
		System.out.println("The Run Rate"+obj.calcRunRate());
		System.out.println("Lowest Run Scored"+obj.lowestRunsScored());
		System.out.println("The no of players who batted"+n);
			

	}
}