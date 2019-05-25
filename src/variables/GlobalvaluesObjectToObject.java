package variables;

public class GlobalvaluesObjectToObject {

//	GlobalvaluesObjectToObject obj1=new GlobalvaluesObjectToObject();
	
	static int a = 10;
	int y = 20;

	static void test1() {
		System.out.println("test1 : a="+a);
		GlobalvaluesObjectToObject obj=new GlobalvaluesObjectToObject();
		System.out.println("test1 : y="+obj.y);
		//System.out.println("test1 : y="+obj1.y);
		
	}

	 void test2() {
		 
		 System.out.println("test2 : a="+a);
			GlobalvaluesObjectToObject obj2=new GlobalvaluesObjectToObject();
			System.out.println("test2 : y="+obj2.y);
		
	}

	public static void main(String[] args) {
		
		
		 System.out.println("main : a="+a);
			GlobalvaluesObjectToObject obj3=new GlobalvaluesObjectToObject();
			System.out.println("main: y="+obj3.y);
			
			test1();
			obj3.test2();
		
	}

}
