package com.natsoft.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.natsoft.entity.Product;
import com.natsoft.service.IProductService;

@RestController
@RequestMapping("/api/product")
public class ProductRestController {
	
	@Autowired
	private IProductService service;
	
	//save the product
	@PostMapping("/create")
	public ResponseEntity<String> createProduct(@RequestBody Product product){
		Integer id = service.saveProduct(product);
		String message="Product got Created";
		return new ResponseEntity<String>(message, HttpStatus.CREATED);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Product>> showAllProducts(){
		List<Product> list = service.findAllProducts();
		return new ResponseEntity<List<Product>>(list,HttpStatus.OK);
	}

}
