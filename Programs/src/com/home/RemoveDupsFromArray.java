package com.home;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDupsFromArray {
	
	
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(10);
		numbers.add(20);
		
		numbers.stream().distinct().forEach(x ->System.out.print(x+" "));
		System.out.println("\n"+" ==================================");
		Set<Integer> distinctNum = new HashSet<Integer>();
		distinctNum.addAll(numbers);
		distinctNum.stream().forEach(x ->System.out.print(x+" "));
	}

}
