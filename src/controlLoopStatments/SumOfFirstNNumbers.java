package controlLoopStatments;

import java.util.Scanner;

public class SumOfFirstNNumbers {

	public static void main(String[] args) {
		Scanner inp_obj=new Scanner(System.in);
		System.out.println("enter the number to calculate sum of first N number");
		int num=inp_obj.nextInt();
		
		int sum=0;
		
		for(int i=1;i<=num;i++)
		{
			sum=sum+i;
			
		}
		System.out.println("sum of first "+num+ "numbers is :"+sum);
		
		
		
		
		//Or another approach
		/*int n=5;
		int sum=0;
		int i=1;
		while(i<=n)
		{
			 sum=sum+i;
			 i++;
		}
		System.out.println("sum="+sum);*/
	}
}
