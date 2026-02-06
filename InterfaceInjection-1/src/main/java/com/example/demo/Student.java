package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
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

	public Student(@Qualifier("lap") ElectronicDevice ref) {
		super();
		this.ref = ref;
	}
}
