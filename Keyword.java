package com.ebanking.keyword;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.ebanking.master.Library1Return;

public class Keyword {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		//instance class
		
				Library1Return LB=new Library1Return();
						 
						 String Res=null;
						 
						 String Kpath="F:\\Selenium joseph\\ebanking\\src\\com\\ebanking\\keyword\\keyword_data.xlsx";
						 
						 String Kout="F:\\Selenium joseph\\ebanking\\src\\com\\ebanking\\keyword\\keyword_data ResultData.xlsx";
						
						 
						 FileInputStream fi=new FileInputStream(Kpath);
							
						 //Workbook
							XSSFWorkbook wb=new XSSFWorkbook(fi);
		                    
							//Sheet
							XSSFSheet ws=wb.getSheet("TestCase");
							XSSFSheet ws1=wb.getSheet("TestSteps");
							
							//XSSFSheet ws2=wb.getSheet("TestData");
							
							
							
							//Row count
							
							int tcRc=ws.getLastRowNum();
					        System.out.println(tcRc);
					        
							int tsRc=ws1.getLastRowNum();
							System.out.println(tsRc);
							
							//test cases

							for (int i = 1;i<=tcRc;i++)
							{
								String exe=ws.getRow(i).getCell(2).getStringCellValue();
								if (exe.equalsIgnoreCase("Y"))
								{
									String tcId=ws.getRow(i).getCell(0).getStringCellValue();
								System.out.println(tcId);
								
								//test steps
									
									for (int j = 1; j <= tsRc ; j++) 
									{
										String tsTcid=ws1.getRow(j).getCell(0).getStringCellValue();
										//System.out.println(tsTcid);
										if (tcId.equalsIgnoreCase(tsTcid))
										{
											String key=ws1.getRow(j).getCell(3).getStringCellValue();
											System.out.println(key);
											switch (key) 
											{
											case "RLanch":
												Res=LB.openApp("http://122.175.8.158/ranford2/home.aspx");
												break;
											case "RLogin":
												Res=LB.AdminLgn("Admin","Te$ting@");
												break;
											case "RBranch":
													LB.BranchCre("Hyderabad44","Irlapadu","Nadendla","Guntur","Guntur","50000","INDIA","DELHI","DELHI");
												break;
											case "RRole":
												Res=LB.Rolecre("Manager","Engineer","E");
												break;
											case "REmR":
												Res=LB.Employeecre("Josephch","Josephch","Accountant","Hyderabad444");
												break;
											case "RLogout": 	
												LB.logout();
												break;
											case "RClose":
												LB.Close();
												break;
											default:
												System.out.println("Pass a Valid Keyword");
												break;
											}

											//result updation in test steps sheet
											
											ws1.getRow(j).createCell(4).setCellValue(Res);
											
											//result updation in test case sheet
											
											if (!ws1.getRow(j).getCell(4).getStringCellValue().equalsIgnoreCase("Fail"))
											{
												ws.getRow(i).createCell(3).setCellValue(Res);
											}
											else
											{
												ws.getRow(i).createCell(3).setCellValue("Fail");
											}	
										}
									}
								}
								else
								{
									ws.getRow(i).createCell(3).setCellValue("Terminated");
								}
							}
							FileOutputStream fo=new FileOutputStream(Kout);
							wb.write(fo);
							wb.close();

						}				
					}


