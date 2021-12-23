package com.xworkz.streamDTO;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TempleArrival {
	
public static void main(String[] args) {
		
		TempleDTO dto=new TempleDTO(1,"Iskon", "Krishna", "Bangalore",1000);
		TempleDTO dto1=new TempleDTO(2,"Murudeshwara", "Mahadeva","Mangaluru",12000);
		TempleDTO dto2=new TempleDTO(3,"Dharmastala", "Manjunatha Swamy","Dhakshina Kannda",250000);
		TempleDTO dto3=new TempleDTO(4,"Horanadu", "Annapoorneshwari","Chikmagaluru",10000);
		TempleDTO dto4=new TempleDTO(5,"Sigandur", "Choudeshwari","Shimoga",15000);
		TempleDTO dto5=new TempleDTO(6,"VittalaTemple", "Virupaksha","Hampi",10000);
		
		Stream<TempleDTO> str=Stream.of(dto,dto1,dto2,dto3,dto4,dto5);
		
		System.out.println("----------filter orderd by no of visitor>10000 and sort location by ascending order------------");
		
		str.filter((e)->e.getVisitorsPerDay()>10000).sorted((a,a1)->a.getLocation().compareTo(a1.getLocation())).collect(Collectors.toList()).forEach((s)->System.out.println(s));
		
}

}
