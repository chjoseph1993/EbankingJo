package com.ebanking.master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Exepom 
{
	WebDriver driver;
	
	 @BeforeTest
	 
	  public void login()
	  {
		 System.setProperty("webdriver.gecko.driver","./Drivers\\geckodriver.exe"); 
		 driver=new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.get("http://122.175.8.158/ranford2/");
		  
		  //Pagefactory
		  
		  //RanfordHome Page
		  RanfordHomePage RHP=PageFactory.initElements(driver,RanfordHomePage.class);
		  RHP.login();
		  
	  }
	 @Test(dataProvider="Rdata")
	 public void Rolecre(String Rname,String Rdesc,String RType)
	 {
		  
		  //AdminHome Page
		  AdminHomePage AHP=PageFactory.initElements(driver,AdminHomePage.class);
		  AHP.Role();
		  
		//New Role
		  RolesDetails RD=PageFactory.initElements(driver, RolesDetails.class);
		  RD.NewRole();
		  
		//Role Creation
		  RolesCreation RC=PageFactory.initElements(driver, RolesCreation.class);
		  RC.RoleCreation();
		  
		//Alert
		  driver.switchTo().alert().accept();
		  
		//Home
		  RD.Home();
		  AHP.Branch();
		 
		
}
@DataProvider

public Object [][] Rdata()
{
	Object [][] Obj=new Object [4][3];
	
	Obj[0][0]="Tester";
	Obj[0][1]="TestEngineer";
	Obj[0][2]="E";
	
	
	Obj[1][0]="Testerr";
	Obj[1][1]="TestEngineer";
	Obj[0][2]="E";
	
	
	Obj[2][0]="Testerrr";
	Obj[2][1]="TestEngineer";
	Obj[0][2]="E";
	
	
	Obj[3][0]="Testerrrr";
	Obj[3][1]="TestEngineer";
	Obj[0][2]="E";
	
	
	return Obj;	
	}	  
	  }

