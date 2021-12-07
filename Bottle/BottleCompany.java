package com.xworkz.collection.cloneableInterface.Bottle;

public class BottleCompany implements Cloneable {
	
	private String name;
	private long contactNumber;
	private int quantity;
	private String color;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "BottleCompany [name=" + name + ", contactNumber=" + contactNumber + ", quantity=" + quantity
				+ ", color=" + color + "]";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		System.out.println("Invoked cloneable");
		return super.clone();
	}

}
