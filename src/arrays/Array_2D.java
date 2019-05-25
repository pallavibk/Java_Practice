package arrays;

public class Array_2D {

	public static void main(String[] args) {
		//2D array : MATRIX and jagged array
		//declaration
		int[][] a;
		int[] []b;
		int [][]c;
		int[] d[];
		
		//Creation :1st method :Matrix array initialisation
		a=new int[2][3];
		int[][] bb=new int [2][3];
		
		//Creationray : 2nd method
		 int [][] cc=new int[2][];
		 cc[0]=new int[3];
		 cc[1]=new int[2];
		 
		 //initialization : of Matrix and jagged
		  a[0][0]=10;
		  a[0][1]=20;
		  //or
		 int[][] aa= {{10,20,30,70,80},{40,50,60,70}};
		 
		 //size
		 System.out.println(aa.length);
		 System.out.println(aa[0].length);
		 System.out.println(aa[1].length);
		// System.out.printlna(aa[0][0].length); cT error because array is not exist no pointing anyhere
		 
	}

}
