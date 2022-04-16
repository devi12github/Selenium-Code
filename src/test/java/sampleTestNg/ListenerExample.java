package sampleTestNg;

import java.io.File;
import java.io.IOException;

import org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListenerExample {

 static ExtentReports extent;
 static ExtentHtmlReporter report;
 static ExtentTest test;
 static WebDriver driver;
 @Test
 public void openSalesforce() throws IOException {
	 WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	 driver.get("http://www.Salesforce.com");
 String title2= driver.getTitle();
	 String title = "google";
	 if(title.equals(title2))
	 {
		 System.out.println("test pass");
	 }
	 else {
		 System.out.println("test fail");
			/*
			 * TakesScreenshot ts = (TakesScreenshot)driver; File src =
			 * ts.getScreenshotAs(OutputType.FILE); String path =
			 * "C:\\Users\\usrah\\eclipse-workspace\\frameworkdemo\\target.png"; File
			 * destination = new File(path); FileUtils.copyFile(src, destination);
			 */
	}
 }
	 @BeforeTest
   public void print() {
	   extent = new ExtentReports();
		 String path = "C:\\Users\\usrah\\eclipse-workspace\\frameworkdemo\\target.html";
		 report = new ExtentHtmlReporter(path);
		 extent.attachReporter(report);
	 
	 
	 }
	@AfterTest
   public void flush() {
	   extent.flush();
   }

}
	 
	 
  

	

 
  




