package com.home.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Example3 {
	
	public static void main(String[] args) {
		
		Predicate<Employee> valuedEmployee = emp -> (emp.salary < 1500 && emp.experience >5);
		
		Employee emp1 = new Employee("Raj",1200,5);
		Employee emp2 = new Employee("Vijay",1000,10);
		Employee emp3 = new Employee("Shyam",1400,8);

		System.out.println(valuedEmployee.test(emp1));
		System.out.println(valuedEmployee.test(emp2));
		System.out.println(valuedEmployee.test(emp3));

		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		
		employees.stream().filter(valuedEmployee).collect(Collectors.toList()).forEach(emp ->System.out.println(emp.empName));

		
	}
	
       
}

class Employee{
	
	String empName;
	int salary;
	int experience;
	
	public Employee(String empName,int salary,int experience) {
		this.empName = empName;
		this.salary=salary;
		this.experience = experience;
	}
	
	
	
}
