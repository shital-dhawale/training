
package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Product;
import com.example.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductService productService;
	@GetMapping("/getAll")
	public @ResponseBody List<Product> getAllProduct(){
		 return productService.getAllProduct();
	}
	@GetMapping(path = "/getAllXml", produces = MediaType.APPLICATION_XML_VALUE)
	public @ResponseBody List<Product> getAllProductXml(){
		return productService.getAllProduct();
	}
	@GetMapping("/getById/{productId}")
	public ResponseEntity<Product> getProductById(@PathVariable int productId) {
		Product product = productService.getProductById(productId);
		return ResponseEntity.ok().body(product); 
	}
	@PostMapping("/saveProduct")
	public ResponseEntity<Product> saveProduct(@RequestBody Product product) {
		Product product1 = productService.saveProduct(product);
		return ResponseEntity.ok().body(product1);
	}
	@DeleteMapping("/delete/{productId}")
	public void deleteProductById(@PathVariable int productId) {
		productService.deleteProductById(productId);
	}
	@PutMapping("/updateProduct/{id}")
	public ResponseEntity<Product> updateProductById(@PathVariable int id, @RequestBody Product product){
		Product product1 = productService.getProductById(id);
		product1.setProductid(product.getProductid());
		product1.setProductname(product.getProductname());
		product1.setProductdescription(product.getProductdescription());
		product1.setQuantity(product.getQuantity());
		product1.setAmount(product.getAmount());
		product1.setStatus(product.getStatus());
		Product product2 = productService.saveProduct(product1);
		return ResponseEntity.ok().body(product2);
	}
	@GetMapping("/getAllAmountAddition")
	public ResponseEntity<Integer> getAllAmountAddion(){
		int totalAmmountAddition = productService.getAdditionAllAmount();
		return ResponseEntity.ok().body(totalAmmountAddition);
	}
}
