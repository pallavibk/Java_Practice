package strings;

public class SplitMethod {

	public static void main(String[] args) {
		String rv1="QSPIDER IS THE BEST INSTITUTE IN TE UNIVERSE";
		String[] ref=rv1.split(" ");
		for(int i=0;i<ref.length;i++)
		{
			System.out.println(ref[i]);
		}
	}
}
