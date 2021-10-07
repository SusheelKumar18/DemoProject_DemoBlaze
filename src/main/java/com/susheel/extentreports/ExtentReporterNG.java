package com.susheel.extentreports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

//ExtentReports
//ExtentSparkReporter

public class ExtentReporterNG {

	ExtentReports extent;
	
	public ExtentReports cofigExtentReport() {
		String filePath = System.getProperty("user.dir") + "/demoBlazeTesting/test-output";
		ExtentSparkReporter reporter = new ExtentSparkReporter(filePath);
		reporter.config().setReportName("DemoBlaze Testing Results");
		reporter.config().setDocumentTitle("Reports");

		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "tim");

		return extent;

	}
}