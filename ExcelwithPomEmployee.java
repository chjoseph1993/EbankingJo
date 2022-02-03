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

public class ExcelwithPomEmployee 
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
public void EmployeeCre() throws IOException
{
	//to get test data file
			FileInputStream FIS=new FileInputStream("F:\\Selenium joseph\\ebanking\\src\\com\\ebanking\\testdata\\Employee Creation.xlsx");
			
			//work book
			XSSFWorkbook WB=new XSSFWorkbook(FIS);
			
			//sheets
			XSSFSheet WS=WB.getSheet("EmployeeCreation");
			
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
				XSSFCell WC3=WR.getCell(3);
				XSSFCell WC4=WR.createCell(4);
				
				
				//Cell values
				String Ename=WC.getStringCellValue();
				String Elpswd=WC1.getStringCellValue();
				String ERole=WC2.getStringCellValue();
				String EBranch=WC3.getStringCellValue();
				
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
				  
				
}
	
	}
}
