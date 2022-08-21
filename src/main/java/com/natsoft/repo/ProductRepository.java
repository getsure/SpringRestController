package com.natsoft.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.natsoft.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
  
}
