package methods;

public class Non_Static_Method_Same_PAckage {

	static void test_static_fun1()
	{
		//again object is required here because canot use the object  created in that class context to in this class ex:obj.fun1(); gives the error
		Non_Static_Method obj1=new Non_Static_Method();
		obj1.fun1();
		obj1.fun2();
		obj1.fun3();
		obj1.fun4();
		
	}
	
	
	 void  test_non_static_fun1()
	{

			Non_Static_Method obj3=new Non_Static_Method();
			obj3.fun1();
			obj3.fun2();
			obj3.fun3();
			obj3.fun4();
			
			
	}
	
}
