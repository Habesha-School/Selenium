package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	WebDriver driver ; 
	private static String registraionPageURL = "http://newtours.demoaut.com/mercuryregister.php";
	// constructor that run by the time you call Home page class
	public RegistrationPage(WebDriver driver){
		this.driver=driver;
		driver.equals(registraionPageURL);
		PageFactory.initElements(driver,  this);
	}
	@FindBy(name="firstName") public WebElement fName;
	
	@FindBy(name="lastName") public WebElement lName;
	@FindBy(name="phone") public WebElement phone;
	@FindBy(id="userName") public WebElement email;
	@FindBy(name="register") public WebElement register;
	// takes your driver and returns you the current title of the page
	public String getTitle(WebDriver driver){
		return driver.getTitle();
	}
	public void fill(String fname, String lName, String phone, String email){
		this.fName.sendKeys(fname);
		this.lName.sendKeys(lName);
		this.phone.sendKeys(phone);
		this.email.sendKeys(email);
		register.click();
	}
}
