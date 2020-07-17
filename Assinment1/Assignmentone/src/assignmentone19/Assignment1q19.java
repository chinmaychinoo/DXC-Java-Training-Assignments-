package assignmentone19;

import java.util.Scanner;

public class Assignment1q19 {
	public static void main(String args[]){
		
	
	Scanner sc=new Scanner(System.in);
	
String[] address = new String[] {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
System.out.println("What is your number?");
int i = sc.nextInt();
System.out.println("The day you get is" + address[i]);


sc.close();
}
}