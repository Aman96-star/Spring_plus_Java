package com.aman;


public class Main {
    public static void main(String[] args) {

        // Step 1: Create DAO
        ProductDAO dao = new ProductDAO();

        // Step 2: Inject DAO into Service
        ProductService service = new ProductService(dao);

        // Step 3: Inject Service into Controller
        ProductController controller = new ProductController(service);

        // Step 4: Call Controller
        controller.handleRequest();
    }
}