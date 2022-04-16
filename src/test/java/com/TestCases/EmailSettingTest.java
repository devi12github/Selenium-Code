package com.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class EmailSettingTest  {
  WebDriver driver;
   
   public void test()  {
	   

		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("userNavLabel")).click();
		driver.findElement(By.linkText("My Settings")).click();
		
		driver.findElement(By.xpath("//*[@id=\"EmailSetup\"]/a")).click();
        driver.findElement(By.id("EmailSettings_font")).click();
        driver.findElement(By.id("sender_name")).clear();
        
        driver.findElement(By.id("sender_name")).sendKeys("devi raj");
        driver.findElement(By.xpath("//*[@id=\"auto_bcc1\"]")).click();
        driver.findElement(By.name("save")).click();
   
   }







  }
