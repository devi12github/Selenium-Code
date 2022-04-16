package com.TestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeSetUp {

    WebDriver driver;
    public static ExtentReports extent;
    public static ExtentHtmlReporter report;
   public static ExtentTest test;
    
    
   
    public void testDropDown() {
    	getReport();
    	 WebDriverManager.chromedriver().setup();
   	  driver = new ChromeDriver();
      test = extent.createTest("Salesforce Login");
   	  driver.get("http://login.salesforce.com");
      driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
      WebElement username =driver.findElement(By.name("username"));
   	username.sendKeys("devi.feb22@tekarch.com");
   WebElement password=driver.findElement(By.id("password"));
   	password.sendKeys("Salesforce@1");
     test.info("Login Successful");
   	WebElement login=driver.findElement(By.name("Login"));
   	login.click();
    }
    
	/*
	 * public void opportunities() { testDropDown();
	 * driver.manage().window().maximize(); //
	 * driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	 * driver.findElement(By.linkText("Opportunities")).click();
	 * //driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	 * 
	 * WebDriverWait wait = new WebDriverWait (driver,5000);
	 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
	 * "//*[@id=\'quarter_q\']"))); WebElement dropDown =
	 * driver.findElement(By.id("//*[@id=\'quarter_q\']"));
	 * driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS); Select select
	 * = new Select(dropDown); select.selectByIndex(3); List<WebElement>
	 * listofElements = select.getOptions(); System.out.println(listofElements);
	 * 
	 * 
	 * }
	 */

    
  public void getReport() {
	  
	  extent = new ExtentReports();
	  report = new ExtentHtmlReporter("C:\\Users\\usrah\\eclipse-workspace\\frameworkdemo\\target\\Result\\My Result.html");
      extent.attachReporter(report);
      }
  
   public void tearDown() throws InterruptedException {
	Thread.sleep(1000);
	driver.quit();
	extent.flush();

  }




   }
