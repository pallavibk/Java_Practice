package controlLoopStatments;

public class Program_To_Find_Sum_Of_Even_Odd_from_1To100 {

	public static void main(String[] args) {
		int sum_Even=0,sum_Odd=0;
		
		
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
			{
				
				sum_Even=sum_Even+i;
				
			}
			else if(i%2!=0)
			{
				sum_Odd=sum_Odd+i;
				
			}
		}
		System.out.println("sum of even="+sum_Even);
		System.out.println("sum of odd="+sum_Odd);
		
		
		
		//Or a
		/*int num=1,sum_even=0,sum_odd=0;
		do
		{
			if(num%2==0)
			{
				sum_even=sum_even+num;
			}
			else
			{
				sum_odd=sum_odd+num;
				
			}
			num++;
		}
		while(num<=10);
		System.out.println("sum_even="+sum_even);
		System.out.println("sum of odd="+sum_odd);
*/
	}

}
