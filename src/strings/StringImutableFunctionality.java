package strings;

public class StringImutableFunctionality {

	public static void main(String[] args) {
		String rv1=new String("Hello");
		String rv2=new String("Hi");
		
		System.out.println("Before:");
		System.out.println("rv1="+rv1);
		System.out.println("rv2="+rv2);
		String	rv3=rv1+rv2;
		System.out.println("After:");
	    System.out.println("rv1="+rv1);
	    System.out.println("rv2="+rv2);
		System.out.println("rv3="+rv3);
		System.out.println("**************");
		System.out.println(rv1.concat(rv2));
		System.out.println("rv1="+rv1);
		System.out.println("rv2="+rv2);
	
		System.out.println("*******LITERAL OPERATION*******");
		
		
		String obj1="COME";
		String obj2="SOON";
		System.out.println("Before:");
		System.out.println("obj1="+obj1);
		System.out.println("obj2="+obj2);
		String	obj3=obj1+obj2;
		System.out.println("After:");
		System.out.println("obj1="+obj1);
		System.out.println("obj2="+obj2);
		System.out.println("obj3="+obj3);
		System.out.println("**************");
		System.out.println(obj1.concat(obj2));
		System.out.println("obj1="+obj1);
		System.out.println("obj2="+obj2);
		

		String rv223=new String("HELLLLLLLLLLOOOOOO");
		System.out.println("rv223="+rv223);
		System.out.println(rv223.concat("PALLAVI"));
		System.out.println("rv223="+rv223);
	}

}
