package com.ebanking.master;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SeleniumGridRole 
{

	 DesiredCapabilities cap=null;
	 @Test
	 public void SGD() throws MalformedURLException 
	 {
		 cap=new DesiredCapabilities();
		   cap.setBrowserName("firefox");
		   cap.setPlatform(Platform.WINDOWS);
		   
		   RemoteWebDriver driver=new RemoteWebDriver(new URL("http://192.168.1.9:4444/wd/hub"),cap);
		   driver.manage().window().maximize();
		   System.setProperty("webdriver.gecko.driver","./Drivers\\geckodriver.exe");
			  driver.get("http://122.175.8.158/ranford2/");
			  
			  //Pagefactory
			  
			  //RanfordHome Page
			  RanfordHomePage RHP=PageFactory.initElements(driver,RanfordHomePage.class);
			  RHP.login();
			  
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
			  
			  
			  
			  //New Branch
			  BranchDetails BD=PageFactory.initElements(driver, BranchDetails.class);
			  BD.NewBranch();
			  
			  //Branch Creation
			  BranchCreation BC=PageFactory.initElements(driver, BranchCreation.class);
			  BC.BranchCreation();
			  
			//Alert
			  driver.switchTo().alert().accept();
			  
			//Home
			  BD.Home();
			  AHP.Employee();
			  
			  
			  
			  //New Employee
			  EmployeeDetails ED=PageFactory.initElements(driver, EmployeeDetails.class);
			  ED.NewEmployee();
			  
			  //Employee Creation
			  EmployeeCreation EC=PageFactory.initElements(driver, EmployeeCreation.class);
			  EC.EmployeeCreation();
			  
			  //Alert
			  driver.switchTo().alert().accept();
			  
			  //Loout
			  
}
}