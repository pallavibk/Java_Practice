package constructor;

public class NoArgsConstructor {
	
	
	
	//constructor do not have return type and return value 
	void NoArgsConstructor()
	{
		System.out.println("I AM NO MORE CONSIDERED AS CONSTRUCTOR,I AM CONSIDERED AS METHOD HERE");
	}

	
public	NoArgsConstructor()
	{
		System.out.println("I AM NO ARGS CONSTRUCTOR");
	}

	//only inside class
/*private	NoArgsConstructor()
{
	System.out.println("I AM NO ARGS CONSTRUCTOR");
}*/

	//outside class and outrside packae through inheritance
/*protected	NoArgsConstructor()
{
	System.out.println("I AM NO ARGS CONSTRUCTOR");
}
*/
	
	
//default
/*
	NoArgsConstructor()
{
System.out.println("I AM NO ARGS CONSTRUCTOR");
}
	*/
	
}
