package com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenrator {

	public static ExtentReports extent;
	
	public static ExtentReports getReports() {
		
		String reportpath="C:\\Users\\Dell\\eclipse-workspace\\Vision_Nov\\Reports\\index.html" ;
	
		ExtentSparkReporter reporter=new ExtentSparkReporter(reportpath);
		reporter.config().setDocumentTitle("Automation Report -Vision");
		reporter.config().setReportName("Vision System -AutoReport");
		reporter.config().setTheme(Theme.DARK);
		
		extent =new ExtentReports();
		extent.attachReporter(reporter);
		
		extent.setSystemInfo("Project Name", "Vision Project");
		extent.setSystemInfo("version ", "1.4.1");
		extent.setSystemInfo("Browser name", "Chrome");
		extent.setSystemInfo("QA", "XYZ");
		return extent;
		
	}
}
