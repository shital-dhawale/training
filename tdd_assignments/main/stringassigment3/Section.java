package com.yash.tdd.stringassigment3;

public class Section {
	private String  id;
	private String name;
	private String createdDate;
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
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	
	public String showSectionDetail() {
		setId("101");
		setName("core_java");
		setCreatedDate("31-01-2017");
		
		return "{id:"+this.getId()+","+"name:"+this.getName()+","+"createdDate:"+this.getCreatedDate()+"}";
	}
	
	
}
