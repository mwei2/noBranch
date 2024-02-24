package com.wma95.model;

public class Model_wma_95 
{
	private String name;
	private String aboutMe;
	private String picLink;
	
	//constructor
	public Model_wma_95() 
	{
		
	}

	//constructor with fields
	public Model_wma_95(String name, String aboutMe, String picLink) 
	{
		this.name = name;
		this.aboutMe = aboutMe;
		this.picLink = picLink;
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

	public String getAboutMe() 
	{
		return aboutMe;
	}

	public void setAboutMe(String aboutMe) 
	{
		this.aboutMe = aboutMe;
	}

	public String getPicLink() 
	{
		return picLink;
	}

	public void setPicLink(String picLink) 
	{
		this.picLink = picLink;
	}
	
	
}
