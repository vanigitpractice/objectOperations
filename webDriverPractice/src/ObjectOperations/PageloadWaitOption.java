package ObjectOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageloadWaitOption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///set browser path
				System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
				
				//create browser instance
				WebDriver pageLoadOp = new ChromeDriver();
				//maximize the browser
				pageLoadOp.manage().window().maximize();
				
				
				
				//open test application
				pageLoadOp.get("http://www.facebook.com");
				
				///identify the forgot pwd and click 
				WebElement forgotpwd=pageLoadOp.findElement(By.linkText("Forgot Password?"));
				forgotpwd.click();
				///use pageload 
				pageLoadOp.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
				//identify email
				WebElement myemail=pageLoadOp.findElement(By.id("identify_email"));
				//enter data
				myemail.sendKeys("vani@123");
				

	}

}
