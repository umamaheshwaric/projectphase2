package phase2project.Mavenjava;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class BaseTest {

	WebDriver driver;
	@BeforeClass
	public void BrowserAutomation() throws MalformedURLException {

		// Below code is for invoking chrome driver manually through it's path//
		
		
		System.setProperty("webdriver.chrome.driver", "resources//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Below code is for invoking chrome driver through node and will be executed
//		 only when node and hub got registered(i.e.,. SELENIUM GRID)
//		DesiredCapabilities dc= new DesiredCapabilities();
//		dc.setBrowserName("chrome");
//		dc.setPlatform(Platform.WINDOWS);
//		
//		driver= new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),dc);
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		
		
	
		// Maximizing the browser
		driver.manage().window().maximize();

		// Opening the targetted link
		driver.get("https://www.swiggy.com/restaurants");

	}
	
	
	//PLEASE COMMENT THIS WHEN CODE WAS RUN WITH SELENIUM GRID//
//	@AfterClass
//	public void closebrowser() {
//		driver.quit();
//	}
	
	
	
}
