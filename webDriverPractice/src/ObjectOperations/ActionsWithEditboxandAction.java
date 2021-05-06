package ObjectOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsWithEditboxandAction {

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
		 Actions myAct  = new Actions(EditOpesAct);
		 
		 Action testAct =  myAct.moveToElement(loginEmail).click()
				 .keyDown(Keys.SHIFT)
				 .sendKeys("testervani")
				 .keyUp(Keys.SHIFT)
				 .doubleClick()
				// .contextClick()
				 .build();
		 testAct.perform();
				 
			WebElement pwd  = EditOpesAct.findElement(By.name("pass"));
			testAct = myAct.moveToElement(pwd).click()
					.sendKeys("tester")
					.build();
		testAct.perform();
		
		WebDriverWait mywait  = new WebDriverWait(EditOpesAct, 30);
		
		
		
		 

	}

}
