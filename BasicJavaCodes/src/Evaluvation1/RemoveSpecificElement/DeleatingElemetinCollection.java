package Evaluvation1.RemoveSpecificElement;

import java.util.ArrayList;
import java.util.List;

public class DeleatingElemetinCollection {
	public static void main(String [] args) {
		List<String> list= new ArrayList<>();
		list.add("Ram");
		list.add("Raghu");
		list.add("Ramesh");
		list.add("Rajesh");
		list.add("Rakesh");
		list.add("Ramar");
		list.add("Ravan");
		list.add("Raghul");
		System.out.println("Before Removing Element ");
		System.out.println(list);
		list.remove("Ram");
		System.out.println("After Removing Eelement ");
		System.out.println(list);
		
	}

}
