package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminHomePage 
{
	//Element Properties
		
		//Branch
	
		@FindBy (xpath="//img[@src='images/Branches_but.jpg']")
	    WebElement Branch;
		
		
		//Roles
		@FindBy (xpath=".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")
	    WebElement Role;
		
		//Employee
		
		@FindBy (xpath="/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[8]/td/a/img")
	    WebElement Employee;
		
		//Log out
		
		@FindBy (xpath="/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[4]/table/tbody/tr/td[3]/a/img")
	    WebElement Logout;

	    //Elememt Methods
		
		public void Branch()
		{
			Branch.click();
		}
		
		public void Role()
		{
			Role.click();
		}
		
		public void Employee()
		{
			Employee.click();
		}
		
		public void Logout()
		{
			Logout.click();
		}
}
		

		
		
		
		
		
		
		
		
		
		