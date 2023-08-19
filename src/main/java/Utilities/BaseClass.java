package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public WebDriver driver;
	
	@BeforeMethod
	public void browserLaunch()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	@AfterMethod
	public void shutDown()
	{
		driver.quit();
	}

}
