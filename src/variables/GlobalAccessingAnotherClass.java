package variables;

public class GlobalAccessingAnotherClass {
	
	public static void static_fun1_another_Class() {

		System.out.println("sttaic fun :Another: The value of static variable X=" + GlobalAccessing.x);
		//alays create obj erever u require it
		GlobalAccessing obj=new GlobalAccessing();
		System.out.println("sttaic fun :Another: The value of static variable y=" + obj.y);
	}

	public void nonstatic_fun2_another_Class() {

		System.out.println("non-static fun :Another:The value of static variable X=" + GlobalAccessing.x);
		GlobalAccessing obj=new GlobalAccessing();
		System.out.println("non-static fun :Another : The value of static variable y=" + obj.y);
	}

	public static void main(String[] args) {

		// accessing static variables from its original class functions
		GlobalAccessing.static_fun1();
		GlobalAccessing obj=new GlobalAccessing();
		obj.nonstatic_fun2();

		// accessing static variables from its current class functions
		static_fun1_another_Class();
		GlobalAccessingAnotherClass obj1=new GlobalAccessingAnotherClass();
		obj1.nonstatic_fun2_another_Class();
			
	}

}
