package Assignment7;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Iterator;

public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number of students ");
		
		int n=sc.nextInt();
		int i;
		int j;
		int marks[]=new int[n];
		//Gathering Marks in an array
		for(i=0 ; i<=(n-1); i++) {
			System.out.println("Enter marks of student "+ (i+1));
		  marks[i] =sc.nextInt();
		}
		
		sc.close();
		//Creating ArrayList Collection
		ArrayList<Integer> marksarray=new ArrayList<Integer>();
		//Entering data from Array to ArrayList
		for (int m: marks) {
			
			marksarray.add(m);
		}
		//Maximum number
		System.out.println(marksarray);
		System.out.println("Maximum marks : " + Collections.max(marksarray));
		
		//average number
		int sum=0;
		for(i=0; i<(n) ;i++) {
			sum = sum+marksarray.get(i);
		}
		int avg= sum /(n);
		System.out.println("Average of everyone is " + avg);
		
		//Display
		System.out.print("Marks: ");
		for(i=0; i<(n) ;i++) {
			System.out.print((i+1)+ "-" + (marksarray.get(i)) + " ");
		}
		System.out.println(" ");
		System.out.println("After sorting ");
		//sorting
			Collections.sort(marksarray); 
			System.out.print("Marks: ");
			 for(i=0; i<(n) ;i++) {
					System.out.print((i+1)+ "-" + (marksarray.get(i)) + " ");
				}
			 
		}
        }
	
	



