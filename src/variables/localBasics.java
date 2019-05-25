package variables;

public class localBasics {

	public static void fun1() {
		
		//1)declaration and initialization at a time
		int x = 10;
		System.out.println("x=" + x);

		// 2)canot say that local variable as static and non-static e can just say it is in static context and non-static context
		// static int y;

		//3) declaration first and initialization later need to initialize a variable before using because compiler ont provide
		// default value to it because they are inside method n method is stack variable
		int z;
		// System.out.println("Z="+z);
		z = 10;

		//4)local variable canot have access modifiers
		// public int x;
		
		//5)Local final variables can be initialized later
		final int u;
		u=22;
		
		
	}
	
	public void non_static_fun()
	{
		int XX=10;
	}
	
	

	public void fun2() {
		//6) canot access local variables directly inside another function through its function only e can use it
		// System.out.println("x="+fun1.x);
		fun1();
		non_static_fun();
		
	}

	public static void main(String[] args) {
		//7) canot access local variables directly inside another function through its function only e can use it
		// System.out.println("x="+fun1.x);
		fun1();
		localBasics obj=new localBasics();
		obj.non_static_fun();
	}

}
