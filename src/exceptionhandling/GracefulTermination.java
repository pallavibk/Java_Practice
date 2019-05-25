package exceptionhandling;

public class GracefulTermination {

	public static void main(String[] args) {
		System.out.println("statemtn1");
		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			System.out.println(10 / 5);
		}
		System.out.println("statemtn3");
	
	}

}
