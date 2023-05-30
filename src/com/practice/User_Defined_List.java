package com.practice;

import java.util.LinkedList;
import java.util.List;

public class User_Defined_List {


public static void main(String[] args) {
	Employee employee = new Employee();
	employee.setName("Ram");
	employee.setEmployeeId(521994);
	
	List<Employee> list = new LinkedList<Employee>();
	list.add(employee);
	
	for (int i = 0; i < list.size(); i++) {
		Employee employee2 = list.get(i);
		System.out.println(employee2.getName());
		System.out.println(employee2.getEmployeeId());
	}
	
	
	
	//list iterator
//	List<Integer> list = new LinkedList<>();
//	list.add(1);
//	list.add(2);
//	list.add(3);
//	list.add(4);
//
//	ListIterator<Integer> listIterator = list.listIterator();
//	while (listIterator.hasNext()) {
//		System.out.println(listIterator.next());
//	}
//	
//	while (listIterator.hasPrevious()) {
//		System.out.println(listIterator.previous());
//	}
}
}
