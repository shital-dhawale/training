package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.model.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
	@Query(value="select sum(amount) from product", nativeQuery=true)
	public int getAdditionAmount ();
}
