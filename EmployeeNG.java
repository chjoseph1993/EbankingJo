package com.ebanking.master;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EmployeeNG extends Base
{
	
  @Test (dataProvider="Edata")
  
  public void Employee(String Ename,String Lpwd) throws InterruptedException {
	  LB.Employeecre(Ename,Lpwd);
  }
  
  @DataProvider
	
	public Object [][] Edata()
	{
		Object [][] Obj=new Object [4][2];
		
		Obj[0][0]="Josephch";
		Obj[0][1]="Josephch";
		
		
		Obj[1][0]="Josephchh";
		Obj[1][1]="Josephch1";
		
		
		Obj[2][0]="Josephchhh";
		Obj[2][1]="Josephch2";
		
		
		Obj[3][0]="Josephchhhh";
		Obj[3][1]="Josephch3";
		
		
		return Obj;
}
}
