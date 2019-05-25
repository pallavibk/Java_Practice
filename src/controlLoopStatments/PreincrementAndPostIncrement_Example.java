package controlLoopStatments;

public class PreincrementAndPostIncrement_Example {

	public static void main(String[] args) {
int a=10,b=5,c;

System.out.println("a="+a);
System.out.println("b="+b);



c=++a+b;
System.out.println("a="+a);
System.out.println("b="+b);
System.out.println("c="+c);//here first 'a' value is incremented then addition il happen 


c=a+++b;
System.out.println("a="+a);
System.out.println("b="+b);
System.out.println("c="+c); //here first addition il happen then 'a' value is incremented



	}

}
