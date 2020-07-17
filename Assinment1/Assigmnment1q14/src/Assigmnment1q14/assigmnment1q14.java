package Assigmnment1q14;

import java.util.Scanner;

public class assigmnment1q14 {
	
public static void main( String[] args) {

		
		Scanner sc=new Scanner (System.in);
		
		
		System.out.println("Enter n");
		int n=sc.nextInt();
		System.out.println("Enter r");
		int r=sc.nextInt();
		int ncr;
		int j;
		int k=1;
		int l=1;
		int m=1;
		
		sc.close();
		
		for(j=1;j<=n;j++) {
			
			k=j*k;     //  k=n!
		}
		
		
for(j=1;j<=r;j++) {
			
			l=j*l;     //  l=r!
		}
		
  
  for(j=1;j<=(n-r);j++) {
		
		m=j*m;     //  m=(n-r)!
	}
		
		ncr=(k)/(l*m);
		
		
		
		
		System.out.println("The ncr is " +  ncr);
}}
