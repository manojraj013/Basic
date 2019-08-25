package Evaluvation1.Java8;

import java.util.LinkedList;
import java.util.List;

public class ForEach {
	public static void main(String []args) {
		List<String> lnkLst = new LinkedList<>();
	      lnkLst.add("Man");
	      lnkLst.add("Wan");
	      lnkLst.add("Lan");
	      lnkLst.add("Cab");
	      for(String s:lnkLst) {
	    	  System.out.println(s);
	      }
	}

}
