package collections;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;

public class LinkedList_Prg {

	public static void main(String[] args) {
		LinkedList LL=new LinkedList();
		ArrayList AL=new ArrayList();
		AL.add("A");
		AL.add("B");
		LL.add(1);
		LL.add(1);
		LL.add(1);
		LL.add(1);
		LL.add(2, "Pallavi");
		LL.addAll(AL);
		System.out.println("After adding elemnets of arraylist colection="+LL);
		LL.addFirst(2);
		LL.addLast(6);
		System.out.println(LL);
		LL.remove(6);
		System.out.println(LL);
	System.out.println("getfirst="+LL.getFirst())	;
	System.out.println("getLast="+LL.getLast())	;
	LL.removeFirst();
	System.out.println("LL after removing first elemnt="+LL);
	
		LL.removeLast();
		System.out.println("LL after removing last elemnt="+LL);
		LL.set(1, "sunita");
		System.out.println(LL);
		
		//interfaces

		System.out.println(LL instanceof Serializable);
		System.out.println(LL instanceof Cloneable);
		System.out.println(LL instanceof RandomAccess);
		
		//constructors
		LinkedList LL1=new LinkedList();
		LinkedList LL2=new LinkedList(AL);
		System.out.println("LL2="+LL2);
		
		
		
		

	}

}
