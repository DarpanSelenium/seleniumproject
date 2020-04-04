package etl.tours.com;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utilities.etlhive.CommonUtils;

public class HomePage extends CommonUtils{
	WebDriver driver;   // driver
	
	public HomePage(WebDriver driver) {
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="SIGN-ON")
	WebElement Signon;
	@FindBy(linkText="REGISTER")
	WebElement Register;
	@FindBy(linkText="SUPPORT")
	WebElement Support;
	@FindBy(linkText="CONTACT")
	WebElement Contact;
	@FindBy(name="userName")
	WebElement username;
	@FindBy(name="password")
	WebElement password;
	@FindBy(name="login")
	WebElement signin;
	
	
	public boolean clickonRegister() {      // methods for performing above elements
		return(clickSafelyOn(Register));
	}
	
	public boolean clickonSignon() {
		return(clickSafelyOn(Signon));
	}
	
	public void clickonSupport() {
		clickSafelyOn(Support);
	}
   
	public void clickonContact() {
		clickSafelyOn(Contact);
	}
	
	public boolean fillUsername() {
		return(enterSafelyIn(username, "Darpan20"));
	}
	
	public boolean fillPassword() {
		return(enterSafelyIn(password, "Welcome"));
	}
	
	public boolean clickSignIn() {
		return(clickSafelyOn(signin));
	}
	
	public boolean clickonSubmit() {
		return(clickSafelyOn(signin));
	}
	
	public boolean Sreenshot() throws IOException {
		return(takeScreenshot(driver));
	}
	
	
	
	
	
}
