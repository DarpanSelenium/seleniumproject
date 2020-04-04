package com.HomeTest.etlhive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoMethods {

	@Test(priority=0)
	public void test() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\darpan19\\Desktop\\eclipse-jee-oxygen-1-win32-x86_64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		System.out.println(" test is running");
		driver.close();
	}
	
	@Test(priority=0)
	public void apple() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\darpan19\\Desktop\\eclipse-jee-oxygen-1-win32-x86_64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		System.out.println(" apple is running");
		driver.close();
		
	}
	
	@Test(priority=2)
	public void screen() {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\darpan19\\Desktop\\eclipse-jee-oxygen-1-win32-x86_64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		System.out.println(" screen is running");
		driver.close();
	}
	
	@Test(priority=3)
	public void fruit() {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\darpan19\\Desktop\\eclipse-jee-oxygen-1-win32-x86_64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println(" fruit is running");
		driver.close();
	}
	
	
	
}
