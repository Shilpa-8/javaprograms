package com.xworkz.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class AtmPin {
	
	public static void main(String[] args) {
		Stream<Integer> atmPinStream=Stream.of(2580,1234,6600,7755,1234,0012,6686,9999,1998,
				1010,2244,4567,8899,1223,1134,6675,9898,7619,2344,2299);
		List<Integer> tempList=atmPinStream
				 .filter((p)->p>1200)
		         .sorted()
		         .collect(Collectors.toList());
		         tempList.forEach((p)->System.out.println(p));
				
		}
}
