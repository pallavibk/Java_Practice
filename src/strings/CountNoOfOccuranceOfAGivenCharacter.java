package strings;

public class CountNoOfOccuranceOfAGivenCharacter {

	public static void main(String[] args) 
	{
		String rv1="aaadbbdda dd ccd eeae";
		int count=0;
		for(int i=0;i<rv1.length();i++)
		{
			if(rv1.charAt(i)=='a')
			{
				count++;
			}
		}
		System.out.println("the number of occurence is"+count);

		
		
}
}
