package exceptionhandling;

public class demo5 {

	public static void main(String[] args) {
	try {
		
	
		int age=19;
		if (age<18)
		{
			throw new ArithmeticException("Invalid AGE U GIVEN");
		}
		else
		{
			System.out.println("eligible");
		}
	}
	catch(ArithmeticException e)
	{
	System.out.println(e);
	System.out.println("age is invalid");
	}
	System.out.println("Out of catch");
	
	
	//or default constructor
	/*int age=10;
	if (age<18)
	{
		throw new ArithmeticException("InvalidAGEUGIVE");
	}
	else
	{
		System.out.println("eligible");
	}
}
catch(ArithmeticException e)
{
System.out.println(e);
System.out.println("age is invaliud");
}*/

	}

}
