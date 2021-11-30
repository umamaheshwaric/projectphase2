package phase2project.Mavenjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwiggyApplication {

	
//	public SwiggyApplication(WebDriver driver) {
//		this.driver = driver;
//	}

	public SwiggyApplication(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// for clicking the location to track//
	// By location = By.xpath("//div[@class='_3mZgT']/div/div[2]");
	@FindBy(xpath = "//div[@class='_3mZgT']/div/div[2]") // Instead of above line
	private WebElement Location;

	
		
	
	// By SignIn = By.xpath("//span[contains(text(),'Sign In')]");
	@FindBy(xpath = "//span[contains(text(),'Sign In')]") // Instead of above line
	//@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/header[1]/div[1]/div[1]/ul[1]/li[2]/div[1]/span[2]")
	private WebElement ClkSignInBttn;

	
	
	// By EntrMobNum = By.xpath("//input[@id='mobile']");
	@FindBy(xpath = "//input[@id='mobile']") // Instead of above line
	//@FindBy(id = "mobile")
	private WebElement MobNumTxtBox;

	
	
	// By LoginBtn = By.xpath("//a[@class='a-ayg']");
	@FindBy(xpath = "//a[@class='a-ayg']")
	// @FindBy(linkText= "LOGIN")
	private WebElement LoginButton;

	
	
	
	
	

	@FindBy(xpath = "//label[contains(text(),'Enter your phone number')]")
	private WebElement ERRMSGEntrphonenumber;

	
	
	


	
	
	
	// Clicks LocateMe
	public void ClkLocteMe() {

		Location.click();
	}


	//Clicks SignIn
	public void ClkSignIn() {

		ClkSignInBttn.click();
	}

	
    //Enters mobile number
	public void enterMobileNum(String mobnum) {
		MobNumTxtBox.clear();
		MobNumTxtBox.sendKeys(mobnum);

	}

	// Clicks LOGIN BUTTON AFTER ENTERING MOBILE NUMBER
	public void ClkLoginBttn() {

		LoginButton.click();

	}

	
	

	// SHOWS ERROR MESSAGE WHEN ENTERED (9 digit number)  as "Enter phone number" :
	public String getErrMssgEntrMobilenumber() {
		String text = ERRMSGEntrphonenumber.getText();
		return text;
	}

	

}
