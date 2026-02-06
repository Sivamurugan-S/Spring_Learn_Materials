package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class InterfaceInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(InterfaceInjectionApplication.class, args);
		Student st = ac.getBean(Student.class);
		st.study();
		st.workWithDevice();
	}

}
