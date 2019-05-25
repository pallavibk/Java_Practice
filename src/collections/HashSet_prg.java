package collections;

import java.util.HashSet;

public class HashSet_prg {

	public static void main(String[] args) {
		
		HashSet HS=new HashSet();
		HS.add("B");
		HS.add("C");
		HS.add("D");
		HS.add("Z");
		HS.add("null");
		HS.add("10");
		System.out.println(HS.add("Z"));
		System.out.println(HS);

	}

}
