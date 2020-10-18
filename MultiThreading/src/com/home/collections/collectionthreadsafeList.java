package com.home.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class collectionthreadsafeList {

	public static void main(String[] args) {


		List<Integer> numbers = Collections.synchronizedList(new ArrayList<Integer>());
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		
		synchronized(numbers){
			for(int n:numbers)
				System.out.println(n);
		}
	}

}
