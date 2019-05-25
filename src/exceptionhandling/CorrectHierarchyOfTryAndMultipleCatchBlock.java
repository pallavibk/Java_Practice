package exceptionhandling;

public class CorrectHierarchyOfTryAndMultipleCatchBlock {

	
	
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}
		catch(NullPointerException e1)
		{
			System.out.println("NULL pointer exception caught");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Aurthmatic exception caught");
		}
		catch(Exception e2)
		{
			System.out.println("Main class exception class");
		}
		
		
	}

}
