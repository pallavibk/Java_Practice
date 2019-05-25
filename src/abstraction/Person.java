package abstraction;

public abstract class Person {
	
	
	//achieving abstraction using abstract class(0 to 100%)
	abstract void display();
	
	
	public static void main(String[] args) {
		
		Person p=new employee1();
		Person p1=new Worker();
		p.display();
		
		p1.display();
		
	}

}
