package com.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingProduct {


	 WebDriver driver;
	  
	  
	  public void setUp() {
		  
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		  driver.get(" http://automationpractice.com/index.php");
		 
		  driver.manage().window().maximize();
		  }

	  
      
        public void selectDress() {
        	
        	Actions action = new Actions(driver);
        	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        	WebElement women = driver.findElement(By.linkText("WOMEN"));
        	WebElement tshirts = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[1]/a"));
        	action.moveToElement(women).moveToElement(tshirts).click().perform();
        	
     String dressName =  driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/h5/a")).getText();
           
        driver.findElement(By.id("search_query_top")).sendKeys(dressName);
        driver.findElement(By.name("submit_search")).click();
       String productName = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/h5[1]/a[1]")).getText();
       System.out.println(productName);
       
       if (dressName.equalsIgnoreCase(productName)) {
    	   System.out.println("product matched");
       }
       else {
    	   System.out.println("product not matched");
       }
       }






  }
