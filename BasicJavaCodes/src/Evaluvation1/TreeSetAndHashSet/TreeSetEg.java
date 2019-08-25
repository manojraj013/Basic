package Evaluvation1.TreeSetAndHashSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEg {
	public static void main(String[] args) {
		TreeSet <String> tree=new TreeSet<String>();
		tree.add("Mahesh");
		tree.add("dinesh");
		tree.add("mendal");
		tree.add("Mahesh");
		Iterator <String> al=tree.iterator();
		while(al.hasNext()) {
			System.out.println(al.next());
		}
	}
}
