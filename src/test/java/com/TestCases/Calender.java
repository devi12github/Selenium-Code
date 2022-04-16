package com.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Calender  {


 WebDriver driver;
  public void calender_Remainder() {
	  
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  driver.findElement(By.id("userNavLabel")).click();
	  driver.findElement(By.linkText("My Settings")).click();
	  driver.findElement(By.xpath("//*[@id=\"CalendarAndReminders_font\"]")).click();
		  
	  driver.findElement(By.id("Reminders_font")).click();
	  driver.findElement(By.id("testbtn")).click();
  }

  






  }
