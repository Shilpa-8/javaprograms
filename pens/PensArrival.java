package com.xworkz.collection.cloneableInterface.pens;



public class PensArrival {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Pens pens = new Pens();
		pens.setName("Dooms");
		pens.setColor("Blue");
		pens.setCost(25);
		pens.setType("BallPen");
		System.out.println(pens.toString());
		
		Object object =pens.clone();
		Pens pens2 = (Pens)object;
		System.out.println(pens2.toString());
	}
	

}
