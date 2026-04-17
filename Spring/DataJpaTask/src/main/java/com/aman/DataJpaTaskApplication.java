package com.aman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.aman.entity.Product;
import com.aman.service.ProductService;


@SpringBootApplication
public class DataJpaTaskApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx = SpringApplication.run(DataJpaTaskApplication.class, args);		
		ProductService ps = ctx.getBean(ProductService.class);
		Product product = ps.createProduct(new Product(1011l,"BMW",22.21));
		System.out.println(product);
		
//		Iterable<Product> allProduct = ps.getAllProduct();
//		System.out.println(allProduct);
	}

}
