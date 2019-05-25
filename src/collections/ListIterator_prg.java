package collections;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Vector;

public class ListIterator_prg {

	public static void main(String[] args) {
		ArrayList AL=new ArrayList();
		AL.add("1");
		AL.add(3);
		AL.add(2);
		AL.add(null);
		AL.add(1);
		
		
		//forord
		ListIterator li=AL.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("next index="+li.nextIndex());
		
		
		//backord
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
		System.out.println("previous index="+li.previousIndex());
		
		AL.set(0, "pallavi");
		System.out.println(AL);
		
		AL.add(555);
		System.out.println(AL);
		
		AL.remove(1);
		System.out.println(AL);
	
	}

	}


