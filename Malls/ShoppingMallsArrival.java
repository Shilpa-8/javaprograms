package com.xworkz.collection.cloneableInterface.Malls;

public class ShoppingMallsArrival {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		ShoppingMalls shoppingMalls = new ShoppingMalls();
		shoppingMalls.setName("Central Mall");
		shoppingMalls.setLocation(" Jayanagar, Bengaluru, Karnataka");
		shoppingMalls.setContactNo(8067282222L);
		shoppingMalls.setNoOfShops(100);
		shoppingMalls.setTotalGates(3);
		System.out.println(shoppingMalls.toString());
		
		Object object = shoppingMalls.clone();
		ShoppingMalls shoppingMalls2 = (ShoppingMalls)object;
		System.out.println(shoppingMalls2.toString());
	}
}




