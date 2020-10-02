package com.home.suiteA;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import base.baseClass;

public class TestA2 extends baseClass{

	
	@Test
	public void Test_A2() throws InterruptedException, MalformedURLException {
		System.out.println("Executing Test A2");
		Thread.sleep(2000);
		setUpBrowser("chrome");
		System.out.println("Ending A2");
		driver.quit();
	}

	
}
