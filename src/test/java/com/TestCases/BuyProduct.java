package com.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BuyProduct {

  WebDriver driver;

  
	  
	  
	  public void setUp() {
		  
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		 
		
		  } 
	  
	
	  
	  public void addToCart() {
      
	//  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.get("http://automationpractice.com/index.php");
	  driver.manage().window().maximize();  
	
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.findElement(By.linkText("Sign in")).click();
      driver.findElement(By.id("email")).sendKeys("devselen@gmail.com");
	  driver.findElement(By.id("passwd")).sendKeys("My Store");
	  driver.findElement(By.id("SubmitLogin")).click();
	 
	   driver.findElement(By.linkText("WOMEN")).click();
	   WebElement SecondImg=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div[2]/ul/li[2]/div/div[1]/div/a[1]/img"));
	   WebElement MoreBtn=driver.findElement(By.xpath("/html/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul/li[2]/div[1]/div[2]/div[2]/a[2]"));
	   Actions actions=new Actions(driver);
	   actions.moveToElement(SecondImg).moveToElement(MoreBtn).click().perform();
	 driver.findElement(By.id("quantity_wanted")).clear();
	 driver.findElement(By.id("quantity_wanted")).sendKeys("2");
	 WebElement dropDownQuantity = driver.findElement(By.xpath("//*[@id='group_1']"));
			
	 Select select = new Select(dropDownQuantity);
	 select.selectByVisibleText("L");
	  
	  driver.findElement(By.name("Black")).click();
	  driver.findElement(By.name("Submit")).click();
	  driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]")).click();
	  driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button")).click();
	  driver.findElement(By.id("cgv")).click();
	  driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p")).click();
	  driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button")).click();
	String Order =   driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[1]")).getText();
	 
	  if (Order.equalsIgnoreCase("Your order on My Store is complete")) {
		  System.out.println("Order Complete.Test pass");
	 }
	  else {
		  System.out.println("Order is not Complete.Test Fail");
	  }
	  
	  }



 

  }
