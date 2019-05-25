package objectClass;

public class OverrideHashCodeMethod {
	int i;
	int j;
	OverrideHashCodeMethod(int i,int j)
	{
		this.i=i;
		this.j=j;
	}
	
	public int hashcode()
	{
		return i+j;
	}
	public static void main(String[] args) {
		OverrideHashCodeMethod obj1=new OverrideHashCodeMethod(10,20);
		OverrideHashCodeMethod obj2=new OverrideHashCodeMethod(30,40);
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1.hashcode());
		System.out.println(obj2.hashcode());
		
		OverrideHashCodeMethod obj3=new OverrideHashCodeMethod(10,20);
		OverrideHashCodeMethod obj4=new OverrideHashCodeMethod(10,20);
		System.out.println(obj3.equals(obj4));
		System.out.println(obj3.hashcode());
		System.out.println(obj4.hashcode());
		
	}

}
