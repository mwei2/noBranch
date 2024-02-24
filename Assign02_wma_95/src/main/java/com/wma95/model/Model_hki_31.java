package com.wma95.model;

public class Model_hki_31 {
	private String name;
	private String profile;
	private String clickDetail;
	
	//constructor
	public Model_hki_31() 
	{
		
	}

	//constructor with fields
	public Model_hki_31(String name, String profile, String clickDetail) 
	{
		this.name = name;
		this.profile = profile;
		this.clickDetail = clickDetail;
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

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getClickDetail() {
		return clickDetail;
	}

	public void setClickDetail(String clickDetail) {
		this.clickDetail = clickDetail;
	}

}
