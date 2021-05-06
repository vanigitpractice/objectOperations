package ObjectOperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class AppopenwithIE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "C:\\Users\\sures\\Desktop\\Softwares\\IEDriverServer.exe");
		
		
		
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://www.facebook.com");
		

	}

}
