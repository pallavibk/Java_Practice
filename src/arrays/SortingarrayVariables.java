package arrays;

import java.util.Arrays;

public class SortingarrayVariables {

	public static void main(String[] args) {
		
		int[] a= {10,80,50,66,74};
		
		for(int v:a)
		{
			System.out.println(v);
		}
		System.out.println("***************");
		Arrays.sort(a);
		for(int v:a)
		{
			System.out.println(v);
		}
	}

}
