package com.xworkz.streamDTO;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ZooArrival {
	
public static void main(String[] args) {
		

		ZooDTO zoo=new ZooDTO("Jaya chamarajendra odeyar", 1, "Mysore", 100.00f);
		ZooDTO zoo1=new ZooDTO("Bannerugatta", 2, "Bangalore", 200.00f);
		ZooDTO zoo2=new ZooDTO("Lion Safari", 3, "Shivmogga", 100.00f);
		ZooDTO zoo3=new ZooDTO("Arignar Anna Zologic park", 4, "Vandalur", 200.00f);
		ZooDTO zoo4=new ZooDTO("Nandankanan zological park", 5, "Odisha", 100.00f);
		
		
		System.out.println("-----------Looping by id<5 and sorting by price in ascending order-------------------");
		
		Stream<ZooDTO> str=Stream.of(zoo,zoo1,zoo2,zoo3,zoo4);
		str.filter((e)->e.getId()<5).sorted((e,e1)->e.getTicketPrice().compareTo(e1.getTicketPrice())).collect(Collectors.toList()).forEach((s)->System.out.println(s));
		
		
	}

}
