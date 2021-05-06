package ObjectOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsWithEditbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		
		//create browser instance
		WebDriver EditOpesAct = new ChromeDriver();
		//maximize the browser
		EditOpesAct.manage().window().maximize();
		
		//open test application
		EditOpesAct.get("http://www.facebook.com");
		///identify the login  
		 WebElement loginEmail  = EditOpesAct.findElement(By.name("email"));
		 
		 ///define actions  
		 Actions myAct  = new  Actions(EditOpesAct);
		 
		 myAct.moveToElement(loginEmail).sendKeys("vani").build().perform();
		 
		// myAct.sendKeys(loginEmail, "testert");	
		
		
		
		
	}

}
