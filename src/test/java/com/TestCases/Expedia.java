package com.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Expedia {
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.expedia.com/");
		driver.manage().window().maximize();
		
		String month = "August";
		String year = "2022";
		String date = "20";
		driver.findElement(By.id("d1-btn")).click();
		
		while(true) {
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			String monthyear = driver.findElement(By.xpath("//div[@class='uitk-date-picker-month'][1]/h2[text()='April 2022']")).getText();
			System.out.println(monthyear);
			
			String[] arr = monthyear.split(" ");
			String mon = arr[0];
			String yr = arr[1];
			if(month.equalsIgnoreCase(mon)&&year.equals(yr)) {
				break;
				}
			else {
				driver.findElement(By.xpath("//div/button[@data-stid='date-picker-paging'][2]")).click();
			}
        }
		driver.findElement(By.xpath("//div[@class='uitk-date-picker-month'][2]/table/tbody//button[@data-day='20']")).click();
	 driver.findElement(By.xpath("//div[@class='uitk-layout-flex uitk-date-picker-menu-footer']/button/span")).click();
	
	}
}
