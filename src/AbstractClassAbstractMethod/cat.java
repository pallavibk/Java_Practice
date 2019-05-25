package AbstractClassAbstractMethod;

public class cat extends Animal{

	@Override
	void move() {
	   System.out.println("CAT MOVES");
	}
    @Override
	void sound() 
	{
	   System.out.println("CAT MEME");
	}
	public static void main(String[] args) 
	{
		Dog obj=new Dog();
		obj.move();
		obj.sound();
		cat obj1=new cat();
		obj1.move();
		obj1.sound();
		//Animal obj6=new Animal(4);7
	}
	
}
