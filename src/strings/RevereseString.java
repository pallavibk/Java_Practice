package strings;

public class RevereseString {

	public static void main(String[] args) {
		String rv="HELLO PALLAVI KUNDAGOL";
		System.out.println("Original string="+rv);
		for(int i=rv.length()-1;i>=0;i--)
		{
			System.out.print(rv.charAt(i));
		}
	}

}
