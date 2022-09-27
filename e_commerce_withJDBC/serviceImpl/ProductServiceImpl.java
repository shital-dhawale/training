package com.e_commerce.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.e_commerce.repository.DBConnection;
import com.e_commerce.service.ProductService;

public class ProductServiceImpl implements ProductService{

	@SuppressWarnings("resource")
	@Override
	public void buyProduct(int user_id) throws SQLException {


		Connection cn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int check_quantity = 0;
		try {
			System.out.println("Enter product id :");
			Scanner sc = new Scanner(System.in);
			int id = sc.nextInt();
			DBConnection db = new DBConnection();
			cn = db.getConnection();
			ps = cn.prepareStatement(
					"select name, price, quantity from product where product_id=?");
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while (rs.next()) {
				check_quantity = rs.getInt(3);
				if (check_quantity > 0) {
					System.out.println("Enter quantity :");
					int quantity = sc.nextInt();
					
					String product_name = rs.getString(1);
					String product_price = rs.getString(2);
					int product_quantity = rs.getInt(3);

					if (product_quantity > 0 && product_quantity >= quantity) {
						int price = Integer.parseInt(product_price);
						int totalAmount = price * quantity;
						int remainingProduct_quantity = product_quantity - quantity;
						System.out.println("Total order price : " + totalAmount);
						ps = cn.prepareStatement(
								"insert into orders (user_id, product_id, ordered_quantity, order_price) values (?,?,?,?)");
						ps.setInt(1, user_id);
						ps.setInt(2, id);
						ps.setInt(3, quantity);
						ps.setInt(4, totalAmount);
						int a = ps.executeUpdate();
						if (a != 0) {

							System.out.println("Your order is successfully executed");
							ps = cn.prepareStatement("update product set quantity=? where product_id = ?");

							ps.setInt(1, remainingProduct_quantity);
							ps.setInt(2, id);
							ps.executeUpdate();

						}

					} else {
						System.out.println(
								"You entered quantity is " + quantity + " but only " + product_quantity + " in stock");
					}

				}
			}
			try {
				System.out.println("1 >> Continue Shopping");
				System.out.println("2 >> close");
				System.out.println("Enter your choice : ");
				int choice = sc.nextInt();
				switch (choice) {
				case 1:
					buyProduct(user_id);
					break;
				case 2:
					close();

				}
			} catch (Exception e) {
				System.out.println("Invalid choice Please Enter choice in Numbers");
				buyProduct(user_id);
			}

		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Somthing went to wrong...");
		} finally {
			cn.close();
			ps.close();
			rs.close();
		}
	
		
	}
	public static void close() {
		System.out.println("------------Thank you--------------");
		System.exit(0);
	}

}
