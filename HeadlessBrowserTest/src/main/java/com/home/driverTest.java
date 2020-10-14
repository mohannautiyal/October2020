package com.home;

import org.openqa.selenium.WebDriver;

public class driverTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		DriverFactory.getInstance().setDriver(new BrowserFactory().getDriver("chrome"));
		WebDriver driver = DriverFactory.getInstance().getDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		DriverFactory.getInstance().closeDriver();
	}
	
}
