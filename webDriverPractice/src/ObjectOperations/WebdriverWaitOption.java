package ObjectOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverWaitOption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		///set browser path
				System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
				
				//create browser instance
				WebDriver webdriverWaitOp = new ChromeDriver();
				//maximize the browser
				webdriverWaitOp.manage().window().maximize();
				///implicit wait  
				
				webdriverWaitOp.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				
				
				//open test application
				webdriverWaitOp.get("http://www.facebook.com");
				//fbRegi.navigate().to("http://www.facebook.com");
				
				//identify the create new account link
				WebElement CreateNewAccount=webdriverWaitOp.findElement(By.linkText("Create New Account"));
				//click on link
				CreateNewAccount.click();
				//Thread.sleep(2000);
				
				///identify the first name  
				WebElement fname  = webdriverWaitOp.findElement(By.name("firstname"));
				///enter data  
				fname.sendKeys("vanitester");
				 
				///identify the lastname  
				WebElement lname  = webdriverWaitOp.findElement(By.name("lastname"));
				///enter data 
				lname.sendKeys("tester");
				   
				   //identify email
				   WebElement eamailname=webdriverWaitOp.findElement(By.name("reg_email__"));
				   //enter data
				   eamailname.sendKeys("Ishitha@gamil.com");
				   
				   WebDriverWait myWait  = new WebDriverWait(webdriverWaitOp, 30);
				   myWait.until(ExpectedConditions.visibilityOf(webdriverWaitOp.findElement(By.name("reg_email_confirmation__"))));
				  
				   //identify reenter email
				   WebElement reenter=webdriverWaitOp.findElement(By.name("reg_email_confirmation__"));
				   //enter data
				   reenter.sendKeys("Ishitha@gmail.com");

	}

}
