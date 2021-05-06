package ObjectOperations;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RemoteWebdriverPractice {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		///browser options 
		DesiredCapabilities chromebr = DesiredCapabilities.chrome();
		//set properties  
		 chromebr.setCapability(CapabilityType.VERSION, "88");
		 
		 ////remote webdriver options  
		 WebDriver driver  = new RemoteWebDriver(new URL("http://127.0.0.1/appname"), chromebr);
		 
		 ///open app 
		 driver.get("http://www.facebook.com");
		 
		 
		

	}

}
