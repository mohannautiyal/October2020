package com.home.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Example1 {

	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("Raj",10,2000));
		employees.add(new Employee("Shyam",12,3000));
		employees.add(new Employee("Suraj",15,1000));
		employees.add(new Employee("Vinaj",14,2000));
		Predicate<Employee> nameLength = e -> e.getName().length() > 2;
		boolean namecheck = employees.stream().allMatch(nameLength);
		System.out.println(namecheck);
	}
}
