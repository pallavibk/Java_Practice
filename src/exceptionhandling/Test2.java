package exceptionhandling;

public class Test2 {

	//program is to differentiate between 2 statements
	public static void main(String[] args) {
		//Statement 1 : here at compile time compiler is not aware that  it is going to get exception at runtime
		System.out.println(10/0); 
		System.out.println("Hello");
		
		//statement 2: here at compile time compiler is  aware that  it is going to get exception at runtime,so it wont allow any statement after throwing exception ie code became unreachable
		throw new ArithmeticException("divide by zero error");
		//System.out.println("Hello");

	}

}
