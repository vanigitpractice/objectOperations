package ObjectOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class editboxOperations {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		///set browser path
				System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
				
				//create browser instance
				WebDriver EditOpes = new ChromeDriver();
				//maximize the browser
				EditOpes.manage().window().maximize();
				
				//open test application
				EditOpes.get("https://www.facebook.com");
				//fbRegi.navigate().to("http://www.facebook.com");
				Thread.sleep(5000);
				//identify the create new account link
				WebElement CreateNewAccount=EditOpes.findElement(By.linkText("Create New Account"));
				//click on link
				CreateNewAccount.click();
				Thread.sleep(5000);
				
		
				///count of input objects 
				int inputCount =EditOpes.findElements(By.xpath("//input")).size();
				System.out.println(inputCount);
				
				///2 method  
				int input2C = EditOpes.findElements(By.tagName("INPUT")).size();
				System.out.println("2nd method count  " + input2C);
				
		
				//count of only edit boxes
				
				int EditCount  = EditOpes.findElements(By.xpath("//input[@type='text']")).size();
				System.out.println("no of edit bxes are  " + EditCount);
				
				//identify the specific one
				///identify the first name
				WebElement FName= EditOpes.findElement(By.name("firstname")); 
				
				//exist or not  
				if((FName.isDisplayed())==true)
				{
					System.out.println("first name is displayeed");
				}
				else
				{
					System.out.println("firstname is not displayed");
				}
				
				//enabled  or not  
				if(FName.isEnabled())
				{
					System.out.println("first name is enabled");
				}
				else
				{
					System.out.println("first name is not enabled");
				}
				
				//enter data  
				FName.sendKeys("vanitester");
				Thread.sleep(4000);
				
				//capture data
				String myFName = FName.getAttribute("value");
				System.out.println("i entered name is  " + myFName);
				
	
				
				
				
				
				
				
				////close driver  
				EditOpes.close();
				///quit driver  
				EditOpes.quit();
		
		

	}

}
