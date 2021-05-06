package parameterization;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.read.biff.BiffException;

public class Excelpractice {

	public static void main(String[] args) throws BiffException, IOException {
		// TODO Auto-generated method stub
		
		   String  VaniFilename="C:\\Users\\sures\\OneDrive\\Documents\\Testing\\ExcelPractice\\VaniExcelPractice.xls";
		  // "C:\\Users\\sures\\OneDrive\\Documents\\Testing\\TestData.xls";

		   String Sheetname="Sheet1";
		   //sheetcount
		   int sheetcount =excelUDF.fnSheetCountInExcel(VaniFilename);
		   System.out.println("no of sheets are"+sheetcount);
		   //rowCount
		   int rowcount =excelUDF.fnRowCountInExclSheet(VaniFilename,Sheetname);
		   System.out.println("no of rows"+rowcount);
		   //read cell data
		   String celldata=excelUDF.fnReadFromExcel(VaniFilename, Sheetname, 1, 2);
		   System.out.println(celldata);
		   
		   System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
			
			//create browser instance
			WebDriver EditOpesAct = new ChromeDriver();
			//maximize the browser
			EditOpesAct.manage().window().maximize();
			
			//open test application
			EditOpesAct.get("http://www.facebook.com");
			String loginem=excelUDF.fnReadFromExcel(VaniFilename, Sheetname, 1, 0);
		     System.out.println(loginem);
            WebElement myEmail=EditOpesAct.findElement(By.name("email"));
            myEmail.sendKeys(loginem);
            String mypwd=excelUDF.fnReadFromExcel(VaniFilename, Sheetname, 1, 1);
            WebElement mypassw=EditOpesAct.findElement(By.name("pass"));
            mypassw.sendKeys(mypwd);
	}

}
