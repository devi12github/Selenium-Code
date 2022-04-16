package com.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTablePractise2 {

	
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	driver.get(" https://www.trivago.in/");
	////div[@class = 'text-center'][1]/button
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[3]/div[2]/div/div[3]/div/div/form/fieldset/div/div[1]/button")).click();
	
	String month = driver.findElement(By.xpath("//div[@class = 'text-center'][1]/button")).getText();
	
	String dayuserinput = "13";
	String monthcell[] = {"January","February","March","April","May","June","July","August","September","october","November","December"};
	if(month.contains("june")) {
		driver.findElement(By.xpath("//div[@class='text-center'][1]//table/tbody//span[text()='"+dayuserinput+"'][1]")).click();
	}////div[@class='text-center'][2]/table/tbody/tr[3]/td[4]
	else {
		int currentIndex=0;
		int reqmonth = 0;
		for(int i=0;i<monthcell.length;i++) {
			if(month.contains(monthcell[i])) {
				if(month.contains(monthcell[i])) {
			  currentIndex = i+1;
			}
			if(monthcell[i].contains("june")) {
				reqmonth = i+1;
			}
			
			WebElement nextbutton = driver.findElement(By.xpath("//button[@data-testid='calendar-button-next']"));
			for ( i=0;i<reqmonth-currentIndex;i++) {
				nextbutton.click();
			
			}
			driver.findElement(By.xpath("//div[@class='text-center'][1]//table/tbody//span[text()='"+dayuserinput+"'][1]")).click();
			
			}
	}
	
	
	}

	}
}