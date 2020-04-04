package com.cucumber.project;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	WebDriver driver;
	@FindBy(name="q") WebElement searchBox;
	 @FindBy(xpath="//ul[@class='erkvQe']/li[1]") WebElement firstItem;
	 
@Given("^User opens \"([^\"]*)\" url$")
public void openGooglepage(String url) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\darpan19\\Desktop\\eclipse-jee-oxygen-1-win32-x86_64\\chromedriver.exe");
	
	driver = new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
}
@When("^User enters \"([^\"]*)\" in the search box$")
public void searchString(String text) throws InterruptedException {
	PageFactory.initElements(driver, this);
	 searchBox.click();
	 searchBox.sendKeys(text);
	 Thread.sleep(5000);	
}
@And("^User selects first option$")
public void selectOption(){
 
 firstItem.click();
}
@Then("^Result page should appear$")
public void result(){
 if(driver.getTitle().contains("selenium - Google Search")){
  System.out.println("Search successful");
  driver.close();
 }else{
  throw new RuntimeException("Results page didnot appear");
 }
}	
	
	
}
	
	
	
	
	
	
	


