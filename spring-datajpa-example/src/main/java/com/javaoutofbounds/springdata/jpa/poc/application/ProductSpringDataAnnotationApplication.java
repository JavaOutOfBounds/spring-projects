package com.javaoutofbounds.springdata.jpa.poc.application;

import java.util.Optional;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.javaoutofbounds.springdata.jpa.poc.config.ProductApplicationConfig;
import com.javaoutofbounds.springdata.jpa.poc.entity.Product;
import com.javaoutofbounds.springdata.jpa.poc.repositories.ProductRepository;

public class ProductSpringDataAnnotationApplication {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(ProductApplicationConfig.class);
		Product product = new Product("Moto wildfire specification", "Moto Wildfire", "12000", "Available");
      // Accessing BeanId - As per naming beans conventions - if you do not provide Id explicitly , then spring 
		// generate the ID base on the camelCase of ClassName
		ProductRepository repo= (ProductRepository)context.getBean("productRepository");
		repo.save(product);
		System.out.println("After Save  Auto generated ProductId :: "+product.getPrductId());

		Optional<Product> products= repo.findById(product.getPrductId());
		Product dbProduct = products.get();
		System.out.println("After Get values   :: "+dbProduct);

		System.out.println();
		
	}

}
