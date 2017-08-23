package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class Shoppingcart {
	
	WebDriver driver;
	
 
	@Given("^I open the website$")
	public void i_open_the_website() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://ec2-35-176-202-196.eu-west-2.compute.amazonaws.com/CrazyHatProject/");
	}

	@Given("^I login as mocca with password$")
	public void i_login_as_mocca_with() throws Throwable {
	    driver.findElement(By.id("login")).click();
	    driver.findElement(By.id("customerName")).sendKeys("mocca");
	    driver.findElement(By.id("customerPassword")).sendKeys("123");
	    driver.findElement(By.id("btnLogin")).click();
	}

	@When("^I click KIDS categories$")
	public void i_click_KIDS_categories() throws Throwable {
	    driver.findElement(By.xpath(".//*[@id='sidebar']/div/div/ul[2]/li/a")).click();
	}

	@When("^I click a hat image$")
	public void i_click_a_hat_image() throws Throwable {
	    driver.findElement(By.linkText("Denver NBA Reflipper Snapback Cap")).click();
	}

	@When("^I am on the Hat Detail page$")
	public void i_am_on_the_Hat_Detail_page() throws Throwable {
	    WebElement text = driver.findElement(By.xpath(".//*[@id='content']/div[2]/table/tbody/tr[2]/td[2]"));
	    String contentText = text.getText();
	    Assert.assertEquals("Denver NBA Reflipper Snapback Cap", contentText);
	}

	@When("^I click add to cart$")
	public void i_click_add_to_cart() throws Throwable {
	    driver.findElement(By.id("btnCart")).click();
	}

	@Then("^I should see the item in my shopping cart$")
	public void i_should_see_the_item_in_my_shopping_cart() throws Throwable {
	    WebElement location = driver.findElement(By.xpath(".//*[@id='content']/h1"));
	    String locationName = location.getText();
	    Assert.assertEquals("Shopping Cart", locationName);
	    
	    WebElement item = driver.findElement(By.xpath(".//*[@id='content']/table[1]/tbody/tr[2]/td[2]"));
	    String itemName = item.getText();
	    Assert.assertEquals("Denver NBA Reflipper Snapback Cap", itemName);
	    
	    driver.close();
	}
	
}
