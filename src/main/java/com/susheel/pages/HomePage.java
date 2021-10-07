package com.susheel.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.susheel.utilities.JavaUtils;

public class HomePage {
	
	WebDriver driver;
	JavaUtils javaUtils;
	
	@FindBy(xpath="//div[@class='list-group']/a[3]") public WebElement laptopField;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		javaUtils = new JavaUtils();
	}
	
	public void clickOnLaptopField() {
		javaUtils.clickOnElement(laptopField);
	}

}
