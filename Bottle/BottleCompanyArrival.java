package com.xworkz.collection.cloneableInterface.Bottle;



public class BottleCompanyArrival {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		BottleCompany bottleCompany = new BottleCompany();
		bottleCompany.setName("Between");
		bottleCompany.setContactNumber(7619100484L);
		bottleCompany.setQuantity(100);
		bottleCompany.setColor("Green");
		System.out.println(bottleCompany.toString());
		
		Object object = bottleCompany.clone();
		BottleCompany bottleCompany2 = (BottleCompany)object;
		System.out.println(bottleCompany2.toString());
	}
	

}
