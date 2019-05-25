package exceptionhandling;

public class Test3 extends RuntimeException {

	public static void main(String[] args) {
		
		//throw can be any of type Throwable
		//throw new  Test();
		
		//if u want your class to throw exception then extend it by Throwable class
		throw new  Test3();
		}
}
