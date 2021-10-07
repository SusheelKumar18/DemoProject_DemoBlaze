package com.susheel.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.susheel.utilities.JavaUtils;

public class CheckOutPage {
	
	WebDriver driver;
	JavaUtils javaUtils;

	@FindBy(xpath="//button[@type='button' and text()='Place Order']") public WebElement placeOrderBtn;
	@FindBy(id="name") public WebElement firstnameField;
	@FindBy(id="country") public WebElement countryField;
	@FindBy(id="card") public WebElement cardField;
	@FindBy(id="month") public WebElement monthField;
	@FindBy(id="year") public WebElement yearField;
	@FindBy(xpath="//button[@type='button' and text()='Purchase']") public WebElement purchaseBtn;
	
	public CheckOutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		javaUtils = new JavaUtils();
	}
	
	public void clickOnPlaceOrder() {
		javaUtils.clickOnElement(placeOrderBtn);
	}
	
	public void enterFirstname(String fn) {
		javaUtils.clearAndEnterText(firstnameField, fn);
	}
	
	public void enterCountry(String cn) {
		javaUtils.clearAndEnterText(countryField, cn);
	}
	
	public void enterCard(String cr) {
		javaUtils.clearAndEnterText(cardField, cr);
	}
	
	public void enterMonth(String mth) {
		javaUtils.clearAndEnterText(monthField, mth);
	}
	
	public void enterYear(String yr) {
		javaUtils.clearAndEnterText(yearField, yr);
	}
	
	public void clickOnPurchase() {
		javaUtils.clickOnElement(purchaseBtn);
	}

}
