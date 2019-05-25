package polymorphism;

public class GlobalStaticClassReferenceVariable {
	
	int i;
	
static	GlobalStaticClassReferenceVariable ref;

static void test()
{
	System.out.println(ref.i);
}
	public static void main(String[] args) {
		System.out.println("Main starts");
		ref=new GlobalStaticClassReferenceVariable();
		System.out.println(ref.i);
		test();
		
		System.out.println("Main starts");

	}

}
