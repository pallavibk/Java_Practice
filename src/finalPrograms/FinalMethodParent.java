package finalPrograms;

public class FinalMethodParent {
	
	 void fun1()
	{
		System.out.println("I am parent function");
	}
	 
	 
	 //Overriding final method is not possible
	final void test()
		{
			System.out.println("I am FINAL parent function");
		}

}
