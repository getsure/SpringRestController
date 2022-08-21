package com.natsoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.natsoft.entity.Product;
import com.natsoft.repo.ProductRepository;

@Service
public class ProductServiceImpl implements IProductService {

	@Autowired
	private ProductRepository repo;
	
	@Override
	public Integer saveProduct(Product p) {
		p = repo.save(p);
		return p.getProdId();
	}
	
	@Override
	public List<Product> findAllProducts(){
		List<Product> list = repo.findAll();
		return list;
	}
}
