package controlLoopStatments;

public class Print_Even_number_from500To1000 {

	public static void main(String[] args) {
		
		int num=500;
		while(num<=1000)
		{
			if(num%2==0)
			{
				System.out.println(num);
			}
			num++;
		}
	}

}
