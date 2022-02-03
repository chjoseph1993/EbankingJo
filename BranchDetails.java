package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BranchDetails 
{
	//Element Properties
	
	//Home
	
	@FindBy (xpath="/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")
    WebElement Home;
	
	
	//Branch
	@FindBy (id="BtnNewBR")
    WebElement NewBranch;
	
	//Elememt Methods
	
	public void Home()
	{
		Home.click();
	}
	
	public void NewBranch()
	{
		NewBranch.click();
	}
}
