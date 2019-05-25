package sibAndIib;

public class SIB1 {
	static
	{
		System.out.println("1st SIB");
	}
	
	static
	{
		System.out.println("2nd SIB");
	}
	
	public static void main(String[] args) {
		System.out.println("Main method");
		SIB3 obj=new SIB3();
		
	}
	static
	{
		System.out.println("3rd SIB");
	}
	
	

}
