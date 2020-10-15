package com.home;

public class runnerFunctional {

	
	public static void main(String[] args) {
		MyInterface func = new FunctionalA();
		func.FunctionalProgramming();
		
		
		MyInterface lamdafunc = () -> System.out.println("Welcome to Lambda expression");
		lamdafunc.FunctionalProgramming();
		
		// Calculator functional interface
		Calculator addcalc = (a,b)->System.out.println("Sum is "+(a+b));
		addcalc.calculate(10, 15);
	}
}
