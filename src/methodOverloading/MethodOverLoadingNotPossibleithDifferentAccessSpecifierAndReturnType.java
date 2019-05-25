package methodOverloading;

public class MethodOverLoadingNotPossibleithDifferentAccessSpecifierAndReturnType {

	
	//canot overload method on basis of access specifier
	public void test()
	{
		System.out.println("Public");
	}
	/*void test()
	{
		System.out.println("default");
	}
	private void test()
	{
		System.out.println("Private");
	}
	protected void test()
	{
		System.out.println("Protected");
	}
	*/
	
	
	//different return type
	public void fun()
	{
		System.out.println("void return type");
	}
	/*public int fun()
	{
		System.out.println("int return type");
	}
	*/
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
