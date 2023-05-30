package com.practice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class User_defined_map {
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
		System.out.println("*UserDefined Map**");
		Map<String, Employee> m = new LinkedHashMap<>();
		m.put("Java", e);
		m.put("selenium", e1);
		m.put("API", e2);
		
		
		Set<Entry<String,Employee>> entrySet = m.entrySet();
		for (Entry<String, Employee> z : entrySet) {
		System.out.println("Employee Name is :" +
		z.getValue().getName());
		System.out.println("Employee Salary is :" +
		z.getValue().getEmployeeId());
		System.out.println();
		}
		}

}
