package com.home;

import org.openqa.selenium.WebDriver;

public class DriverFactory {
	
	private DriverFactory() {
		
			}
	
	
	public static DriverFactory instance = new DriverFactory();
	
	public static DriverFactory getInstance() {
		return instance;
		
	}
	
	
	ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	
	public WebDriver getDriver() {
		return driver.get();
	}
	
	public void setDriver(WebDriver driverparam) {
		driver.set(driverparam);
	}
	
	public void closeDriver() {
		driver.get().close();
		driver.remove();
	}

}
