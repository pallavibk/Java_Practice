package exceptionhandling;

public class DefaultExceptioponHandling3 {
	
	public static void dostuff()
	{
		doMorestuff();
		System.out.println("Hello");
		
	
	}
	public static void doMorestuff()
	{
		System.out.println("Hi");
	
	}

	
	//only main function is going to terminate abnormally bez it contain exception remaining 2 methods terminate normally
	public static void main(String[] args) {
		
		dostuff();
		System.out.println(10/0);
		
		
		
	}

}
