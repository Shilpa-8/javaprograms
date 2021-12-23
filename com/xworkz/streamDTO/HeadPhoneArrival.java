package com.xworkz.streamDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class HeadPhoneArrival {
	
	public static void main(String[] args) {	
	HeadPhoneDTO dto=new HeadPhoneDTO(1,"Sony MDR","Wired","White",799d);
	HeadPhoneDTO dto1=new HeadPhoneDTO(2,"JBl E45Bt","Wireless","White",6385d);
	HeadPhoneDTO dto2=new HeadPhoneDTO(3,"Beats Pro","wired","Black",33300d);
	HeadPhoneDTO dto3=new HeadPhoneDTO(4,"Logitech G633","Wireless","Blue",12495d);
	HeadPhoneDTO dto4=new HeadPhoneDTO(5,"Beats Solo 2","Wireless","Black",4999d);
	
	List<HeadPhoneDTO> head=new ArrayList<HeadPhoneDTO>();
	head.add(dto4);
	head.add(dto3);
	head.add(dto2);
	head.add(dto1);
	head.add(dto);
	
	head.stream().sorted((e1,e2)->e2.getId().compareTo(e1.getId())).collect(Collectors.toList()).forEach((d)->System.out.println(d));
	System.out.println(System.lineSeparator());
	
	System.out.println(System.lineSeparator());
	head.stream().filter((t)->t.getType()=="Wireless").sorted((e1,e2)->e1.getBrand().compareTo(e2.getBrand())).collect(Collectors.toList()).forEach((a)->System.out.println(a));
	
	System.out.println(System.lineSeparator());
	head.stream().sorted((e1,e2)->e2.getId().compareTo(e1.getId())).map((a)->a.getColor()).collect(Collectors.toList()).forEach((a)->System.out.println(a));
	



	

}
}