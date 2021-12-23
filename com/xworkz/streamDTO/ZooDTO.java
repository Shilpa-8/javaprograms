package com.xworkz.streamDTO;

public class ZooDTO {
	
	private String name;
	private int id;
	private String place;
	private Float ticketPrice;
	
	public ZooDTO(String name, int id, String place, Float ticketPrice) {
		
		super();
		this.name = name;
		this.id = id;
		this.place = place;
		this.ticketPrice = ticketPrice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public Float getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(Float ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	@Override
	public String toString() {
		return "ZooDTO [name=" + name + ", id=" + id + ", place=" + place + ", ticketPrice=" + ticketPrice + "]";
	}
	

}
