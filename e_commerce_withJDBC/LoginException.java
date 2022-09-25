package com.e_commerce;

import java.sql.SQLException;

public class LoginException extends Exception{
	private String msg;
	public LoginException(String msg) throws SQLException {
		super(msg);
		
	}
	
}
