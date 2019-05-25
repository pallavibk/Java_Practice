package exceptionhandling;

public class FinallyBlock {

	public static void main(String[] args) {
		//if no exception occurred
		try
		{
			System.out.println("try");
			
		}
	
		catch(NullPointerException e)
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
