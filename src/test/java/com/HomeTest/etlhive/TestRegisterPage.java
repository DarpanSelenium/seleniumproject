package com.HomeTest.etlhive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import etl.tours.com.HomePage;
import etl.tours.com.RegisterPage;
@Listeners(ListenerEvent.class)
public class TestRegisterPage {

	    @Test
		public void openBrowser() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\darpan19\\Desktop\\eclipse-jee-oxygen-1-win32-x86_64\\chromedriver.exe");
		
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			// Creating object of base classes
			HomePage hm = new HomePage(driver); // test scripts for calling the main function by creating object // d
			RegisterPage rp = new RegisterPage(driver);
			// Test Steps starts. Test Step 1
			Thread.sleep(1000);
			driver.get("http://newtours.demoaut.com/");
			//Test Step2. Click on Register
			hm.clickonRegister();
			
			Assert.assertTrue(hm.clickonRegister(), "Click register succesfully");
			Assert.assertTrue(rp.enterFirstName(), "FName entered succesfully");
			Assert.assertTrue(rp.enterLastName(), "Lname entered succesfully");
			Assert.assertTrue(rp.enterPhone(), "Phone entered succesfully");
			Assert.assertTrue(rp.enterUname(), "Uname entered succesfully");
			Assert.assertTrue(rp.enterAddress(), "Address entered succesfully");
			Assert.assertTrue(rp.enterCity(), "City entered succesfully");
			Assert.assertTrue(rp.enterState(), "State entered succesfully");
			Assert.assertTrue(rp.enterPostalCode(), "PosalCode entered succesfully");
			Assert.assertTrue(rp.selectCountry()," Country selected succefully");
			Assert.assertTrue(rp.selectUsername(), " Username selected succesfully");
			Assert.assertTrue(rp.selectPassword(), "password selected susccesfuly");
			Assert.assertTrue(rp.selectConfirmPassword()," confirmpassword selected succesfully");
			Assert.assertTrue(rp.clickSubmitButton(), " register button clicked");
			Thread.sleep(5000);
			driver.close();

	}

}
