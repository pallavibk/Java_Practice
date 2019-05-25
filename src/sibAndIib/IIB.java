package sibAndIib;

public class IIB {
	{
		System.out.println("IIB block");
	}
	IIB(int a)
	{
		super();
		System.out.println("paramettirised constructor");
	}
	IIB()
	{
		this(90);
		System.out.println("default constructor");
	}
	public static void main(String[] args) {
		System.out.println("Starts");
		IIB obj=new IIB();
		System.out.println("Done");
	}
	
	
}
