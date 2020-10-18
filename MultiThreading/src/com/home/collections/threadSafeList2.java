package com.home.collections;

import java.util.concurrent.CopyOnWriteArrayList;

public class threadSafeList2 {
	
	
	public static void main(String[] args) {
		CopyOnWriteArrayList<Integer> numbers =new CopyOnWriteArrayList<Integer>();
		numbers.add(20);
		numbers.add(40);
		numbers.add(14);
		
		for(int n:numbers) {
			System.out.println(n);
		}
		
	}

}
