package exceptionhandling;

public class InvalidHierarchyOFTryOfMultipleCatchStatment {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}
		/* */

		catch(NullPointerException e1)
		{
			System.out.println("NULL pointer exception caught");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Aurthmatic exception caught");
		}
		
	}

}
