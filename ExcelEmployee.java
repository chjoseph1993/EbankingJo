package com.ebanking.master;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelEmployee {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		//instance class
		Library1Return Lb=new Library1Return();
		Lb.openApp("http://122.175.8.158/ranford2/");
		Lb.AdminLgn("Admin","Te$ting@");
		
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
			String Result=Lb.Employeecre(Ename,Elpswd, ERole, EBranch);
			System.out.println("Results");
		
			//Results
			WC4.setCellValue(Result);
				
		}
		
		//result excel
		FileOutputStream FOS=new FileOutputStream("F:\\Selenium joseph\\ebanking\\src\\com\\ebanking\\results\\Employee Creation.xlsx");
		WB.write(FOS);
		WB.close();

	}

}
