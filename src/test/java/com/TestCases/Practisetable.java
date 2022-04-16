package com.TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practisetable {

	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.manage().window().maximize();
	
	List<WebElement> row = driver.findElements(By.xpath("//table[@id='product'])[1]/tbody/tr"));
	List<WebElement>  col =  driver.findElements(By.xpath("(//table[@id='product'])[1]/tbody/tr/th"));
	int rowsize = row.size();
	int colsize = col.size();
	
	System.out.println("rowsize"+rowsize);
	System.out.println("colsize"+colsize);
	
	for(int j=1;j<=rowsize;j++) {
		for(int i=1;i<=colsize;i++) {

			
		String text = driver.findElement(By.xpath("(//table[@id='product'])[1]/tbody/tr["+j+"]/td["+i+"]")).getText();
		System.out.println(text);
	
	}
}
////*[@id="product"]/tbody/tr[3]/td[2]
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	}


