package Assignment7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ScoreCard {
	
	public static void main(String args[]) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		
		
		int ar[] = new int[5];
		System.out.println("Enter runs by Rahane,Rahul,Kolhi,Dhoni,Rahul");
		
		
		for (int i = 0; i < ar.length; i++)
			ar[i] = sc.nextInt();

		map.put("Rahane", ar[0]);
		map.put("Rahul", ar[1]);
		map.put("Kohli", ar[2]);
		map.put("Dhoni", ar[3]);
		map.put("Lokesh", ar[4]);
             sc.close();
             
             
		int max = 0, sum = 0;

		for (Map.Entry<String, Integer> n : map.entrySet()) {
			System.out.print(n.getKey() + ":");
			System.out.println(n.getValue());
			if (max < n.getValue()) {
				max = n.getValue();
			}
			sum = sum + n.getValue();
		}
		
		
		System.out.println("The total Score : "+sum);
		System.out.println("The max run scorer is");
		
		
	}
}