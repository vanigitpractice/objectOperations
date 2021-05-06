package ObjectOperations;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//set browser path
		System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver.exe");
		//instance
		WebDriver driver= new ChromeDriver();
		
		//maximize browser
		driver.manage().window().maximize();
		
		
		//open app
		driver.get("http://www.facebook.com");
		GetScreenShot.getScreen(driver,"empty1");
		//identify the login email
		WebElement myemail= driver.findElement(By.name("email"));
		//exist or not
		if(myemail.isDisplayed())
		{
			System.out.println("email is displayed");
			GetScreenShot.getScreen(driver, "LoginEmail1");
			
		}
		else
		{
			System.out.println("email is not displayed");
			GetScreenShot.getScreen(driver, "LoginEmail1");
		}
		//identify pwd
		WebElement mypwd=driver.findElement(By.name("pass"));
		mypwd.sendKeys("vani");
		GetScreenShot.getScreen(driver, "enterdata");
		
		//click on login
		WebElement login=driver.findElement(By.name("login"));
	}

}
