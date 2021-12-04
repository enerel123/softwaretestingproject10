package regressiontest;

import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import commoncode.baseclass;
import pages.fbhome;

public class propertiesNewTest extends baseclass {
  @Test (groups={"api"})
  public void f(FileInputStream FileInputStream) throws IOException{
	 
	  Properties prop= new Properties();
	  FileInputStream = new FileInputStream ("C:\\Users\\ccene\\eclipse-workspace\\seleniumproject4\\drivers\\chromedriver.exe");
	 
	  
	  String emailid =prop.getProperty("Email");
	  String passtxt= prop.getProperty("Password");
	  
	  System.out.println(emailid);
	  System.out.println(passtxt);
	  fbhome fbhomeob=new fbhome(driver);
	  fbhomeob.emailid(emailid);
	  fbhomeob.password(passtxt);
  }


}
