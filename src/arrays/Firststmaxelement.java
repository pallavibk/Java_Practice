package arrays;

public class Firststmaxelement {

	public static void main(String[] args) {
		int[] a= {10,54,2,89,100,500};
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			
			if(max<a[i])
			{
				max=a[i];
			}
	}
	
		System.out.println("max="+max);

	}

}
