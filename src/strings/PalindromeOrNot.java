package strings;

public class PalindromeOrNot {

	public static void main(String[] args) {
		String rv1="DAD";
		String rv2="";
		System.out.println("Original string="+rv1);
		for(int i=rv1.length()-1;i>=0;i--)
		{
			rv2=rv2+rv1.charAt(i);
		}
		System.out.println("Reversred string="+rv2);
		if(rv1.equals(rv2))
		{
			System.out.println(" palindrome");
		}
		else
		{
			System.out.println("Its not  a palindrome");
			
		}
		
		

	}

}
