package com.practice;

import java.util.LinkedHashSet;
import java.util.Set;

public class User_defined_set {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEmployeeId(722619);
		e.setName("Jeff");
		Employee e1 = new Employee();
		e1.setEmployeeId(62135);
		e1.setName("Kate");
		Employee e2 = new Employee();
		e2.setEmployeeId(619324);
		e2.setName("Randy");
		System.out.println("*UserDefined Set**");
		Set<Employee> s = new LinkedHashSet<>();
		s.add(e);
		s.add(e1);
		s.add(e2);
		
		for (Employee y : s) {
		System.out.println("Employee id is :" + y.getEmployeeId());
		System.out.println("Employee Name is :" + y.getName());
		System.out.println();
		}
		
}}
