package com.xworkz.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class AccountNo {
	
	public static void main(String[] args) {
		Stream<Long> accountNoStream=Stream.of(7619100484L,866025356698L,990219232998L,636069012445L,660923678167L,987612306814L,636246781012L,
				662488996750L,234567800912L,231154678236L,211789654230L,123556788882L,112365889906L,990087543211L,761910034562L,1123557896601L,
				555008675123L,102345671880L,888234400779L,999866421334L);
		List<Long> tempList=accountNoStream
		           .filter((p)->p>440000000000L)
		           .sorted()
		           .collect(Collectors.toList());
		           tempList.forEach((p)->System.out.println(p));
	}
}
	
	
	
	
	
	
	


