package com.xworkz.streams;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RollNoArrival {
	
	public static void main(String[] args) {
		Stream<Integer> rollNoStream=Stream.of(1,2,4,8,10,12,16,18,21,24,28,35,40,43,49,53,67,78,83,90);
		List<Integer> tempList=rollNoStream
				.filter((p)->p>20)
				.sorted(Collections.reverseOrder())
				.collect(Collectors.toList());
		tempList.forEach((p)->System.out.println(p));
	}

}
