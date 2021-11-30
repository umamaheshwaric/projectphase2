package phase2project.testscriptsofFeature;

import java.util.concurrent.TimeUnit;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class BeforeAfter extends Tools {
	
	@Before
	public void setUp(Scenario scenario) {
		Driver.init();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/restaurants");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	
	@After
	public void tearDown() {
		driver.quit();
	}

}
