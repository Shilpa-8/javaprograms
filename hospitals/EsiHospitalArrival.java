package com.xworkz.collection.cloneableInterface.hospitals;

public class EsiHospitalArrival {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		EsiHospitals esiHospitals = new EsiHospitals();
		esiHospitals.setName("ESI Hospitals");
		esiHospitals.setCareSystem("Public multi-specialty hospitals");
		esiHospitals.setType("Specialist");
		esiHospitals.setPatron("H. Sudarshan Ballal");
		esiHospitals.setContactNo(9814237);
		System.out.println(esiHospitals.toString());
		
		Object object = esiHospitals.clone();
		
	    EsiHospitals esiHospitals2 = (EsiHospitals)object;
		System.out.println("After cloneing");
		System.out.println(esiHospitals2.toString());
	}

}
