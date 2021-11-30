package phase2project.testscriptsofFeature;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features = "Feature"
				,glue = "phase2project.testscriptsofFeature"
				,tags = "@uma")


public class TestRunner extends AbstractTestNGCucumberTests{

}

