package methodOverloading;

public class OverloadingMainMethod {
	
	public static void main() 
	{
		System.out.println("Main() methods");
    }

	public static void main(String[] args) 
	{
		System.out.println("String[] of methods");
		main();
	}
	
	
}
