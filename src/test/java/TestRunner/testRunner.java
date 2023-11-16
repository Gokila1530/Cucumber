
package TestRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


public class testRunner {
	
	
	@CucumberOptions(
			features =  "src/test/resources/Feature",
			            
			glue = "StepDefinition",
					
			plugin= {"pretty", "html:target/cucumber-reports"}
			)

 public class Runner extends AbstractTestNGCucumberTests {
		
	}

	
}
