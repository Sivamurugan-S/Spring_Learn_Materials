package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Student {
	ElectronicDevice ref;
	
	void study() {
		System.out.println("Student is studying.");
	}
	
	void workWithDevice() {
		ref.useDevice();
	}
	
	public Student(ElectronicDevice ref) {
		super();
		this.ref = ref;
	}
}
