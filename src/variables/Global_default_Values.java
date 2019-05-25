package variables;

public class Global_default_Values {
	// non-static global values

	int a;
	float b;
	double c;
	long d;
	char e;
	String f;
	boolean g;
	byte h;

	// static global
	static int aa;
	static float bb;
	static double cc;
	static long dd;
	static char ee;
	static String ff;
	static boolean gg;
	static byte hh;

	public static void main(String[] args) {
		// print static values
		System.out.println("******* static**********");
		System.out.println("default value of int:" + aa);
		System.out.println("default value of float:" + bb);
		System.out.println("default value of double:" + cc);
		System.out.println("default value of long:" + dd);
		System.out.println("default value of char:" + ee);//default value is blank
		System.out.println("default value of String:" + ff);
		System.out.println("default value of boolean:" + gg);
		System.out.println("default value of byte:" + hh);

		// print non-static values
		System.out.println("*******non static**********");
		Global_default_Values obj1 = new Global_default_Values();
		System.out.println("default value of int:" + obj1.a);
		System.out.println("default value of float:" + obj1.b);
		System.out.println("default value of double:" + obj1.c);
		System.out.println("default value of long:" + obj1.d);
		System.out.println("default value of char:" + obj1.e);//default value is blank
		System.out.println("default value of String:" + obj1.f);
		System.out.println("default value of boolean:" + obj1.g);
		System.out.println("default value of byte:" + obj1.h);
	}

}
