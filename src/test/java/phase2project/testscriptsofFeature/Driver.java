package phase2project.testscriptsofFeature;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import phase2project.Mavenjava.SwiggyApplication;

public class Driver extends Tools {

	protected static SwiggyApplication S;
	
	public static void init() {
		System.setProperty("webdriver.chrome.driver", "resources//chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		S = new SwiggyApplication(driver);
	}
}
