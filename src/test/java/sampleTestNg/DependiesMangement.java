package sampleTestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DependiesMangement {

	static WebDriver driver;
	@BeforeSuite
	public static void openBrowse() {
		 WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
	}
	
	@Test
  public void openGoogle() {
	  
	  driver.get("http://www.google.com");
	  driver.getTitle();
	  
	}
  @Test()
	public void openSalesforce() {
	  driver.get("http://www.Salesforce.com");
	  driver.getTitle();
	  
  }
 @Test
 public void openAmazon() {
	  driver.get("http://www.Amazon.com");
	 driver.getTitle();
	
 }
 @AfterTest
 public void closeBrowser() {
	 driver.close();
 }
 
 }
 


