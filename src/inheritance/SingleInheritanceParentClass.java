package inheritance;

public class SingleInheritanceParentClass {
	static int x=10;
	static int y;
	int u=20;
	int z;
	public static void test1()
	{
		System.out.println("test1");
	}
	
	public  void test2()
	{
		System.out.println("test5");
	}
	 
	
	SingleInheritanceParentClass()
	{
		System.out.println("parent : No args constructor");
	}
	SingleInheritanceParentClass(int x)
	{
		System.out.println("parent : Parametrised constructor");
	}
	

}
