package com.springioc_4;

public class ConstructorMessege {
	private String messege=null;

	public ConstructorMessege(String messege) {
		super();
		this.messege = messege;
		System.out.println("In constructor : " +messege);
	}
	
}
