package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass {
	public String baseUrl="https://www.google.co.in/?";
	public WebDriver driver;
	
	@BeforeTest
	public void setBaseUrl()
	{
		System.setProperty("webdriver.gecko.driver","D:\\Browser\\geckodriver.exe\\");
		driver=new FirefoxDriver();
		driver.get(baseUrl);
	}
	
	@Test
	public void verifyHomePage()
	{
		String expectedTitle="Google";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@AfterTest()
	public void tearDown()
	{
		driver.quit();
		
	}

	 
}
