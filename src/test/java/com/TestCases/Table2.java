package com.TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table2 {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
       
   List<WebElement> colmns = driver.findElements(By.xpath("//table[@id='product']/tbody/tr/th"));
   System.out.println("column size"+ colmns.size());
   List<WebElement> rows = driver.findElements(By.xpath("//table[@id='product']/tbody/tr"));
   System.out.println("row size" + rows.size());
	
   WebElement text = driver.findElement(By.xpath("//table[@name='courses']/tbody/tr[5]/td[2]"));
  String text1 =  text.getText();
	System.out.println("text = "+ text1);
	
	
	}

}
