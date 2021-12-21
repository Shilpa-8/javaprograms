package com.xworkz.mapapp;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class BarMap {
	
	public static void main (String[] args) {
		Map<String, Integer>  barMap = new HashMap<String, Integer>();
		
		barMap.put("Arbor Brewing Company",85);
		barMap.put("Skyye",78 );
		barMap.put("Toit",80);
		barMap.put("High Ultra Lounge",74);
		barMap.put("District",35);
		barMap.put("Loft 38",42);
		barMap.put("Fenny",78);
		barMap.put("Biere Club",50);
		barMap.put("Guzzlers Inn",75);
		barMap.put("Pecos",68);
		
		Set<String> set =  barMap.keySet();
		set.forEach((e)->System.out.println(e));
		System.out.println(" ");
		Collection<Integer> collection =  barMap.values();
		collection.forEach((e)->System.out.println(e));
		System.out.println("\n");
		Set<Map.Entry<String, Integer>> entries = barMap.entrySet();
		Iterator<Entry<String, Integer>> iterator = entries.iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, Integer> entry = iterator.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
			
		}
		
		System.out.println(" ");
		System.out.println("After Asending");
		System.out.println("===================");
		
		Map<String, Integer>  barMa = new TreeMap<String, Integer>((e,e1)->e.compareTo(e1));
		barMap.put("Arbor Brewing Company",85);
		barMap.put("Skyye",78 );
		barMap.put("Toit",80);
		barMap.put("High Ultra Lounge",74);
		barMap.put("District",35);
		barMap.put("Loft 38",42);
		barMap.put("Fenny",78);
		barMap.put("Biere Club",50);
		barMap.put("Guzzlers Inn",75);
		barMap.put("Pecos",68);
		
		Set<String> set2 = barMa.keySet();
		set2.forEach((e)->System.out.println(e));
		System.out.println(" ");
		Collection<Integer> collection2 = barMa.values();
		collection2.forEach((e)->System.out.println(e));
		System.out.println(" ");
		Set<Map.Entry<String, Integer>> entries2 = barMa.entrySet();
		Iterator<Entry<String, Integer>> iterator2 = entries2.iterator();
		while (iterator2.hasNext()) {
			Map.Entry<String, Integer> entry = iterator2.next();
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}
		

		System.out.println(" ");
		System.out.println("After Descending");
		System.out.println("=====================");
		
		Map<String, Integer>  bar = new TreeMap<String, Integer>((e,e1)->e1.compareTo(e));
		barMap.put("Arbor Brewing Company",85);
		barMap.put("Skyye",78 );
		barMap.put("Toit",80);
		barMap.put("High Ultra Lounge",74);
		barMap.put("District",35);
		barMap.put("Loft 38",42);
		barMap.put("Fenny",78);
		barMap.put("Biere Club",50);
		barMap.put("Guzzlers Inn",75);
		barMap.put("Pecos",68);
		
		
		Set<String> set3 = bar.keySet();
		set3.forEach((e)->System.out.println(e));
		System.out.println(" ");
		Collection<Integer> collection3 = bar.values();
		collection3.forEach((e)->System.out.println(e));
		System.out.println(" ");
		Set<Map.Entry<String, Integer>> entries3 = bar.entrySet();
		Iterator<Entry<String, Integer>> iterator3 = entries3.iterator();
		while (iterator3.hasNext()) {
			Map.Entry<String, Integer> entry = iterator3.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		
		
	}
	

}


