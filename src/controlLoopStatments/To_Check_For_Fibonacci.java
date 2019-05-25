package controlLoopStatments;

public class To_Check_For_Fibonacci {

	public static void main(String[] args) {
		int i=1;
		int j=1;
		int sum=i+j;
        int num=21;
		while(sum<=num)
		{
			i=j;
			j=sum;
			sum=i+j;
			System.out.println("fibonacci series="+sum);
		}
		
	}

}
