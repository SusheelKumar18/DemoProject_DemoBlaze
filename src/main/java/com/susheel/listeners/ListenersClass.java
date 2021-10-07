package com.susheel.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.demoblaze.tests.DemoBlaze;
import com.susheel.extentreports.ExtentReporterNG;
import com.susheel.testbase.TestBase;

public class ListenersClass implements ITestListener {
	
	public ExtentTest eTest;
	ExtentReporterNG extentReporterNG = new ExtentReporterNG();
	ExtentReports extent = extentReporterNG.cofigExtentReport();

	public void onTestStart(ITestResult result) {
		eTest = extent.createTest(result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println(" Test Case Passed --> " + result.getMethod().getMethodName() + " ");
		eTest.pass(result.getThrowable());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println(" Test Case Failed --> " + result.getMethod().getMethodName() + " ");
		eTest.fail(result.getThrowable());
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println(" Test Case Skipped --> " + result.getMethod().getMethodName() + " ");
		eTest.skip(result.getThrowable());

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onStart(ITestContext context) {

	}

	public void onFinish(ITestContext context) {
		extent.flush();
	}

}
