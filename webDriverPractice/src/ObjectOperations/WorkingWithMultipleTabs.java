package ObjectOperations;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithMultipleTabs {

	private static final int ArrayList = 0;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver.exe");
		//browser instance
		WebDriver workingWithMT=new ChromeDriver();
		//browser maximize
		workingWithMT.manage().window().maximize();
		//open app
		workingWithMT.get("http://www.facebook.com");
		//identify the instagram link
		WebElement instalink=workingWithMT.findElement(By.linkText("Instagram"));
		instalink.click();
		//identify oclus link
		WebElement oculuslink=workingWithMT.findElement(By.linkText("Oculus"));
		oculuslink.click();
		//identify portal link
		WebElement portallink=workingWithMT.findElement(By.linkText("Portal"));
		portallink.click();
		/// Array
		
		ArrayList<String> myTabs  = new  ArrayList<String>(workingWithMT.getWindowHandles());
		//tab count
		int tabcount=myTabs.size();
		System.out.println("no of tabs are  : "  + tabcount);
		//capture tab titles  / names  
		for(int i=0; i<tabcount; i++)
		{
			//switch to tabs
			workingWithMT.switchTo().window(myTabs.get(i));
			String tabName  = workingWithMT.getTitle();
			System.out.println(tabName);
			if(tabName.equalsIgnoreCase("Instagram"))
			{
				WebElement username  = workingWithMT.findElement(By.name("username"));
				username.sendKeys("vanitester");
				Thread.sleep(4000);
			}
			
			else if(tabName.equalsIgnoreCase("Oculus | VR Headsets & Equipment"))
			
			
		     {
				WebElement login = workingWithMT.findElement(By.name("email"));
				login.sendKeys("testervani");
				Thread.sleep(5000);
			}
			
		}
		

	}

}
