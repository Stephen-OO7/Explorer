package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features="classpath:Features",
		glue="StepDefinition",
		tags="@sendtofriend",
		dryRun=false,
		strict=true,
		monochrome=true
		
		)

public class Testrunner {

}
