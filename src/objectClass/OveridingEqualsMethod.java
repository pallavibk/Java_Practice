package objectClass;

public class OveridingEqualsMethod {
	
	int i;
	OveridingEqualsMethod(int i)
	{
		this.i=i;
		//System.out.println("i="+i);
	}
	
	public boolean equals(Object obj)
	{
		OveridingEqualsMethod obj3=(OveridingEqualsMethod)obj;
		if(this.i==obj3.i)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args) {
		OveridingEqualsMethod obj1=new  OveridingEqualsMethod(1);
		OveridingEqualsMethod obj2=new  OveridingEqualsMethod(2);
		System.out.println(obj1.equals(obj2));
		
		OveridingEqualsMethod obj4=new  OveridingEqualsMethod(1);
		OveridingEqualsMethod obj5=new  OveridingEqualsMethod(1);
		System.out.println(obj4.equals(obj5));
	
		

	}

}
