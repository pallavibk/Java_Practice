package inheritance;

public class ProgramToDemonstrateSuperStatementParent {

	ProgramToDemonstrateSuperStatementParent()
	{
		System.out.println("Parent::default constructor");
	}
	ProgramToDemonstrateSuperStatementParent(int a)
	{this();
		System.out.println("Parent::paremetised constructor");
	}
	
}
