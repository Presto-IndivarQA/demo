package runnerfiles;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "E://AutomationWorkspace//test.cucu//Features//test.feature" 
		,glue = "stepDefinition"
									)
public class Runner {

}
