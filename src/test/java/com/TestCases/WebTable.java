package com.TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

   WebDriver driver;
  
   public void setUp() {
	   
	   WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
	   driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
     driver.manage().window().maximize();
   }
    
    public void tearDown() {
    	driver.quit();
    }

    
	/*
	 * public void title() {
	 * 
	 * WebElement table = driver.findElement(By.id("customers")); List<WebElement>
	 * headers = table.findElements(By.tagName("tr"));
	 * 
	 * for(WebElement header :headers ) { String text = header.getText();
	 * System.out.println(text); }
	 */
    
  
  /* public void rows() {
	   WebElement table = driver.findElement(By.id("customers"));
	   
     List<WebElement>rows =  driver.findElements(By.tagName("th"));
     for (WebElement row : rows) {
    	 
    	 String text = row.getText();
        System.out.println(text);
   
   }
   }*/
   
  
   public void colomns() {
	   
	
       WebElement table=driver.findElement
		 (By.xpath("//*[@id=\"post-body-5867683659713562481\"]/div[1]/div[4]/table"));
   
            List<WebElement> headers =  table.findElements(By.tagName("td"));
   
         for (WebElement header : headers ) {
        	 
        	 String text = header.getText();
             System.out.println(text);
         }
   
   
   }
   
   
   
   
   
   }
  

   
