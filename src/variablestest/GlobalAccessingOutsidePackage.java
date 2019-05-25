package variablestest;

import variables.GlobalAccessing;
import variables.GlobalAccessingAnotherClass;

public class GlobalAccessingOutsidePackage {

public static void static_fun1_package() {
		
		System.out.println("sttaic fun : package: The value of static variable X=" +GlobalAccessing.x);
		GlobalAccessing obj=new GlobalAccessing();
		System.out.println("sttaic fun :package: The value of static variable y=" +obj.y);
	}

	public void nonstatic_fun2_package() {
		
		System.out.println("non-static fun : The value of static variable X=" + GlobalAccessing.x);
		GlobalAccessing obj=new GlobalAccessing();
		System.out.println("non-static fun : The value of static variable y=" + obj.y);
	}
	
	public static void main(String[] args) {
		
		// accessing static variables from its original class functions
				GlobalAccessing.static_fun1();
				GlobalAccessing obj=new GlobalAccessing();
				obj.nonstatic_fun2();

				// accessing static variables from its another  class functions
				
				GlobalAccessingAnotherClass.static_fun1_another_Class();
				GlobalAccessingAnotherClass obj1=new GlobalAccessingAnotherClass();
				obj1.nonstatic_fun2_another_Class();
				
				
				// accessing static variables from its another current pacakage functions
				static_fun1_package();
				GlobalAccessingOutsidePackage obj2=new GlobalAccessingOutsidePackage();
				obj2.nonstatic_fun2_package();
		
		
	}

}
