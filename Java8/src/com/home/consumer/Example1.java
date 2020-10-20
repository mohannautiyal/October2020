package com.home.consumer;

import java.util.function.Consumer;

public class Example1 {

	// Consumer contains Accept method It doesn't return any value
	// single parameter as input and returns nothing
	
	public static void main(String[] args) {
		
		Consumer<Integer> tables = num -> {
			for(int i=1;i<=10;i++)
				System.out.println(num +" * " + i+" = " + (num*i));
		};
		
		
		tables.accept(10);
	}
}
