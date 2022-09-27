package com.e_commerce.service;

import java.sql.SQLException;

public interface UserService {
	public void getRegistrationDetails() throws SQLException;
	public void login();
}
