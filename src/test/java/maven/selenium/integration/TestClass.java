package maven.selenium.integration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestClass {
	@Test
	public void testMethod(){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.close();
		System.out.println("Selenium-Maven Integration - succesful");
	}
}
