package abstraction;

public class Bulb implements SWitch{

	@Override
	public void on() {
		System.out.println("Bulb On");
		
	}

	@Override
	public void off() {
		System.out.println("Bulb Off");
		
	}
	

}
