package arrays;

public class secondMaxNumberinarray {

	public static void main(String[] args)
	{
		//first sort array in descending order then the element in 2nd position ie a[1] is nd heightest one
		
		int [] a= {10,6,7,3,100,500};
		System.out.println("before sorting ");
		for(int v:a)
		{
			System.out.println(v);
		}
		
		for(int i=0;i<a.length;i++)
		{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]<a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		}
		System.out.println("after sort");
		for(int v:a)
		{
			System.out.println(v);
		}
		System.out.println("second max="+a[1]);
	
	}
	
}
