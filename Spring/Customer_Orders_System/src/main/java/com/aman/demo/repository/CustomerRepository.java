package com.aman.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aman.demo.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}