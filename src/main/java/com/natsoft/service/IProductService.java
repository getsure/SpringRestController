package com.natsoft.service;

import java.util.List;

import com.natsoft.entity.Product;

public interface IProductService {

	Integer saveProduct(Product p);
	List<Product> findAllProducts();
}
