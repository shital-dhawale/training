package com.e_commerce;

import java.sql.SQLException;

import com.e_commerce.serviceImpl.UserWelcomeImpl;

public class TestMain {
	public static void main(String[] args) throws SQLException {
		UserWelcomeImpl userWelcom = new UserWelcomeImpl();
		userWelcom.welcome();
	}
	
}
