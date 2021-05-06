package parameterization;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.read.biff.BiffException;

public class DatareadfromExcel {

	public static void main(String[] args) throws Exception, BiffException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		
		//create browser instance
		WebDriver EditOpesAct = new ChromeDriver();
		//maximize the browser
		EditOpesAct.manage().window().maximize();
		EditOpesAct.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//open test application
		EditOpesAct.get("http://www.facebook.com");
		///excel file name  
		String fileName = "C:\\Users\\sures\\OneDrive\\Documents\\Testing\\TestData.xls";
		String sheetName ="Sheet2";
		
		excelUDF excelUDF=new excelUDF();
		
		///excel sheet name  
		sheetName ="myData";
		
		///sheetcount  
		int mySheetsCount  = excelUDF.fnSheetCountInExcel(fileName);
		
		System.out.println("number of sheets are  " + mySheetsCount);
		
		
		///row count  
		 int myRows  = excelUDF.fnRowCountInExclSheet(fileName,sheetName);
		 System.out.println("number of rows in  sheet 2 --> " + myRows);
		 
		 ///column count  
		 int  myCols  = excelUDF.fnColCountInExcelSheet(fileName, sheetName);
		 System.out.println("number of columns in  sheet 2--> " + myCols);
		
		///loginemail 
		 String  myEmail = excelUDF.fnReadFromExcel(fileName, sheetName, 1, 0);
		 System.out.println(myEmail);
		 
		 ///pwd  
		 String myPwd  = excelUDF.fnReadFromExcel(fileName, sheetName, 1, 1);
		 
		 System.out.println(myPwd);
		 //fname
		 String myname=excelUDF.fnReadFromExcel(fileName, sheetName, 1, 2);
		 System.out.println(myname);
		 //lastname
		 String mylname=excelUDF.fnReadFromExcel(fileName, sheetName, 1, 3);
		 System.out.println(mylname);
		 
		 
		 
			///identify the login  
			 WebElement loginEmail  = EditOpesAct.findElement(By.name("email"));
			 loginEmail.sendKeys(myEmail);
			 
			 
			 ///pwd  
			 WebElement password  = EditOpesAct.findElement(By.name("pass"));
			 password.sendKeys(myPwd);
			 Thread.sleep(4000);

			 //identify create button click on link
			 WebElement createacc=EditOpesAct.findElement(By.linkText("Create New Account"));
			 createacc.click();
			 
			 WebElement fname=EditOpesAct.findElement(By.name("firstname"));
			
			 fname.sendKeys(myname);
			 
			 WebElement lastname=EditOpesAct.findElement(By.name("lastname"));
			 lastname.sendKeys(mylname);
	
			 
			 
			 
			 
			 
			 


	}

}
