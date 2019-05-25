package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class iterator_prog {

	public static void main(String[] args) {
		ArrayList AL=new ArrayList();
		AL.add("1");
		AL.add(3);
		AL.add(2);
		AL.add(null);
		AL.add(1);
		
Iterator itr=AL.iterator();
System.out.println(itr);
while(itr.hasNext())
{
	System.out.println(itr.next());
}
System.out.println(itr);
itr.remove();
System.out.println(itr);

	}
	
}
