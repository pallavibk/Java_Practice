package exceptionhandling;

public class Test6 extends RuntimeException {
	
	public static void dostuff() 
	{
		doMoreStuff();

		System.out.println("2");
	}
	public static void doMoreStuff() 
	{
		//if u uncomment this u get error
		//Thread.sleep(1000);
		System.out.println("1");
	}
	
	

	public static void main(String[] args) throws InterruptedException {
		
		dostuff();
		
		}
}
