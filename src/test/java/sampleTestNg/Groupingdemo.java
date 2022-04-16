package sampleTestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Groupingdemo {
 
	 @Test(groups= {"add"})
  public void add() {
	  System.out.println("add");
  }

	 @Test(groups= {"sub"})
 public void sub() {
	 System.out.println("sub");
 }

 @Test(groups= {"add"})
 public void add1() {
	  System.out.println("added");
 }

 @Test(groups= {"multi"})
 public void mutply() {
	 System.out.println("mutply");
 }
 @Test(groups= {"sub"})
 public void sub2() {
	 System.out.println("sub");
 }
 @Test(groups= {"multi"})
 public void mutply1() {
	 System.out.println("mutply");
 }



}
