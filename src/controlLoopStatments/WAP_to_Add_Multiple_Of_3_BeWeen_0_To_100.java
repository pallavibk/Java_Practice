package controlLoopStatments;

public class WAP_to_Add_Multiple_Of_3_BeWeen_0_To_100 {

	public static void main(String[] args) {
		int count=0;
		for(int i=0;i<=100;i++)
		{
			
			if(i%3==0)
			{
				count++;
				System.out.println(i);
				
			}
			
		}
		System.out.println("count="+count);

	}

}
