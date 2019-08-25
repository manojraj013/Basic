package Evaluvation1.CollectionConcepts;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueEg {
	public static void main(String [] args) {
		PriorityQueue <String> list=new PriorityQueue <String>();
		list.add("Manoj ");
		list.add("Jerry");
		list.add("Balasubramainan");
		list.add("Varalakshmi");
		/*System.out.println("HEad "+list.element());
		System.out.println("Head "+list.peek() );*/
		System.out.println("Queue contenet ");
		Iterator <String> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		list.remove();
		list.poll();
		System.out.println("After minimizing the queue");
		Iterator<String> iter=list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
