package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BranchCreation 
{
	//Element Properties
	
	@FindBy (id="txtbName")
	WebElement Bname;
	
	@FindBy (id="txtAdd1")
    WebElement Add1;
	
	@FindBy (id="Txtadd2")
    WebElement Add2;
	
	@FindBy (id="txtadd3")
    WebElement Add3;
	
	@FindBy (id="txtArea")
    WebElement Area;
	
	@FindBy (id="txtZip")
    WebElement Zipcode;
	
	@FindBy (id="lst_counrtyU")
    WebElement Ctry;
	
	@FindBy (id="lst_stateI")
    WebElement State;
	
	@FindBy (id="lst_cityI")
    WebElement City;
	
	@FindBy (id="btn_insert")
    WebElement Submit;
	
	


	//Element Methods
	
	public void BranchCreation()
	{
		Bname.sendKeys("Hyderabad40");
		Add1.sendKeys("Irlapadu");
		Add2.sendKeys("Nadendla");
		Add3.sendKeys("Guntur");
		Area.sendKeys("Narasaraopet");
		Zipcode.sendKeys("52261");
		Ctry.sendKeys("INDIA");
		State.sendKeys("GOA");
		City.sendKeys("GOA");
		Submit.click();
	}
	
}
