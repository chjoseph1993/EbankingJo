package com.ebanking.master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelPom2 
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
	 @Test(dataProvider="Edata")
	  public void Employeecre(String Ename,String Lpwd, String Role, String Branch)
	  
	  {

		//AdminHome Page
		  AdminHomePage AHP=PageFactory.initElements(driver,AdminHomePage.class);
		  AHP.Employee();
		  
		//New Employee
		  EmployeeDetails ED=PageFactory.initElements(driver, EmployeeDetails.class);
		  ED.NewEmployee();
		  
		  //Employee Creation
		  EmployeeCreation EC=PageFactory.initElements(driver, EmployeeCreation.class);
		  EC.EmployeeCreation();
		  
		  //Alert
		  driver.switchTo().alert().accept();
		  
		//Home
		  ED.Home();
}
	 @DataProvider
		
		public Object [][] Edata()
		{
			Object [][] Obj=new Object [4][4];
			
			Obj[0][0]="Josephch";
			Obj[0][1]="Josephch";
			Obj[0][2]="Accountant";
			Obj[0][3]="Hyderabad";
			
			
			Obj[1][0]="Josephchh";
			Obj[1][1]="Josephch1";
			Obj[1][2]="assistantmanager";
			Obj[1][3]="Hyderabad2";
			
			
			Obj[2][0]="Josephchhh";
			Obj[2][1]="Josephch2";
			Obj[2][2]="amanager";
			Obj[2][3]="Hyderabad3";
			
			
			Obj[3][0]="Josephchhhh";
			Obj[3][1]="Josephch3";
			Obj[3][2]="Manager";
			Obj[3][3]="Hyderabad44";
			
			
			return Obj;
	}
}


