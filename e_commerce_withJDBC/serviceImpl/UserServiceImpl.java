package com.e_commerce.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.e_commerce.exception.UserLoginException;
import com.e_commerce.repository.DBConnection;
import com.e_commerce.service.UserService;

public class UserServiceImpl implements UserService{
	//UserServiceImpl userServiceImpl = new UserServiceImpl();
	
	Scanner sc = new Scanner(System.in);
	@Override
	public void getRegistrationDetails() throws SQLException {
		UserServiceImpl userServiceImpl = new UserServiceImpl();
		Connection connection = null;
		PreparedStatement preparedstatement = null;
		System.out.println("To buy products please register");
		System.out.println("Enter your name ");
		String name = sc.next();
		System.out.println("Enter user id ");
		String userId = sc.next();
		System.out.println("Enter password ");
		String password = sc.next();
		System.out.println("Enter email ");
		String email = sc.next();
		try {
			DBConnection dbConnection = new DBConnection();
			connection = dbConnection.getConnection();
			preparedstatement = connection.prepareStatement("insert into user(name, userId, password, email)values(?,?,?,?)");
			preparedstatement.setString(1, name);
			preparedstatement.setString(2, userId);
			preparedstatement.setString(3, password);
			preparedstatement.setString(4, email);
			preparedstatement.executeUpdate();
			System.out.println("Record inserted successfully");
			
			userServiceImpl.login();
		}catch(Exception e) {
			System.out.println(e);
			System.out.println("Something went wrong");
		}finally {
			connection.close();
			preparedstatement.close();
		}
		
	}

	@Override
	public void login() {
		UserServiceImpl userServiceImpl = new UserServiceImpl();
		Connection connection = null;
		PreparedStatement preparedstatement = null;
		System.out.println("Please login to your account");
		try {
			DBConnection dbConnection = new DBConnection();
			connection = dbConnection.getConnection();
			
			System.out.println("Enter user id");
			String user_Id = sc.next();
			System.out.println("Enter password");
			String pass = sc.next();
			preparedstatement = connection.prepareStatement("select * from user where userId ='"+user_Id+"' and password = '"+pass+"'"); 
			ResultSet resultSet = preparedstatement.executeQuery();
			if(resultSet.next()) {
				System.out.println("You logged in successful");
				//UserWelcomeImpl userWelcom = new UserWelcomeImpl();
				//userWelcom.welcome();
				int userId = resultSet.getInt(1);
				ProductServiceImpl productServiceImpl = new ProductServiceImpl();
				productServiceImpl.buyProduct(userId);
			}else {
				throw new UserLoginException("Invalid login credentials");
			}
		}catch(Exception e){
			System.out.println(e);
			userServiceImpl.login();
		}
		
	}

}
