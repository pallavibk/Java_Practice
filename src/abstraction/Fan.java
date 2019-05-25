package abstraction;

public class Fan  implements SWitch{
	@Override
	public void on() {
		System.out.println("FAN ON ");
		
	}

	@Override
	public void off() {
		System.out.println("FAN  Off");
		
	}
	

}
