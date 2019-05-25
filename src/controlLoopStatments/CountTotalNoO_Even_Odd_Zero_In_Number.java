package controlLoopStatments;

import java.util.Scanner;

public class CountTotalNoO_Even_Odd_Zero_In_Number {

	public static void main(String[] args) {
		
		Scanner input_Obj=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=input_Obj.nextInt();
	
		int count_Odd=0,count_even=0,count_zero=0,reminder,quotient;
		do {
			reminder=num%10;
			quotient=num/10;
			if (reminder==0)
			{
				count_zero++;
			}
			else if(reminder%2==0)
			{
				count_even++;
			}
			else if(reminder%2!=0)
			{
				count_Odd++;
			}
			num=quotient;
		}while(quotient>0);
		
		System.out.println("number of even=" + count_even);
		System.out.println("number of odd=" +count_Odd );
		System.out.println("number of zero=" +count_zero );
		
		
		/*do
		{
			rem=num%10;
			if(rem==0)
			{
				Zero_cnt++;

			}
			else if(rem%2==0)
			{
				even_cnt++;
			}
			else
			{
				odd_cnt++;
			}
			num=num/10;
			
		}while(num>0);
		System.out.println("even_cnt= "+even_cnt+" odd_cnt= "+odd_cnt+" Zero_cnt= "+Zero_cnt);

		*/
		
		
		
	}

}
