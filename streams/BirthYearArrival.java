package com.xworkz.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class BirthYearArrival {
	
	public static void main(String[] args) {
	
	Stream<Integer> birthYearStream=Stream.of(1990,1991,1992,1993,1994,1995,1996,1997,1998,1999,
		2000,2001,2002,2003,2004,2005,2006,2007,2008,2009,2010);
	            List<Integer> tempList=birthYearStream
	           .filter((p)->p>1992)
	           .sorted()
	           .collect(Collectors.toList());
	           tempList.forEach((p)->System.out.println(p));
	
}
}