package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmployeeCreation 
{
	//Element Properties
	
	@FindBy (id="txtUname")
	WebElement Ename;
	
	@FindBy (id="txtLpwd")
    WebElement Lpwd;
	
	@FindBy (id="lst_Roles")
    WebElement ERole;
	
	@FindBy (id="lst_Branch")
    WebElement EBranch;
	
	@FindBy (id="BtnSubmit")
    WebElement Submit;
	
	
	//Element Methods
	
	public void EmployeeCreation()
	{
		Ename.sendKeys("Joseph");
		Lpwd.sendKeys("Joseph");
		ERole.sendKeys("Accountant");
		EBranch.sendKeys("RanfordSahitya5");
		Submit.click();
		
}
}