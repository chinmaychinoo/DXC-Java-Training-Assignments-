package assignmentonethree;

import java.util.Scanner;

public class Assignment1q3 {
	int i;
	int j;
	
public static void main (String args[]) {
Scanner sc=new Scanner(System.in);

System.out.println("Enter the year");
int i=sc.nextInt();


 System.out.println("Enter the month in uppercase letters");
 String month=sc.next();
 sc.close();
switch(month){
case"JANUARY": System.out.println("JANUARY has 31 days in " + i);
case"FEBRUARY": if((i%4)==0) {
	System.out.println("FEBRUARY has 29 days in " + i);
}
else {
	System.out.println("FEBRUARY has 28 days in " + i);
}
case"MARCH": System.out.println("MARCH has 31 days in " + i);
break;
case"APRIL": System.out.println("APRIL has 30 days in " + i);
break;
case"MAY": System.out.println("MAY has 31 days in " + i);
break;
case"JUNE": System.out.println("JUNE has 30 days in " + i);
break;
case"JULY": System.out.println("JULY has 31 days in " + i);
break;
case"AUGUST": System.out.println("AUGUST has 31 days in " + i);
break;
case"SEPTEMBER": System.out.println("SEPTEMBER has 30 days in " + i);
break;
case"OCTOBER": System.out.println("OCTOBER has 31 days in " + i);
break;
case"NOVEMBER": System.out.println("NOVEMBER has 30 days in " + i);
break;
case"DECEMBER": System.out.println("DECEMBER has 31 days in " + i);
}
}
}

