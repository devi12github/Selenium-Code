package com.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.CommonFuctions.CommonFuctions;
import com.PageObjects.LoginPage;
import com.PageObjects.UserMenu;

public class TestCase02 extends CommonFuctions{

  @Test
  public void userMenu() {
	  
	  PageFactory.initElements(driver,UserMenu.class);
   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
   UserMenu.UserMenu.click();
   UserMenu.Myprofile.click();
   UserMenu.Editprofile.click();
  
  }

  

}
