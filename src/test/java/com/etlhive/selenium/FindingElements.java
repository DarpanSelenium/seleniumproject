package com.etlhive.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingElements {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\darpan19\\Desktop\\eclipse-jee-oxygen-1-win32-x86_64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();  
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement footer = driver.findElement(By.className("footer"));   //     get text from page   // footer.getAttribute("value") , footer.getAttribute("InnerText"), footer.getAttribute("OuterText")
		System.out.println(footer.getText());
		
		
		
	WebElement reg = driver.findElement(By.linkText("REGISTER"));
		reg.click();
	    //driver.close();
		if( driver.getTitle().equalsIgnoreCase("Register: Mercury Tours"))    // get title of page
		{
	WebElement FN = driver.findElement(By.name("firstName"));
	FN.sendKeys("Darpan");
	WebElement LN  =driver.findElement(By.name("lastName"));
	LN.sendKeys("Parnami");
	WebElement Phone  =driver.findElement(By.name("phone"));
	Phone.sendKeys("9989100880");
    WebElement Email = driver.findElement(By.id("userName"));
    Email.sendKeys("darpan.parnami@gmail.com");
    
    WebElement add1 = driver.findElement(By.name("address1"));
    add1.sendKeys("pimple saudagar");
    
    WebElement add2 = driver.findElement(By.name("address2"));
    add2.sendKeys("etlhive");
    
    WebElement city = driver.findElement(By.name("city"));
    city.sendKeys("pune");
    
    
 
    driver.close();
	}else {
		throw new RuntimeException("Register page is not opened");
	}

}
}

