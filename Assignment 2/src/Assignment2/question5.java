package Assignment2;
import java.util.Scanner;
public class question5 {

   public static void main(String[] args)

{
    int i,n;

    System.out.print("Input number of terms : ");
    Scanner in = new Scanner(System.in);
		    n = in.nextInt();
in.close();
     for(i=1;i<=n;i++)
     {
     System.out.println("Number is : " +i+" and cube of " +i+" is : "+(i*i*i));     
    }
 }
}
