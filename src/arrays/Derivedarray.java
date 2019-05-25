package arrays;

public class Derivedarray {
public static void main(String[] args) {
	BinarySearch[] ref=new BinarySearch[3];
	BinarySearch obj=new BinarySearch();		
	BinarySearch obj2=new BinarySearch();
	BinarySearch obj3=new BinarySearch();
	ref[0]=obj;
	ref[1]=obj2;
	ref[2]=obj3;
	
	
	for(BinarySearch v:ref)
	{
		System.out.println(v);
	}
	
	for(int i=0;i<ref.length;i++)
	{
		System.out.println(ref[i]);
	}
	
	}
}
