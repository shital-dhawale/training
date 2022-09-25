package com.e_commerce;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UserForm {
	int user_id;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public static void Welcome() throws SQLException {
		try {
			System.out.println("WELCOME......");
			System.out.println("1 >> Login");
			System.out.println("2 >> Sign Up");
			System.out.println("3 >> Skip");
			System.out.println("4 >> Admin");
			System.out.println("5 >> Close");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your choice:");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				getLoginDetails();
				break;
			case 2:
				getRegistrationDetails();
				break;
			case 3:
				skip();
				break;
			case 4:
				Admin admin = new Admin();
				admin.adminLogin();
				break;
			case 5:
				close();
				break;
			default:
				System.out.println("Invalid Choice");
				System.out.println();
				Welcome();
			}
		} catch (Exception e) {

			System.out.println("Invalid choice Please Enter choice in Numbers");
//			UserForm u = new UserForm();
			Welcome();
		}

	}

	
	public static void getRegistrationDetails() throws SQLException {
		Connection connection = null;
		PreparedStatement preparedstatement = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter FirstName : ");
		String FirstName = sc.next();
		System.out.println("Enter LastName : ");
		String LastName = sc.next();
		System.out.println("Enter Email : ");
		String Email = sc.next();
		System.out.println("Enter Contact Number : ");
		String ContactNumber = sc.next();
		System.out.println("Enter Username : ");
		String Username = sc.next();
		System.out.println("Enter Password : ");
		String Password = sc.next();
		try {
			DBConnection db = new DBConnection();
			connection = db.getConnection();
			preparedstatement = connection.prepareStatement(
					"insert into Users(firstname, lastname, email, contact, username, password)values(?, ?, ?, ?, ?, ?)");

			preparedstatement.setString(1, FirstName);
			preparedstatement.setString(2, LastName);
			preparedstatement.setString(3, Email);
			preparedstatement.setString(4, ContactNumber);
			preparedstatement.setString(5, Username);
			preparedstatement.setString(6, Password);
			preparedstatement.executeUpdate();
			System.out.println("Record Inserted Successfully...");
			getLoginDetails();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Something went wrong...");
			getRegistrationDetails();
		} finally {
			connection.close();
			preparedstatement.close();
		}

	}

	
	public static void getLoginDetails() throws SQLException {
		UserForm userForm = new UserForm();
		Scanner sc = new Scanner(System.in);
		String userid = null;
		String pass = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		System.out.println("Enter Username : ");
		String Username = sc.next();
		System.out.println("Enter Password : ");
		String Passsword = sc.next();
		try {
			DBConnection db = new DBConnection();
			connection = db.getConnection();
			preparedStatement = connection.prepareStatement(
					"Select * from users where username='" + Username + "' and password ='" + Passsword + "'");
			ResultSet resultset = preparedStatement.executeQuery();
			if (resultset.next()) {
				System.out.println("You logged in successfull....");
				int user_id = resultset.getInt(1);
				userForm.setUser_id(user_id);
				Product product = new Product();
				product.getProductList(userForm.getUser_id());
			} else {
				throw new LoginException("Invalid credentials");
			}

		} catch (LoginException e) {
			System.out.println(e.getMessage());
			getLoginDetails();
		} finally {
			connection.close();
			preparedStatement.close();
		}

	}


	private static void skip() throws SQLException {
		Product product = new Product();
		UserForm userForm = new UserForm();
		product.getProductList(userForm.getUser_id());
	}


	private static void close() {
		System.out.println("******Thank You*******");
		System.exit(0);

	}

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		Welcome();

	}
}
