package com.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tables {

	
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(" https://www.trivago.in/");
	    driver.manage().window().maximize();
	
	   String month = "july";
	   String year = "2022";
	   String date = "20";
	   driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[3]/div[2]/div/div[3]/div/div/form/fieldset/div/div[1]/button")).click();
	 while(true) {
		String monthyear = driver.findElement(By.xpath("//div[@class='text-center'][1]/button")).getText();
	    String arr[]=monthyear.split(" ");
	   String mon = arr[0];
	   String yr = arr[1];
	   if(mon.equalsIgnoreCase(month)&& yr.equals(year)) {
		  driver.findElement(By.xpath("//div[@class='text-center'][1]/table/tbody/tr[3]/td[3]")).click();
		   break;
	   }
		   else {
			   driver.findElement(By.xpath("//button[@data-testid='calendar-button-next']")).click();
		   }
	   }
	 
	 
	 }
	
	}


