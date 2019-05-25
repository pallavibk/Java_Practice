package objectClass;

public class EqualsMethod {

	public static void main(String[] args) {
		EqualsMethod obj1=new EqualsMethod();
		EqualsMethod obj2=new EqualsMethod();
     System.out.println(obj1.equals(obj2));
     EqualsMethod obj3=new EqualsMethod();
		EqualsMethod obj4=obj3;
		 System.out.println(obj3.equals(obj4));
     
	}

}
