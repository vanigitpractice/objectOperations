package parameterization;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.read.biff.BiffException;
import jxl.write.WriteException;

public class WriteMultipleCells {

	public static void main(String[] args) throws WriteException, BiffException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver.exe");
		//browser instance
		WebDriver multicells=new ChromeDriver();
		//maximize
		multicells.manage().window().maximize();
		multicells.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		//open app
		multicells.get("http://www.facebook.com");
		//excel file address
		String fileName="C:\\Users\\sures\\OneDrive\\Documents\\Testing\\TestData.xls";
		
		///excel sheet name  
		String sheetName ="Sheet8";
		String ExpectedTitle  = "Facebook - Log In or Sign Up";
		//capture title
		String titleName=multicells.getTitle();
		//comparing title
		if(titleName.equalsIgnoreCase(ExpectedTitle))
		
		{
			excelUDF.fnWriteMultipleCols(fileName, sheetName, "openfacebook", "facebook home page shouldbe displayed", "page displayed", "passed");
		}
		else
		{
			excelUDF.fnWriteMultipleCols(fileName, sheetName, "open facebook", "facebook shoud not be displayed", "page is not displayed","failed");
			
		}
		//identify email
				WebElement logemail=multicells.findElement(By.name("email"));
				logemail.sendKeys("Sanjana");
				//verify login email
				if(logemail.isDisplayed())
				if(logemail.isEnabled())
				{
					excelUDF.fnWriteMultipleCols(fileName, sheetName, "verify login email", "email should be displayed", "email displayed", "passed");
					excelUDF.fnWriteMultipleCols(fileName, sheetName, "verify status login email", "email should be enabled", "email enabled", "passed");
		             
				}
				else
				{
					excelUDF.fnWriteMultipleCols(fileName, sheetName, "verify login email", "email should not displayed", "email is not displayed", "failed");

				}
				else
				{
					excelUDF.fnWriteMultipleCols(fileName, sheetName, "verify status login email", "email should not enabled", "email is not enabled", "failed");

				}
		
				//identify password
				WebElement logpwd=multicells.findElement(By.name("pass"));
				logpwd.sendKeys("Behara");
				//verify login email displayed and enabled
				if(logpwd.isDisplayed())
				{
					excelUDF.fnWriteMultipleCols(fileName, sheetName, "verify login pwd", "pwd should be displayed", "pwd displayed", "passed");
					
					if(logpwd.isEnabled())
					{
						
						excelUDF.fnWriteMultipleCols(fileName, sheetName, "verify status login pwd", "pwd should be enabled", "pwd enabled", "passed");
			             
					}
					else
					{
						excelUDF.fnWriteMultipleCols(fileName, sheetName, "verify status login pwd", "pwd should not enabled", "pwd is not enabled", "failed");						
					}
				}
				else
				{
					
					excelUDF.fnWriteMultipleCols(fileName, sheetName, "verify login pwd", "pwd should not displayed", "pwd is not displayed", "failed");

				}
				//click on create an account
				WebElement createacc=multicells.findElement(By.linkText("Create New Account"));
				createacc.click();
				//identify first name
				WebElement fname=multicells.findElement(By.name("firstname"));
				if(fname.isDisplayed())
				if(fname.isEnabled())
				{
					excelUDF.fnWriteMultipleCols(fileName, sheetName, "verify first name", "first name should be displayed", "first name displayed", "passed");
					excelUDF.fnWriteMultipleCols(fileName, sheetName, "verify status first name", "first name should be enabled", "first name enabled", "passed");
		            fname.sendKeys("Nithika"); 
				}
				else
				{
					excelUDF.fnWriteMultipleCols(fileName, sheetName, "verify  first name", "first name should not displayed", "first name is not displayed", "failed");

				}
				else
				{
					excelUDF.fnWriteMultipleCols(fileName, sheetName, "verify status  first name", "first name should not enabled", "first name is not enabled", "failed");

				}
				WebElement lname=multicells.findElement(By.name("lastname"));
				if(lname.isDisplayed())
				if(lname.isEnabled())
				{
					excelUDF.fnWriteMultipleCols(fileName, sheetName, "verify last name", "last name should be displayed", "last name displayed", "passed");
					excelUDF.fnWriteMultipleCols(fileName, sheetName, "verify status last name", "last name should be enabled", "last name enabled", "passed");
		            lname.sendKeys("M"); 
				}
				else
				{
					excelUDF.fnWriteMultipleCols(fileName, sheetName, "verify  last name", "last name should not displayed", "last name is not displayed", "failed");

				}
				else
				{
					excelUDF.fnWriteMultipleCols(fileName, sheetName, "verify status login last name", "last name should not enabled", "last name is not enabled", "failed");

				}

				
		

				

	}

}
