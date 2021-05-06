package poiExcelPractice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataWrireinExcelwithMultipleCoumn {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//set browser path;
		System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver.exe");
		//create browser instance
		WebDriver writemc=new ChromeDriver();
		//maximize browser
		writemc.manage().window().maximize();
		//open app
		writemc.get("http://www.facebook.com");
		//file name
		 String filename ="C:\\Users\\sures\\OneDrive\\Documents\\Testing\\Mydata.xlsx";
			String sheetname="Sheet3";
			///btitle  
			
		poiexcelUDF.fnwriteinexcelwithmutiple(filename, sheetname, "open App", "FB Displayed", "FB Displayed", "Passed");
		//identify email
		WebElement myemail=writemc.findElement(By.name("email"));
		
		//verify login email
		if(myemail.isDisplayed())
			
		{
			poiexcelUDF.fnwriteinexcelwithmutiple(filename, sheetname,"verifyloginemail ", "loginemail should be displayed","login email diplayed" ," passed");
		}
		else
		{
			poiexcelUDF.fnwriteinexcelwithmutiple(filename, sheetname, "verify login email","login email should not be displayed","login email not displayed", "failed");
		}
		//verify login email status
		if(myemail.isEnabled())
		{
		  poiexcelUDF.fnwriteinexcelwithmutiple(filename, sheetname,"verify login email status","login email should be enabled","login email is enabled", "passed");
		}
		else
		{
		  poiexcelUDF.fnwriteinexcelwithmutiple(filename, sheetname,"verify login email status","login email should not be enabled","login email is not enabled","failed");
		}
		//enter data
		myemail.sendKeys("sanjana");
		//capture data
		String myemail1="sanjana";
		String mydata=myemail.getAttribute("value");
		if(mydata.equalsIgnoreCase(myemail1))
		{
		poiexcelUDF.fnwriteinexcelwithmutiple(filename, sheetname,"enter data","data should be entered","data is entered","passed");
		}
		else
		{
		poiexcelUDF.fnwriteinexcelwithmutiple(filename, sheetname, "enter data", "data should not be entered","data is not entered","failed");	
		}
		//identify password
		WebElement mypwd=writemc.findElement(By.name("pass"));
		//verify pwd
		if(mypwd.isDisplayed())
		{
			poiexcelUDF.fnwriteinexcelwithmutiple(filename, sheetname,"verifylogin pwd ", "login pwd should be displayed","login pwd diplayed" ," passed");
		}
		else
		{
			poiexcelUDF.fnwriteinexcelwithmutiple(filename, sheetname, "verify login pwd","login pwd should not be displayed","login pwd not displayed", "failed");
		}
		//verify login pwd status
		if(mypwd.isEnabled())
		{
		  poiexcelUDF.fnwriteinexcelwithmutiple(filename, sheetname,"verify login pwd status","login pwd should be enabled","login pwd is enabled", "passed");
		}
		else
		{
		  poiexcelUDF.fnwriteinexcelwithmutiple(filename, sheetname,"verify login pwd status","login pwd should not be enabled","login pwd is not enabled","failed");
		}
		//enter data
		mypwd.sendKeys("C");
		//capture data
		String mypwd1="C";
		String mypwddata=mypwd.getAttribute("value");
		if(mypwddata.equalsIgnoreCase(mypwd1))
		{
		 poiexcelUDF.fnwriteinexcelwithmutiple(filename, sheetname,"enter data","data should be entered","data is entered","passed");
	    }
		else
		{
			poiexcelUDF.fnwriteinexcelwithmutiple(filename, sheetname,"enter data","data should not be entered","data is not entered","failed");
		}
		
		
			

	}

}
