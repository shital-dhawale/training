package com.e_commerce.service;

import java.sql.SQLException;

public interface ProductService {
	public void buyProduct(int user_id) throws SQLException;
}