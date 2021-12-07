package com.xworkz.collection.cloneableInterface.Institute;

public class KitInstituteArrival {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		KitInstitutes kitInstitute = new KitInstitutes();
		kitInstitute.setName("Kalpataru Institute of Technology");
		kitInstitute.setContactNumber(8660253566l);
		kitInstitute.setStudents(20000);
		kitInstitute.setPrincipalName("Dr Gurumurthy");
		kitInstitute.setBranches("Ece,Cs,Is,Mech,Civil");
		System.out.println(kitInstitute.toString());
		
		Object object = kitInstitute.clone();
		KitInstitutes kitInstitute2 = (KitInstitutes)object;
		System.out.println(kitInstitute2.toString());
	}
	
}	