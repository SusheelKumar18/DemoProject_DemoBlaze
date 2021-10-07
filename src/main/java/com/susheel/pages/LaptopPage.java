package com.susheel.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.susheel.utilities.JavaUtils;

public class LaptopPage {
	
	WebDriver driver;
	JavaUtils javaUtils;

	@FindBy(xpath="//a[@class='hrefch' and text()='MacBook air']") public WebElement selectDesiredLaptop;
	@FindBy(xpath="//a[@onclick='addToCart(11)']") public WebElement addSelectedLaptopToCart;
	@FindBy(id="cartur") public WebElement cartBtn;
	
	public LaptopPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		javaUtils = new JavaUtils();
	}
	
	public void selectAnyLaptop() {
		javaUtils.clickOnElement(selectDesiredLaptop);
	}
	
	public void addLaptopToCart() {
		javaUtils.clickOnElement(addSelectedLaptopToCart);
		javaUtils.clickOnElement(cartBtn);
	}
}
