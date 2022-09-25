package com.e_commerce;

public class Cart {
	int cart_id;
	int userid;
	int product_id;
	
	public int getCart_id() {
		return cart_id;
	}


	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}


	public int getUserid() {
		return userid;
	}


	public void setUserid(int userid) {
		this.userid = userid;
	}


	public int getProduct_id() {
		return product_id;
	}


	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public Cart()
	{
		
	}
	public Cart(int cart_id, int userid, int product_id) {
	
		this.cart_id = cart_id;
		this.userid = userid;
		this.product_id = product_id;
		
	}
	
}
