package com.ebanking.master;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRole {

	public static void main(String[] args) throws InterruptedException, IOException {
	

		//instance class
		Library1Return Lb=new Library1Return();
		System.setProperty("webdriver.gecko.driver","./Drivers\\geckodriver.exe");
		Lb.openApp("http://122.175.8.158/ranford2/");
		Lb.AdminLgn("Admin","Te$ting@");
		
		//to get test data file
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
			String Result=Lb.Rolecre(Rname,Rdesc, Rtype);
			
			System.out.println("Results");
			
			//Results
			WC3.setCellValue(Result);
				
		}
		
		//result excel
		FileOutputStream FOS=new FileOutputStream("F:\\Selenium joseph\\ebanking\\src\\com\\ebanking\\results\\Roles Creation.xlsx");
		WB.write(FOS);
		WB.close();
				
		
	}

	}


