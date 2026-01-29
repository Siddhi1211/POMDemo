package com.javaClasses.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest {

	protected static WebDriver driver;
	@Parameters("browser")
    @BeforeMethod
	public static void SetUp(@Optional("Chrome")String browser)
	{
		switch(browser)
		{
		case "Chrome":
				driver = new ChromeDriver();
				break;
		case "Firefox":
				driver = new FirefoxDriver();
				break;
		default:
				System.out.println("Invalid Browser Name");
		}
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		System.out.println(driver.getTitle());
		
	}
    
    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
	
}
