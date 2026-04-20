package com.aman;

public class ProductController {

    private ProductService service;

    // Constructor Injection
    public ProductController(ProductService service) {
        this.service = service;
    }

    public void handleRequest() {
        service.process();
        System.out.println("Handling request in Controller");
    }
}