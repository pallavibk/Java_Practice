package controlLoopStatments;

import java.util.Scanner;

public class check_perfect_number_or_not {
	public static void main(String[] args) {
		/*Scanner input_Obj = new Scanner(System.in);
		System.out.println("Enter the number to check wheather it is perfect number or not");
		int num = input_Obj.nextInt();*/
		int num=19;
		int sum=0;

		
		
		for(int i=2;i<=num;i++)
		{
						int reminder=num%i;
			if(reminder==0)
			{
				int quotient=num/i;
				sum=sum+quotient;
				
			}
		
			
		}
		System.out.println("sum="+sum);
		if(sum==num)
		{
			System.out.println("perfect number");
			
		}
		else
		{
			System.out.println("not a perfect number");
		}
		
		
	}

}
