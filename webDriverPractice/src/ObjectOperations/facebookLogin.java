package ObjectOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookLogin {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		///set browser path
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		
		//create browser instance
		WebDriver FBLogin = new ChromeDriver();
		//maximize the browser
		FBLogin.manage().window().maximize();
		
		//open test application
		FBLogin.get("http://www.facebook.com");
		//fbRegi.navigate().to("http://www.facebook.com");
		Thread.sleep(5000);
		///identify the login email 
		WebElement loginEmail  = FBLogin.findElement(By.name("email"));
		///login email exist or not  
		if((loginEmail.isDisplayed())==true) 
		{
		if((loginEmail.isEnabled())==true)
		{
			//enter data
			loginEmail.sendKeys("vanitester");
		System.out.println("is displayed");
		System.out.println("is enabled");
		}
		else
		{
			System.out.println("is not enabled");
		}
		}
		else
		{
			System.out.println("is not displayed");
		}
		//identify password
		WebElement mypwd=FBLogin.findElement(By.id("pass"));
		if((mypwd.isDisplayed())==true)
		{
			if((mypwd.isEnabled())==true)
			{
				mypwd.sendKeys("tester");
				System.out.println("is displayed");
				System.out.println("is enabled");
			}
			else {
				System.out.println("is not enabled");
			}
		}
		else
		{
			System.out.println("is not displayed");
		}
		//identify login button
		WebElement Mlogin=FBLogin.findElement(By.name("login"));
		//click on login button
		Mlogin.click();
		
		
		
		
		
			
		
		
				
			 
			
		
		
		
		
		
		
		
		
		}

	
		

	}


