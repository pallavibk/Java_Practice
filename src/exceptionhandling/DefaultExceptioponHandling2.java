package exceptionhandling;

public class DefaultExceptioponHandling2 {
	
	public static void dostuff()
	{
		doMorestuff();
		System.out.println(10/0);
	
	}
	public static void doMorestuff()
	{
		System.out.println("Hi");
	
	}

	//both dostuff() and  main function is going to terminate abnormally bez ,dostuff() contain exception and main is calling function 
	public static void main(String[] args) {
		
		dostuff();
		
		
		
	}

}
