package com.e_commerce.entities;

public class Product {
	private int product_id;
	private String name;
	private String description;
	private String price;
	int quantity;
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Product(int product_id, String name, String description, String price, int quantity) {
		super();
		this.product_id = product_id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Product [product_id=" + product_id + ", name=" + name + ", description=" + description + ", price="
				+ price + ", quantity=" + quantity + "]";
	}

}
