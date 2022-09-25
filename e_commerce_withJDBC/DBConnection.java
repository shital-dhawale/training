package com.e_commerce;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	public Connection getConnection() {
		Connection connection=null;
		String url="jdbc:mysql://localhost:3306/e_commerce?autoReconnect=true&useSSL=false";
		try {
			//loading driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//establish connection
			connection=DriverManager.getConnection(url, "root", "root");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Connection Problem...");
		}
		return connection;
	}
}
