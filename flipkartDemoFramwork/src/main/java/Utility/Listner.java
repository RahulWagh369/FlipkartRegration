package Utility;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import BaseClass.Base;


public class Listner extends Base implements ITestListener {
	
	ExtentTest test;
	ExtentReports extent  = ExtentReportClass.Report();
	
	ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>();
	
	public void onTestStart(ITestResult result) {
		test=extent.createTest(result.getMethod().getMethodName());
		extentTest.set(test);
	}
	
	public void onTestSuccess(ITestResult result) {
	  extentTest.get().log(Status.PASS, "Test Pass");
	}
	
	public void onTestFailure(ITestResult result) {
		
		extentTest.get().log(Status.FAIL, "Test failed");
		
		String testmethodname =result.getMethod().getMethodName();
		
//		try {
//			driver = (WebDriver) result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
//		} 
//		catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		try {
			extentTest.get().addScreenCaptureFromPath(GenricUtilsx.getScreenshotAs(),result.getMethod().getMethodName());
		} 
		catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
			
		}
		
	

	public void onFinish(ITestContext context) {
		
		extent.flush();
		
	}

	
}
