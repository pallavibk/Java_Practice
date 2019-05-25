package variables;

public class GlobalBasics {

	// 1)all access specifier are given to global variables and decalration and
	// Initialization at a time
	public static int x = 10;

	// 2)No concept of initialization later either initialize no or else I ill
	public static int y;
	// y=80;

	// 3) if global value not initialized compiler provides the value
	public static int z;
	public int k;

	// 4)can be accessed everyer
	static void test1() {
		System.out.println("test1:x=" + x);
		System.out.println("test1:z=" + z);

	}

	void test2() {
		System.out.println("test2:x=" + x);
		System.out.println("test2:z=" + z);
	}
	public static void main(String[] args) {
		System.out.println("z="+z);
		GlobalBasics obj1=new GlobalBasics();
		System.out.println("k="+obj1.k);
	}
	
}
