package constructor;




public class ConstructorOverloading {
	
	//different types of constructor overloading
	
	
	ConstructorOverloading(int x)
	{
		System.out.println("constructor");
	}
	
	//1)by changing type of argument
	ConstructorOverloading(float x)
	{
		System.out.println("by changing type of argument");
	}
	
	//2)by changing number of argument
	ConstructorOverloading(int x,float y)
	{
		System.out.println("by changing number of argument");
	}
	
	//3)by changing position of argument
	ConstructorOverloading(float x,int y)
		{
		System.out.println("by changing position of argument");
		}
	
	public static void main(String[] args) 
	{
		ConstructorOverloading obj=new ConstructorOverloading(1);
		ConstructorOverloading obj1=new ConstructorOverloading(1,1.1f);
		ConstructorOverloading obj2=new ConstructorOverloading(1.3f,5);
		
		
	}
	

}
