package poiExcelPractice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



import parameterization.excelUDF;

public class DataWriteinexcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//excel file address
		 String filename ="C:\\Users\\sures\\OneDrive\\Documents\\Testing\\Mydata.xlsx";
		String sheetname="Sheet5";
		
		///set browser path  
		System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver.exe");
		
		
		///create browser instance
		WebDriver myDriver  =  new ChromeDriver();
		
		
		
		///open test app 
		myDriver.navigate().to("http://www.facebook.com");
		
		///capture  B title  
		String ActualBTitle  = myDriver.getTitle();
		if(ActualBTitle.equalsIgnoreCase("Facebook - Log In or Sign Up"))
		{
			poiexcelUDF.fnwriteinexcel(filename, sheetname, 1,2,"FB Homepage displayed");
			poiexcelUDF.fnwriteinexcel(filename, sheetname, 1, 3, "Passed");			
		}
		else
		{
			poiexcelUDF.fnwriteinexcel(filename, sheetname, 1,2,"FB Homepage not  displayed");
			poiexcelUDF.fnwriteinexcel(filename, sheetname, 1, 3, "Failed");
			
		}
		//identify the login email
				WebElement myemail=myDriver.findElement(By.id("email"));
				/////login emai displayed or not  
				if(myemail.isDisplayed())
				{
					poiexcelUDF.fnwriteinexcel(filename, sheetname, 2, 2, "Login email displayed");
					poiexcelUDF.fnwriteinexcel(filename, sheetname,2, 3, "Passed");
				}
				else
				{
					poiexcelUDF.fnwriteinexcel(filename, sheetname, 2, 2, "Login email not displayed");
					poiexcelUDF.fnwriteinexcel(filename, sheetname, 2, 3, "Failed");
					
				}
				
				///login email enabled or not  
				if((myemail.isEnabled())==true)
				{
					poiexcelUDF.fnwriteinexcel(filename, sheetname, 3, 2, "Login email is enabled");
					poiexcelUDF.fnwriteinexcel(filename, sheetname, 3, 3, "Passed");
					
				}
				else
				{
					poiexcelUDF.fnwriteinexcel(filename, sheetname, 3, 2, "Login email is not enabled");
					poiexcelUDF.fnwriteinexcel(filename, sheetname, 3, 3, "Failed");
				}
				///data read from excel and sheet is myData
				String myLoginEmail   = poiexcelUDF.fnreadfrompoiexcel(filename, "Sheet4", 1, 0);
				
				myemail.sendKeys(myLoginEmail);
				//capture data fro app
				String mylogindata=myemail.getAttribute("value");
				if(myLoginEmail.equalsIgnoreCase(mylogindata))
				{
					poiexcelUDF.fnwriteinexcel(filename, sheetname, 4,2,"data is entered");
					poiexcelUDF.fnwriteinexcel(filename, sheetname, 4, 3, "passed");
					
				}
				else
				{
					poiexcelUDF.fnwriteinexcel(filename, sheetname, 4, 2, "data is not entered");
					poiexcelUDF.fnwriteinexcel(filename, sheetname, 4, 3, "failed");
				}
				
				//identify pwdWebElement
				WebElement mypwd=myDriver.findElement(By.id("pass"));

				if(mypwd.isDisplayed())
				{
					poiexcelUDF.fnwriteinexcel(filename, sheetname, 5, 2,"pwd is displayed");
					poiexcelUDF.fnwriteinexcel(filename, sheetname, 5, 3, "passed");
				}
				else
				{
					poiexcelUDF.fnwriteinexcel(filename, sheetname, 5, 2, "pwd is not displayed");
					poiexcelUDF.fnwriteinexcel(filename, sheetname, 5, 3, "failed");
				}
				
				///pwd is enabled or not
				if(mypwd.isDisplayed())
				{
					poiexcelUDF.fnwriteinexcel(filename, sheetname, 6, 2, "pwd is enabled");
					poiexcelUDF.fnwriteinexcel(filename, sheetname, 6, 3, " passed");
					//identify pwdWebElement
		
                  //data read from excel sheet is my data
					String pwd=poiexcelUDF.fnreadfrompoiexcel(filename, "Sheet4", 1, 1);
					mypwd.sendKeys(pwd);
					
				}
				else
				{
					poiexcelUDF.fnwriteinexcel(filename, sheetname, 6, 2, "pwd is not enabled");
					poiexcelUDF.fnwriteinexcel(filename, sheetname, 6, 3, "failed");
				}
				///identify the  login button
				WebElement loginb=myDriver.findElement(By.name("login"));
				
				
				///login button displayed or not 
				if(loginb.isDisplayed())
				{
					poiexcelUDF.fnwriteinexcel(filename, sheetname, 7, 2, "login button is displayed");
					poiexcelUDF.fnwriteinexcel(filename, sheetname, 7, 3, "passed");
					
				}
				else
				{
					poiexcelUDF.fnwriteinexcel(filename, sheetname, 7, 2, "login button is not displayed");
					poiexcelUDF.fnwriteinexcel(filename, sheetname, 7, 3, "failed");
				}
				
				
				///login button enabled or not 
				if(loginb.isEnabled())
				{
					poiexcelUDF.fnwriteinexcel(filename, sheetname, 8, 2, "login button is enabled");
					poiexcelUDF.fnwriteinexcel(filename, sheetname, 8, 3, "passed");
				}
				else
				{
					poiexcelUDF.fnwriteinexcel(filename, sheetname, 8, 2, "is not enabled");
					poiexcelUDF.fnwriteinexcel(filename, sheetname, 8, 3, "failed");
				}
				loginb.click();
				
				
				
				
				
				
				
		

	}

}
