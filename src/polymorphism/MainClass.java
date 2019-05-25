package polymorphism;

public class MainClass {
	public static void main(String[] args) {
		
		BankParent ref;
		ref=new SBIChild();
		System.out.println("SBI rate of intrest="+ref.rateointrest());
		 ref=new ICICIChild();
		 System.out.println("ICICI rate of intrest="+ref.rateointrest());
		 ref=new AXISChild();
		 System.out.println("AXIS rate of intrest="+ref.rateointrest());
		 
	}

}
