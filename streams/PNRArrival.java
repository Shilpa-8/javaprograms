package com.xworkz.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PNRArrival {
	public static void main(String[] args) {
		
		Stream<Long> pnrStream=Stream.of(7619100484L,8660253566L,9902192329L,9845513820L,
				9902032411L,9901182753L,1112342309L,1234890876L,6790876908L,9087658903L,8760921456L,
				7890765432L,1290876504L,5678908765L,7890765478L,3456789076L,3345678901L,9900236666L,
				1078965431L,8772245600L);
		
		List<Long> tempList=pnrStream

	    .filter((p)->p>2200000000L)
		.sorted()
        .collect(Collectors.toList());
        tempList.forEach((p)->System.out.println(p));
	}

	
}
