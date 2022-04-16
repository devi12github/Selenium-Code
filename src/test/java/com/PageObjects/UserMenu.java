package com.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserMenu {

  @FindBy(id = "userNavLabel")
  public static WebElement UserMenu;

  @FindBy(linkText = "My Profile")
  public static WebElement Myprofile;
  
  @FindBy(xpath = "//*[@id=\"chatterTab\"]/div[2]/div[2]/div[1]/h3/div/div/a/img")
  public static WebElement Editprofile;
  

}
