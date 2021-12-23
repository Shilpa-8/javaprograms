package com.xworkz.streamDTO;

public class TempleDTO {
	
	private Integer id;
	private String name;
	private String location;
	private String famousGod;
	private Integer visitorsPerDay;
	
	public TempleDTO(Integer id, String name, String location, String famousGod, Integer visitorsPerDay) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.famousGod = famousGod;
		this.visitorsPerDay = visitorsPerDay;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getFamousGod() {
		return famousGod;
	}

	public void setFamousGod(String famousGod) {
		this.famousGod = famousGod;
	}

	public Integer getVisitorsPerDay() {
		return visitorsPerDay;
	}

	public void setVisitorsPerDay(Integer visitorsPerDay) {
		this.visitorsPerDay = visitorsPerDay;
	}

	@Override
	public String toString() {
		return "TempleDTO [id=" + id + ", name=" + name + ", location=" + location + ", famousGod=" + famousGod
				+ ", visitorsPerDay=" + visitorsPerDay + "]";
	}
	

}
