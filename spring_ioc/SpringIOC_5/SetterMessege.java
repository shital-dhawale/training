package com.springioc_5;

public class SetterMessege {
	private String messege = null;

	public void setMessege(String messege) {
		this.messege = messege;
	}
	public void getMessege() {
		System.out.println("Setter messege : " +messege);	
	}
}
