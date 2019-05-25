package constructor;

public class Calling1ConstructorFromAnotherConstructor {
	
	Calling1ConstructorFromAnotherConstructor()
	{
		System.out.println("I am no agrs constructor");
	}
	
	Calling1ConstructorFromAnotherConstructor(float i)
	{
		System.out.println("I am Parametrised constructor"); 
		Calling1ConstructorFromAnotherConstructor obj=new  Calling1ConstructorFromAnotherConstructor();
		
	}
	//THIS() CALLING ATATEMENT
	Calling1ConstructorFromAnotherConstructor(int i)
	{
		this(90.2f);
		System.out.println("I am int(i) constructor"); 
		
		
	}

	public static void main(String[] args) {
		Calling1ConstructorFromAnotherConstructor obj=new  Calling1ConstructorFromAnotherConstructor(1);
	}

}
