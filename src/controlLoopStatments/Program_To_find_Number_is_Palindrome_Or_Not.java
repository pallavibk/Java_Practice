package controlLoopStatments;

import java.util.Scanner;

public class Program_To_find_Number_is_Palindrome_Or_Not {

	public static void main(String[] args) {

		Scanner input_Obj = new Scanner(System.in);
		System.out.println("Enter the number to check wheather it is palindrome or not");
		int num = input_Obj.nextInt();

		int reverse = 0, temp;
		temp = num;
		int reminder;

		while (temp > 0) {
			reminder = temp % 10;
			reverse = reverse * 10 + reminder;
			temp = temp / 10;
		}
		if (reverse == num) {
			System.out.println("Number is palindrome");
		} else {
			System.out.println(" Number is not palindrome");
		}

	}

}
