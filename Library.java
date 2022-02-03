package com.ebanking.master;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Library {

		
		WebDriver driver;
		String Expval,Actval;
		
			
	public void openApp() throws InterruptedException 
	{
		String Expval="Ranford Bank";
		
		//Firefox browser
		
		System.setProperty("webdriver.gecko.driver","./Drivers\\geckodriver.exe");
		 driver=new FirefoxDriver();
		// to maximize browser
		driver.manage().window().maximize();
		
		//Enter url
		
		driver.get("http://122.175.8.158/ranford2/");
		
		Thread.sleep(1000);
		
		Actval=driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/p/span")).getText();
		
		//to comparision
		
		if(Expval.equalsIgnoreCase(Actval)){
			System.out.println("Ranford launch Successfully");
		}
		else{
			System.out.println("Ranford Launch failed");
			
			
		}
	}


		public void AdminLgn() throws InterruptedException
		{
			Expval="Welcome to Admin";
			
			driver.findElement(By.id("txtuId")).sendKeys("Admin");
			driver.findElement(By.id("txtPword")).sendKeys("Te$ting@");
			driver.findElement(By.id("login")).click();
			
			Thread.sleep(1000);
			Actval=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).getText();
			

		      //Comparision
		      
		      if (Expval.equalsIgnoreCase(Actval)) 
		      {
				System.out.println("Admin Login Succ");
			  }
		      else
		      {
		    	 System.out.println("Admin Login Failed"); 
		      }
		}
		

			public void BranchCre() throws InterruptedException
			{
				Expval="Sucessfully";
			      
				driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
				driver.findElement(By.id("BtnNewBR")).click();
				
				driver.findElement(By.id("txtbName")).sendKeys("Hyderabad444");
				driver.findElement(By.id("txtAdd1")).sendKeys("Ameerpet123");
				driver.findElement(By.id("Txtadd2")).sendKeys("SRNagar");
				driver.findElement(By.id("txtadd3")).sendKeys("Yellareddyguda");
				driver.findElement(By.id("txtArea")).sendKeys("Alinagar");
				driver.findElement(By.id("txtZip")).sendKeys("50007");
				
				//Dropdowns
				Select ctry=new Select(driver.findElement(By.id("lst_counrtyU")));
				ctry.selectByVisibleText("INDIA");
				
				Select state=new Select(driver.findElement(By.id("lst_stateI")));
				state.selectByVisibleText("Delhi");
				
				
				Select city=new Select(driver.findElement(By.id("lst_cityI")));
				city.selectByVisibleText("Delhi");
				
				// submit
				driver.findElement(By.id("btn_insert")).click();
				
				Thread.sleep(1000);
				
		       
		     
		     Actval=driver.switchTo().alert().getText();
		     
		   //Alert
		     driver.switchTo().alert().accept();
		     
		     //Comparision
		     
		     if(Actval.contains(Expval)) 
		     {
				System.out.println("Branch Created");
			  }
		     else
		     {
		   	  System.out.println("Branch Already Exist");
		     }
		     
				//to click on home button
				driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")).click();
				
			}
			
			
			public void Rolecre() throws InterruptedException
			{
				Expval=" Sucessfully";
				driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")).click();
				driver.findElement(By.id("btnRoles")).click();

				
				driver.findElement(By.id("txtRname")).sendKeys("Tester");
				driver.findElement(By.id("txtRDesc")).sendKeys("TestEngineer");
				
				//drop Downs
				
				Select roletype=new Select(driver.findElement(By.id("lstRtypeN")));
				roletype.selectByVisibleText("E");
				
				//submit
				driver.findElement(By.id("btninsert")).click();
				
				Thread.sleep(1000);
				
				Actval=driver.switchTo().alert().getText();
				//Alert
				driver.switchTo().alert().accept();
				
				 //Comparision
			     
			     if(Actval.contains(Expval)) 
			     {
					System.out.println("Role Created");
				  }
			     else
			     {
			   	  System.out.println("Role Already Exist");
			     }

				
				//click on home buttom
				driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")).click();
				
			}
			
			public void Employeecre() throws InterruptedException
			{
				Expval="Try again";
				
				driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[8]/td/a/img")).click();
				driver.findElement(By.id("BtnNew")).click();
				
				driver.findElement(By.id("txtUname")).sendKeys("Josephch");
				driver.findElement(By.id("txtLpwd")).sendKeys("Josephch");
				
				//drop down
				Select role=new Select(driver.findElement(By.id("lst_Roles")));
				role.selectByVisibleText("Accountant");
				
				Select branch=new Select(driver.findElement(By.id("lst_Branch")));
				branch.selectByVisibleText("Hyderabad444");
				
				//click on submit
				driver.findElement(By.id("BtnSubmit")).click();
				
				Thread.sleep(1000);
				
				Actval=driver.switchTo().alert().getText();
				
				//Alert
				driver.switchTo().alert().accept();
				
				//Comparision
			     
			     if(Actval.contains(Expval)) 
			     {
					System.out.println("Employee Created");
				  }
			     else
			     {
			   	  System.out.println("Employee Already Exist");
			     }

				
				//to click on home button
				driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")).click();
				
			}
			
			public void logout()
			{
				driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[4]/table/tbody/tr/td[3]/a/img")).click();
			}

			public void close()
			{
				driver.close();
			}
			
	

	}


