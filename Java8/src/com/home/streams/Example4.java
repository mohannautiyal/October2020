package com.home.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Example4 {

	public static void main(String[] args) {
		
		// Sorted
		List<Integer> numbers = Arrays.asList(2,4,15,1,6,7,1,77,22,3);
		numbers.stream().sorted().forEach(n->System.out.print(n+" "));
		System.out.println("\n Reverse Order ");
		numbers.stream().sorted(Comparator.reverseOrder()).forEach(n->System.out.print(n+" "));

		
		System.out.println("\n******** Any Match / All Match ***********");
		boolean b =numbers.stream().anyMatch(n -> n>10);
		System.out.println(b);

		boolean b1 =numbers.stream().allMatch(n -> n>0);
		System.out.println(b1);
	
	 Optional numb=numbers.stream().filter(n->n>20).findAny();
	 System.out.println(numb.get());
	 

	 Optional num=numbers.stream().sorted().filter(n->n>20).findFirst();
	 System.out.println(num.get());
	}

}
