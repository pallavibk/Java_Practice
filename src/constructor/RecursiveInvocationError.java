package constructor;

public class RecursiveInvocationError {
	
	RecursiveInvocationError()
	{
		this(90);
		System.out.println("RecursiveInvocationError() Constructor");
	}
	
	RecursiveInvocationError(int a)
	{
		//recursive invocation error
		//this();
		System.out.println("RecursiveInvocationError(int a) Constructor");
	}
	RecursiveInvocationError(int a,double d)
	{
		this(90);
		System.out.println("RecursiveInvocationError(int a,double d) Constructor");
	}
	

public static void main(String[] args) {
	

	RecursiveInvocationError obj=new RecursiveInvocationError(90,90.5);
	
		
		
		

	}

}
