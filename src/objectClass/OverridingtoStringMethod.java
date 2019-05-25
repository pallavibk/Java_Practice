package objectClass;

public class OverridingtoStringMethod {
	String name;
	int id;
	OverridingtoStringMethod(String name,int id)
	{
	   this.name=name;
	   this.id=id;
	   
	}
	
	public String toString()
	{
		return " mpname: "+name+"  &  id: "+id;
	}
	
	
	
	public static void main(String[] args) {
		OverridingtoStringMethod obj=new OverridingtoStringMethod("A",1);
		System.out.println(obj);
		OverridingtoStringMethod obj1=new OverridingtoStringMethod("B",2);
		System.out.println(obj1);
		
	}
}
