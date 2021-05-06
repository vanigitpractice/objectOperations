package ObjectOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwithModelWindow {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver.exe");
		//browser instance
		WebDriver workingmw=new ChromeDriver();
		//maximize
		workingmw.manage().window().maximize();
		//open app
		workingmw.get("http://www.facebook.com");
		Thread.sleep(5000);
		//identify the places link
		WebElement placeslink=workingmw.findElement(By.linkText("Places"));
		placeslink.click();
		Thread.sleep(2000);
		///capture model window name  
		String  modelWindowName  = workingmw.getWindowHandle();
		System.out.println(modelWindowName);
		
		///switch to model  
		workingmw.switchTo().window(modelWindowName);
		
		//identify the email
		WebElement myemail= workingmw.findElement(By.id("email"));
		//enter data
		myemail.sendKeys("tester");
		//identify the password
		WebElement mypassword=workingmw.findElement(By.name("pass"));
		//enter password
		mypassword.sendKeys("practice");
		//identify login
		WebElement mylogin=workingmw.findElement(By.id("loginbutton"));
		mylogin.click();
		
		/////change to normal  
		workingmw.switchTo().defaultContent();

	}

}
