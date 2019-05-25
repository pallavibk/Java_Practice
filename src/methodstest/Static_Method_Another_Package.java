package methodstest;

import methods.static_method;

public class Static_Method_Another_Package {

	
	static void test_static_fun1()
	{
		static_method.fun1();
		static_method.fun2();
		static_method.fun3();
		static_method.fun4();
	}


	 void  test_non_static_fun1()
	{
		 static_method.fun1();
			static_method.fun2();
			static_method.fun3();
			static_method.fun4();
	}

	
}
