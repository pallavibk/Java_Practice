package controlLoopStatments;

import java.util.Scanner;

public class Averageof3Numbers {

	public static void main(String[] args) {
		Scanner input_Obj=new Scanner(System.in);
		System.out.println("Enter the number1");
		int num1=input_Obj.nextInt();
		System.out.println("Enter the number2");
		int num2=input_Obj.nextInt();
		System.out.println("Enter the number3");
		int num3=input_Obj.nextInt();
		int avg=(num1+num2+num3)/3;
		System.out.println("average="+avg);

	}

}
