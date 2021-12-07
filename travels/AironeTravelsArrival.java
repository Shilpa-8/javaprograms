package com.xworkz.collection.cloneableInterface.travels;

public class AironeTravelsArrival {
	public static void main(String[] args) throws CloneNotSupportedException {
	AironeTravels travels = new AironeTravels();
	travels.setTravels("Airone Travels");
	travels.setOwner("Naven Pndey");
	travels.setHeadQuaters("Bangalore");
	travels.setFounded(2010);
	
	Object object = travels.clone();
	AironeTravels travels2 = (AironeTravels)object;
	System.out.println("After cloneing");
	System.out.println(travels2.toString());
	}
}


