package com.ecommerce.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ecommerce.entitites.Product;
import com.ecommerce.exception.ProductException;
import com.ecommerce.service.ProductBuy;



public class ProductToBuyImpl implements ProductBuy{
	private static List<Product> list2 = new ArrayList<Product>();
	@Override
	public List<Product> buyProduct() {
		
		//ProductToBuyImpl productToBuyImpl = new ProductToBuyImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter product id to buy the product");
		int prodId = sc.nextInt();
		System.out.println("Enter quantity ");
		int quantity = sc.nextInt();
		ProductListImpl productListImpl = new ProductListImpl();
		List<Product> list1 = productListImpl.getProductListwithoutprintlinglist();
		
		//if(list2.isEmpty())
		//List<Product> list2 = new ArrayList<Product>();
		
		for(int i=0; i<list1.size(); i++) {
			Product product1 = list1.get(i);
			int id = product1.getId();
			int qty = product1.getQuantity();
			if(prodId==id) {
				if(quantity>qty) {
					try {
						throw new ProductException("Entered product quantity is more than available product quantity, please enter valid quantity");
					}catch(Exception e){
						System.out.println(e);
						
						this.buyProduct();
					}
					
				}else {
					product1.setQuantity(quantity);
					
					list2.add(product1);
					System.out.println(list2);
					System.out.println("Product added successfully");
					//System.out.println("Enter you");
					System.out.println("Enter your choice,  ");
					//System.out.println("To buy more product enter yes");
					System.out.println("1 : To buy more product");
					System.out.println("2 : To get total amount of products that you bought ");
					int input = sc.nextInt();
					switch(input) {
					case 1 :  
						this.buyProduct();
						//break;
						//System.out.println(list2);
					case 2: 
						System.out.println("Following product list that you want to buy");
						//List<Product> list3= productToBuyImpl.buyProduct();
						
						System.out.println(list2);
						int sum = 0;
						for(int j=0; j<list2.size(); j++) {
							Product product = list2.get(j);
							int quantity1 = product.getQuantity();
							int price = Integer.parseInt(product.getPrice());
							int mul = quantity1*price;
							sum = sum + mul;
							
						}
						System.out.println("Total amount of all the products : " +sum);
				}
					
				
					
				
			
		}
				return list2;
			}
		}
		return list2;
	

//	@Override
//	public void getBoughtProducts() {
//
//		ProductToBuyImpl productToBuyImpl = new ProductToBuyImpl();
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter your choice,  ");
//		//System.out.println("To buy more product enter yes");
//		System.out.println("1 : To buy more product");
//		System.out.println("2 : To get total amount of products that you bought ");
//		int input = sc.nextInt();
//		switch(input) {
//		case 1 :  
//			productToBuyImpl.buyProduct();
//		
//		case 2: 
//			System.out.println("Following product list that you want to buy");
//			List<Product> list3= productToBuyImpl.buyProduct();
//			
//			System.out.println(list3);
//			int sum = 0;
//			for(int j=0; j<list3.size(); j++) {
//				Product product = list3.get(j);
//				int quantity1 = product.getQuantity();
//				int price = Integer.parseInt(product.getPrice());
//				int mul = quantity1*price;
//				sum = sum + mul;
//				
//			}
//			System.out.println("Total amount of all the products : " +sum);
//			
//		
//	}

	




	}
		}
	

