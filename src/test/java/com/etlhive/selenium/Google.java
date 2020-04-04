package com.etlhive.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\darpan19\\Desktop\\eclipse-jee-oxygen-1-win32-x86_64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();  
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
	    driver.close();
		

	}

	}


