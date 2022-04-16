package com.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase03 {

  public static WebDriver driver;
   public static WebElement username;
  public static WebElement password;
  public static WebElement Login;
  public static WebElement userNavLabel;
  public static WebElement MyProfile;
  public static WebElement EditProfile;
  
  @Test
  public void test() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
   driver.get("http://login.salesforce.com");
  
   PageFactory.initElements(driver,TestCase03.class);
  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
   username.sendKeys("devi.feb22@tekarch.com");
   password.sendKeys("Salesforce@1");
   Login.click();
   userNavLabel.click();
   MyProfile.click();
   EditProfile.click();
  
  
  
  }


}
