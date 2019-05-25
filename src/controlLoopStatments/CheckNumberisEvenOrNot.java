package controlLoopStatments;

import java.util.Scanner;

public class CheckNumberisEvenOrNot {

	public static void main(String[] args) {
		Scanner input_Obj=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=input_Obj.nextInt();
		if(number%2==0)
		{
			System.out.println("number is even");
		}
		else {
			System.out.println("number is odd");
		}
		
		

	}

}
