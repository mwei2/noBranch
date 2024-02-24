package com.wma95.model;

public class Model_ldh_52 {
	private String name;
	private String description;
	private String pictureClick;
	
	//constructor
	public Model_ldh_52() 
	{
		
	}

	//constructor with fields
	public Model_ldh_52(String name, String description, String pictureClick) 
	{
		this.name = name;
		this.description = description;
		this.pictureClick = pictureClick;
	}

	//getter and setters:
	
	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPictureClick() {
		return pictureClick;
	}

	public void setPictureClick(String pictureClick) {
		this.pictureClick = pictureClick;
	}


}
