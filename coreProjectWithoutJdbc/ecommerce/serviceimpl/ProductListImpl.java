package com.ecommerce.serviceimpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.ecommerce.entitites.Product;
import com.ecommerce.service.ProductList;

public class ProductListImpl implements ProductList{

	@Override
	public List<Product> getProductList() {
		List<Product> list = new ArrayList<Product>();
		Product product1 = new Product(1101, "Mobile", "Samsung Galaxy", "17500", 5);
		Product product2 = new Product(1103, "Laptop", "HP ZBOOK", "56000", 2);
		Product product3 = new Product(1106, "Mobile", "Apple iPhone", "50000", 3);
		Product product4 = new Product(1105, "Mobile", "One Plus", "36000", 7);
		Product product5 = new Product(1110, "Laptop", "Dell", "70000", 5);
		Product product6 = new Product(1109, "Laptop", "Lenovo", "40000", 4);
		Product product7 = new Product(1107, "Mobile", "RealMe", "10000", 8);
		Product product8 = new Product(1102, "Laptop", "Apple", "150000", 3);
		Product product9 = new Product(1104, "Mobile", "Vivo", "20500", 5);
		Product product10 = new Product(1108, "Mobile", "RedMI", "8000", 5);
		
		list.add(product1);
		list.add(product2);
		list.add(product3);
		list.add(product4);
		list.add(product5);
		list.add(product6);
		list.add(product7);
		list.add(product8);
		list.add(product9);
		list.add(product10);
		
		Iterator iterator = list.iterator();
		System.out.println("-----------Welcome-----------");
		System.out.println();
		System.out.println("Follwing are the available product list ");
		System.out.println();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		//System.out.println(list);
		return list;
	}
	
	public List<Product> getProductListwithoutprintlinglist() {
		List<Product> list = new ArrayList<Product>();
		Product product1 = new Product(1101, "Mobile", "Samsung Galaxy", "17500", 5);
		Product product2 = new Product(1103, "Laptop", "HP ZBOOK", "56000", 2);
		Product product3 = new Product(1106, "Mobile", "Apple iPhone", "50000", 3);
		Product product4 = new Product(1105, "Mobile", "One Plus", "36000", 7);
		Product product5 = new Product(1110, "Laptop", "Dell", "70000", 5);
		Product product6 = new Product(1109, "Laptop", "Lenovo", "40000", 4);
		Product product7 = new Product(1107, "Mobile", "RealMe", "10000", 8);
		Product product8 = new Product(1102, "Laptop", "Apple", "150000", 3);
		Product product9 = new Product(1104, "Mobile", "Vivo", "20500", 5);
		Product product10 = new Product(1108, "Mobile", "RedMI", "8000", 5);
		
		list.add(product1);
		list.add(product2);
		list.add(product3);
		list.add(product4);
		list.add(product5);
		list.add(product6);
		list.add(product7);
		list.add(product8);
		list.add(product9);
		list.add(product10);
		
//		Iterator iterator = list.iterator();
//		System.out.println("-----------Welcome-----------");
//		System.out.println();
//		System.out.println("Follwing are the available product list ");
//		System.out.println();
//		while(iterator.hasNext()) {
//			iterator.next();
//		}
//		//System.out.println(list);
		return list;
	}


}
