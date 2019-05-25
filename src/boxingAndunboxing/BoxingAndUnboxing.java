package boxingAndunboxing;

public class BoxingAndUnboxing {

	public static void main(String[] args) {
		Integer rv1=new Integer(10);
		Double rv2=new Double(10.2);
		Boolean rv3=new Boolean(true);
		System.out.println(rv1);//here internally it is stored in the form of string
		System.out.println(rv2);//here internally it is stored in the form of string
		System.out.println(rv3);//here internally it is stored in the form of string
		
		System.out.println("*************");
		int a=rv1.intValue();
		double d=rv2.doubleValue();
		boolean b=rv3.booleanValue();
		
		System.out.println(rv1);//here internally it is not stored in the form of string ,it is in the form of Integer
		System.out.println(rv2);//here internally it is not stored in the form of string ,it is in the form of double
		System.out.println(rv3);//here internally it is not stored in the form of string it is in the form of Boolean
		
		
		int aa=Integer.parseInt("900");
		System.out.println(aa);
		
		

	}

}
