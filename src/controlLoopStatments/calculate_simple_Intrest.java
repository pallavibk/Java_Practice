package controlLoopStatments;

import java.util.Scanner;

public class calculate_simple_Intrest {

	public static void main(String[] args) {
		//simple intrest calculation
		
		Scanner input_Obj1=new Scanner(System.in);
		System.out.println("enter the principle amount");
		float principle=input_Obj1.nextInt();
		Scanner input_Obj2=new Scanner(System.in);
		System.out.println("enter the time period in either year/month ");
		float time=input_Obj2.nextInt();
		Scanner input_Obj3=new Scanner(System.in);
		System.out.println("enter the rate of intrest in either year/month");
		float rateofintrest=input_Obj3.nextInt();
		
		float simple_intrest=(principle*time*rateofintrest)/100;
		System.out.println("simple intrest="+simple_intrest);
		

	}

}
