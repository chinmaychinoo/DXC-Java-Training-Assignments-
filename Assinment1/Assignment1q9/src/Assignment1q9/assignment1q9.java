package Assignment1q9;

import java.util.Scanner;

public class assignment1q9 {
	
	public static void main (String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	double num=sc.nextInt();
	
	double i;
	double j;
	double k;
	
	if(num<1)
	{
		System.out.println("Invalid Number");
	}
	else if(num==1) {
		System.out.println("Neither prime nor integer");
	}
	else if(num==2) {
		System.out.println("2 is the only prime number");
	}
	else {
	
		for(j=2;j<=num;j++) {
			for(i=2;i<=num;i++) {
			k=j%i;
			if(k!=0) {
				System.out.println(j);
			}
			else {
				
				break;
				
			}
			
			}
			
			}
				}
		
			}
			
		}
	
	

