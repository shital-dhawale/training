package com.example.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Product;
import com.example.repository.ProductRepository;
import com.example.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product> getAllProduct() {
		return productRepository.findAll();
		 
	}

	@Override
	public Product getProductById(int productId) {
		Product product = new Product();
//		Product p = null;
//		for(Product product : list) {
//			if(product.getId()==productId) {
//				p=product;
//				break;
//				
//			}
//		}
		try {
			product = converToProduct(productRepository.findById(productId));
			
		}catch(Exception e){
			System.out.println("Product id is not valid");
		}
		return product;
	}
	
	private Product converToProduct(Optional<Product> product1) {
		Product product2 = new Product();
		if(product1 != null) {
			product2.setId(product1.get().getId());
			product2.setProductname(product1.get().getProductname());
			product2.setProductdescription(product1.get().getProductdescription());
			product2.setProductid(product1.get().getProductid());
			product2.setAmount(product1.get().getAmount());
			product2.setQuantity(product1.get().getQuantity());
			product2.setStatus(product1.get().getStatus());
		}
		return product2;
	}

	@Override
	public Product saveProduct(Product product) {
	
		return productRepository.save(product);
	}

	@Override
	public void deleteProductById(int id) {
		
		productRepository.deleteById(id);
	}

	@Override
	public int getAdditionAllAmount() {
		int addition = productRepository.getAdditionAmount();
		return addition;
	}

}
