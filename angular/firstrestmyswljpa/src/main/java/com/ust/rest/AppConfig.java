//package com.ust.rest;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Profile;
//
//public class AppConfig {
//	
//	@Autowired
//	private EnvDetails envDetails;
//	
//	@Bean
//	@Profile("dev")
//	public EnvDetails devEnv() {
//		
//		System.out.println("Dev Env");
//		System.out.println(envDetails);
//		return envDetails;
//		
//	}
//	
//	@Bean
//	@Profile("test")
//	public EnvDetails testEnv() {
//		
//		System.out.println("test Env");
//		System.out.println(envDetails);
//		return envDetails;
//		
//	}
//	
//	@Bean
//	@Profile("prod")
//	public EnvDetails prodEnv() {
//		
//		System.out.println("prod Env");
//		System.out.println(envDetails);
//		return envDetails;
//		
//	}
//
//}
