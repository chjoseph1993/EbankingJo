package com.ebanking.master;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

public class ExcelwithPomBranch 
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
public void Branchcre() throws IOException
{
	//to get test data file
	FileInputStream FIS=new FileInputStream("F:\\Selenium joseph\\ebanking\\src\\com\\ebanking\\testdata\\Branch Creation.xlsx");
	
	//work book
	XSSFWorkbook WB=new XSSFWorkbook(FIS);
	
	//sheets
	XSSFSheet WS=WB.getSheet("BranchCreation");
	
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
		XSSFCell WC4=WR.getCell(4);
		XSSFCell WC5=WR.getCell(5);
		XSSFCell WC6=WR.getCell(6);
		XSSFCell WC7=WR.getCell(7);
		XSSFCell WC8=WR.getCell(8);
		XSSFCell WC9=WR.createCell(9);
		
		//Cell values
		String Bname=WC.getStringCellValue();
		String Badd1=WC1.getStringCellValue();
		String Badd2=WC2.getStringCellValue();
		String Badd3=WC3.getStringCellValue();
		String Barea=WC4.getStringCellValue();
		String Bzipcode=WC5.getStringCellValue();
		String Bcountry=WC6.getStringCellValue();
		String Bstate=WC7.getStringCellValue();
		String Bcity=WC8.getStringCellValue();	
		
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
	}
}
