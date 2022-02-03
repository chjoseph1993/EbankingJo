package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RolesDetails {
	
	//Element Properties
	
			//Home
		
			@FindBy (xpath="/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")
		    WebElement Home;
			
			
			//Roles
			@FindBy (xpath="//*[@id=\"btnRoles\"]")
		    WebElement NewRole;
			
			//Elememt Methods
			
			public void Home()
			{
				Home.click();
			}
			
			public void NewRole()
			{
				NewRole.click();
			}

}
