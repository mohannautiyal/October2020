package com.home.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Example2 {
	
	
	public static void main(String[] args) {
		Function<Employee,Integer> getBonus = emp -> emp.Salary *10;

		List<Employee> employees  = new ArrayList<Employee>();
		employees.add(new Employee("Raj",2000));
		employees.add(new Employee("Shyam",3000));
		employees.add(new Employee("Dinesh",4000));
		employees.add(new Employee("Brij",5000));
		
		employees.stream().forEach(emp ->{
			System.out.println(emp.empName +" "+getBonus.apply(emp));
			
		});
	}

}


class Employee{
	
	String empName;
	int Salary;
	
	Employee(String empName,int Salary){
		this.empName = empName;
		this.Salary= Salary;
	}
}
