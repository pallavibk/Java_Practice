package controlLoopStatments;

import java.util.Scanner;

public class Multiply2Num {

	public static void main(String[] args) {
		Scanner input_obj=new Scanner(System.in);
		System.out.println("enter num1");
		int num1=input_obj.nextInt();
		System.out.println("Enter num2");
		int num2=input_obj.nextInt();
		int mul=num1*num2;
		System.out.println("mul="+mul);
		
	}

}
