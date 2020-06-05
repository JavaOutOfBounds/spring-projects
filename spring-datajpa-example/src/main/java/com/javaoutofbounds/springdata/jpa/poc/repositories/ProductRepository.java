package com.javaoutofbounds.springdata.jpa.poc.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.javaoutofbounds.springdata.jpa.poc.entity.Product;
@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
	
}