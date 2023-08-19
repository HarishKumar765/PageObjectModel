package OrangeHrm.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import locators.LoginPageLocators;

public class LoginPageTestCase {
	public static WebDriver driver;

	@Test
	public void testcase() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		LoginPageLocators.username(driver).sendKeys("Admin");
		LoginPageLocators.password(driver).sendKeys("admin123");
		LoginPageLocators.loginButton(driver).click();

	}
}
