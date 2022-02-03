package com.ebanking.master;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelBranch {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		//instance class
				Library1Return Lb=new Library1Return();
				Lb.openApp("http://122.175.8.158/ranford2/");
				Lb.AdminLgn("Admin","Te$ting@");
				
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
					String Result=Lb.BranchCre(Bname,Badd1,Badd2,Badd3,Barea,Bzipcode, Bcity, Bstate, Bcountry);
					
					System.out.println("Results");
				
					//Results
					WC9.setCellValue(Result);

			}
				//result excel
						FileOutputStream FOS=new FileOutputStream("F:\\Selenium joseph\\ebanking\\src\\com\\ebanking\\results\\Branch Creation.xlsx");
						WB.write(FOS);
						WB.close();


	}

}
