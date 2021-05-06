package ObjectOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleProgram {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		///web application functionality testing  framework
		//// create browser instance, open test app, identify the object and object operations
		
		///set browser path 
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		
		///create browser instance 
		WebDriver fbApp = new ChromeDriver();
		//maximize the browser  
		fbApp.manage().window().maximize();
		Thread.sleep(2000);
		
		////open test app
		fbApp.get("http://www.facebook.com");
		
		//fbApp.navigate().to("http://www.facebook.com");
		
		
		///identify the  email object  
		WebElement myEmail  = fbApp.findElement(By.name("email"));
		
		///login email  exist ornot  
		if((myEmail.isDisplayed())==true)
		{
			System.out.println("login email displayed");
		}
		else
		{
			System.out.println("login email not displayed");
		}
		///login  email enabled or not  
		if(myEmail.isEnabled())
		{
			System.out.println("login email is enabled");
		}
		else
		{
			System.out.println("login email not enabled");
		}
		
		
		///enter  data 
		myEmail.sendKeys("vanitester");
		
		//capture data from edit box  
		
		String myEnteredData = myEmail.getAttribute("tagName");
		System.out.println("i am entereed data  is  --> " + myEnteredData);
		
		Thread.sleep(10000);
		///close app/ browser  
		fbApp.close();
		//quit browser  
		fbApp.quit();
		
		
		

	}

}
