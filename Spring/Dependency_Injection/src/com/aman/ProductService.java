package com.aman;


public class ProductService {

    private ProductDAO dao;

    // Constructor Injection
    public ProductService(ProductDAO dao) {
        this.dao = dao;
    }

    public void process() {
        dao.getData();
        System.out.println("Processing in Service");
    }
}
