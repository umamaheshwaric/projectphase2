package phase2project.testscriptsofFeature;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import phase2project.Mavenjava.SwiggyApplication;




public class loginSwiggySteps extends Driver{
	
	
	@Given("a user is on swiggy home page")
	public void a_user_is_on_swiggy_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	   Assert.assertTrue(driver.getTitle().equals("Order food online from India's best food delivery service. Order from restaurants near you"));
	}

	@When("he clicks on locate me")
	public void he_clicks_on_locate_me() {
	    // Write code here that turns the phrase above into concrete actions
		S.ClkLocteMe();
	}

	@When("he clicks on sign button")
	public void he_clicks_on_sign_button() {
	    // Write code here that turns the phrase above into concrete actions
		S.ClkSignIn();
	}

	@When("he enters the mobile number {string}")
	public void he_enters_the_mobile_number(String string) {
	    // Write code here that turns the phrase above into concrete actions
		S.enterMobileNum(string);
	}

	@When("he clicks on login button")
	public void he_clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		S.ClkLoginBttn();
	}


	
	
	@Then("the error message should be displayed")
	public void the_error_message_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		String expectedErrMsg = "Enter your phone number";
		String actualErrMsg = S.getErrMssgEntrMobilenumber();
		Assert.assertEquals(actualErrMsg, expectedErrMsg);
	}
	
}
