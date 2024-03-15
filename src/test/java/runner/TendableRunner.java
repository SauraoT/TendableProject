package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\features\\tendable.feature"},
		
		glue = {"stepsDefinition","hooks"},
		
//		tags = "@check",
		
		plugin = {"pretty"},
		
		publish = true
		)

public class TendableRunner extends AbstractTestNGCucumberTests {

}
