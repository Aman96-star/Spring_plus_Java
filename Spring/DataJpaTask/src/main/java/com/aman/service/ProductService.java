package com.aman.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aman.entity.Product;
import com.aman.repository.ProductRepository;

@Service
public class ProductService {
			@Autowired
			private ProductRepository productRepository;
			
			public Product createProduct(Product product) {
				return productRepository.save(product);
			}
			
			public  Iterable<Product> getAllProduct() {
				return productRepository.findAll();
			}
}
