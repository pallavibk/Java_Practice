package inheritance;

public class MultiLevelGrand  extends MultiLevelChild{
	int z=30;
	void test3()
	{
		System.out.println("GRANDchild method");
	}
	MultiLevelGrand()
	{
		System.out.println("GRANDchild consructor");
	}
	
	public static void main(String[] args) {
		MultiLevelGrand obj=new MultiLevelGrand();
		System.out.println("x="+obj.x);
		System.out.println("y="+obj.y);
		System.out.println("z="+obj.z);
		obj.test1();
		obj.test2();
		obj.test3();
	}
	

}
