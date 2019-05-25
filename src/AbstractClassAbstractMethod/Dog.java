package AbstractClassAbstractMethod;

public class Dog  extends Animal{

	@Override
	void move() {
		System.out.println("DOG MOVES");
	}

	@Override
	void sound() {
		System.out.println("DOG BARKS");
		
	}

}
