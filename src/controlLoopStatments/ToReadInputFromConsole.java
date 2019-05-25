package controlLoopStatments;


import java.util.Scanner;


public class ToReadInputFromConsole {
public static void main(String[] args) {
		
Scanner input_Obj=new Scanner(System.in);
System.out.println("Enter int number");
int intnum=input_Obj.nextInt();
System.out.println("Iteger number="+intnum);


System.out.println("Enter double number");
double doublenum=input_Obj.nextDouble();
System.out.println("Doble number="+doublenum);

System.out.println("float number enter");
float ftnum=input_Obj.nextFloat();
System.out.println("float num="+ftnum);

System.out.println("enter string");
String strnum=input_Obj.nextLine();
System.out.println("string="+strnum);

/*System.out.println("Enetr characvter");
char charnum=input_Obj.
System.out.println("character="+);
*/

input_Obj.close();
}
}
