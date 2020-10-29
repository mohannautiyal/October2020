package com.home.streams;

import java.util.Arrays;
import java.util.List;

public class Example2 {
	
	
	public static void main(String[] args) {
		
		// distinct and count
		List<Integer> numbers = Arrays.asList(2,2,3,4,5,6,77,88,6,77);
		long distinct =numbers.stream().distinct().count();
	    System.out.println(distinct);
	    
	    // Limit
	    numbers.stream().limit(4).forEach(n ->System.out.print(n+" "));
	
	}

}
