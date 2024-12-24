package runner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src//test//resources//features//GooglePageSearch.feature",
		glue= {"stepDefs"},
	    monochrome=true,
	    plugin= {"pretty",
	    		"html:target/reports/HTMLReport.html",
	    		"rerun:target/failedScenarios.txt"
	    		//"usage:target/reports/UsageReport",
	    		//"json:target/reports/JsonReport.json",
	    		//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
	    }
				
		
		
		
		)


public class GooglePageRunner extends AbstractTestNGCucumberTests{
  @Test
  public void f() {
  }
}
