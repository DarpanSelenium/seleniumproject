package com.Utilities.etlhive;

import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonUtils {     // common methods for the page elements
	WebDriver driver ; 
	
	
	 public CommonUtils(WebDriver driver) {
		 this.driver= driver;
	 }
	
	 
	public boolean clickSafelyOn(WebElement ele) {      // common click method for all pages
		try {
		WebDriverWait wait = new WebDriverWait(driver, 20);     // explicit wait
		wait.until(ExpectedConditions.visibilityOf(ele));
			ele.click();
			return true;
		}catch(NoSuchElementException ex) {
			return false;
		}
	}

	public boolean enterSafelyIn(WebElement ele , String text) {   // common enter fields data
		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);     // explicit wait
			wait.until(ExpectedConditions.visibilityOf(ele));
			ele.sendKeys(text);
			return true;
		}catch(NoSuchElementException ex) {
			return false;
		}
	}

	public boolean selectFromDropdown(WebElement ele , String text) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);     // explicit wait
			wait.until(ExpectedConditions.visibilityOf(ele));
		   Select dropdown = new Select(ele);
		dropdown.selectByVisibleText(text);
		return true;
		}catch(NoSuchElementException ex) {
		 return false;
	}
			
	}
	
	public boolean takeScreenshot(WebDriver driver) throws IOException {
     try {
	Random rn=new Random(); 
	int randomint=rn.nextInt(1000); 
	TakesScreenshot scr=((TakesScreenshot)driver); 
	File scrfile=scr.getScreenshotAs(OutputType.FILE); 
	File destfile=new File("C:\\Users\\darpan19\\Screenshot\\"+ randomint+".png");
	FileHandler.copy(scrfile, destfile);
	return true;
	}catch(NoSuchElementException ex) {
		return false;
	}
}
	
	
	}



	

	
	

