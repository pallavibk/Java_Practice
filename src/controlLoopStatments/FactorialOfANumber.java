package controlLoopStatments;

import java.util.Scanner;

public class FactorialOfANumber {

	public static void main(String[] args) 
	{
		//Tips to remember the Logic: is always start multiplication from top number till 1 (ie factorial of 4=4*3*2*1)
		Scanner input_Obj=new Scanner(System.in);
		System.out.println("Enter the number for factorial calculation");
		int num=input_Obj.nextInt();
		/*int fact=1;
		while(num>0)
		{
			fact=fact*num;
			num--;
		}*/
		
		//use it en using recursion
		//System.out.println("factorial of number="+fact(num));
		/*//another approach
		
		Scanner input_Obj=new Scanner(System.in);
		System.out.println("Enter the number for factorial calculation");
		int num=input_Obj.nextInt();
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		
		
		System.out.println("factorial of number="+fact);*/

	}
	//using recursion
	/*
	private static Integer fact(Integer n) {
		if (n == 0 || n == 1) {
			return 1;
		} else {
			return n * fact(n-1);
		}
	}
*/
}
