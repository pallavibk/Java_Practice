package finalPrograms;

public class FinalMethodChild extends FinalMethodParent {
	
	void fun1()
	{
		System.out.println("I am child function");
	}
	
	//Overriding final method is not possible
		/*final void test()
			{
				System.out.println("I am FINAL Child function");
			}
*/
	
	
	//e can make main method also as final
	public final static void main(String[] args) {
		System.out.println("hi");
	}
	
	

}
