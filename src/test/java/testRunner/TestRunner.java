package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
		features = "Features//LoginModule.feature",
		glue={"stepDefinition"},
		plugin = { "pretty", "html:target/test_results.html"},
		dryRun = false,
		//tags = ("@SmokeTest"),
		publish = true,
		monochrome = true)

public class TestRunner {
	
}


