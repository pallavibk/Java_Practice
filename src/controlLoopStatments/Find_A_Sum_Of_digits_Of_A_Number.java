package controlLoopStatments;

import java.util.Scanner;

public class Find_A_Sum_Of_digits_Of_A_Number {

	public static void main(String[] args) {

		Scanner input_Obj=new Scanner(System.in);
		System.out.println("Enter the number to find the sum of digits of a number");
		int num=input_Obj.nextInt();
	
		int sum=0,reminder,quotient;
		do
		{   reminder=num%10;
		     quotient=num/10;
			
			
			sum=sum+reminder;
		//	System.out.println("sum="+sum);
			num=quotient;
			
		}while(quotient!=0);
		
		System.out.println("sum="+sum);
		
		
		
		//or
		/*while(num>0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println("sum="+sum);
*/
	}

}
