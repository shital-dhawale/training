package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.model.Product;

public interface ProductService {
	
	public List<Product> getAllProduct();

	public Product getProductById(int productId);
	
	public Product saveProduct(Product product);
	
	public void deleteProductById(int id);
	public int getAdditionAllAmount();
}
