package com.ajai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"controlador"})
public class CRUDApplication {

	public static void main(String[] args) {
		SpringApplication.run(CRUDApplication.class, args);
	}

}
