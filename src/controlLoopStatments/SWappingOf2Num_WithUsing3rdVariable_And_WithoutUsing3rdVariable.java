package controlLoopStatments;

import java.util.Scanner;

public class SWappingOf2Num_WithUsing3rdVariable_And_WithoutUsing3rdVariable {

	public static void main(String[] args) {
		
		//SWapping Of 2 Num With Using 3rdVariable_And_WithoutUsing3rdVariable
		Scanner input_Obj=new Scanner(System.in);
		System.out.println("Enter the num1");
		int num1=input_Obj.nextInt();
		System.out.println("Enter the num2");
		int num2=input_Obj.nextInt();
		System.out.println("before interchange num1="+num1);
		System.out.println("before interchange num2="+num2);
		
		int num3;
		num3=num1;
		num1=num2;
		num2=num3;
		
		System.out.println("after interchange num1="+num1);
		System.out.println("after interchange num2="+num2);
		
		//SWapping Of 2 Number Without  Using 3rd Variable
		
		System.out.println("Enter the number1");
		int number1=input_Obj.nextInt();
		System.out.println("Enter the number2");
		int number2=input_Obj.nextInt();
		System.out.println("before interchange num1="+number1);
		System.out.println("before interchange num2="+number2);
		 number1=number1+number2;
		 number2=number1-number2;
		 number1=number1-number2;
		 System.out.println("before interchange num1="+number1);
			System.out.println("before interchange num2="+number2);
		
		

	}

}
