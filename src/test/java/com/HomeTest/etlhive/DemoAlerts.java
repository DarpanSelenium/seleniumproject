package com.HomeTest.etlhive;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DemoAlerts {

	@Test
	public void openBrowsernew() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\darpan19\\Desktop\\eclipse-jee-oxygen-1-win32-x86_64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://thedemosite.co.uk/login.php");
		WebElement login = driver.findElement(By.name("FormsButton2"));
		Thread.sleep(2000);
		login.click();
		Alert al = driver.switchTo().alert();
		al.accept();
		driver.close();
	}
}

// IFrames 

/*
 * driver.get("http://the-internet.herokuapp.com/iframe");
 * driver.switchTo().frame(0);
 *  WebElement body=driver.findElement(By.id("tinymce")); 
 *  body.clear(); 
 * Actions act = new Actions(driver); 
 * act.keyDown(Keys.TAB).build().perform();
 * act.keyUp(Keys.TAB).build().perform(); 
 * body.sendKeys("Iframe Test");
 * Thread.sleep(2000); 
 * driver.switchTo().defaultContent(); 
 * WebElement abc=driver.findElement(By.id("mceu_15-open")); 
 * abc.click();
 */
