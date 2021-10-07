package com.susheel.testbase;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.susheel.extentreports.ExtentReporterNG;
import com.susheel.pages.CheckOutPage;
import com.susheel.pages.HomePage;
import com.susheel.pages.LaptopPage;
import com.susheel.pages.LoginPage;
import com.susheel.prophelper.PropertiesHelper;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public WebDriver driver;
	public PropertiesHelper pHelper;
	public LoginPage loginPage;
	public HomePage homePage;
	public LaptopPage laptopPage;
	public CheckOutPage checkOutPage;
	
//	public ExtentTest eTest;
//	ExtentReporterNG extentReporterNG = new ExtentReporterNG();
//	ExtentReports extent = extentReporterNG.cofigExtentReport();
//	
//	@BeforeMethod
//	public void setUpExtent(Method method) {
//		eTest = extent.createTest(method.getName());
//	}
//	
//	@AfterClass
//	public void tearDownExtent() {
//		extent.flush();
//	}
	
	@BeforeTest
	public void browserSetUp() throws IOException {
		// System.setProperty("webdriver.chrome.driver",
		// System.getProperty("user.dir")+"/src/test/resources/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		pHelper = new PropertiesHelper();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(pHelper.getUrl());
	}

}
