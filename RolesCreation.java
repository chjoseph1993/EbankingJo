package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RolesCreation 
{
	//Element Properties
	
			@FindBy (id="txtRname")
			WebElement Rname;
			
			@FindBy (id="txtRDesc")
		    WebElement Rdesc;
			
			@FindBy (id="lstRtypeN")
		    WebElement Rtype;
			
			@FindBy (id="btninsert")
		    WebElement Submit;


			//Element Methods
			
			public void RoleCreation()
			{
				Rname.sendKeys("Tester");
				Rdesc.sendKeys("TestEnineer");
				Rtype.sendKeys("E");
				Submit.click();
			}

}
