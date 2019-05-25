package constructor;

public class thisKeyord {
	static int a=60;
	
   
	/*void test1() 
	{
		//RHS(global)=LHS(local) ie Assign LHS value t RHS
		int a=10;
		a = a;
		System.out.println("a=" + a);//10
		this.a = a;
		System.out.println("a=" +a);//10
		a = this.a;//10
		System.out.println("a=" + a);
		
				
	}
	
	void test2(int a) 
	{
		//RHS(global)=LHS(local) ie Assign LHS value t RHS
		
		a = a;
		System.out.println("a=" + a);
		this.a = a;
		System.out.println("a=" +a);
		a = this.a;
		System.out.println("a=" + a);
		
				
	}*/
	void test3(int a) 
	{
		//RHS(global)=LHS(local) ie Assign LHS value t RHS
		
	//int	a = 100;
		//System.out.println("a=" + a);
		//this.a = a;
		System.out.println("a=" +a);
		a = this.a;
		System.out.println("a=" + a);
		
				
	}

	

	public static void main(String[] args) {
		thisKeyord obj = new thisKeyord();
				obj.test3(100);
		System.out.println("from main after:"+obj.a);
		//obj.test2(20);
		
	}
}
