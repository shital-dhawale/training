package com.e_commerce;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Product {
	int id;
	String description;
	String price;
	String name;
	int quantity;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Product() {

	}

	public Product(int id, String description, String price, String name, int quantity) {

		this.id = id;
		this.description = description;
		this.price = price;
		this.name = name;
		this.quantity = quantity;
	}

	
	public static void getProductList(int user_id) throws SQLException {
		Connection cn = null;
		PreparedStatement ps = null;
		List<Product> productList = new ArrayList<Product>();
		try {
			DBConnection db = new DBConnection();
			cn = db.getConnection();
			ps = cn.prepareStatement("select * from product order by product_id");
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
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Somthing went to wrong...");
		} finally {
			cn.close();
			ps.close();
		}

		// productList.forEach(products -> System.out.println(products));
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
		try {
			System.out.println(
					"---------------------------------------------------------------------------------------------------------------");
			System.out.println("1 >> Buy product");
			System.out.println("2 >> Add to Cart");
			System.out.println("3 >> My Cart");
			System.out.println("4 >> Back");
			System.out.println("Enter your choice:");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				if (user_id != 0) {
					buyProduct(user_id);
				} else {
					System.out.println("1 >> Account already exist");
					System.out.println("2 >> Sign Up");
					System.out.println("Enter your Choice:");
					int userchoice = sc.nextInt();
					UserForm userForm = new UserForm();
					switch (userchoice) {
					case 1:
						userForm.getLoginDetails();
						break;
					case 2:
						userForm.getRegistrationDetails();
						break;
					default:
						System.out.println("Invalid choice");
						getProductList(user_id);
					}
				}
				break;
			case 2:
				if (user_id != 0) {
					addToCart(user_id);
				} else {
					System.out.println("1 >> Account already exist");
					System.out.println("2 >> Sign Up");
					System.out.println("Enter your Choice:");
					int userchoice = sc.nextInt();
					UserForm userForm = new UserForm();
					switch (userchoice) {
					case 1:
						userForm.getLoginDetails();
						break;
					case 2:
						userForm.getRegistrationDetails();
						break;
					default:
						System.out.println("Invalid choice");
					}
				}
				break;
			case 3:
				if (user_id != 0) {
					goToCart(user_id);
				} else {
					System.out.println("1 >> Account already exist");
					System.out.println("2 >> Sign Up");
					System.out.println("Enter your Choice:");
					int userchoice = sc.nextInt();
					UserForm userForm = new UserForm();
					switch (userchoice) {
					case 1:
						userForm.getLoginDetails();
						break;
					case 2:
						userForm.getRegistrationDetails();
						break;
					default:
						System.out.println("Invalid choice");
					}
				}
				break;
			case 4:
				UserForm userForm = new UserForm();
				userForm.Welcome();
				break;

			default:
				System.out.println("Invalid Choice");
				System.out.println("******");
			}
		} catch (Exception e) {
			System.out.println("Invalid choice Please Enter choice in Numbers");
			getProductList(user_id);
		}
	}

	
	private static void addToCart(int user_id) throws SQLException {
		Connection cn = null;
		PreparedStatement ps = null;
		try {
			System.out.println("Enter product id :");
			Scanner sc = new Scanner(System.in);
			int id = sc.nextInt();
			DBConnection db = new DBConnection();
			cn = db.getConnection();
			ps = cn.prepareStatement("insert into cart (user_id, product_id)values(?,?) ");
			ps.setInt(1, user_id);
			ps.setInt(2, id);
			// ps.setInt(3, quantity);
			int i = ps.executeUpdate();
			System.out.println("Added to cart successfully");
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			cn.close();
			ps.close();
		}
		try {
			System.out.println("1 >> add more product to cart");
			System.out.println("2 >> show my cart");
			System.out.println("Enter your choice:");
			Scanner scanner = new Scanner(System.in);
			int cart_choice = scanner.nextInt();
			switch (cart_choice) {
			case 1:
				getProductList(user_id);
			case 2:
				goToCart(user_id);
			}
		} catch (Exception e) {
			System.out.println("Invalid choice Please Enter choice in Numbers");
			addToCart(user_id);
		}
	}

	private static void goToCart(int user_id) throws SQLException {
		List<Cart> cartList = new ArrayList<Cart>();
		Connection cn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		DBConnection db = new DBConnection();
		try {

			cn = db.getConnection();
			ps = cn.prepareStatement("select * from cart where user_id=?");
			ps.setInt(1, user_id);
			rs = ps.executeQuery();

			System.out.println("--------------------------------------------");
			System.out.printf("|%10s%15s%15s%3s", "Cart Id", "User Id", "Product Id", "|");
			System.out.println();
			System.out.println("--------------------------------------------");

			while (rs.next()) {
				int cartId = rs.getInt(1);
				int userId = rs.getInt(2);
				int productId = rs.getInt(3);

				cartList.add(new Cart(cartId, userId, productId));
				System.out.printf("|%10s%15s%15s%3s", cartId, userId, productId, "|");
				System.out.println();

			}
			System.out.println("--------------------------------------------");

		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Something went wrong");
		}

		try {
			System.out.println("1 >> Delete product from Cart");
			System.out.println("2 >> Buy Product Available in Cart");
			System.out.println("3 >> Back");
			System.out.println("Enter your choice:");
			Scanner sc = new Scanner(System.in);
			int cart_choice = sc.nextInt();
			switch (cart_choice) {
			case 1:
				System.out.println("Enter Cart Id:");
				int cart_id = sc.nextInt();
				try {
					cn = db.getConnection();
					ps = cn.prepareStatement("delete from cart where cart_id=?");
					ps.setInt(1, cart_id);
					ps.executeUpdate();
					System.out.println("Item Deleteed Successfully...");
					goToCart(user_id);
				} catch (Exception e) {
					System.out.println(e);
					System.out.println("Item not Deleted");
				}
				break;
			case 2:

				Cart cart = new Cart();
				for (Cart c : cartList) {
					int check_quantity = 0;
					try {
						cn = db.getConnection();
						ps = cn.prepareStatement(
								"select product_price, product_name, product_quantity from product where product_id=?");
						ps.setInt(1, c.getProduct_id());
						rs = ps.executeQuery();
						if (rs.next()) {
							String product_name = rs.getString(2);
							check_quantity = rs.getInt(3);
							if (check_quantity > 0) {
								System.out.println("Enter quantity for: " + c.getProduct_id());
								int quantity = sc.nextInt();

								String product_price = rs.getString(1);

								int product_quantity = rs.getInt(3);

								if (product_quantity > 0 && product_quantity >= quantity) {
									int price = Integer.parseInt(product_price);
									int totalAmount = price * quantity;
									int remainingProduct_quantity = product_quantity - quantity;
									System.out.println("Total order price : " + totalAmount);
									ps = cn.prepareStatement(
											"insert into orders (user_id, product_id, ordered_quantity, order_price) values (?,?,?,?)");
									ps.setInt(1, c.getUserid());
									ps.setInt(2, c.getProduct_id());
									ps.setInt(3, quantity);
									ps.setInt(4, totalAmount);
									int a = ps.executeUpdate();
									if (a != 0) {

										System.out.println("Your order is successfully executed");
										ps = cn.prepareStatement(
												"update product set product_quantity=? where product_id = ?");

										ps.setInt(1, remainingProduct_quantity);
										ps.setInt(2, c.getProduct_id());
										ps.executeUpdate();
										ps = null;
										ps = cn.prepareStatement("delete from cart where cart_id=?");
										ps.setInt(1, c.getCart_id());
										ps.executeUpdate();

									}

								} else {
									System.out.println("You entered quantity is " + quantity + " but only "
											+ product_quantity + " in stock");
								}

							}
						}

					} catch (Exception e) {

					}
				}

				break;
			case 3:
				getProductList(user_id);
				break;
			default:
				System.out.println("Invalid choice");
				goToCart(user_id);
				break;

			}
			getProductList(user_id);
		} catch (Exception e) {
			System.out.println("Invalid choice Please Enter choice in Numbers");
			goToCart(user_id);
		}
	}


	private static void buyProduct(int user_id) throws SQLException {

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
					"select product_price, product_name, product_quantity from product where product_id=?");
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while (rs.next()) {
				check_quantity = rs.getInt(3);
				if (check_quantity > 0) {
					System.out.println("Enter quantity :");
					int quantity = sc.nextInt();

					String product_price = rs.getString(1);
					String product_name = rs.getString(2);
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
							ps = cn.prepareStatement("update product set product_quantity=? where product_id = ?");

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
					UserForm userform = new UserForm();
					userform.Welcome();

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
}
