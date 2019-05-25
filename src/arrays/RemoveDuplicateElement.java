package arrays;

import java.util.HashSet;

public class RemoveDuplicateElement {

	public static void main(String[] args) {
		int[] a= {1,2,2,4,5};
		int[] b= {5,6,7,5,9};
		
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0;i<a.length;i++)
		{
		hs.add(a[i]);
		}
		for(int v:hs)
		{
			System.out.println(v);
		}
		System.out.println("*******");
		
		HashSet<Integer> hs1=new HashSet<>();
		for(int j=0;j<b.length;j++)
		{
		hs1.add(b[j]);
		}
		for(int v1:hs1)
		{
			System.out.println(v1);
		}
		

	}

}
