package exceptionhandling;

public class  AgeNotValidException extends Exception{
	//default constructor of our exception class
	public AgeNotValidException()
	{
		System.out.println("Defalult and Age is invalid");
	}
	//Parameterized constructor of our exception class
	AgeNotValidException(String msg)
	{
		System.out.println("paremetrised"+msg);
	}
}
