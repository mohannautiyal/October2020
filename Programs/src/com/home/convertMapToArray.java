package com.home;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class convertMapToArray {

	public static void main(String[] args) {

		Map<String,Integer> students = new HashMap<>();
		students.put("Mohan", 2000);
		students.put("Rohan", 3000);
		students.put("Sohan", 4000);
		students.put("Tanishq", 5000);
		
		List<String> names = new ArrayList<>(students.keySet());
		List<Integer> fee = new ArrayList<>(students.values());
		
		System.out.println(names);
		System.out.println(fee);
		
		
		
	}

}
