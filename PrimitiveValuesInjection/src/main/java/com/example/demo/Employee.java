package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	int empId;
	String empName;
	double empSalary;
	
	Department dept;
	
	void work() {
		System.out.println("Employee is working.");
	}
	
	void details() {
		System.out.println("Employee ID: " + empId);
		System.out.println("Employee Name: " + empName);
		System.out.println("Employee Salary: " + empSalary);
		
		dept.deptDetails();
	}
	
	public Employee(@Value("${employee.empId}") int empId, 
			@Value("${employee.empName}") String empName, 
			@Value("${employee.empSalary}") double empSalary, Department dept) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.dept = dept;
	}
	
}
