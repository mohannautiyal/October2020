package com.home.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ExampleFilter {

	public static void main(String[] args) {

		
		Predicate<Employee> salaryaboveavg = emp -> emp.getSalary() > 1500;
		
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("Raj",10,2000));
		employees.add(new Employee("Shyam",12,3000));
		employees.add(new Employee("Suraj",15,1000));
		employees.add(new Employee("Vinaj",14,1600));
		
		List<Employee> HighSalaryEmp =employees.stream().filter(salaryaboveavg).collect(Collectors.toList());
		HighSalaryEmp.stream().forEach(emp -> System.out.println(emp));
	
	
	}

}
