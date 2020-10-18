package com.home.predicate;

import java.util.function.Predicate;

public class Example4 {
	
	// Joining Predicate and , or and negate
	
	public static void main(String[] args) {
		
		Predicate<Integer> check1 = num -> (num>10);
		Predicate<Integer> check2 = num -> (num%2==0);
		
		boolean status = check1.and(check2).test(12);
		System.out.println(status);
		

		status = check1.and(check2).test(11);
		System.out.println(status);
		
		
		status = check1.or(check2).test(11);
		System.out.println(status);
		
		status = check1.or(check2).negate().test(11);
		System.out.println(status);
	}
	

}
