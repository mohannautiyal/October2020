package com.home.Map;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import com.home.streams.Employee;

//Map helps us to transform the data in the collection
public class Example1 {
	
	public static void main(String[] args) {
		
		
      Function<Employee,Employee> NameToUpper =emp-> new Employee(emp.name.toUpperCase(),emp.getEmpNo(),emp.getSalary()); 
		
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("Raj",10,2000));
		employees.add(new Employee("Shyam",12,3000));
		employees.add(new Employee("Suraj",15,1000));
		employees.add(new Employee("Vinaj",14,1600));
		
		employees.stream().map(NameToUpper).forEach(emp -> System.out.println(emp));
	}
	

	
}
