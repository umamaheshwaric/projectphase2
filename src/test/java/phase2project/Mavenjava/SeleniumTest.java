package phase2project.Mavenjava;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTest extends BaseTest {

	@Test
	public void titleVerification() throws InterruptedException, IOException {
		
		
		
//		String expectedTitle = driver.getTitle();
//		System.out.println(expectedTitle);
		SwiggyApplication S = new SwiggyApplication(driver);

		// for clicking the location to track//
		S.ClkLocteMe();
		Thread.sleep(3000);



		// Click SigninBttn
		S.ClkSignIn();
		Thread.sleep(3000);

		String[][] data = ReadExcel.getData("resources//TestData2.xlsx", "Sheet1");

		for (int i = 1; i < 5; i++) {

			// Enter an valid mobile number
			String Mobilenum = data[i][0];
			S.enterMobileNum(Mobilenum);
			Thread.sleep(2000);

			// click loginBttn
			S.ClkLoginBttn();
			Thread.sleep(2000);

		


			String expectedErrMsg = "Enter your phone number";
			String actualErrMsg = S.getErrMssgEntrMobilenumber();
			Assert.assertEquals(actualErrMsg, expectedErrMsg);

		}

	}

	
}
