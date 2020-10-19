package com.home.Function;

import java.util.function.Function;

public class Example1 {
	
	
	// Function interface has one method apply. It returns single value
	// It needs two arguments. One is the input type and the other the return value
	
	Function<Integer,Integer> squareNum = x -> x*x;
	public static void main(String[] args) {
	 int squareval=	new Example1().squareNum.apply(20);
	 System.out.println(squareval);
	 
	 Function<String,Integer> lenOfStr = x ->x.length();
	 int len = lenOfStr.apply("Find My Length");
	 System.out.println(len);
	}

}
