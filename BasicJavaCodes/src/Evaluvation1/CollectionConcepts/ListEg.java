package Evaluvation1.CollectionConcepts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListEg {
	public static void main(String[] args) {
	      List<String> lnkLst = new LinkedList<>();
	      lnkLst.add("Man");
	      lnkLst.add("Wan");
	      lnkLst.add("Lan");
	      lnkLst.add("Cab");
	      System.out.println(lnkLst);
	      List <String>aryLst = new ArrayList<>();
	      aryLst.add("x");
	      aryLst.add("y");
	      aryLst.add("z");
	      aryLst.add("w");
	      System.out.println(aryLst);
	      Iterator <String>itr =lnkLst.iterator();
	      Iterator <String>itr1=aryLst.iterator();
	      while(itr.hasNext()||itr1.hasNext()) {
	    	  System.out.print(itr.next());
	    	  System.out.print(itr1.next());
	      }
	   }

}
