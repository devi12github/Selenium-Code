package com.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase08 {

  WebDriver driver;
  
  @BeforeSuite
  public void setUp() {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get(" http://automationpractice.com/index.php");
	 
	  driver.manage().window().maximize();}

  
 public void loginPage() {
	 
	 
	// driver.get(" http://automationpractice.com/index.php");
	// driver.manage().window().maximize();
	 driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
     driver.findElement(By.id("email_create")).sendKeys("devselen@gmail.com");
     driver.findElement(By.id("SubmitCreate")).click();
     driver.findElement(By.id("id_gender1")).click();
     driver.findElement(By.id("customer_firstname")).sendKeys("abc");
     driver.findElement(By.id("customer_lastname")).sendKeys("degh");
      driver.findElement(By.id("passwd")).sendKeys("My Store");
     driver.findElement(By.id("address1")).sendKeys("Allentown");
     driver.findElement(By.id("city")).sendKeys("LA");
     
     WebElement dropDown = driver.findElement(By.id("id_state"));
     dropDown.click();
     Select select = new Select(dropDown);
     select.selectByVisibleText("California");
 
   driver.findElement(By.id("postcode")).sendKeys("90002");

  WebElement dropDown2 = driver.findElement(By.id("id_country"));
  dropDown2.click();
  Select select2 = new Select(dropDown2);
   select2.selectByVisibleText("United States");
  driver.findElement(By.id("phone")).sendKeys("8183245643");
  
  driver.findElement(By.id("submitAccount")).click();
    String userText =  driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).getText();
    if(userText.contains("abc degh")) {
    	System.out.println("User created Account successfull");
    }
    else {
    	System.out.println("Account not created");
    }
  
  
  }
  
  public void tearDown() {
	  driver.quit();
  }


 }
