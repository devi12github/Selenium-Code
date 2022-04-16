package sampleTestNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class HierachyAnnotations {
  @Test
  public void test() {
   System.out.println("test = 0");
  }
 @Test
 public void test2() {
	 System.out.println("test2 = 1");
 }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before method = 1");
  
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after method = 2");
  
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("before class = hi");
  
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("after class = yes");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("before test = no");
  
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("after test = ok");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("before suite = right");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("after suite = left");
  }

}
