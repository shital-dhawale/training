package com.springioc_2;

public class PrintMessege {
	private String messege="Yash";

	public String getMessege() {
		return messege;
	}

	public void setMessege(String messege) {
		this.messege = messege;
	}

	public PrintMessege(String messege) {
		super();
		this.messege = messege;
	}

	@Override
	public String toString() {
		return "PrintMessege [messege=" + messege + "]";
	}

	public PrintMessege() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
