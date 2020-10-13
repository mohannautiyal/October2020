package com.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {

	public static WebDriver driver;

	public WebDriver getDriver(String browserName) {

		if (driver == null) {
            
			if (browserName.equals("chrome")) {
				WebDriverManager.chromedriver().setup();
				ChromeOptions chopt = new ChromeOptions();
				 chopt.addArguments("--headless");
				chopt.addArguments("--incognito");

				driver = new ChromeDriver(chopt);

			} else if (browserName.equals("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				FirefoxOptions fopt = new FirefoxOptions();
				fopt.addArguments("--private");
				driver = new FirefoxDriver(fopt);

			}else {
				
				WebDriverManager.iedriver().setup();
				InternetExplorerOptions ieOpt = new InternetExplorerOptions();
				ieOpt.addCommandSwitches("--private");
				driver= new InternetExplorerDriver(ieOpt);
			}

		}
		return  driver;
	}

	
	public static void main(String[] args) throws InterruptedException {
		driver = new BrowserFactory().getDriver("chrome");
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.quit();
	}
	
}
