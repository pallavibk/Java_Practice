package callbyvalueAndcallbyrefererence;

public class callByReference1 {
	
	int i;
	static void test(callByReference1 obj)
	{
		obj.i=90;
	}

	public static void main(String[] args) {
		System.out.println("The Main Starts");
		callByReference1 obj2=new callByReference1();
		System.out.println("From Main:"+obj2.i);
		test(obj2);
		System.out.println("From Main:"+obj2.i);
		System.out.println("The Main Ends");

	}

}
