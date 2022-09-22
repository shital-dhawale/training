package com.exception1_4;

import java.util.Scanner;

//4) You are having a class with name Item which store the item name, price, 
//and maximum no of item can bought, Class Category it has catid, and categoryname. 
//Class ItemBought it will have itemid, itemqty. User will input the item list 
//which will be store by the item class object array, user also input how many item 
//he has purchased and what is the quantity. On the basis of these input you need 
//to print the all item in the bill and if user input the quantity of item which is 
//more than maximum number of item can be bought limit you have to throw the exception 
//ItemPurchaseLimitExceed. It may be possible user input the price or maximum limit 0 
//in that case also throw the exception. If all good print the total amount and 
//all items list on console.
public class TestMain {
	public static void itemToBeBuy() {
		Scanner sc = new Scanner(System.in);
		int maxNoItemCanBeBought = 3;
			System.out.println("Enter item name ");
			String itemName = sc.next();
			System.out.println("Enter item price ");
			int itemPrice = sc.nextInt();
			System.out.println("Enter Quantity");
			int quantity = sc.nextInt();
			System.out.println("Enter category id ");
			int categoryId = sc.nextInt();
			System.out.println("Enter item category ");
			String itemCategory = sc.next();
			Item item = new Item(itemName, itemPrice, quantity);
			if(quantity>maxNoItemCanBeBought) {
				throw new ItemPurchaseLimitExeedException("Limit of maximun number of items can be bought exceeded");
			}else if(itemPrice<=0) {
				throw new ItemPurchaseLimitExeedException("Invalid item price");
			}
		
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of items you want to buy ");
		int noOfItems = sc.nextInt();
		for(int i=1; i<=noOfItems; i++) {
			itemToBeBuy();
		}
		itemToBeBuy();
		
	    
//	    Item i=new Item("laptop",500000);
//	    Category c=new Category(100,"electronics");
//	    ItemBought ib=new ItemBought(201,2);
//	    
//	    System.out.println(i);
//	    System.out.println(c);
//	    System.out.println(ib);
//	    



	}
}
