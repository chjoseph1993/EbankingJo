package com.ebanking.master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExePom1 
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
	  @Test(dataProvider="Bdata")
	  public void BranchCre(String Bname,String Add1,String Add2,String Add3,String Area,String Zipcode,String Ctry,String State,String City)
	  {
		//AdminHome Page
		  AdminHomePage AHP=PageFactory.initElements(driver,AdminHomePage.class);
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
}
	  @DataProvider
	  public Object [][] Bdata()
		{
			Object [][] Obj=new Object [4][9];
			
			Obj[0][0]="Hyderabad444";
			Obj[0][1]="Ameerpet123";
			Obj[0][2]="SRNagar";
			Obj[0][3]="Yellareddyguda";
			Obj[0][4]="Alinagar";
			Obj[0][5]="50007";
			Obj[0][6]="INDIA";
			Obj[0][7]="Delhi";
			Obj[0][8]="Delhi";
			
			
			Obj[1][0]="Hyderabad4444";
			Obj[1][1]="Ameerpet124";
			Obj[1][2]="SRNagarr";
			Obj[1][3]="Yellareddygudb";
			Obj[1][4]="Alinagarr";
			Obj[1][5]="50008";
			Obj[1][6]="UK";
			Obj[1][7]="Delhi";
			Obj[1][8]="Delhi";
			
			
			Obj[2][0]="Hyderabad44444";
			Obj[2][1]="Ameerpet125";
			Obj[2][2]="SRNagarrr";
			Obj[2][3]="Yellareddygudc";
			Obj[2][4]="Alinagarrr";
			Obj[2][5]="50009";
			Obj[2][6]="USA";
			Obj[2][7]="GOA";
			Obj[2][8]="GOA";
			
			Obj[3][0]="Hyderabad444444";
			Obj[3][1]="Ameerpet126";
			Obj[3][2]="SRNagarrrr";
			Obj[3][3]="Yellareddygudd";
			Obj[3][4]="Alinagarrrr";
			Obj[3][5]="50010";
			Obj[3][6]="INDIA";
			Obj[3][7]="GOA";
			Obj[3][8]="GOA";
			
			return Obj;
	  
}
}
