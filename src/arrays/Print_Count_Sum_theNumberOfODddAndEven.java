package arrays;

import java.util.ArrayList;

public class Print_Count_Sum_theNumberOfODddAndEven {

	public static void main(String[] args) {

		int[] a = { 1, 7, 9, 6, 4, 3 };
		ArrayList<Integer> al1 = new ArrayList<>();
		ArrayList<Integer> al2 = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				al1.add(a[i]);
			}

			else if (a[i] % 2 != 0) {
				al2.add(a[i]);
			}

		}
		System.out.println("even array elements are :");

		int even_sum = 0;
		for (int v : al1)

		{
			System.out.println(v);
			even_sum = even_sum + v;

		}
		System.out.println("count of even no" + al1.size());
		System.out.println("sum of even number=" + even_sum);

		System.out.println("ODD array elements are :");

		int even_odd = 0;
		for (int v : al2) {

			System.out.println(v);
			even_odd = even_odd + v;

		}
		System.out.println("count of odd no" + al2.size());
		System.out.println("sum of odd number=" + even_odd);
		
		

		
	}

}
