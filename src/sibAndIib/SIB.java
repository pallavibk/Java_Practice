package sibAndIib;

public class SIB {
	static
	{
		String Operati_systemng=System.getenv("OS");
		System.out.println(Operati_systemng);
		if(Operati_systemng.equals("Linux"))
		{
			System.out.println("u can proceed further");
		}
		else
		{
			System.out.println("PLS check ur OS");
			System.exit(0);
		}
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("In main");
		
		
		
	}

}
