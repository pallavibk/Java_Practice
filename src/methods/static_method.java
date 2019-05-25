package methods;

public class static_method {
	

	public	static void fun1()
	{
		System.out.println("private:static");
	}

	public static void fun2()
	{
		 System.out.println("");
	}
	 public	static void fun3()
	{
	System.out.println("");
	}

	public static void fun4()
	{
		System.out.println("");
	}

	static void test_static_fun()
	{
		fun1();
		fun2();
		fun3();
		fun4();
		
	}
	
	
	 void test_non_static_fun()
	{
		 fun1();
			fun2();
			fun3();
			fun4();
			
	}
	

	public static void main(String[] args) {
		System.out.println("");
	}

}
