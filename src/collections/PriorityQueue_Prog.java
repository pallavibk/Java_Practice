package collections;

import java.util.PriorityQueue;

public class PriorityQueue_Prog {

	public static void main(String[] args) {
		PriorityQueue PQ=new PriorityQueue();
		PQ.add("A");
		PQ.add("B");
		PQ.add("C");
		PQ.add("D");
		PQ.add("A");
		PQ.add(null);
		System.out.println(PQ);//gives  nullpointer exception
		System.out.println(PQ.peek());//returns 1st element of queu
		System.out.println(PQ.poll());//return and remove 1st element of queu
		System.out.println(PQ);
	}

}
