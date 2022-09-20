package com.ecommerce;

import java.util.List;

import com.ecommerce.entitites.Product;
import com.ecommerce.serviceimpl.ProductListImpl;
import com.ecommerce.serviceimpl.ProductToBuyImpl;
import com.ecommerce.serviceimpl.UserLoginImpl;

public class TestMain {
	public static void main(String[] args) {
		ProductListImpl productListImpl = new ProductListImpl();
		productListImpl.getProductList();
		System.out.println();
		System.out.println("To purchase products please create your account");
		System.out.println();
		UserLoginImpl userLoginImpl = new UserLoginImpl();
		userLoginImpl.getUserDetails();
		userLoginImpl.login();
		ProductToBuyImpl p = new ProductToBuyImpl();
		p.buyProduct();
		//p.getBoughtProducts();
//		System.out.println("Following product list that you want to buy");
//		//List<Product> list= productToBuyImpl.buyProduct();
//		
//		System.out.println(list);
//		int sum = 0;
//		for(int i=0; i<list.size(); i++) {
//			Product product = list.get(i);
//			int quantity1 = product.getQuantity();
//			int price = Integer.parseInt(product.getPrice());
//			int mul = quantity1*price;
//			sum = sum + mul;
//			
//		}
//		System.out.println("Total amount of all the products : " +sum);
		
		}
	}

