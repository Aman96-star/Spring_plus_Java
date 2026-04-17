package com.aman.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aman.entity.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product,Long>{

}
