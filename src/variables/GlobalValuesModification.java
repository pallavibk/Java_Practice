package variables;

public class GlobalValuesModification {

	static int x = 10;
	static int y = 20;
	int z = 30;
	int u = 40;

	static void test1() {

		GlobalValuesModification obj1 = new GlobalValuesModification();
		x = 100;
		y = 200;
		obj1.z = 300;
		obj1.u = 400;
		System.out.println("test1 : x=" + x);
		System.out.println("test1: y=" + y);
		System.out.println("test1: z=" + obj1.z);
		System.out.println("test1: u=" + obj1.u);
	}

	void test2() {
		GlobalValuesModification obj2 = new GlobalValuesModification();
		GlobalValuesModification.x = 1000;
		GlobalValuesModification.y = 2000;
		System.out.println("before value Z=" + z);
		System.out.println("before value y=" + u);
		obj2.z = 3000;
		obj2.u = 4000;

		System.out.println("test2 : x=" + x);
		System.out.println("test2 : y=" + y);
		System.out.println("test2: z=" + obj2.z);
		System.out.println("test2: u=" + obj2.u);
	}

	public static void main(String[] args) {
		GlobalValuesModification obj3 = new GlobalValuesModification();
		System.out.println("MAIN : x=" + x);
		System.out.println("MAIN : y=" + y);
		System.out.println("MAIN : z=" + obj3.z);
		System.out.println("MAIN : u=" + obj3.u);

		System.out.println("*********************************");
		// accessing the functions ith obj3
		test1();
		obj3.test2();

		System.out.println("*********************************");
		// accessing the functions ith obj4
		GlobalValuesModification obj4 = new GlobalValuesModification();
		test1();
		obj4.test2();

		System.out.println("*********************************");
		// accessing the functions ith obj3
		test1();
		obj3.test2();
		System.out.println("*********************************");

	}

}
