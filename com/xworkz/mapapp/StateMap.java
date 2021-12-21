package com.xworkz.mapapp;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class StateMap {
	

	public static void main(String[] args) {
	
	Map<String, Integer> stateMap = new HashMap<String, Integer>();
	
	stateMap.put("Karnataka", 31);
	stateMap.put("Manipur",9);
	stateMap.put("Maharashtra",35);
	stateMap.put("Andhra Pradesh",13);
	stateMap.put("Rajasthan",33);
	stateMap.put("Gujarath",33 );
	stateMap.put("Goa",2 );
	stateMap.put("Punjab",23);
	stateMap.put("Bhihar",38 );
	stateMap.put("Kerala",14);
	stateMap.put("West Bengal",23);
	stateMap.put("Tamil Nadu",38 );
	stateMap.put("Himachal Pradesh",12);
	stateMap.put("Haryana",22);
	stateMap.put("Assam",33);
	stateMap.put("Tripura",8);
	stateMap.put("Sikkim",4);
	stateMap.put("Telangana",31);
	stateMap.put("Meghalaya",11);
	stateMap.put("Delhi",11);
	stateMap.put("Jharkhand",24);
	
	Set<String> keys= stateMap.keySet();
	Iterator<String> itr = keys.iterator();
	while(itr.hasNext()) {
		String map = itr.next();
		System.out.println(map);
	}
	System.out.println(" ");
	Collection<Integer> values =  stateMap.values();
	Iterator<Integer> itrr = values.iterator();
	while (itrr.hasNext()) {
		Integer maps = itrr.next();
		System.out.println(maps);
	}
	System.out.println(" ");
	Set<Map.Entry<String, Integer>> both =  stateMap.entrySet();
	Iterator<Map.Entry<String, Integer>> both1 = both.iterator();
	while (both1.hasNext()) {
		Map.Entry<String, Integer> entry = both1.next();
		System.out.println(entry.getKey()+ " " + entry.getValue());
	}

	System.out.println(" ");
	System.out.println("After Asending");
	System.out.println("==============");
	
	Map<String, Integer> state =new TreeMap<String, Integer>((ele1, ele2)->ele1.compareTo(ele2));
	stateMap.put("Karnataka", 31);
	stateMap.put("Manipur",9);
	stateMap.put("Maharashtra",35);
	stateMap.put("Andhra Pradesh",13);
	stateMap.put("Rajasthan",33);
	stateMap.put("Gujarath",33 );
	stateMap.put("Goa",2 );
	stateMap.put("Punjab",23);
	stateMap.put("Bhihar",38 );
	stateMap.put("Kerala",14);
	stateMap.put("West Bengal",23);
	stateMap.put("Tamil Nadu",38 );
	stateMap.put("Himachal Pradesh",12);
	stateMap.put("Haryana",22);
	stateMap.put("Assam",33);
	stateMap.put("Tripura",8);
	stateMap.put("Sikkim",4);
	stateMap.put("Telangana",31);
	stateMap.put("Meghalaya",11);
	stateMap.put("Delhi",11);
	stateMap.put("Jharkhand",24);
	
	Set<String> key= state.keySet();
	Iterator<String> i = key.iterator();
	while(i.hasNext()) {
		String map = i.next();
		System.out.println(map);
	}
	System.out.println(" ");
	Collection<Integer> value =  state.values();
	Iterator<Integer> it = value.iterator();
	while (it.hasNext()) {
		Integer ma = it.next();
		System.out.println(ma);
	}
	System.out.println(" ");
	Set<Map.Entry<String, Integer>> both2 =  state.entrySet();
	Iterator<Map.Entry<String, Integer>> both3 = both2.iterator();
	while (both3.hasNext()) {
		Map.Entry<String, Integer> entr = both3.next();
		System.out.println(entr.getKey()+ " " + entr.getValue());
	}
	
	System.out.println(" ");
	System.out.println("After Desending");
	System.out.println("===============");
	
	Map<String, Integer> sta =new TreeMap<String, Integer>((ele1, ele2)->ele2.compareTo(ele1));
	stateMap.put("Karnataka", 31);
	stateMap.put("Manipur",9);
	stateMap.put("Maharashtra",35);
	stateMap.put("Andhra Pradesh",13);
	stateMap.put("Rajasthan",33);
	stateMap.put("Gujarath",33 );
	stateMap.put("Goa",2 );
	stateMap.put("Punjab",23);
	stateMap.put("Bhihar",38 );
	stateMap.put("Kerala",14);
	stateMap.put("West Bengal",23);
	stateMap.put("Tamil Nadu",38 );
	stateMap.put("Himachal Pradesh",12);
	stateMap.put("Haryana",22);
	stateMap.put("Assam",33);
	stateMap.put("Tripura",8);
	stateMap.put("Sikkim",4);
	stateMap.put("Telangana",31);
	stateMap.put("Meghalaya",11);
	stateMap.put("Delhi",11);
	stateMap.put("Jharkhand",24);
	
	Set<String> keyss= sta.keySet();
	Iterator<String> ii = keyss.iterator();
	while(ii.hasNext()) {
		String mapy = ii.next();
		System.out.println(mapy);
	}
	System.out.println(" ");
	Collection<Integer> valuess =  sta.values();
	Iterator<Integer> itt = valuess.iterator();
	while (itt.hasNext()) {
		Integer m = itt.next();
		System.out.println(m);
	}
	System.out.println(" ");
	Set<Map.Entry<String, Integer>> bot =  sta.entrySet();
	Iterator<Map.Entry<String, Integer>> bo = bot.iterator();
	while (bo.hasNext()) {
		Map.Entry<String, Integer> ent = bo.next();
		System.out.println(ent.getKey()+ " " + ent.getValue());
	}
}
	
	
}	
	
	
	




