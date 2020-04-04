package com.HomeTest.etlhive;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import etl.tours.com.HomePage;

public class TestHomePage {
    
	//@Test(dataProvider = "testData", dataProviderClass = DataProviderdemo.class)
	@Test
	@Parameters({"username"})
	public void loginpage(String args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\darpan19\\Desktop\\eclipse-jee-oxygen-1-win32-x86_64\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// Creating object of base classes
		HomePage hm = new HomePage(driver);      // test scripts for calling the main function by creating object // d
		
		// Test Steps starts. Test Step 1
		driver.get("http://newtours.demoaut.com/");
		/*
		 * Random rn=new Random(); 
		 * int randomint=rn.nextInt(1000); 
		 * TakesScreenshot scr=((TakesScreenshot)driver); 
		 * File scrfile=scr.getScreenshotAs(OutputType.FILE); 
		 * File destfile=new File("C:\\Users\\darpan19\\Screenshot\\"+ randomint+".png");
		 * FileHandler.copy(scrfile, destfile);
		 */
     
		/*
		 * WebElement link= driver.findElement(By.linkText("SIGN-ON")); Actions act =
		 * new Actions(driver);
		 * act.contextClick(link).keyDown(Keys.CONTROL).click().perform();
		 */
		
		//Test Step 3.
		Assert.assertTrue(hm.clickonSignon()," signon clicked sucessfully"); 
		Assert.assertTrue(hm.fillUsername(),"username selected succesfully");
		Assert.assertTrue(hm.fillPassword(),"password selected succesfully");
		Assert.assertTrue(hm.Sreenshot(), "screenshot taken succesfully");
		Assert.assertTrue(hm.clickonSubmit()," submit button clicked");
		Assert.assertTrue(hm.Sreenshot(), "screenshot taken succesfully");
		//driver.close();
		 
		
		//Test Step2. Click on Register
		//hm.clickonRegister();
		
		
		 // Assert.assertTrue(hm.clickonRegister(), "clicking on signon");
		  //System.out.println("click on register is succesfull");
		 
		
		
		
		
		

	}

}
