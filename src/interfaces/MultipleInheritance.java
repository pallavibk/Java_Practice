package interfaces;



public class MultipleInheritance implements MultipleInheritance1,MultipleInheritance2 {

	@Override
	public void sho() {
		System.out.println("In sho()");
		
	}

	@Override
	public void take(int x) {
		
		System.out.println("In take()"+x);
	}
	
	
	@Override
	public void print() {
		System.out.println("print()");
		
	}
	
	public static void main(String[] args) {
		MultipleInheritance obj=new MultipleInheritance();
		obj.sho();
		obj.take(2);
		obj.print();
	}

}
