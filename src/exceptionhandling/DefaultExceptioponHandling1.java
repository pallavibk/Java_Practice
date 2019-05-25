package exceptionhandling;

public class DefaultExceptioponHandling1 {
	
	public static void dostuff()
	{
		doMorestuff();
	
	}
	public static void doMorestuff()
	{
		System.out.println(10/0);
	
	}
	//it terminate all 3 methods abnormally bez domorestuff() contain exception and remaning 2 methods are  calling those methods containing exception. 
	 
	public static void main(String[] args) {
		
		dostuff();
		
		
		
	}

}
