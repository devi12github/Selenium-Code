package com.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Accounts {

  static WebDriver driver;
    public static void main (String []args){
    	
    	
    	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    	
    	driver.findElement(By.xpath("//*[@id=\"Opportunity_Tab\"]/a")).click();
    	WebElement drowpDown = driver.findElement(By.id("quarter_q"));
    			drowpDown.click();
    	Select select = new Select(drowpDown);
    select.selectByValue("curnext1");
    select.selectByIndex(0);
    WebElement drowpDown1 = driver.findElement(By.id("open"));
    drowpDown1.click();
    Select select1 = new Select(drowpDown1);
    select1.selectByIndex(2);
   
   
   }





}
