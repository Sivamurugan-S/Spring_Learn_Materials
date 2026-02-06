package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SetterInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(SetterInjectionApplication.class, args);
		Laptop lap = ac.getBean(Laptop.class);
		lap.build();
	}

}
// What is Setter Injection?