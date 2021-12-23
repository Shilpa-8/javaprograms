package com.xworkz.streamDTO;

public class HeadPhoneDTO {
	
	private Integer id;
	private String brand;
	private String type;
	private String Color;
	private Double cost;
	
	public HeadPhoneDTO(int id, String brand,String type,String Color,Double cost) {
		super();
		this.id=id;
        this.brand=brand;
        this.type=type;
        this.Color=Color;
        this.cost=cost;
        }
		

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "HeadPhoneDTO [id=" + id + ", brand=" + brand + ", type=" + type + ", Color=" + Color + ", cost=" + cost
				+ "]";
	}

	
	}
	
	

