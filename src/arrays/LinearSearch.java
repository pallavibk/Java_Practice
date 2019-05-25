package arrays;

public class LinearSearch 
{
	public static void main(String[] args) {
		int[] a= {38,52,9,18,6,62,13};
		int item=6,count=0;
		System.out.println("**********");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==item)
			{
				System.out.println("elemnet found at "+i +"Position");
				count=count+1;
				break;
				
				
			}
			
		}
		if(count==0)
		{
			System.out.println("Item never found");
		}
	}

	
}
