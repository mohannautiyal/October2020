package com.home.supplier;

import java.util.Date;
import java.util.function.Supplier;

public class Example1 {

	
	// Supplier doesn't take any argument but returns value
	// get method
	public static void main(String[] args) {

		
		Supplier sup = () -> new Date();
		System.out.println(sup.get());
	}

}
