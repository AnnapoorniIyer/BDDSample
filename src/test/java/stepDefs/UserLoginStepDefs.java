package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserLoginStepDefs {
	WebDriver driver;

@Given("when User is on login page")
public void when_user_is_on_login_page() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://the-internet.herokuapp.com/login");
	
}
@When("User enters credentials")
public void user_enters_credentials() {
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
	driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
	driver.findElement(By.cssSelector("button.radius")).click();
	}

@Then("should display the home page")
public void should_display_the_home_page() {
	boolean isValidUser=driver.findElement(By.cssSelector("div.success")).isDisplayed();
	Assert.assertTrue(isValidUser);
   
}

}
