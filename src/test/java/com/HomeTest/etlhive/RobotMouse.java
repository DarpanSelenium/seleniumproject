package com.HomeTest.etlhive;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RobotMouse {
	
	@Test
	 public void f4() throws InterruptedException, AWTException{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\darpan19\\Desktop\\eclipse-jee-oxygen-1-win32-x86_64\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://file-examples.com/index.php/sample-documents-download/sample-doc-download/");
	 WebElement ele=driver.findElement(By.xpath("//*[@id='table-files']/tbody/tr[1]/td[5]/a[1]"));
	 ele.click();
	 Thread.sleep(10000);
	 Robot rb=new Robot();
	 rb.mouseMove(194, 697);
	 rb.mousePress(InputEvent.BUTTON1_DOWN_MASK);
	 rb.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	 Thread.sleep(2000);
	 rb.mouseMove(200, 641);
	 Thread.sleep(2000);
	 rb.mousePress(InputEvent.BUTTON1_DOWN_MASK);
	 rb.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	 Thread.sleep(5000);
	 rb.mouseMove(313, 247);
	 rb.mousePress(InputEvent.BUTTON1_DOWN_MASK);
	 rb.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	 //driver.close();

}
}