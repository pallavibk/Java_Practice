package strings;

public class prog1 {

	public static void main(String[] args) {
		String rv1=new String("Hello");
		String rv2=new String("Hello");
		String rv3=new String("Hi");
		
		System.out.println(rv1);
		System.out.println(rv2);
		System.out.println(rv3);
		
		System.out.println(rv1.equals(rv2));
		System.out.println(rv1.equals(rv3));
		
		String obj1="Hi";
		String obj2="Hi";
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj1.equals(rv3));
		System.out.println(obj1.equals(obj2));
		System.out.println(rv1==rv2);
		
		
		System.out.println("rv1 hascode="+rv1.hashCode());
		System.out.println("rv2 hascode="+rv2.hashCode());
		System.out.println("rv3 hascode="+rv3.hashCode());
		System.out.println("obj1 hascode="+obj1.hashCode());
		System.out.println("obj2 hascode="+obj2.hashCode());
	}
}
