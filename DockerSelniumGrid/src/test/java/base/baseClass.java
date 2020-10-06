package base;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;

public class baseClass {
	
public	WebDriver driver;
	
	public void setUpBrowser(String browsername) throws MalformedURLException {
      
		DesiredCapabilities cap = new DesiredCapabilities();
		String hub="http://192.168.99.100:4444/wd/hub";
		if(browsername.equals("chrome")){
			System.out.println("Setting browser chrome");
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.ANY);
			}
	
		//Chrome Options
				ChromeOptions copt = new ChromeOptions();
				copt.merge(cap);
		driver = new RemoteWebDriver(new URL(hub),cap);
		driver.get("https://freecrm.co.in/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		//driver.quit();
	}
	
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		String browsername="chrome";
		String hub="http://192.168.99.100:4444/wd/hub";
		if(browsername.equals("chrome")){
			System.out.println("Setting browser chrome");
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.LINUX);
			}
	
		//Chrome Options
				ChromeOptions copt = new ChromeOptions();
				copt.merge(cap);
				WebDriver  driver = new RemoteWebDriver(new URL(hub),cap);
		driver.get("https://freecrm.co.in/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.quit();
	}
	
	
	@AfterTest
	public void close() {
		if(driver!=null)
		driver.quit();
	}

}
