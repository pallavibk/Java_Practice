package controlLoopStatments;

import java.util.Scanner;

public class Check_Prime_Or_Not {

	public static void main(String[] args) {
		
		Scanner input_Obj = new Scanner(System.in);
		System.out.println("Enter the number to check wheather it is prime or not");
		int num = input_Obj.nextInt();
		
		int i=1,quot,reminder;
		//i=num;
		while (i<=num) 
		{
			quot=num/i;
			
			if(quot>1&&i%num==0)
			{
		    System.out.println("number is prime");
			i++;
		    }
			else
			{
				System.out.println("number is not prime");
			}
		}
	}

}
