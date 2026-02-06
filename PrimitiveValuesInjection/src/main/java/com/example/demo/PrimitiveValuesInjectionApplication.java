package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PrimitiveValuesInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(PrimitiveValuesInjectionApplication.class, args);
		Employee emp = ac.getBean(Employee.class);
		emp.work();
		emp.details();
	}

}
