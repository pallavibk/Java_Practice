package abstraction;

public class Worker extends Person {


	String Workername;
	int Workinghours;
	
	
	void accept(String Workername,int Workinghours)
	{
		this.Workername=Workername;
		this.Workinghours=Workinghours;
		System.out.println("orkername="+Workername);
		System.out.println("orkinghours="+Workinghours);
	}
	@Override
	void display() {
		accept("XYZ",20);
		
		
	}

}
