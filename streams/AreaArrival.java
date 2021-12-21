package com.xworkz.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Collections;

public class AreaArrival {
	
	public static void main(String[] args) {
		
	Stream<String> areaStream=Stream.of("Rajajinaga","Jayanagar","Vidyanagar","MahaLakshmi","Shivajinagar","MG Road","Dollarscolony","Btm layout",
				"Mejestic","Yashvanthpura","WhiteField","Hsr Layout","Electronic City","Basavana Gudi",
				"Gayathri Nagar","Pinya","Jalahalli","Gandhi Nagar","Sri Nagar","JP Nagar");
             List<String> tempList=areaStream
			.map(String::toLowerCase)
			.sorted()
			.collect(Collectors.toList());
	        tempList.forEach((p)->System.out.println(p));
	        
	        System.out.println("===========");
	        System.out.println("Area Decending order");
	        
	Stream<String> areaStream1=Stream.of("Rajajinaga","Jayanagar","Vidyanagar","MahaLakshmi","Shivajinagar","MG Road","Dollarscolony","Btm layout",
					"Mejestic","Yashvanthpura","WhiteField","Hsr Layout","Electronic City","Basavana Gudi",
					"Gayathri Nagar","Pinya","Jalahalli","Gandhi Nagar","Sri Nagar","JP Nagar");
	                    List<String> tempList1=areaStream1
	       	           .map(String::toUpperCase)
	       	           .sorted(Collections.reverseOrder())
	       	           .collect(Collectors.toList());
	       	           tempList1.forEach((p)->System.out.println(p));
	        
	}
}
	        
	        
	
			



