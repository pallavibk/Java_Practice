package interfaces;

public class TestExtendNormalClassithAbstarctClass extends ExtendNormalClassithAbstarctClass 
{

	@Override
	void test1() {
		System.out.println("unimplemented");
		
	}
	
	public static void main(String[] args) {
		TestExtendNormalClassithAbstarctClass	obj=new TestExtendNormalClassithAbstarctClass();
		obj.test1();
		obj.test2();
	}

	
	
}
