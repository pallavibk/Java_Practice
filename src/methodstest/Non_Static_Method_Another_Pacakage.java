package methodstest;

import methods.Non_Static_Method;
import methods.static_method;

public class Non_Static_Method_Another_Pacakage {

	static void test_static_fun1()
	{

		Non_Static_Method obj4=new Non_Static_Method();
		obj4.fun1();
		obj4.fun2();
		obj4.fun3();
		obj4.fun4();
		
		
	}
	
	
	 void  test_non_static_fun1()
	{

			Non_Static_Method obj5=new Non_Static_Method();
			obj5.fun1();
			obj5.fun2();
			obj5.fun3();
			obj5.fun4();
			
	}
	
}
