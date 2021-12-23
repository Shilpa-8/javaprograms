package com.xworkz.streamDTO.dto;

public class CafeDTO{
	private Integer id;
	private String name;
	private String location;
	private float ratings;
	
	public CafeDTO(Integer id, String name,String location,float ratings) {
		super();
		this.id=id;
		this.name=name;
		this.location=location;
		this.ratings=ratings;
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

	public float getRatings() {
		return ratings;
	}

	public void setRatings(float ratings) {
		this.ratings = ratings;
	}

	@Override
	public String toString() {
		return "CafeDTO [id=" + id + ", name=" + name + ", location=" + location + ", ratings=" + ratings + "]";
	}
	
	
}
