package com.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase04 {


  WebDriver driver;

  public void test() {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
   driver.get("http://login.salesforce.com");
   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
   WebElement username =driver.findElement(By.name("username"));
	username.sendKeys("devi.feb22@tekarch.com");
WebElement password=driver.findElement(By.id("password"));
	password.sendKeys("Salesforce@1");
	WebElement login=driver.findElement(By.name("Login"));
	login.click();
	  
  }
   @Test
  public void accounts() {
	  
	  test();
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.findElement(By.linkText("Accounts")).click();
	  WebElement dropDown = driver.findElement(By.id("fcf"));
	  
	  Select select = new Select (dropDown);
      select.selectByIndex(3);
    
  
  
  }


}
