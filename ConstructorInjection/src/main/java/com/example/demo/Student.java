package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	Laptop ref;
	
	void study() {
		System.out.println("Student is studying.");
	}
	
	void useLaptop() {
		ref.work();
	}
	
	@Autowired // Spring handles using @Autowired annotation
	public Student(Laptop ref) { 
		super();
		this.ref = ref;
	}
}

// What is Constructor Injection?
// Contsructor Injection is the process of providing the required object to the class through its constructor.
// What is @Autowired?
// @Autowired annotation tells Spring to perform automatically injection.
// Why Constructor injection used more than setter injection?
// Constructor injection is preffered for mandatory injection. Object cannot be created without required inputs.
