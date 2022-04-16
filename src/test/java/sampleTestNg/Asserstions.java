package sampleTestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Asserstions {

   String name = "pavi";
   @Test
   public void checkequal() {
	   
	  Assert.assertNotEquals(name,"ravi");
   
   
   }
  






}
