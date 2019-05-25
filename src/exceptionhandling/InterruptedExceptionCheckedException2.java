package exceptionhandling;

public class InterruptedExceptionCheckedException2 {

	public static void main(String[] args) {
		System.out.println("I m getting sleep");
		//interrupted exception ie main method is sleeping some other fun may  interrupt main for some other there function so handle them
		//if u uncomment this u get error
		//Thread.sleep(2000);

	}

}
