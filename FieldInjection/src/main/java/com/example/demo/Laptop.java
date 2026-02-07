package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
	@Autowired
	Os ref;
	
	public void build() {
		ref.opreating();
		System.out.println("Building project in the system.");
	}
}
