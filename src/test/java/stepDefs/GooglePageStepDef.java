package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GooglePageStepDef  { 
	WebDriver driver;
	@Given("User is on Google page")
	public void user_is_on_google_page() {
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	   
	}
	@When("User enters Selenium Tutorials")
	public void user_enters_selenium_tutorial() {
		WebElement searchBox=driver.findElement(By.tagName("textarea"));
		searchBox.sendKeys("Selenium Tutorial");
		searchBox.submit();
	   
	}
	
	@Then("Should display Selenium result page")
	public void should_display_selenium_result_page() {
		Assert.assertEquals(driver.getTitle(),"Selenium Tutorial - Google Search");
	}
	
	@When("User enters Java Tutorials")
	public void user_enters_java_tutorial() {
		WebElement searchBox=driver.findElement(By.tagName("textarea"));
		searchBox.sendKeys("Java Tutorial");
		searchBox.submit();   
	}

	@Then("Should display Java result page")
	public void should_display_java_result_page() {
		Assert.assertEquals(driver.getTitle(),"Java Tutorial - Google Search");
		
	}
	@After
	public void attachScreenshot(Scenario scenario) {
		if(scenario.isFailed()) {
			TakesScreenshot scr=(TakesScreenshot)driver;
			byte[]img=scr.getScreenshotAs(OutputType.BYTES);
			scenario.attach(img, "image/png","Screenshot");
					
					
		}
	}
	

  @Test
  public void f() {
  }
}
