package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FieldInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(FieldInjectionApplication.class, args);
		Laptop lap = ac.getBean(Laptop.class);
		lap.build();
	}

}
