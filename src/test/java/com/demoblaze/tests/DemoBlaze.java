package com.demoblaze.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.susheel.listeners.ListenersClass;
import com.susheel.pages.CheckOutPage;
import com.susheel.pages.HomePage;
import com.susheel.pages.LaptopPage;
import com.susheel.pages.LoginPage;
import com.susheel.testbase.TestBase;

import io.github.bonigarcia.wdm.WebDriverManager;

	@Listeners(com.susheel.listeners.ListenersClass.class)
	

public class DemoBlaze extends TestBase {
		
		ListenersClass listener;

	@BeforeClass
	public void setUp() {
		loginPage = new LoginPage(driver);
		homePage = new HomePage(driver);
		laptopPage = new LaptopPage(driver);
		checkOutPage = new CheckOutPage(driver);
		listener = new ListenersClass();
	}

	@Test(priority = 1)
	public void logInPage() {

		loginPage.clickOnLoginBtn1();
	//	eTest.log(Status.PASS, "Click On Login Button");
		loginPage.enterUserName(pHelper.getUsername());
	//	eTest.log(Status.PASS, "Enter Username");
		loginPage.enterPassword(pHelper.getPassword());
	//	eTest.log(Status.PASS, "Enter Password");
		loginPage.clickOnLoginBtn2();
	//	eTest.log(Status.PASS, "Click On Login Button");
		
	}

	@Test(priority = 2)
	public void validateUser() throws InterruptedException {
		
		Thread.sleep(5000);
		String user = driver.findElement(By.xpath("//div[@id='navbarExample']/ul/li[7]")).getText();
		
		Assert.assertEquals(user, "Welcome tom894");
		
		System.out.println("Invalid User"); // to test git testBranch
		System.out.println("commit 3");
	}

	@Test(priority = 3)
	public void clickOnLaptops() {

		homePage.clickOnLaptopField();
	//	eTest.log(Status.PASS, "Click On Laptop Field");
	}

	@Test(priority = 4)
	public void selectAnyLaptop() {

		laptopPage.selectAnyLaptop();
	//	eTest.log(Status.PASS, "Select Any Laptop");
	}

	@Test(priority = 5)
	public void validateAndAddLaptopToCart() {

		String laptopPrice = driver.findElement(By.xpath("//div[@id='tbodyid']/h2")).getText();
		Assert.assertEquals(laptopPrice, "MacBook air");
	//	eTest.log(Status.PASS, "MacBook air Is Selected");

		laptopPage.addLaptopToCart();
	//	eTest.log(Status.PASS, "Add Laptop To Cart");
	}

	@Test(priority = 6)
	public void placingOrder() {

		checkOutPage.clickOnPlaceOrder();
	//	eTest.log(Status.PASS, "Click On Place Order");

	}

	@Test(priority = 7)
	public void placingOrder_customerDetails() throws InterruptedException {
		
		Thread.sleep(3000);
		checkOutPage.enterFirstname(pHelper.getFirstname());
	//	eTest.log(Status.PASS, "Enter Firstname");
		checkOutPage.enterCountry(pHelper.getCountry());
	//	eTest.log(Status.PASS, "Enter Country");
		checkOutPage.enterCard(pHelper.getCard());
	//	eTest.log(Status.PASS, "Enter Card");
		checkOutPage.enterMonth(pHelper.getMonth());
	//	eTest.log(Status.PASS, "Enter Month");
		checkOutPage.enterYear(pHelper.getYear());
	//	eTest.log(Status.PASS, "Enter Year");
		checkOutPage.clickOnPurchase();
	//	eTest.log(Status.PASS, "Click Purchase");
	}

}
