package com.home.predicate;

import java.util.function.Predicate;

public class Example1 {

	//Predicate Contains abstract method Test
	
	public static void main(String[] args) {

		Predicate<Integer> checkEvenOdd = num ->(num%2==0);
	
		boolean evenOdd =checkEvenOdd.test(11);
	    System.out.println(evenOdd);
	}
}
