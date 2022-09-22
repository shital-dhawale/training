package com.exception1_4;

public class Category {
	int catid;
	String categoryname;
	public int getCatid() {
		return catid;
	}
	public void setCatid(int catid) {
		this.catid = catid;
	}
	public String getCategoryname() {
		return categoryname;
	}
	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	@Override
	public String toString() {
		return "Category [catid=" + catid + ", categoryname=" + categoryname + "]";
	}
	




}
