package exceptionhandling;

public class Test1_1 {
	
	
	
	static ArithmeticException e1;
	public static void main(String[] args) {
		
		
		//here e1 is referring to null because object is not created yet so if anything referring to null throw an nullpointerexception
		throw e1;

	}

}
