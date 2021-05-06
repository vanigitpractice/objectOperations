package SimpleExcelFramework;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import jxl.read.biff.BiffException;
import jxl.write.WriteException;

public class MainScript {

	public static void main(String[] args) throws BiffException, IOException, WriteException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver.exe");
		//browser instance
		WebDriver simpleframew=new ChromeDriver();
		simpleframew.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//maximize
		simpleframew.manage().window().maximize();
		//open app
		simpleframew.get("http://www.facebook.com");
		
		//excel file address
		String fileName="C:\\Users\\sures\\OneDrive\\Documents\\Testing\\TestData.xls";

		String sheetName="Sheet9";
		//rowcount  
		
		int myRows  = ExcelUDFS.fnRowCountInExclSheet(fileName, sheetName);
		System.out.println("rows are  " + myRows);
		for(int r=2; r<myRows; r++)
		{
			
			///read propertyname 
			String propName = ExcelUDFS.fnReadFromExcel(fileName, sheetName, r, 1);
			System.out.println(propName);
			
		///read propertyvalue  
			String propValue  = ExcelUDFS.fnReadFromExcel(fileName, sheetName, r, 2);
			System.out.println(propValue);
			
			///read  method  
			String objMethod  = ExcelUDFS.fnReadFromExcel(fileName, sheetName, r, 3);
			System.out.println("objMethod==="+objMethod);
			
			///identify the locator  
			By ObjLocator  = ObjectIdentificationProject.objProcess(propName, propValue);
			///identify the webelement  
			WebElement myElement = simpleframew.findElement(ObjLocator);
			
			///////based on method execute the case  
			switch (objMethod) {
			case "isdisplayed":				
				
				if(myElement.isDisplayed())
				{
					ExcelUDFS.fnwriteInExcelSingleColumn(fileName, sheetName, r, 6, "Object is displayed");
					ExcelUDFS.fnwriteInExcelSingleColumn(fileName, sheetName, r, 7, "Passed");
				}
				else
				{
					ExcelUDFS.fnwriteInExcelSingleColumn(fileName, sheetName, r, 6, "Object is not displayed");
					ExcelUDFS.fnwriteInExcelSingleColumn(fileName, sheetName, r, 7, "Failed");
				}
				break;
				
			case "isenabled" :
				if(myElement.isEnabled())
				{
					ExcelUDFS.fnwriteInExcelSingleColumn(fileName, sheetName, r, 6, "Object is enabled");
					ExcelUDFS.fnwriteInExcelSingleColumn(fileName, sheetName, r, 7, "Passed");
				}
				else
				{
					ExcelUDFS.fnwriteInExcelSingleColumn(fileName, sheetName, r, 6, "Object s not enabled");
					ExcelUDFS.fnwriteInExcelSingleColumn(fileName, sheetName, r, 7, "Failed");
				}
				break; 
			case "sendkeys" :
				///read data from excel  
				String testData = ExcelUDFS.fnReadFromExcel(fileName, sheetName, r, 4);
				myElement.sendKeys(testData);
				///data validation
				///capture data from app
				String ActualData = myElement.getAttribute("value");
				if(ActualData.equalsIgnoreCase(testData))
				{
					ExcelUDFS.fnwriteInExcelSingleColumn(fileName, sheetName, r, 6, "Data entered");
					ExcelUDFS.fnwriteInExcelSingleColumn(fileName, sheetName, r, 7, "Passed");
				}
				else  
				{
					ExcelUDFS.fnwriteInExcelSingleColumn(fileName, sheetName, r, 6, "Data not entered");
					ExcelUDFS.fnwriteInExcelSingleColumn(fileName, sheetName, r, 7, "Failed");
				}

				break;
				
				///link click
			case "lclick":
				myElement.click();
				///form display,  title  change  , new tab display
				break;
				
				///button click  
			case "click" :
				myElement.click();
				///form display / same title  , title change  , new tab
				//title change
				//capture title
				String Title=simpleframew.getTitle();
				System.out.println(Title);
				//verify title  
				if(Title.equalsIgnoreCase("Facebook - Log In or Sign Up"))
				{
					System.out.println(" page is dsplayed");
				}
				else
				{
					System.out.println("other page is displayed");
				}
				//new tab
				ArrayList<String> myTabs  = new  ArrayList<String>(simpleframew.getWindowHandles());
				//tab count
				int tabcount=myTabs.size();
				System.out.println("no of tabs are  : "  + tabcount);
				//capture tab titles  / names  
				for(int i=0; i<tabcount; i++)
				{
					//switch to tabs
					simpleframew.switchTo().window(myTabs.get(i));
					String tabName  = simpleframew.getTitle();
					System.out.println(tabName);
				}
				
				break;
				
			///radio button click
			case "rclick" :
				myElement.click();
				break; 
				
				///check box click  
				
			case "cbclick" :
				myElement.click();
				break;
				
				///list box  
			case  "select" :
				///webelement convert to select category  
				Select mySelect  = new Select(myElement);
				///store  all 
				List<WebElement> allMonths  = mySelect.getOptions();
				///define random  
				Random myRan  = new Random();
				//select random
				int myIndex  = myRan.nextInt(allMonths.size()-1);	
				///select by index  
				mySelect.selectByIndex(myIndex);
				///data read from excel  
				///String selectData  = ExcelUDFS.fnReadFromExcel(fileName, sheetName, r, 4);
				//mySelect.selectByVisibleText(selectData);
				///verify selected  
				break;
				
			default:
				ExcelUDFS.fnwriteInExcelSingleColumn(fileName, sheetName, r, 6, "Pending  -under development");
				ExcelUDFS.fnwriteInExcelSingleColumn(fileName, sheetName, r, 7, "Warning");
			
			}
			
			
			
		}
		
	}

}
