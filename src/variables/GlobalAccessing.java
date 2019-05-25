package variables;

public class GlobalAccessing {

	//static variable accessing
	public static int x = 10;

	//non-static variable accessing
	public  int y=20;
	

	public static void static_fun1() {
		
		System.out.println("sttaic fun : The value of static variable X=" + x);
		GlobalAccessing obj=new GlobalAccessing();
		System.out.println("sttaic fun : The value of static variable y=" +obj.y);
	}

	public void nonstatic_fun2() {
		
		System.out.println("non-static fun : The value of static variable X=" + x);
		
		System.out.println("non-static fun : The value of static variable y=" + y);
	}

	public static void main(String[] args) {
		static_fun1();
		GlobalAccessing obj=new GlobalAccessing();
		obj.nonstatic_fun2();
		
	}

}
