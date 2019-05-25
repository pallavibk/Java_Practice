package encapsulation;

public class MainClass {

		
		public static void main(String[] args) {
			
		ParentClass obj=new ParentClass();
		System.out.println("Before change I value="+obj.getI());
		obj.SettI(90);
		System.out.println("after change I value="+obj.getI());
		
		
	}
	
}
