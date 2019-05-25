package inheritance;

public class SingleInheritanceChildClass extends SingleInheritanceParentClass 
{
	static int xx=10;
	static int yy;
	int uu=20;
	int zz;
	public static void test3()
	{
		System.out.println("test9");
	}
	public void test4()
	{
		System.out.println("test10");
	}
	SingleInheritanceChildClass()
	{
		System.out.println("child : No args constructor");
	}
	SingleInheritanceChildClass(int x)
	{
		System.out.println("child : Parametrised constructor");
	}

}
