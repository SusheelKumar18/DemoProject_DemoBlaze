package com.susheel.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.susheel.utilities.JavaUtils;

public class LoginPage {
	
	WebDriver driver;
	JavaUtils javaUtils;

	@FindBy(id="login2") public WebElement loginBtn1;
	@FindBy(id="loginusername") public WebElement username;
	@FindBy(id="loginpassword") public WebElement password;
	@FindBy(css="button[onclick='logIn()']") public WebElement loginBtn2;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);	
		javaUtils = new JavaUtils();
	}
	
	public void clickOnLoginBtn1() {
		javaUtils.clickOnElement(loginBtn1);
	}
	
	public void enterUserName(String usr) {
		javaUtils.clearAndEnterText(username, usr);
	}
	
	public void enterPassword(String pas) {
		javaUtils.clearAndEnterText(password, pas);
	}
	
	public void clickOnLoginBtn2() {
		javaUtils.clickOnElement(loginBtn2);
	}
	
}
