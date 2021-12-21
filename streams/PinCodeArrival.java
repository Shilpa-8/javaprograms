package com.xworkz.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class PinCodeArrival {
	
	public static void main(String[] args) {
		Stream<Integer> pincodeStream=Stream.of(577229,560063,560030,560034,560007,560092,560024,
				562102,560045,560003,560050,562107,560064,50026,560086,560003,560070,560073,560053,562149);
		List<Integer> tempList=pincodeStream
		           .filter((p)->p>560063)
		           .sorted()
		           .collect(Collectors.toList());
		           tempList.forEach((p)->System.out.println(p));
		
	}

}
