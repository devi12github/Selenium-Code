package sampleTestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTesting {

 static WebDriver driver;
 @Test
 public void openGoogle() {
	 WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
   driver.get("https://www.youtube.com");
  driver.close();
 }
 @Test
 public void openSalesforce() {
	 WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
   driver.get("http://www.Amazon.com");
  driver.close();
 }





}
