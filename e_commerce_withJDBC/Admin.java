package com.e_commerce;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Admin {
	private final String adminUserName = "admin";
	private final String adminPassword = "password";

	public void adminLogin() throws SQLException, Exception {
		try {
			System.out.println("Enter Admin User Name: ");
			Scanner sc = new Scanner(System.in);
			String username = sc.next();
			System.out.println("Enter Admin Password: ");
			String pass = sc.next();
			if (this.adminUserName.equalsIgnoreCase(username) && this.adminPassword.equalsIgnoreCase(pass)) {
				System.out.println("You logged in successfull....");
				adminWelcome();
			} else {
				throw new LoginException("Invalid Credentials");
			}
		} catch (LoginException e) {
			System.out.println(e.getMessage());
			adminLogin();
		}
	}

	private static void adminWelcome() throws SQLException{
		Admin a = new Admin();
		try {
			System.out.println("WELCOME......" + a.adminUserName);
			System.out.println("1 >> Products List");
			System.out.println("2 >> Product Details");
			System.out.println("3 >> User List");
			System.out.println("4 >> User Purchase Details");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your choice:");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				getProductList();
				break;
			case 2:
				CheckQuantity();
				break;
			case 3:
				getUserList();
				break;
			case 4:
				getPurchaseDetails();
				break;
			default:
				System.out.println("Invalid Choice");
				System.out.println("******");
				adminWelcome();
			}

		} catch (Exception e) {
			System.out.println("Invalid choice Please Enter choice in Numbers");
		}
	}

	public static void getProductList() throws SQLException, Exception {
		Connection cn = null;
		PreparedStatement ps = null;
		List<Product> productList = new ArrayList<Product>();
		try {
			DBConnection db = new DBConnection();
			cn = db.getConnection();
			ps = cn.prepareStatement("select * from product order by product_name");
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				int produtct_id = rs.getInt(1);
				String product_description = rs.getString(2);
				String product_price = rs.getString(3);
				String product_name = rs.getString(4);
				int product_quantity = rs.getInt(5);

				productList.add(
						new Product(produtct_id, product_description, product_price, product_name, product_quantity));

			}
			System.out.println("1 press");
			Scanner sc = new Scanner(System.in);
			int adminchoice = sc.nextInt();
			if (adminchoice == 1) {
				adminWelcome();
			}

		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Somthing went to wrong...");
		} 
		
		finally {
			cn.close();
			ps.close();
		}
		System.out.println("1 press");
		Scanner sc = new Scanner(System.in);
		int adminchoice = sc.nextInt();
		if (adminchoice == 1) {
			adminWelcome();
		}

		System.out.println(
				"---------------------------------------------------------------------------------------------------------------");
		System.out.printf("|%3s%70s%8s%15s%10s%3s", "id", "Description", "Price", "Name", "Quantity", "|");
		System.out.println();
		System.out.println(
				"---------------------------------------------------------------------------------------------------------------");
		for (Product p : productList) {
			System.out.printf("|%3s%70s%8s%15s%10s%3s", p.getId(), p.getDescription(), p.getPrice(), p.getName(),
					p.getQuantity(), "|");
			System.out.println();

		}
		System.out.println(
				"---------------------------------------------------------------------------------------------------------------");

	}

	public static void getUserList() throws SQLException, Exception {
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			DBConnection db = new DBConnection();
			connection = db.getConnection();
			preparedStatement = connection.prepareStatement("Select * from users");
			ResultSet resultset = preparedStatement.executeQuery();

			System.out.println(
					"----------------------------------------------------------------------------------------------");
			System.out.printf("|%10s%15s%15s%20s%15s%15s%3s", "Id", "FirstName", "Lastname", "Email", "Contact",
					"Username", "|");
			System.out.println();
			System.out.println(
					"----------------------------------------------------------------------------------------------");
			while (resultset.next()) {
				int ID = resultset.getInt(1);
				String fname = resultset.getString(2);
				String lname = resultset.getString(3);
				String email = resultset.getString(4);
				String contact = resultset.getString(5);
				String username = resultset.getString(6);
				String pass = resultset.getString(7);
				System.out.printf("|%10s%15s%15s%20s%15s%15s%3s", ID, fname, lname, email, contact, username, "|");
				System.out.println();

			}
			System.out.println(
					"----------------------------------------------------------------------------------------------");

		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("1 press");
		Scanner sc = new Scanner(System.in);
		int adminchoice = sc.nextInt();
		if (adminchoice == 1) {
			adminWelcome();
		}
	}

	public static void CheckQuantity() {
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			DBConnection db = new DBConnection();
			connection = db.getConnection();
			System.out.println("Enter Product Id : ");
			Scanner scanner = new Scanner(System.in);
			int ID = scanner.nextInt();

			preparedStatement = connection.prepareStatement(
					"Select product_id, product_name, product_quantity from product where product_id = ?");
			preparedStatement.setInt(1, ID);
			ResultSet resultset = preparedStatement.executeQuery();
			while (resultset.next()) {
				System.out.println("Product_Id >> " + resultset.getInt(1));
				System.out.println("Product_Name >> " + resultset.getString(2));
				System.out.println("Product_Quantity >> " + resultset.getString(3));
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void getPurchaseDetails() throws SQLException, Exception {
		try {
			
			DBConnection dbcon = new DBConnection();
			Connection cn = null;
			cn = dbcon.getConnection();

			PreparedStatement ps = null;
			ResultSet rs = null;

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter User Id :");
			int user_id = sc.nextInt();
			ps = cn.prepareStatement(
					"select orders.order_id,username,product_name,ordered_quantity,order_price from \r\n"
							+ "orders inner join users on orders.user_id = users.userid inner join product \r\n"
							+ "on orders.product_id=product.product_id where user_id=?");
			ps.setInt(1, user_id);
			rs = ps.executeQuery();
			System.out.println("-------------------------------------------------------------------------------");
			System.out.printf("|%10s%15s%15s%20s%15s%3s", "Id", "User Name", "Product Name", "Quantity", "Price", "|");
			System.out.println();
			System.out.println("-------------------------------------------------------------------------------");

			while (rs.next()) {
				int order_id = rs.getInt(1);
				String userName = rs.getString(2);
				String productName = rs.getString(3);
				int quantity = rs.getInt(4);
				int price = rs.getInt(5);

				System.out.printf("|%10s%15s%15s%20s%15s%3s", order_id, userName, productName, quantity, price, "|");
				System.out.println();
			}
			System.out.println("-------------------------------------------------------------------------------");

			
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("1 press");
		Scanner sc = new Scanner(System.in);
		int adminchoice = sc.nextInt();
		if (adminchoice == 1) {
			adminWelcome();
		}
	}
}
