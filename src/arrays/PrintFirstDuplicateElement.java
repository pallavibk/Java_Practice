package arrays;

public class PrintFirstDuplicateElement {
	

	public static void main(String[] args) {
		
		int[] a= {6,5,3,2,5,1,2,4};
		
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{System.out.println("first duplicate element="+a[i]);
				count=count+1;
					break;
			    }
			}
			if(count>0)
				break;
				}
			
		}
		

	}


