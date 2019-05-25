package methodOverloading;

public class DifferentTypesOfMethodOverloading {
	public void test() 
	{
		System.out.println("*******Oerloading NON_STATIC FUNCTIONS***********");
		System.out.println("test1()");
	}

	// variation in the number of argument list
	public void test(int a, int b) 
	{
		System.out.println("test1(int a)");
	}

	// variation in the type of argument list
	public void test(float a, int b) 
	{
		System.out.println("test1(float a,int b)");
	}

	// variation in the position of the argument list
	public void test(int b, float a) 
	{
		System.out.println("test1(int b,float a)");
		
	}

	public static void fun() 
	{
		System.out.println("********Overloading STATIC FUNCTIONS*******");
		System.out.println("static :fun()");
	}

	// variation in the number of argument list
	public static void fun(int a, int b) 
	{
		System.out.println("static:fun(int a,int b)");
	}
	
	
	//testing overloading of static by non-static and voice versa
	public  void fun(int x) 
		{
		System.out.println("*******Oerloading STATIC BY NON_STATIC FUNCTIONS***********");
		System.out.println("static to non static  :fun(int X)");
	}
	
	//testing overloading of   non-static by static and voice versa
	public static void test(int X) 
	{
		System.out.println("*******Oerloading NON-STATIC BY STATIC FUNCTIONS***********");
		System.out.println("test(int X)");
	}

	public static void main(String[] args) 
	{
		DifferentTypesOfMethodOverloading obj = new DifferentTypesOfMethodOverloading();
		// method call is decided at runtime
		obj.test();
		obj.test(10, 20);
		obj.test(3.3f, 6);
		obj.test(2, 3.2f);
		obj.fun(3);

		//method call is decided at compile time
		test(4);
		fun();
		fun(2, 3);
		
	}
}
