package com.ebanking.master;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RoleNG extends Base{
	
  @Test (dataProvider="Rdata")
  public void RoleCre(String Rname,String Rdesc) throws InterruptedException 
  {
	  LB.Rolecre(Rname,Rdesc);
	  
  }
  
  @DataProvider
	
	public Object [][] Rdata()
	{
		Object [][] Obj=new Object [4][2];
		
		Obj[0][0]="Tester";
		Obj[0][1]="TestEngineer";
		
		
		Obj[1][0]="Testerr";
		Obj[1][1]="TestEngineer2";
		
		
		Obj[2][0]="Testerrr";
		Obj[2][1]="TestEngineer3";
		
		
		Obj[3][0]="Testerrrr";
		Obj[3][1]="TestEngineer4";
		
		
		return Obj;
		
}
}