package com.xworkz.collection.cloneableInterface.hospitals;

public class EsiHospitals implements Cloneable {
	
	private String Name;
	private String careSystem;
	private String type;
	private String patron;
	private long ContactNo;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCareSystem() {
		return careSystem;
	}
	public void setCareSystem(String careSystem) {
		this.careSystem = careSystem;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPatron() {
		return patron;
	}
	public void setPatron(String patron) {
		this.patron = patron;
	}
	public long getContactNo() {
		return ContactNo;
	}
	public void setContactNo(long contactNo) {
		ContactNo = contactNo;
	}
	@Override
	public String toString() {
		return "EsiHospitals [Name=" + Name + ", careSystem=" + careSystem + ", type=" + type + ", patron=" + patron
				+ ", ContactNo=" + ContactNo + "]";
	} 
	@Override
	public Object clone() throws CloneNotSupportedException {
		System.out.println("Invoked Clone method");
		return super.clone();
	}
	
}
