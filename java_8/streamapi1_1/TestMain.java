package com.stream.api1_1;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
//1. WAP to find the average price of item from the list of given items. 
//2. WAP to print detail of item which is having highest and lowest price. 
//(separate programs should be used.
//3. WAP to print the item with maximum price and not having any expiry 
//date(item like water bottle, and dresses not having any expiry date)
//4. WAP to store item name and price from list to set. 
//5. WAP to remove duplicate prices from the list of the items.

public class TestMain {
	public static void main(String[] args) {
		List<Item> list = new ArrayList<Item>();
		LocalDateTime date_of_manufacturing = LocalDateTime.of(2022, Month.AUGUST, 05, 23,10, 00);
		LocalDateTime date_of_expiry = LocalDateTime.of(2022, Month.DECEMBER, 05, 23, 10, 00);
		Item item1 = new Item(2, "honey", date_of_manufacturing, date_of_expiry, 250);
		
		LocalDateTime date_of_manufacturing2 = LocalDateTime.of(2022, Month.AUGUST, 23, 10, 00);
		LocalDateTime date_of_expiry2 = LocalDateTime.of(2022, Month.SEPTEMBER, 05, 23, 10, 00);
		Item item2 = new Item(2, "chocolate", date_of_manufacturing2, date_of_expiry2, 100);
		
		LocalDateTime date_of_manufacturing3 = LocalDateTime.of(2022, Month.AUGUST, 23, 10, 00);
		LocalDateTime date_of_expiry3 = LocalDateTime.of(2022, Month.DECEMBER, 05, 23, 10, 00);
		Item item3 = new Item(2, "water bottle", date_of_manufacturing3, date_of_expiry3, 25);
		
		
		list.add(item1);
		list.add(item2);
		list.add(item3);
		
		double average = list.stream().mapToDouble(Item::getPrice).average().getAsDouble();
		System.out.println("Average price of item from a given list : " +average);
		
		//Comparator<Item> comp = (i1,i2)->i1.getPrice().compare(i2.getPrice());
		
		//Item min = list.stream().min((i1,i2)->i1.getPrice().compareTo(i2.getPrice())).get();
		
		List<Item> list1 = (List<Item>) list.stream().sorted(new Comparator<Item>(){
			

			@Override
			public int compare(Item o1, Item o2) {
				if(o1.getPrice()>o2.getPrice()) {
					return 1;
				}else if(o1.getPrice()<o2.getPrice()) {
					return -1;
				}else {
					return 0;
				}
				
			}
		}).collect(Collectors.toList());
		
		System.out.println("Item having highest price : " +list1.get(0));
		System.out.println("Item having lowest price : " +list1.get(list1.size()-1));
	}


}