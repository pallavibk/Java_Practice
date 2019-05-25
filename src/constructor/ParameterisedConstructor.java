package constructor;

public class ParameterisedConstructor {
	int i;
	static int j=20;
	static int k;
	 int l=30;
	int m;
	
	//program to demonstarate modification of values in 1 object not reflect in another
	 ParameterisedConstructor(int i)
	{
		i=90;
		System.out.println("Value of i:"+i);
	}
	 
	 ParameterisedConstructor()
		{
			
			System.out.println("Value of j:"+j);
			System.out.println("Value of k:"+k);
			System.out.println("Value of l:"+l);
			System.out.println("Value of m:"+m);
		}

	public static void main(String[] args) 
	{
		
		//method invocation itself is calling of cnsructor
		ParameterisedConstructor obj1=new ParameterisedConstructor(90);
		ParameterisedConstructor obj2=new ParameterisedConstructor(190);
		ParameterisedConstructor obj3=new ParameterisedConstructor();
		

	}

}
