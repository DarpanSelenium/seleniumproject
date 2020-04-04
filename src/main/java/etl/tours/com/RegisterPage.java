package etl.tours.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utilities.etlhive.CommonUtils;

public class RegisterPage extends CommonUtils {
	WebDriver driver;
	
	public RegisterPage(WebDriver driver) {
		super(driver);
		this.driver= driver;
	PageFactory.initElements(driver, this);	
	}
	
	@FindBy(name="firstName")
	WebElement Fname;
	@FindBy(name="lastName")
	WebElement Lname;
	@FindBy(name="phone")
	WebElement Phone;
	@FindBy(id="userName")
	WebElement Uname;
	@FindBy(name="address1")
	WebElement Address;
	@FindBy(name="city")
	WebElement City;
	@FindBy(name="state")
	WebElement State;
	@FindBy(name="postalCode")
	WebElement PostalCode;
	@FindBy(name="country")
	WebElement country;
	@FindBy(name="email")
	WebElement username;
	@FindBy(name="password")
	WebElement password;
	@FindBy(name="confirmPassword")
	WebElement confirmpassword;
	@FindBy(name="register")
	WebElement submit;
	

	public boolean enterFirstName() {
		return(enterSafelyIn(Fname , "Darpan"));
	}
	
	public boolean enterLastName() {
		return(enterSafelyIn(Lname , "Parnami"));
	}
	
	public boolean enterPhone() {
		return(enterSafelyIn(Phone , "9989100880"));
	}
	
	public boolean enterUname() {
		return(enterSafelyIn(Uname , "darpan.parnami@gmail.com"));
	}
	
	public boolean enterAddress() {
		return(enterSafelyIn(Address , "PimpleSaudagar"));
	}
	
	public boolean enterCity() {
		return(enterSafelyIn(City , "Pune"));
	}
	
	public boolean enterState() {
		return(enterSafelyIn(State , "Maharashtra"));
		
	}
	public boolean enterPostalCode() {
		return(enterSafelyIn(PostalCode , "411027"));
	}
	
	public boolean selectCountry() {
		return(selectFromDropdown(country, "INDIA "));
	}
	
	public boolean selectUsername() {
		return(enterSafelyIn(username, "Darpan20"));
	}
	
	public boolean selectPassword() {
		return(enterSafelyIn(password, "Welcome"));
	}
	
	public boolean selectConfirmPassword() {
		return(enterSafelyIn(confirmpassword, "Welcome"));
	}
	
	public boolean clickSubmitButton() {
		return(clickSafelyOn(submit));
	}
	
	

	
	
	
	
	
	
	
	
	

}
