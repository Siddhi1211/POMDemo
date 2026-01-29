package com.javaClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	 private WebDriver driver;

	    // Locators
	    private By username = By.id("name");
	    private By email = By.id("email");

	    // Constructor
	    public LoginPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    // Page Actions
	    public void enterUsername(String user) {
	        driver.findElement(username).sendKeys(user);
	    }

	    public void enterEmail(String pass) {
	        driver.findElement(email).sendKeys(pass);
	    }
	    
	    public void login(String user, String email) {
	        enterUsername(user);
	        enterEmail(email);
	    }
}
