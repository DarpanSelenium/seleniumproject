package com.HomeTest.etlhive;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerEvent implements ITestListener {

	public void onTestStart(ITestResult result) {
	  System.out.println("Test Case execution started");
	  Reporter.log("Test Case execution started");
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Case passed");
		  Reporter.log("Report Test Case passed");
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test Case failed");
		  Reporter.log("Report Test Case failed");
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
