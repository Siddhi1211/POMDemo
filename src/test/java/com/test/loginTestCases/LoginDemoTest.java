package com.test.loginTestCases;

import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.javaClasses.LoginPage;
import com.javaClasses.Base.BaseTest;

public class LoginDemoTest extends BaseTest {

	@Test
	public void userLogIn() {
		System.out.println("I am inside POM");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("Admin", "admin123@gmail.com");
	}
	
	//@Test
	public void testFailure()
	{
		Assert.fail("Failed Test Case");
	}
}
