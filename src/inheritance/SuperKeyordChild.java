package inheritance;

public class SuperKeyordChild  extends SuperKeyordParent{
	int x=20;
	
	void test1()
	{
		System.out.println("Child::test1()");
	}
	
	void sho()
	{
		System.out.println("Before using super : x="+super.x);
		super.test1();
	}

	public static void main(String[] args) {
		SuperKeyordChild obj=new SuperKeyordChild();
		System.out.println("Before using super : x="+obj.x);
		obj.sho();
	}
}
