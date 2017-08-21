package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Navigation {

	WebDriver driver;
	
	@Given("^I go to \"([^\"]*)\"$")
	public void i_go_to(String arg1) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\Download\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://ec2-35-176-202-196.eu-west-2.compute.amazonaws.com/CrazyHatProject/");
	}

	@Then("^I should be on \"([^\"]*)\" Home Page$")
	public void i_should_be_on_Home_Page(String arg1) throws Throwable {
	    Assert.assertTrue(driver.getTitle().contains("CRAZY HATS"));
	    driver.close();
	}
}
