package com.xworkz.collection.cloneableInterface.Institute;

public class KitInstitutes implements Cloneable  {
	
	private String name;
	private long contactNumber;
	private int students;
	private String principalName;
	private String Branches;
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
	public int getStudents() {
		return students;
	}
	public void setStudents(int students) {
		this.students = students;
	}
	public String getPrincipalName() {
		return principalName;
	}
	public void setPrincipalName(String principalName) {
		this.principalName = principalName;
	}
	public String getBranches() {
		return Branches;
	}
	public void setBranches(String branches) {
		Branches = branches;
	}
	@Override
	public String toString() {
		return "KitInstitutes [name=" + name + ", contactNumber=" + contactNumber + ", students=" + students
				+ ", principalName=" + principalName + ", Branches=" + Branches + "]";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		System.out.println("Invoked cloneable");
		return super.clone();
	}

}
