package exceptionhandling;

public class FinallyBlock3 {

	public static void main(String[] args) {
		//if  exception occured and exception not handled
		try
		{
			System.out.println("try");
			System.out.println(10/0);
		}
	
		
		
		finally
		{
			System.out.println("finally block");
		}
		System.out.println("After finally block");

	}

}
