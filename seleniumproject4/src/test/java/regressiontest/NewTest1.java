package regressiontest;

import org.testng.annotations.Test;

import commoncode.baseclass;
import pages.fbhome;

import org.testng.annotations.BeforeTest;
import java.io.IOException;
import org.testng.annotations.AfterTest;


public class NewTest1 extends baseclass{
 
  
 
	  
 
  @Test
  public void f()  throws IOException, InterruptedException {
	  fbhome ob = new fbhome(driver);
	 // ob.emailid("abc@yahoo.com");
	 // Thread.sleep(5000);
	  //ob.password("aaaaaaa");
	  //Thread.sleep(5000);
	  ob.findfblinks();
	  
  }


	
}



	


  

  
