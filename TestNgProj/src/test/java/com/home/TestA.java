package com.home;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class TestA {
	
	
	
	@Test
	public void TestA1(ITestContext context) {
		System.out.println("Executing test A1");
		context.setAttribute("TestName", "A1");
		int n=10;
		context.setAttribute("number", n);
		
		
	}
	
	@Test
	public void TestA2(ITestContext context) {
		System.out.println("Executing test A2");
		String prevTest =context.getAttribute("TestName").toString();
		System.out.println(prevTest +" " + context.getAttribute("number"));
		
		
		
	}
	

}
