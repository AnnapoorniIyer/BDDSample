package runner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="@target/failedScenarios.txt",
		glue= {"stepDefs"},
	    monochrome=true
	   )
public class ReRunner extends AbstractTestNGCucumberTests{

}
