//package com.ust.rest;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.service.Contact;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//
////hoe do we call swagger = http://localhost:<portno>/swagger-ui/index.html
//@EnableWebMvc
//@Configuration
//
////it creates and injects bean
//
//@EnableSwagger2
//
//public class SwaggerConfig {                                                                                          
//	
//	@Bean
//	public Docket docket() {
//		return new Docket(DocumentationType.SWAGGER_2).
//				select().
//				apis(RequestHandlerSelectors.basePackage("com.ust.rest")).
//				paths(PathSelectors.any()).
//				build().apiInfo(metaData());
//	}
//	
//	private ApiInfo metaData() {
//		
//		return new ApiInfoBuilder().title("UST - SpringBoot Swagger Config").
//				description("\" Swagger configuration for application\"").
//				version("1.1.0").
//				license("Apache 2.0").
//				licenseUrl("https://www,apache.org/license/LICENSE-2.0\"").
//				contact(new Contact("UST","https://youtube.com/","contact@ust.com")).
//				build();
//		
//		
//	}
//	
//	
//	
//	
//
//}
