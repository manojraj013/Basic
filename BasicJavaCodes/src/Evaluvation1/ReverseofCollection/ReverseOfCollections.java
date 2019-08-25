package Evaluvation1.ReverseofCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ReverseOfCollections {
	public static void main(String [] args) {
		List<String> list=new ArrayList<>();
		list.add("Mahesh");
		list.add("Maonj");
		list.add("Jerry");
		list.add("Ganesh");
		Collections.sort(list);
		Collections.reverse(list);
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
