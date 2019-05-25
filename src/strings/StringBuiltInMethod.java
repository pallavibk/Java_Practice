package strings;

public class StringBuiltInMethod {

	public static void main(String[] args) {
		String st1=new String("I LOVE INDIA");
		System.out.println(st1.length());
		System.out.println(st1.charAt(7));
		System.out.println(st1.indexOf('V'));
		System.out.println(st1.indexOf('I'));
		System.out.println(st1.lastIndexOf('I'));
		System.out.println(st1.indexOf('I', 2));
		System.out.println(st1.substring(1));
		System.out.println(st1.subSequence(2, 9));
System.out.println(st1.startsWith("I LOVE"));
System.out.println(st1.endsWith("HUBLI"));
System.out.println(st1.toUpperCase());
System.out.println(st1.toLowerCase());
System.out.println(st1.toCharArray());

	}

}
