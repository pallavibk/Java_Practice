package controlLoopStatments;

import java.util.Scanner;

public class FindLargestOf3Numbers {

	public static void main(String[] args) {
		Scanner input_Obj=new Scanner(System.in);
		System.out.println("Enter the number1");
		int num1=input_Obj.nextInt();
		System.out.println("Enter the number2");
		int num2=input_Obj.nextInt();
		System.out.println("Enter the number3");
		int num3=input_Obj.nextInt();
		if(num1>=num2 && num1>=num3)
		{
			System.out.println("number1="+num1+" is greater");
		}
		else if(num2>=num3)
		{
			System.out.println("number2="+num2 +" is greater");
		}
		else
		{
			System.out.println("number3 ="+num3+" is greater");
			
		}

	}

}
