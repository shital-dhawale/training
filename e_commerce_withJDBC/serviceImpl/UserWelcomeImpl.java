package com.e_commerce.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.e_commerce.entities.Product;
import com.e_commerce.repository.DBConnection;
import com.e_commerce.service.UserWelcome;

public class UserWelcomeImpl implements UserWelcome{

	@Override
	public void welcome() throws SQLException {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		List<Product> productList = new ArrayList<Product>();
		try {
			DBConnection dbConnection = new DBConnection();
			connection = dbConnection.getConnection();
			preparedStatement = connection.prepareStatement("select * from product order by product_id");
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				int id = resultSet.getInt(1);
				String name = resultSet.getString(2);
				String description = resultSet.getString(3);
				String price = resultSet.getString(4);
				int quantity = resultSet.getInt(5);
				
				productList.add(new Product(id, name, description, price, quantity));
				
			}
			
		}catch(Exception e) {
			System.out.println(e);
			System.out.println("Something went wrong");
			
		}finally {
			connection.close();
			preparedStatement.close();
		}
		for(int i=0; i<productList.size(); i++) {
			System.out.println(productList.get(i));
		}
		UserServiceImpl userServiceImpl = new UserServiceImpl();
		userServiceImpl.getRegistrationDetails();
		
	}

}
