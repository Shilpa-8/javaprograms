package com.xworkz.streamDTO;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class RiverArrival {
	
	public static void main(String[] args) {
		
	
	RiverDTO dto=new RiverDTO(1,"Brahmaputra", "India and Bangladesh", 3969, "Northern Himalayas");
	RiverDTO dto1=new RiverDTO(2,"Yamuna", "India", 1376, "Uttharakshi");
	RiverDTO dto2=new RiverDTO(3,"Ganga", "India and Bangladesh", 2510, "Western Himalaya");
	RiverDTO dto3=new RiverDTO(4,"Godavari", "Maharashtra and Andhra pradesh", 1465, "Western Ghats of central India");
	RiverDTO dto4=new RiverDTO(5,"Krishna", "Vijaywada and Sangali", 1400, "Mahabaleshwara");
	
	Stream<RiverDTO> str=Stream.of(dto,dto1,dto2,dto3,dto4);
	
	
	
	System.out.println("-------------.-Filterd by where length >100 and Sorted in desending order");
	str.filter((dt)->dt.getLonger()>500).sorted((dt1,dt2)->dt1.getLonger().compareTo(dt2.getLonger())).collect(Collectors.toList()).forEach((r)->System.out.println(r));
	
	System.out.println("----------sorted in desending order-----------------");
	Stream<RiverDTO> str1=Stream.of(dto,dto1,dto2,dto3,dto4);
	str1.filter((dt)->dt.getLonger()>500).sorted((dt1,dt2)->dt2.getLonger().compareTo(dt1.getLonger())).collect(Collectors.toList()).forEach((r)->System.out.println(r));
	
	
	}

}
