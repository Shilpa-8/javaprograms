package com.xworkz.streamDTO;

public class RiverDTO {
	
	private Integer id;
	private String name;
	private String place;
	private Integer longer;
	private String bornAt;
	
	public RiverDTO(Integer id, String name, String place, Integer longer,String bornAt) {
		super();
		this.id = id;
		this.name = name;
		this.place = place;
		this.longer = longer;
		this.bornAt = bornAt;
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

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public Integer getLonger() {
		return longer;
	}

	public void setLonger(Integer longer) {
		this.longer = longer;
	}

	public String getBornAt() {
		return bornAt;
	}

	public void setBornAt(String bornAt) {
		this.bornAt = bornAt;
	}

	@Override
	public String toString() {
		return "RiverDTO [id=" + id + ", name=" + name + ", place=" + place + ", longer=" + longer + ", bornAt="
				+ bornAt + "]";
	}
	

}