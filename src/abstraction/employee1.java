package abstraction;

public class employee1 extends Person {

	String empname;
	int id,sal;
	
	
	void accept(String empname,int id,int sal)
	{
		this.empname=empname;
		this.id=id;
		this.sal=sal;
		System.out.println("empname="+empname);
		System.out.println("id="+id);
		System.out.println("sal="+sal);
	}
	@Override
	void display() {
		accept("pallavi",11,1100000);
		
		
	}

}
