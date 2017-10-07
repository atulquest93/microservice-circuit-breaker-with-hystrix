package com.microservice.dto;

public class Course {

	private String id;
	private String name;
	private String category;
	private String datasoruce;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	public Course(String id, String name, String category, String datasoruce) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.datasoruce = datasoruce;
	}
	public String getDatasoruce() {
		return datasoruce;
	}
	public void setDatasoruce(String datasoruce) {
		this.datasoruce = datasoruce;
	}

	
}