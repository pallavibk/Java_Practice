package collections;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;

public class ArrayList1 {

	public static void main(String[] args) {
        
		ArrayList l1 = new ArrayList();
		l1.add("1");
		l1.add(3);
		l1.add(2);
		l1.add(null);
		l1.add(1);
		System.out.println(l1);
		l1.add(3, "pallavi");
		System.out.println(l1);
		l1.add(6, "XYZ");
		System.out.println(l1);
        ArrayList l2 = new ArrayList();
        for(Object v : l1) 
        {
			System.out.println(v);
		}
		System.out.println("ADDING ANOTHER COLLECTION L2 in L1");
		l1.addAll(l2);
		System.out.println(l1);
		l1.remove(6);
		System.out.println(l1);
		System.out.println(l1.size());
		l1.add("sunita");
		l1.set(6, "spurthi");
		System.out.println("L1="+l1);
		System.out.println("***");
		System.out.println(l1.get(6));
		System.out.println("***");
		System.out.println(l1.size());
		
		System.out.println("********CONSTRUCTOR********");
		ArrayList l3 = new ArrayList( 4);
		l3.add("A");
		l3.add("A");
		l3.add("A");
		l3.add("A");
		l3.add("A");
		l3.add("A");
		l3.add("A");
		System.out.println(l3.lastIndexOf("A"));
		System.out.println(l3.indexOf("A"));
		
		LinkedList LL=new LinkedList();
		LL.add("5");
		LL.add("6");
		
		ArrayList AL=new ArrayList(LL);
		System.out.println("AL="+AL);
		
		
		//interfaces
		System.out.println(l1 instanceof Serializable);
		System.out.println(l1 instanceof Cloneable);
		System.out.println(l1 instanceof RandomAccess);
	
		
	}
}
