package assignment1q10;


public class Assignment1q10 {
	
	public static void main (String[] args) {
	
	
	
	double num=100;
	
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
	
	

