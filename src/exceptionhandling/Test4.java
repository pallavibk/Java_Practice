package exceptionhandling;

public class Test4 extends RuntimeException {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("hello");
		Thread.sleep(1000);
		System.out.println("hi");
		}
}
