package patternPrintingUsingforLoop;

public class Star3 {

	public static void main(String[] args) 
	{
		int n=4;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=2*n-1;j++)
			{
				if (j <= n - i) {
					System.out.print(" ");
				} else if (j >= n + i) {
					break;
				} else {
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
		
		
		
		

	}
}
