package exceptionhandling;

public class FinallyBlock2 {

	public static void main(String[] args) {
		//if  exception occured and exception handled
		try
		{
			System.out.println("try");
			System.out.println(10/0);
		}
	
		catch(ArithmeticException e)
		{
			System.out.println("catch");
		}
		
		
		finally
		{
			System.out.println("finally block");
		}
		System.out.println("After finally block");

	}

}
