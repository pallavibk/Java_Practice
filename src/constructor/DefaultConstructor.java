package constructor;

public class DefaultConstructor {
	int i;
	static int x=20;

	public static void main(String[] args) {
		DefaultConstructor obj=new DefaultConstructor();
		//here default value for non-static is provided by default constructor 
		System.out.println("i="+obj.i);
		System.out.println("X="+x);

	}

}
