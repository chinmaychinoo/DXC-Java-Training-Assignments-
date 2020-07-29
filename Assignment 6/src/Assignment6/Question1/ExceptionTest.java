package Assignment6;


public class ExceptionTest {
	public double i;
	public double j;
	
	public ExceptionTest() {
		System.out.println("No inputs recieved");
	}
	
	public ExceptionTest(double i, double j) {
		this.i=i;
		this.j=j;
	}
	
	   double divide() { 
				 System.out.println(i/j);
				return i/j; 
				 }
	
	public static void main(String[] args) {
		ExceptionTest op=new ExceptionTest(8,2);
		
		try
		{
			op.divide();
		}
		catch( ArithmeticException e) 
		{
			System.out.println("Division with zero is not possible");
		}
		catch(NumberFormatException exp)
		{
			System.out.println("Only integers are allowed");
	    }
		
		System.out.println("op done");
}
}
