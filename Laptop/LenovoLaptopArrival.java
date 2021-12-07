package com.xworkz.collection.cloneableInterface.Laptop;

public class LenovoLaptopArrival {
	
	public static void main(String[] args)throws CloneNotSupportedException{
		LenovoLaptop lenovoLaptop = new LenovoLaptop();
		lenovoLaptop.setName("Lenovo");
		lenovoLaptop.setRam(8);
		lenovoLaptop.setProcessor("i5");
		lenovoLaptop.setType("64 bit operating system");
		lenovoLaptop.setScreenInInch(16.5);
		System.out.println(lenovoLaptop.toString());
		
		Object object=lenovoLaptop.clone();
		LenovoLaptop lenovoLaptop2 = (LenovoLaptop)object;
		System.out.println(lenovoLaptop2.toString());
		
		
		
		
	}

}
