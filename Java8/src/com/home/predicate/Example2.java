package com.home.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example2 {

	// Find even numbers from a list
	public static void main(String[] args) {

		List<Integer> num = Arrays.asList(10,22,13,45,17,20,36,40);
		
		List<Integer> even =num.stream().filter(n -> (n%2==0)).collect(Collectors.toList());
		even.stream().forEach(System.out::println);
		
	}

}
