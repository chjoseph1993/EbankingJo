package com.ebanking.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Library1Return {
	
	WebDriver driver;
	String Expval,Actval;
	FileInputStream FIS;
	Properties PR;

	
public String openApp(String Url) throws InterruptedException, IOException
{
	FIS=new FileInputStream("D:\\Ebanking-Joseph2\\Ebanking.Joseph\\src\\com\\ebanking\\joseph\\properties\\Rep.properties");
	PR=new Properties();
	PR.load(FIS);
	
	String Expval="Ranford Bank";
	
	//Firefox browser
	
	System.setProperty("webdriver.gecko.driver","./Drivers\\geckodriver.exe");
	driver=new FirefoxDriver();
	// to maximize browser
	driver.manage().window().maximize();
	
	//Enter Url
	
	driver.get(Url);
	
	Thread.sleep(1000);
	
	Actval=driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/p/span")).getText();
	
	//to comparision
	
	if(Expval.equalsIgnoreCase(Actval)){
		System.out.println("Ranford launch Successfully");
	}
	else{
		System.out.println("Ranford Launch failed");
		
		
	}
	return "Pass";
}


	public String AdminLgn(String Un,String Pwd) throws InterruptedException
	{
		Expval="Welcome to Admin";
		
		driver.findElement(By.id(PR.getProperty("Uname"))).sendKeys(Un);
		driver.findElement(By.id(PR.getProperty("Pswd"))).sendKeys(Pwd);
		driver.findElement(By.id(PR.getProperty("Lgn"))).click();
		
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
	      return "Adm succ";
	}
	

		public String BranchCre(String Bname,String Add1,String Add2,String Add3,String Area,String Zipcode) throws InterruptedException
		{
			Expval="Sucessfully";
		      
			driver.findElement(By.xpath(PR.getProperty("BBranch"))).click();
			driver.findElement(By.id(PR.getProperty("BBranchCre"))).click();
			
			driver.findElement(By.id(PR.getProperty("Bname"))).sendKeys(Bname);
			driver.findElement(By.id(PR.getProperty("Badd1"))).sendKeys(Add1);
			driver.findElement(By.id(PR.getProperty("Badd2"))).sendKeys(Add2);
			driver.findElement(By.id(PR.getProperty("Badd3"))).sendKeys(Add3);
			driver.findElement(By.id(PR.getProperty("Barea"))).sendKeys(Area);
			driver.findElement(By.id(PR.getProperty("Bzipcode"))).sendKeys(Zipcode);
			
			//Dropdowns
			Select ctry=new Select(driver.findElement(By.id(PR.getProperty("Bcountry"))));
			ctry.selectByVisibleText("INDIA");
			
			Select state=new Select(driver.findElement(By.id(PR.getProperty("Bstate"))));
			state.selectByVisibleText("Delhi");
			
			
			Select city=new Select(driver.findElement(By.id(PR.getProperty("Bcity"))));
			city.selectByVisibleText("Delhi");
			
			// submit
			driver.findElement(By.id(PR.getProperty("Bsubmit"))).click();
			
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
			
			 return "Branch succ";
		}
		
		
		public String Rolecre(String Rname,String Rdesc) throws InterruptedException
		{
			Expval=" Sucessfully";
			driver.findElement(By.xpath(PR.getProperty("RRole"))).click();
			driver.findElement(By.id(PR.getProperty("RRoleCre"))).click();

			
			driver.findElement(By.id(PR.getProperty("Rname"))).sendKeys(Rname);
			driver.findElement(By.id(PR.getProperty("Rdesc"))).sendKeys(Rdesc);
			
			//drop Downs
			
			Select roletype=new Select(driver.findElement(By.id(PR.getProperty("Rtype"))));
			roletype.selectByVisibleText(Rdesc);
			
			//submit
			driver.findElement(By.id(PR.getProperty("Rsubmit"))).click();
			
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
			
			 return "Roll succ";
		}
		
		public String Employeecre(String Ename,String Lpwd) throws InterruptedException
		{
			Expval="Try again";
			
			driver.findElement(By.xpath(PR.getProperty("EEmployee"))).click();
			driver.findElement(By.id(PR.getProperty("EEmployeeCre"))).click();
			
			driver.findElement(By.id(PR.getProperty("Ename"))).sendKeys(Ename);
			driver.findElement(By.id(PR.getProperty("Elpswd"))).sendKeys(Lpwd);
			
			//drop down
			Select role=new Select(driver.findElement(By.id(PR.getProperty("ERole"))));
			role.selectByVisibleText("air craft manager");
			
			Select branch=new Select(driver.findElement(By.id(PR.getProperty("EBranch"))));
			branch.selectByVisibleText("S R Nagar");
			
			//click on submit
			driver.findElement(By.id(PR.getProperty("Esubmit"))).click();
			
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
			
			 return "Emp succ";
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
