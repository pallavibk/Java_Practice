package controlLoopStatments;

import java.util.Scanner;

public class CheckNumisPositiveOrNot {

	public static void main(String[] args) {
		Scanner input_Obj = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = input_Obj.nextInt();
		if(num>0)
		{
			System.out.println("number is positive");
		}
		else if(num<0)
		{
			System.out.println("number is negative");
			
		}
		else if(num==0)
		{
			System.out.println("neither positive nor negative");
		}
		input_Obj.close();
	}

}
