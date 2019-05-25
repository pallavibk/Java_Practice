package collections;

import java.util.Enumeration;
import java.util.Vector;

public class Enumerator_prg {

	public static void main(String[] args) 
	{
       Vector v=new Vector();
        v.addElement("A");
		v.addElement("B");
		v.addElement("C");
		v.addElement("D");
		
		Enumeration e=v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}

	}

}
