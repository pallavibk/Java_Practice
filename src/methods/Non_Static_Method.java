package methods;

public class Non_Static_Method {

	public	 void fun1()
	{
		System.out.println("private:static");
	}

	public  void fun2()
	{
		 System.out.println("");
	}
	 public	 void fun3()
	{
	System.out.println("");
	}

	public  void fun4()
	{
		System.out.println("");
	}

	static void test_static_fun()
	{
		Non_Static_Method obj=new Non_Static_Method();
		obj.fun1();
		obj.fun2();
		obj.fun3();
		obj.fun4();
		
	}
	
	
	 void test_non_static_fun()
	{
		 fun1();
			fun2();
			fun3();
			fun4();
			
	}
	
	
	 public static void main(String[] args) {
		 
	}
	
}

