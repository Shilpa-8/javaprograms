package com.xworkz.collection.cloneableInterface.Malls;

public class ShoppingMalls implements Cloneable {
	
	private String Name;
	private String Location;
	private long contactNo;
	private int NoOfShops;
	private int TotalGates;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	public int getNoOfShops() {
		return NoOfShops;
	}
	public void setNoOfShops(int noOfShops) {
		NoOfShops = noOfShops;
	}
	public int getTotalGates() {
		return TotalGates;
	}
	public void setTotalGates(int totalGates) {
		TotalGates = totalGates;
	}
	@Override
	public String toString() {
		return "ShoppingMalls [contactNo=" + contactNo + ", Location=" + Location + ", Name=" + Name + ", NoOfShops="
				+ NoOfShops + ", TotalGates=" + TotalGates + "]";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		System.out.println("Invoked clone method");
		return super.clone();

    }
}