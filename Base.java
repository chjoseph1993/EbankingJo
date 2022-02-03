package com.ebanking.master;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

import org.testng.annotations.AfterSuite;

public class Base {
	Library1 LB=new Library1();
	
	  @BeforeTest
	  public void beforeTest() throws IOException, InterruptedException 
	  {
		  LB.AdminLgn("Admin","Te$ting@");
	  }

	  @AfterTest
	  public void afterTest() 
	  {
		  LB.logout();
	  }

	  @BeforeSuite
	  public void beforeSuite() throws InterruptedException 
	  {
		  LB.openApp("http://122.175.8.158/ranford2/");
	  }

	  @AfterSuite
	  public void afterSuite() 
	  {
		  LB.close();
	  }


}
