package com.home.suiteB;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import base.baseClass;

public class TestB1 extends baseClass {
	
	
	@Test(priority=1)
	public void Test_B1() throws InterruptedException, MalformedURLException {
		System.out.println("Executing Test B1");
		Thread.sleep(2000);
		setUpBrowser("chrome");
		System.out.println("Ending B1");
	}


	@Test(priority=2)
	public void Test_BA1() {
		System.out.println("Executing Test BA1");
		
		System.out.println(driver.getCurrentUrl());
	}
}
