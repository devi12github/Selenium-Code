package com.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown  {

	WebDriver driver;
	 
	public void search() {
		
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.id("userNavLabel")).click();
		driver.findElement(By.linkText("My Settings")).click();
		driver.findElement(By.xpath("//*[@id=\"DisplayAndLayout_font\"]")).click();
	    driver.findElement(By.xpath("//*[@id=\"CustomizeTabs_font\"]")).click();
	    WebElement dropDown  =   driver.findElement(By.id("p4"));
	     Select select = new Select (dropDown);
	      select.selectByIndex(8);
	  WebElement dropDown1 = driver.findElement(By.xpath("//*[@id=\"duel_select_0\"]"));
	  Select select1 = new Select(dropDown1);
	  
	  select1.selectByValue("report");
	
	driver.findElement(By.xpath("//*[@id=\"duel_select_0_right\"]/img")).click();
	driver.findElement(By.name("save")).click();
	}
	
	}


