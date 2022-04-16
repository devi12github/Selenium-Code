package sampleTestNg;

import org.testng.annotations.Test;

public class TestNgTestCase {

  @Test
  public void login() {
	  System.out.println("login");
  }
   @Test(priority=1)
  public void accounts() {
	  System.out.println("accounts");
	  
  }
@Test(priority=0)
   public void profile() {
	   System.out.println("profile");
	   
   }

  @Test(priority=2,enabled=false)
   public void setting() {
	   System.out.println("setting");
   }


}
