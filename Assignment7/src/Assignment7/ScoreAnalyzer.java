package Assignment7;

import java.awt.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class ScoreAnalyzer {
	private LinkedList<Integer> runsData= new LinkedList();

	public ScoreAnalyzer(LinkedList<Integer> runsData) {
		super();
		this.runsData = runsData;
	} 
	
	
	public ScoreAnalyzer() {}
	
	
	
	void addRunsToList(int runs)
	{
		runsData.add(runs);
	}
	
	
	double calcRunRate()
	{
		
		int sum=0;
		for(int i=0;i<runsData.size();i++)
		{
			sum=sum+runsData.get(i);
			
		}
		return sum/50;
	}
	
	
	
	int lowestRunsScored() {
	return(Collections.min(runsData));
	}
	
	
	
	void displayRuns()
	{
		for(int j:runsData)
		{
			System.out.println(runsData.indexOf(j)+" "+j);
}

	
	
	}
}
