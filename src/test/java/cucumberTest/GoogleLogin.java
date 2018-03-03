package cucumberTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class GoogleLogin {

	private static WebDriver driver=null;
	public static void main (String args[] )
	{
		System.setProperty("webdriver.gecko.driver", "F:\\SeleniumPrograms\\CucumberMavenExample\\NullDriver\\geckodriver.exe");
		driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		 driver.navigate().to("https://www.google.com");
		Assert.assertEquals("Google", driver.getTitle());
		driver.findElement(By.id("lst-ib")).sendKeys("Selenium Easy");
		driver.findElement(By.name("btnK")).click();
		System.out.println("*******Selenium Easy Searched*******");
	}
}
