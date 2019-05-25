package variables;

public class PracticalUsageOfStaticVariable {

	
	 int id;
	 String name;
	 int age;
	 int sal;
	 static String company_name="Ethans";
	  static int count=0;
	 
	 PracticalUsageOfStaticVariable(int id,String name,int age,int sal)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		
		System.out.println("id="+id);
		System.out.println("name="+name);
		System.out.println("age="+age);
		System.out.println("sal="+sal);
		
		count++;
	
	}
	 
	 
}
