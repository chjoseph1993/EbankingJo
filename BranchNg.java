package com.ebanking.master;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BranchNg extends Base {
	
  @Test (dataProvider="Bdata")
  public void Branch(String Bname,String Add1,String Add2,String Add3,String Area,String Zipcode) throws InterruptedException  {
	  
	  LB.BranchCre(Bname,Add1,Add2,Add3,Area,Zipcode);
  }
  @DataProvider
	
	public Object [][] Bdata()
	{
		Object [][] Obj=new Object [4][6];
		
		Obj[0][0]="Hyderabad444";
		Obj[0][1]="Ameerpet123";
		Obj[0][2]="SRNagar";
		Obj[0][3]="Yellareddyguda";
		Obj[0][4]="Alinagar";
		Obj[0][5]="50007";
		
		
		Obj[1][0]="Hyderabad4444";
		Obj[1][1]="Ameerpet124";
		Obj[1][2]="SRNagarr";
		Obj[1][3]="Yellareddygudb";
		Obj[1][4]="Alinagarr";
		Obj[1][5]="50008";
		
		
		Obj[2][0]="Hyderabad44444";
		Obj[2][1]="Ameerpet125";
		Obj[2][2]="SRNagarrr";
		Obj[2][3]="Yellareddygudc";
		Obj[2][4]="Alinagarrr";
		Obj[2][5]="50009";
		
		
		Obj[3][0]="Hyderabad444444";
		Obj[3][1]="Ameerpet126";
		Obj[3][2]="SRNagarrrr";
		Obj[3][3]="Yellareddygudd";
		Obj[3][4]="Alinagarrrr";
		Obj[3][5]="50010";
		
		
		return Obj;
}
}