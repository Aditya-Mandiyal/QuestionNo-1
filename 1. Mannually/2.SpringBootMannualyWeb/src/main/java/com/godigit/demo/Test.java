package com.godigit.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
// this is the combination of @componentScan , @enableautoconfig ,
public class Test {
    
	public static void main(String[] args) {
	ApplicationContext context = SpringApplication.run(Test.class, args);	
        
	}

}
