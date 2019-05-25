package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSet_Prog {

	public static void main(String[] args) {
		LinkedHashSet HS=new LinkedHashSet();
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
