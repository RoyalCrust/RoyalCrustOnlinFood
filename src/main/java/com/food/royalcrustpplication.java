package com.food;

import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
//@EnableSwagger2

@SpringBootApplication
@ComponentScan(basePackages = "com.food")
public class royalcrustpplication {

    public static void main(String[] args) {
        SpringApplication.run(royalcrustpplication.class, args);
        System.out.println("RoyalCrust is Successfully created");

        
        
//    	@Bean
//    	public Docket restApi(){
//    	return new Docket(DocumentationType.SWAGGER_2)
//    				.select()
//    			.apis(RequestHandlerSelectors.basePackage("com.example.demo"))
//    			.paths(PathSelectors.any())
//    		.build();
 
    

    }

}
