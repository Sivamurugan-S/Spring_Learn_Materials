package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ConstructorInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(ConstructorInjectionApplication.class, args);
		Student st = ac.getBean(Student.class);
		st.study();
		st.useLaptop();
	}

}
