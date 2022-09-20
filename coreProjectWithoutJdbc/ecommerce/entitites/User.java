package com.ecommerce.entitites;

public class User {
	private int userId;
	private String password;
	private String email;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public User(int userId, String password, String email) {
		super();
		this.userId = userId;
		this.password = password;
		this.email = email;
	}
	
}
