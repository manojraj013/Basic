package Evaluvation1.CollectionConcepts;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class MapEg {
	public static void main(String []args) {
		
		Map <String,String>map1 = new HashMap<>();
		map1.put("1", "One");
		map1.put("2", "Two");
		map1.put("3", "Three");
		map1.put("4", "Four");
		
		SortedMap<String,String> map2 = new TreeMap<>();
		map2.put("1", "One");
		map2.put("2", "Two");
		map2.put("3", "Three");
		map2.put("4", "Four");
		
		LinkedHashMap<String,String> map3 = new LinkedHashMap<>();
		map3.put("1", "One");
		map3.put("2", "Two");
		map3.put("3", "Three");
		map3.put("4", "Four");
		System.out.println("Hash Map");
		System.out.println(map1);
		System.out.println("Tree Map ");
		System.out.println(map2);
		System.out.println("LinkedHash Map");
		System.out.println(map3);
		
	}
	   

}
