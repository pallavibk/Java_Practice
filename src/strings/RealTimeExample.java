package strings;

public class RealTimeExample {

	public static void main(String[] args) {
		String rv1="Anamika";
		String rv2="anamika";
		if(rv1.equals(rv2))
		{
			System.out.println("Passord mismatch");
		}
		else if(rv1.equalsIgnoreCase(rv2))
		{
			System.out.println("CASE MISMATCH");
		}
		else
		{
			System.out.println("PASSORD MISMATCH");
		}
		

	}

}
