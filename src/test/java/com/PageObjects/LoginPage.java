package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

 
  @FindBy(id = "username")
  public static WebElement username;

  @FindBy(id = "password")
 public static  WebElement password;
 
  @FindBy(id = "Login")
 public static WebElement loginButton;


	
  
  
  
  
  
  
  
}
