package controlLoopStatments;

public class TO_Reverse_Num {

	public static void main(String[] args) {
		int num=12345;
		
		int reverse=0;
		
		while(num>0) {
		int reminder=num%10;
		reverse=(reverse*10)+reminder;
		int quotient=num/10;
		num=quotient;
		
		}
		System.out.println("revrese number="+reverse);

	}

}
