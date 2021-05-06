package ObjectOperations;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class GetScreenShot {
	
	public static void  getScreen(WebDriver driver, String filename) throws IOException
	{
		
		///Date Format
		String  dateReq = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		
		//define screenshot object with webdriver  
		File scrscreen    = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		///define the file path 
		
		String mypath  ="C:\\Users\\sures\\Desktop\\Softwares\\Screens\\"+dateReq+"-"+filename+".png"; 
		File DesFile  = new File(mypath);
		
		
		//copy the file in destination
		FileUtils.copyFile(scrscreen, DesFile);		
	
	}
}

	