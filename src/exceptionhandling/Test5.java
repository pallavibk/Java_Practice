package exceptionhandling;

public class Test5 extends RuntimeException {
	
	public static void dostuff() throws InterruptedException
	{
		doMoreStuff();

		System.out.println("2");
	}
	public static void doMoreStuff() throws InterruptedException
	{
		Thread.sleep(1000);
		System.out.println("1");
	}
	
	

	public static void main(String[] args) throws InterruptedException {
		
		dostuff();
		
		}
}
