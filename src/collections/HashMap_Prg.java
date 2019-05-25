package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap_Prg {

	public static void main(String[] args) {
		HashMap HM=new HashMap();
		HM.put(101, "A");
		HM.put(102, "B");
		HM.put(103, "C");
		System.out.println(HM);
		HM.put(102, "X");
		System.out.println(HM);
		
		HashMap M=new HashMap();
		M.putAll(HM);
		System.out.println("M=="+M);
	System.out.println("M.get(101)=="+M.get(101));
	System.out.println(M.keySet());
	System.out.println(M.values());
	System.out.println(M.entrySet());
	
	
	System.out.println("*********");
	System.out.println(M);
	System.out.println(M.put(104,"D" ));
	Set s=M.keySet();
	System.out.println("S===="+s);
	
	Collection c=M.values();
	System.out.println("C===="+c);
	
	Set s1=M.entrySet();
	System.out.println(s1);
	
	Iterator itr=s1.iterator();
	while(itr.hasNext())
	{
		Map.Entry m1=(Map.Entry)itr.next();
		System.out.println(m1.getKey()+"---"+m1.getValue());
		
	}
		
		

	}
}
