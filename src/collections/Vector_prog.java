package collections;

import java.util.Vector;

public class Vector_prog {

	public static void main(String[] args) {
		//methods
		Vector v=new Vector();
		v.addElement("A");
		v.addElement("B");
		v.addElement("C");
		v.addElement("D");
		v.addElement("D");
		v.addElement("D");
		v.addElement("D");
		v.addElement("D");
		v.addElement("D");
		v.addElement("D");
		
		System.out.println("v="+v);
		
		//retrival methods
		System.out.println(v.elementAt(1));
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		
		
		//other methods
		System.out.println("size"+v.size());
		System.out.println("Capacity="+v.capacity());
		v.addElement("E");
		System.out.println("After adding 1 element vector Capacity="+v.capacity());
		
		//removal methods
		System.out.println(v.removeElement("A"));
		System.out.println("v="+v);
	v.removeElementAt(1);
	System.out.println("v="+v);
		System.out.println(v.removeAll(v));
		System.out.println("v="+v);
		
		
	}

}
