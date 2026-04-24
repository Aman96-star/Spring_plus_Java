package com.aman.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.aman.demo.entity.Customer;
import com.aman.demo.entity.Customer_Profile;
import com.aman.demo.repository.CustomerRepository;

@SpringBootApplication
public class CustomerOrdersSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerOrdersSystemApplication.class, args);
    }

    @Bean
    CommandLineRunner run(CustomerRepository repo) {
        return args -> {

            // create profile
            Customer_Profile profile = new Customer_Profile();
            profile.setPhone("9617202020");
            profile.setAddress("Sr.Nagar");

            // create customer
            Customer customer = new Customer();
            customer.setName("Aman");
            customer.setEmail("amanv24@gmail.com");

            // 🔥 IMPORTANT: set both sides
            customer.setProfile(profile);
            profile.setCustomer(customer);

            repo.save(customer);

            System.out.println("Saved successfully");
        };
    }
}