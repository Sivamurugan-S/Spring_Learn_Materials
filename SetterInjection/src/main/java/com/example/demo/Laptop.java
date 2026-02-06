package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
	Os ref;
	
	public Os getRef() {
		return ref;
	}
	
	@Autowired
	public void setRef(Os ref) {
		this.ref = ref;
	}

	public void build() {
		System.out.println("Building the App.");
		ref.operating();
	}
}
