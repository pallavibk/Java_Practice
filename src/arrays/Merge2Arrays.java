package arrays;

public class Merge2Arrays {
	public static void main(String[] args) {
		
		int[] a= {10,58,63,20};
		int[] b= {52,68,40,30,87};
		int[] c=new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		for(int v:c)
		{
			System.out.println(v);
		}
		System.out.println("a length  "+a.length);
		System.out.println("b length  "+b.length);
		System.out.println("c length  "+c.length);
		
		/*int k=a.length;
		
		for(int j=0;j<b.length;j++)
		{
		
			
				c[k]=b[j];
				k++;
			}
			*/
		
		//or
		for(int i=0;i<b.length;i++)
		{
		
			
				c[a.length+i]=b[i];
				
			}
			
		
		for(int v:c)
		{
			System.out.println(v);
		}
	}

}
