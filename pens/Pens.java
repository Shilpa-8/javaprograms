package com.xworkz.collection.cloneableInterface.pens;

public class Pens implements Cloneable {
	private String name;
	private String Color;
	private int cost;
	private String type;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Pens [name=" + name + ", Color=" + Color + ", cost=" + cost + ", type=" + type + "]";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		System.out.println("Invoked cloneable");
		return super.clone();
	}

	
	
	
	

}
