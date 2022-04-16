package com.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadTables {

	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(" https://www.trivago.in/");
	    driver.manage().window().maximize();
	   // checkIn("july","2022","15");
	   // checkOut("September","2022","16");
	    roomsBook();
	    sortBy();
	}
	
	
	
	public static void checkOut(String month,String year,String date) {

		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[3]/div[2]/div/div[3]/div/div/form/fieldset/div/div[2]/button")).click();
		while(true) {
			String monthyear = driver.findElement(By.xpath("//div[@class='text-center'][1]/button")).getText();
			String arr[] = monthyear.split(" ");
			String mon = arr[0];
			String yr = arr[1];
			if(month.equalsIgnoreCase(mon)&& year.equals(year)) {
				driver.findElement(By.xpath("//div[@class='text-center'][2]/table/tbody//span[text()='"+date+"']")).click();
				break;
			}
			else {
				driver.findElement(By.xpath("//button[@data-testid='calendar-button-next']")).click();
			}

		}
	}
	public static void checkIn(String month,String year,String date) {
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[3]/div[2]/div/div[3]/div/div/form/fieldset/div/div[1]/button")).click();
		while(true) {
			String monthyear = driver.findElement(By.xpath("//div[@class='text-center'][1]/button")).getText();
			String arr[]=monthyear.split(" ");
			String mon = arr[0];
			String yr = arr[1];
			if(mon.equalsIgnoreCase(month)&& yr.equals(year)) {
				driver.findElement(By.xpath("//div[@class='text-center'][2]/table/tbody//span[text()='"+date+"']")).click();
				break;
			}
			else {
				driver.findElement(By.xpath("//button[@data-testid='calendar-button-next']")).click();
			}
		}
	}
	public static void roomsBook() {
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[3]/div[2]/div/div[3]/div/div/form/div[2]/button")).click();
		WebElement enterbox = driver.findElement(By.xpath("//input[@id='number-input-21']"));
		enterbox.clear();
		enterbox.sendKeys("3");
		driver.findElement(By.xpath("//button[@data-testid='guest-selector-apply']")).click();
		driver.findElement(By.xpath("//button[@data-testid='search-button']")).click();
	}

	public static void sortBy() {

		WebElement dropDown = driver.findElement(By.id("select-id63"));
		Select select = new Select(dropDown);
		select.selectByVisibleText("Rating only");

	}
//Get the list of Rent of the hotels displayed.


}


