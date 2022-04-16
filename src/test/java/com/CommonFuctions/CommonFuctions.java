package com.CommonFuctions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CommonFuctions {

  public static WebDriver driver;
  public static Properties pro =null;
 
  public Properties loadFile() throws IOException {
	  FileInputStream fis = new FileInputStream("C:\\Users\\usrah\\eclipse-workspace\\frameworkdemo\\config.properties");
     pro = new Properties();
     pro.load(fis);
     return pro;
  
  
  }
  
   @BeforeSuite
    public void launchBrowser() throws IOException {
	  loadFile();
	 
	 
	
	  String browser = pro.getProperty("browser");
	  
	  String url = pro.getProperty("baseurl");
    String driverlocation = pro.getProperty("driverlocation");
	
    if (browser.equalsIgnoreCase("chrome")) {
	   System.setProperty("webdriver.chrome.driver",driverlocation);
	   driver = new ChromeDriver();
	   }
	 else if(browser.equalsIgnoreCase("FireFox")) {
	  System.setProperty("webdriver.gecko.driver",driverlocation);
	 } 		
     
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.get(url);
    
   
   }
    
    @AfterSuite
    public void teardown() {
    	driver.quit();
    }
    
    
    }




