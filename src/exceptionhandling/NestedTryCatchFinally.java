package exceptionhandling;

public class NestedTryCatchFinally {

	//program to illustrate if there is nested try catch,if for nested try block is not handled by nested catch then outer catch can handle it,if outer catch also cannot handle means JVM il handle it
	public static void main(String[] args) {
		try {
			System.out.println("1");
			try {
				System.out.println("2");
			}
			catch(NullPointerException e)
			{
				System.out.println(10/0);
			}
			finally
			{
				System.out.println("4");
			}
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("5");
		}
		finally
		{
			System.out.println("6");
		}
		System.out.println("7");

	}

}
