package arrays;

public class OneDimensionalarray {

	public static void main(String[] args) {
		// different primitive types of arrays
		String[] st = new String[3];
		int[] in = new int[5];
		char[] ch = new char[5];
		double[] dob = new double[5];

		// different ays of declaring the arrays
		int[] a;
		int[] b;
		int c[];
		int[] d;

		int[] aaa, bbb;// both are arrays
		int[] aaa1, bbb1;// both are arrays
		int aaa2[], bbb2;// in this case aaa2 is array and bbb2 is primitive of type integer

		// creation
		int[] x;
		x = new int[3];

		// size of array
		// int []d=new int[]; providing the size is mandatory at creation time
		int[] y = new int[0];
		//int[] z = new int[-1]; // u ill get exception NegativeArraySize Exception
		// int [] u=new int[1.1]; never size be a float,double
		int[] xx = new int[4];
		System.out.println("size of x=" + xx.length);

		// initialisation of arrays
		// 1st method:

		int[] e = new int[3];
		e[0] = 10;
		e[1] = 20;
		e[2] = 30;

		// 2nd method
		int[] ee = { 10, 20, 30, 40, 50 };
		
		//if u ont provide any value it takes by default value
		int[] eee = new int[3];
		for(int v:eee)
		{
			System.out.println(v);
		}

		// printing using for loop

		for (int i = 0; i < e.length; i++) {
			System.out.println(e[i]);

		}
		System.out.println("*************");

		// printing the array elements using for each loop
		for (int v : ee) {
			System.out.println(v);
		}
		
		
		//object or derived array

		System.out.println("*************");

		OneDimensionalarray obj1 = new OneDimensionalarray();
		OneDimensionalarray obj2 = new OneDimensionalarray();
		OneDimensionalarray obj3 = new OneDimensionalarray();
		OneDimensionalarray obj4 = new OneDimensionalarray();
		OneDimensionalarray obj5 = new OneDimensionalarray();
		OneDimensionalarray[] aa = new OneDimensionalarray[5];
		aa[0] = obj1;
		aa[1] = obj2;
		for (OneDimensionalarray v : aa) {
			System.out.println(v);
		}

		System.out.println("*************");
		
		OneDimensionalarray bb;
		bb = new OneDimensionalarray();
		bb= new OneDimensionalarray();
		bb= new OneDimensionalarray();
		bb= new OneDimensionalarray();
		

		/*for (OneDimensionalarray v : bb) {
			System.out.println(v);
		}
*/
	}
}
