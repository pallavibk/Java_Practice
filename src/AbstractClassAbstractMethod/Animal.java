package AbstractClassAbstractMethod;

public abstract class Animal extends TestClass implements TestInterface
{
	abstract void move();
	abstract void sound();
	Animal()
	{
		System.out.println("animal consrructor");
	}
   Animal(int a)
	{
		System.out.println("animal parameterised consrructor");
	}
public static void main(String[] args) 
{
	//Animal obj=new Animal();
	TestClass obj=new TestClass();
}
}
