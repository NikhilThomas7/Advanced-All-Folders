package com.ust.rest.resources;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ust.rest.repository.ProductRepository;
import com.ust.rest.resource.Product;
import com.ust.rest.services.ProductService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping("/product/api.2.0")
@CrossOrigin(origins = "http://localhost:4200", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})


public class ProductResource {
	
	@Autowired
	ProductService service;
	@Autowired
	ProductRepository productrepo;
	
	
	
   @GetMapping
	
	public String TestMethod() {
		return " test method working";
	}
	
	@GetMapping
//	@ApiOperation(value= "accepts product id and returns product entity")
	@RequestMapping("/retrieve/{productId}")
	public Product fetchProduct(@PathVariable long  productId) {
	
	return service.getProduct(productId);
}
	

	
	@GetMapping
//	@ApiOperation(value= "accepts product id and returns product entity")
	@RequestMapping("/retrieve/all")
	public List<Product> fetchproducts() {
	
	return service.getProducts();
}
	
	@PostMapping
//	@ApiOperation(value= "postmapping")
	
	@RequestMapping(value="/create",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE )
	public Product addProduct(@RequestBody Product product ){
		return productrepo.save(product);
		
		
	}
	
	@PutMapping
//	@ApiOperation(value= "putmapping")
	@RequestMapping(value="/update",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Product updateProduct(@RequestBody  Product product) {
		Optional<Product> optional = productrepo.findById(product.getProductId());
		
		Product tempProd = optional.get();
		
		tempProd.setName(product.getName());
		tempProd.setDescription(product.getDescription());
		tempProd.setPrice(product.getPrice());
		tempProd.setQty(product.getQty());
		
		
		return productrepo.save(tempProd);
	}
	
	@DeleteMapping
//	@ApiOperation(value= "deletemapping")
	@RequestMapping(value="/delete/{productId}")
	public void deleteProduct(@PathVariable long productId) {
		service.deleteProduct(productId);
	} 
	
	
	
	
	
	
}
