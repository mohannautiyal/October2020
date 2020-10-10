package com.home.suiteA;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import base.baseClass;

public class TestA1 extends baseClass{
	
	@Test
	public void Test_A1() throws InterruptedException, MalformedURLException {
		System.out.println("Executing Test A1");
		setUpBrowser("firefox");
		Thread.sleep(2000);
		System.out.println("Ending A1");
	}

}
