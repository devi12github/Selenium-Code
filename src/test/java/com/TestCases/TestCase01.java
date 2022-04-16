package com.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.CommonFuctions.CommonFuctions;
import com.PageObjects.LoginPage;
import com.PageObjects.UserMenu;

public class TestCase01 extends CommonFuctions {

	@Test
  public void login() {
	PageFactory.initElements(driver, LoginPage.class);
   
   LoginPage.username.sendKeys(pro.getProperty("username"));
   LoginPage.password.sendKeys(pro.getProperty("password"));
   LoginPage.loginButton.click();
   
  }
   
 
  
   
  
   
   
}
