package com.home.FlatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example1 {

	
	public static void main(String[] args) {
		
		
		List<Integer> list1 = Arrays.asList(1,2,3);
		List<Integer> list2 = Arrays.asList(4,5,6);
		List<Integer> list3 = Arrays.asList(7,8);
		List<List<Integer>> collatedList = Arrays.asList(list1,list2,list3);

		List<Integer> finalList =collatedList.stream().flatMap(sublist ->sublist.stream()).collect(Collectors.toList());
		finalList.stream().forEach(x->System.out.println(x));

	}
}
