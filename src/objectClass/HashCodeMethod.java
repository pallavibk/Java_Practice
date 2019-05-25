package objectClass;

public class HashCodeMethod {
	public static void main(String[] args) {
		HashCodeMethod obj=new HashCodeMethod();
		HashCodeMethod obj1=new HashCodeMethod();
		System.out.println(obj.hashCode());
		System.out.println(obj1.hashCode());
		HashCodeMethod obj3=new HashCodeMethod();
		HashCodeMethod obj4=obj3;
		System.out.println(obj3.hashCode());
		System.out.println(obj4.hashCode());
		
	}

}
