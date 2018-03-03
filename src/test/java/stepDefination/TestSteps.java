package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class TestSteps {

	private static WebDriver driver=null;
	@Given("^Navigate to google$")
	public void Navigate_to_google() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		System.setProperty("webdriver.gecko.driver", "F:\\SeleniumPrograms\\CucumberMavenExample\\NullDriver\\geckodriver.exe");
		driver=new FirefoxDriver();		
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		 driver.navigate().to("https://www.google.com");
		Assert.assertEquals("Google", driver.getTitle());
		System.out.println("*******In Given block*******");
	}

	@When("^Enter \"([^\"]*)\" in google searchbar$")
	public void Enter_in_google_searchbar(String data) throws Throwable {
	    // Express the Regexp above with the code you wish you had
		driver.findElement(By.id("lst-ib")).sendKeys(data);
		driver.findElement(By.name("btnK")).click();
		System.out.println("*******In When block*******");
	}

	@Then("^result of the page is shown$")
	public void result_of_the_page_is_shown() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		System.out.println("*******Selenium Easy Searched*******");
		driver.quit();
		System.out.println("*******In Then block*******");
	}

}
