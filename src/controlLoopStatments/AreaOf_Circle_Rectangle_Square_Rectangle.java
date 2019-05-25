package controlLoopStatments;

import java.util.Scanner;

public class AreaOf_Circle_Rectangle_Square_Rectangle {

	public static void main(String[] args) {
		//formula to calculate area of circle : pi*r*r
		
		final float PI=3.148f;
		Scanner input_Obj=new Scanner(System.in);
		System.out.println("Enter the radius of cirle");
		int radius=input_Obj.nextInt();
		float areaofcircle=PI*radius*radius;
		System.out.println("are of circle="+areaofcircle);
		
		
		
		
		//calculate area of rectangle
		Scanner input_Obj1=new Scanner(System.in);
		System.out.println("enter the length of the rectangle");
		int length=input_Obj1.nextInt();
		System.out.println("enter the Width of rectangle");
		int Width=input_Obj1.nextInt();
		int areaofrectangle=length*Width;
		System.out.println("area of rectangle="+areaofrectangle);
		
		
		
		//calculate area of triangle
		Scanner inp_obj3=new Scanner(System.in);
		System.out.println("enter the height of the triangle");
		int height=inp_obj3.nextInt();
		System.out.println("enter the breadth of triangle");
		int breadth=inp_obj3.nextInt();
		float area_triangle=0.5f*height*breadth;
		System.out.println("area of rectangle="+area_triangle );
		
		
		//calculate area of square
		Scanner inp_obj2=new Scanner(System.in);
		System.out.println("enter the length/Width of the square");
		int len_Wid=inp_obj2.nextInt();
		 int area_Square=len_Wid*len_Wid;
		 System.out.println("area of square="+area_Square);
	}

}
