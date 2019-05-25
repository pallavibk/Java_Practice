package classesesObjects;

//Program to explain class structure
public class P1 {
	// class contains belo fields
	// 1)Global Variables(static/non-static)
	static int x;
	float y;

	// Methods (static/non-static)
	static void fun1() {
		System.out.println("static function");
	}

	void fun2() {
		System.out.println("non-static function");
	}

	// constructor-non static

	P1() {
		System.out.println("default constructor");
	}

	P1(int a) {
		System.out.println("parametrized constructor");
	}

	// SIB -static
	static {
		System.out.println("static block");
	}

	// IIB -non static

	{
		System.out.println("non-static block");
	}

	public static void main(String[] args) {

	}

}
