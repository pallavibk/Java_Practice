package inheritance;

public class ProgramToDemonstrateSuperStatementChild extends ProgramToDemonstrateSuperStatementParent{

	ProgramToDemonstrateSuperStatementChild()
	{super(4);
		System.out.println("child::default constructor");
	}
	ProgramToDemonstrateSuperStatementChild(int a)
	{this();
		System.out.println("child::paremetised constructor");
	}
	
	//this() and super() canot be used in same constructor
	/*ProgramToDemonstrateSuperStatementChild(float a)
	{
	super(4);
	this();
		System.out.println("child::paremetised constructor");
	}*/
	
	public static void main(String[] args) {
		
		ProgramToDemonstrateSuperStatementChild obj=new  ProgramToDemonstrateSuperStatementChild(4);
		
		
	}

}
