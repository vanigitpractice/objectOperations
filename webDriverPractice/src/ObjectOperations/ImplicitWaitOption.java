package ObjectOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitOption {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		///set browser path
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		
		//create browser instance
		WebDriver impicitwaitOp = new ChromeDriver();
		//maximize the browser
		impicitwaitOp.manage().window().maximize();
		///implicit wait  
		
		impicitwaitOp.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//impicitwaitOp.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		//open test application
		impicitwaitOp.get("http://www.facebook.com");
		//fbRegi.navigate().to("http://www.facebook.com");
		
		//identify the create new account link
		WebElement CreateNewAccount=impicitwaitOp.findElement(By.linkText("Create New Account"));
		//click on link
		CreateNewAccount.click();
		//Thread.sleep(2000);
		
		///identify the first name  
		 WebElement fname  = impicitwaitOp.findElement(By.name("firstname"));
		 ///enter data  
		 fname.sendKeys("vanitester");
		 
		 ///identify the lastname  
		  WebElement lname  = impicitwaitOp.findElement(By.name("lastname"));
		  ///enter data 
		   lname.sendKeys("tester");
		


	}

}
