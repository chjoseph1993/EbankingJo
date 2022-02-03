package com.ebanking.master;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExcelwithPOM 

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
@Test
	public void Rolecre() throws IOException
	{
	
	//To get Test Data Excel File
	
	FileInputStream FIS=new FileInputStream("F:\\Selenium joseph\\ebanking\\src\\com\\ebanking\\testdata\\Roles Creation.xlsx");
	
	//work book
	XSSFWorkbook WB=new XSSFWorkbook(FIS);
	
	//sheets
	XSSFSheet WS=WB.getSheet("RoleCreation");
	
	//Row count
	int Rcount=WS.getLastRowNum();
	System.out.println("Rcount");
	
	//multiple itteration....... loop
	for(int i=1;i<=Rcount;i++){
		
		//Rows
		XSSFRow WR=WS.getRow(i);
		
		//Cells
		
		XSSFCell WC=WR.getCell(0);
		XSSFCell WC1=WR.getCell(1);
		XSSFCell WC2=WR.getCell(2);
		XSSFCell WC3=WR.createCell(3);
		
		//Cell values
		String Rname=WC.getStringCellValue();
		String Rdesc=WC1.getStringCellValue();
		String Rtype=WC2.getStringCellValue();
		
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
	}
}

