package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class Navigation {

	WebDriver driver;
	
	@Given("^I am on the home page$")
	public void i_am_on_the_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://ec2-35-176-202-196.eu-west-2.compute.amazonaws.com/CrazyHatProject/");
	}

	@When("^I navigate to \"([^\"]*)\"$")
	public void i_navigate_to(String menuBar) throws Throwable {
	    driver.findElement(By.id(menuBar)).click();
	}

	@Then("^I check page title is \"([^\"]*)\"$")
	public void i_check_page_title_is(String title) throws Throwable {
	    Assert.assertTrue(driver.getTitle().contains(title));
	}

	@Then("^I close the browser$")
	public void i_close_the_browser() throws Throwable {
	    driver.close();
	}
}
