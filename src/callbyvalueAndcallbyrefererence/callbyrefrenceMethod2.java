package callbyvalueAndcallbyrefererence;

public class callbyrefrenceMethod2 {

	int i;

	static void test(callbyrefrenceMethod2 obj) {
		System.out.println("From test:" + obj.i);
		obj.i = 90;
		System.out.println("From test after change:" + obj.i);
	}

	public static void main(String[] args) {
		System.out.println("The Main Starts");

		test(new callbyrefrenceMethod2());

		System.out.println("The Main Ends");

	}

}
