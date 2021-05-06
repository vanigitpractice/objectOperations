package parameterization;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import jxl.read.biff.BiffException;
import jxl.write.WriteException;

public class DataWriteinExcel {

	public static void main(String[] args) throws WriteException, BiffException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver.exe");
		//browser instance
		WebDriver Exceldata=new ChromeDriver();
		//maximize
		Exceldata.manage().window().maximize();
		Exceldata.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//excel file address  
		String fileName = "C:\\Users\\sures\\OneDrive\\Documents\\Testing\\TestData.xls";
		
		///excel sheet name  
		String sheetName ="Result";
		//open app
		Exceldata.get("http://www.facebook.com");
		String BRtitle=Exceldata.getTitle();
		//title verification  
		if(BRtitle.equalsIgnoreCase("Facebook - Log In or Sign Up"))
		{
			excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 1, 3, "Facebook is displayed");
			excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 1, 4, "Passed");
		}
		else
		{
			excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 1, 3, "Facebook is not displayed");
			excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 1, 4, "Failed");			
		}
		
		
		//identify the login email
		WebElement myemail=Exceldata.findElement(By.id("email"));
		/////login emai displayed or not  
		if(myemail.isDisplayed())
		{
			excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 2, 3, "Login email displayed");
			excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 2, 4, "Passed");
		}
		else
		{
			excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 2, 3, "Login email not displayed");
			excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 2, 4, "Failed");
			
		}
		
		///login email enabled or not  
		if((myemail.isEnabled())==true)
		{
			excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 3, 3, "Login eal is enabled");
			excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 3, 4, "Passed");
		}
		else
		{
			excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 3, 3, "Login email is not enabled");
			excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 3, 4, "Failed");
		}
		
		///data read from excel and sheet is myData
		String myLoginEmail   = excelUDF.fnReadFromExcel(fileName, "myData", 1, 0);
		///enter data  
		myemail.sendKeys(myLoginEmail);
		//identify pwd
		WebElement mypwd=Exceldata.findElement(By.id("pass"));
		if(mypwd.isDisplayed())
		{
			excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 4, 3,"pwd is displayed");
			excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 4, 4, "passed");
		}
		else
		{
			excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 4, 3, "pwd is not displayed");
			excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 4, 4, "failed");
		}
		
		///pwd is enabled or not
		if(mypwd.isEnabled())
		{
			excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 5, 3, "pwd is enabled");
			excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 5, 4, " passed");
		}
		else
		{
			excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 5, 3, "pwd is not enabled");
			excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 5, 4, "failed");
		}
		
		//data read from excel sheet is my data
		String pwd=excelUDF.fnReadFromExcel(fileName, "myData", 1, 1);
		mypwd.sendKeys(pwd);
		
		///identify the  login button
		WebElement loginb=Exceldata.findElement(By.name("login"));
		
		
		///login button displayed or not 
		if(loginb.isDisplayed())
		{
			excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 6, 3, "login button is displayed");
			excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 6, 4, "passed");
			
		}
		else
		{
			excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 6, 3, "login button is not displayed");
			excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 6, 4, "failed");
		}
		
		
		///login button enabled or not 
		if(loginb.isEnabled())
		{
			excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 7, 3, "login button is enabled");
			excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 7, 4, "passed");
		}
		else
		{
			excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 7, 3, "is not enabled");
			excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 7, 4, "failed");
		}
		
		
		////identify the create account
		WebElement createacc=Exceldata.findElement(By.linkText("Create New Account"));
		
		///click on  create account
		createacc.click();
		//identify the firstname
		WebElement fname=Exceldata.findElement(By.name("firstname"));
		//first name displayed or not
		if(fname.isDisplayed())
		if(fname.isEnabled())
		{
			excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 9, 3, "first name is displayed");
			excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 9, 4, "passed");
			excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 10, 3, "first name is enabled");
			excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 10, 4, "passed");
		}
		else
		{
		excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 9, 3, "first name is not displayed");
		excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 9, 4, "failed");
		}
		else
		{
		excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 10, 3, "first name is not enabled");
		excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 10, 4, "failed");
		}
		//data read from excel
		String firstname=excelUDF.fnReadFromExcel(fileName, "myData", 1, 2);
		fname.sendKeys(firstname);
		//identify last name
		WebElement lastna=Exceldata.findElement(By.name("lastname"));
		//last name display or not,enable or not
		if(lastna.isDisplayed())
		if(lastna.isEnabled())
		{
			excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 11, 3, "last name is displayed");
			excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 11, 4, "passed");
			excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 12, 3, "last name is enabled");
			excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 12, 4, "passed");
		}
		else
		{
			excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 11, 3, "last name is not displayed");
			excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 11, 4, "failed");
		}
		else
		{
			excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 12, 3, "last name is not enabled");
			excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 12, 4, "failed");
		}
		String lname=excelUDF.fnReadFromExcel(fileName, "myData", 1, 3);
		lastna.sendKeys(lname);
		//identify the login email
				WebElement email=Exceldata.findElement(By.name("reg_email__"));
				/////login emai displayed or not  
				if(email.isDisplayed())
				{
					excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 13, 3, "Login email displayed");
					excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 13, 4, "Passed");
				}
				else
				{
					excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 13, 3, "Login email not displayed");
					excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 13, 4, "Failed");
					
				}
				
				///login email enabled or not  
				if((email.isEnabled())==true)
				{
					excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 14, 3, "Login email is enabled");
					excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 14, 4, "Passed");
				}
				else
				{
					excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 14, 3, "Login email is not enabled");
					excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 14, 4, "Failed");
				}
				
				///data read from excel and sheet is myData
				String LoginEmail   = excelUDF.fnReadFromExcel(fileName, "myData", 1, 4);
				///enter data  
		        email.sendKeys(LoginEmail);
		       //identify pwd
				WebElement mypwd1=Exceldata.findElement(By.name("reg_passwd__"));
				if(mypwd1.isDisplayed())
				{
					excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 15, 3,"pwd is displayed");
					excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 15, 4, "passed");
				}
				else
				{
					excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 15, 3, "pwd is not displayed");
					excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 15, 4, "failed");
				}
				
				///pwd is enabled or not
				if(mypwd1.isEnabled())
				{
					excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 16, 3, "pwd is enabled");
					excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 16, 4, " passed");
				}
				else
				{
					excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 16, 3, "pwd is not enabled");
					excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 16, 4, "failed");
				}
				
				//data read from excel sheet is my data
				String mpwd=excelUDF.fnReadFromExcel(fileName, "myData", 1, 6);
				mypwd1.sendKeys(mpwd);
				//identify month
				WebElement month=Exceldata.findElement(By.name("birthday_month"));
				//data read from excel
				String monname=excelUDF.fnReadFromExcel(fileName, "myData", 1, 7);
				
			    //month select or not
				month.sendKeys(monname);
				if(month.isSelected())
				{
					excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 17, 3, "month is selected");
					excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 17, 4, "passed");
				}
				else
				{
					excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 17, 3, "month is not selected");
					excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 17, 4, "failed");
				}
				//identify day
				WebElement date=Exceldata.findElement(By.name("birthday_day"));
				//data read from excel
				String day=excelUDF.fnReadFromExcel(fileName, "myData", 1, 8);
				//enter data
				date.sendKeys(day);
				//day select or not
				if(date.isSelected())
				{
					excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 18, 3, "day is selected");
					excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 18, 4, "passed");
				}
				else
				{
					excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 18, 3, "day is not selected");
				     excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 18, 4, "failed");
			    }
				   ///identify year
				WebElement year=Exceldata.findElement(By.name("birthday_year"));
				///covert to select
	
			Select yearselect=new Select(year);
			
				//data read from excel
				String yearname=excelUDF.fnReadFromExcel(fileName, "myData", 1, 9);
				//select  data
				yearselect.selectByVisibleText(yearname);
				//year.sendKeys(yearname);
				
				//year select or not
				if(year.isSelected())
				{
					excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 19, 3, "year is selected");
					excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 19, 4, "passed");
				}
				else
				{
					excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 19, 3, "year is not selected");
				     excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 19, 4, "failed");
			    }
				//identify female radio button
				WebElement femalebutton=Exceldata.findElement(By.xpath("//input[@value='1']"));
				
				femalebutton.click();
				
				if(femalebutton.isSelected())
				{
					excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 20, 3, "female is selected");
					excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 20, 4, "passed");
				}
				else
				{
					excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 20, 3, "female is not selected");
				     excelUDF.fnwriteInExcelSingleColumn(fileName, sheetName, 20, 4, "failed");
			    }
				
				
				
				
				
				
		        
				
		
		

	}

}
