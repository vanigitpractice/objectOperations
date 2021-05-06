package MyWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverInitialization {
	
	public WebDriver GetWebDriver(String url)
	{
		System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver.exe");
		//browser instance
		WebDriver MyWebdriver= new ChromeDriver();
		//maximize
		MyWebdriver.get(url);
		MyWebdriver.manage().window().maximize();
		
		return MyWebdriver ;
}

}
