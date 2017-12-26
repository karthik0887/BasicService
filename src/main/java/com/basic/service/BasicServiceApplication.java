package com.basic.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.basic"})
public class BasicServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicServiceApplication.class, args);
	}
}
