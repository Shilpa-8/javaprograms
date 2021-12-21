package com.xworkz.map;

import java.util.HashMap;

import java.util.Map;
import java.util.Set;

public class PinCode {
	
	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<String,Integer>();
		
		map.put("India", 91);
		map.put("America",1 );
		map.put("Australlia",61);
		map.put("Russia",7);
		map.put("Dubai",971);
		map.put("Saudi",966);
		map.put("Nepal",977);
		map.put("New Zealand",64);
		map.put("Japan",81);
		map.put("Germany",49);
		
		System.out.println(map.size());
		Integer value=map.get("India");
		System.out.println(value);
		
		boolean contains=map.containsKey("Russia");
		System.out.println(contains);
		
		contains=map.containsValue(256);
		System.out.println(contains);
		
		Set<String> keys= map.keySet();
		
		keys.forEach((e)->{
			
			System.out.println(e);
			
		});
		
		
		
		
	}

}
