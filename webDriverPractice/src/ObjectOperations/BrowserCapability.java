package ObjectOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserCapability {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//define desired capbilities  for chrome 
		DesiredCapabilities myCap  = DesiredCapabilities.chrome();
		////set capabilities
	    //myCap.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
		//myCap.setCapability(CapabilityType.VERSION, "88");
		//myCap.setCapability(CapabilityType.PLATFORM_NAME, "Windows");
		myCap.setCapability("ignoreProtectedModeSettings", true);
		///get the information
		String info  = myCap.getBrowserName();
		System.out.println(info);
		
		//set browser path
		System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver.exe");
		///chrome driver 
		WebDriver chrDriver = new ChromeDriver(myCap);
		chrDriver.manage().window().maximize();
		//open app
		chrDriver.get("https://google.com");
		//enter search
		chrDriver.findElement(By.name("q")).sendKeys("abcd");
		//click on google search
		chrDriver.findElement(By.name("btnK")).click();
		

		
		
		
		//DesiredCapabilities myCapIE = DesiredCapabilities.internetExplorer();
	    //myCapIE.setCapability(CapabilityType.BROWSER_NAME, "IE");
		//myCapIE.setCapability(CapabilityType.VERSION, "10");
		//myCapIE.setCapability(CapabilityType.PLATFORM_NAME, "Windows");
		//myCapIE.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		
		
		
		
		
		
		

	}

}
