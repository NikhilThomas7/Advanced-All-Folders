package com.ust.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.ust.rest.repository.ProductRepository;
import com.ust.rest.resource.Product;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableWebMvc
//@EnableSwagger2
@SpringBootApplication
public class FirstrestApplication implements CommandLineRunner{
	
	@Autowired
	ProductRepository repo;

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(FirstrestApplication.class, args);
		for(String str:args) {
			System.out.println(str);
		}
		boolean str = ctxt.containsBean("userRepository");
		System.out.println(str);
	}
	
	@Override public void run(String...args ) throws Exception{
		System.out.println("fromcommandlinerunner");
		List<Product> products = repo.findAll();
		System.out.println(products.size());
				
	}
	
	

}


