package com.restservice.applicationrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.restservice.controller.ProductController;

@SpringBootApplication
@ComponentScan(basePackages = { "com.restservice.controller", "com.restservice.services" })
public class WholesaleMaster {

	public static void main(String[] args) {
		SpringApplication.run(WholesaleMaster.class, args);
	}

}
