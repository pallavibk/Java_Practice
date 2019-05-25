package finalPrograms;

public class FinalVariable {

	
	//final global variable
	//get compile time error if u ont initialzise value at the time of declaration
	// static final int x;
	 static final int y=10;
	
	//canot modify the value if it is final
	// static final int y=20;
	
	
	//final non-static
	 final int z=12220; 
	
	
	//final ith respect to local
	public void fun()
	{
		//final inside local can be declared and initaialized later
		 final int u;
		 u=1000;
		 
		 //canot modify the final variable
		 //u=2000;
		 
		 
	}
	
	
}
