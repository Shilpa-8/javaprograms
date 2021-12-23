package com.xworkz.streamDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.xworkz.streamDTO.dto.CafeDTO;


public class CafeArrival {
	public static void main(String[] args) {
		
		CafeDTO dto=new CafeDTO(1,"Cafe Noir","UB City",4.2f);
		CafeDTO dto1=new CafeDTO(2,"Dyu Art Cafe","KHB Colony",4.3f);
		CafeDTO dto2=new CafeDTO(3,"Cofe Coffe Day","Rajajinagar",4.0f);
		CafeDTO dto3=new CafeDTO(4,"Nammooru cafe","Bhadravathi",4.2f);
		CafeDTO dto4=new CafeDTO(5,"Cafe Chillax","Shimoga",3.9f);
		
		List<CafeDTO> cafe=new ArrayList<CafeDTO>();
		cafe.add(dto4);
		cafe.add(dto3);
		cafe.add(dto2);
		cafe.add(dto1);
		cafe.add(dto);
		
		cafe.stream().filter((e)->e.getRatings()>3).sorted((d1,d2)->d2.getName().compareTo(d1.getName())).collect(Collectors.toList()).forEach((e)->System.out.println(e));
	
		
	}

}
