package com.xworkz.collection.cloneableInterface.mobile;


public class MobileComanyArrival {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		MobileComany redMeMobile = new MobileComany();
		redMeMobile.setName("RedMe Note 8 pro");
		redMeMobile.setColor("Black");
		redMeMobile.setCost(10000);
		redMeMobile.setType("Androide");
		System.out.println(redMeMobile.toString());
		
		Object object =redMeMobile.clone();
		MobileComany redMeMobile2 = (MobileComany)object;
		System.out.println(redMeMobile2.toString());
	}
	


	
}
	




