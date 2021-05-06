package ObjectOperations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkOperations {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		///set browser path
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		
		//create browser instance
		WebDriver linksOpes = new ChromeDriver();
		//maximize the browser
		linksOpes.manage().window().maximize();
		
		//open test application
		linksOpes.get("http://www.facebook.com");
		//fbRegi.navigate().to("http://www.facebook.com");
		Thread.sleep(5000);
		
		///count of links  
		int linksCount  = linksOpes.findElements(By.xpath("//a")).size();
		System.out.println("no of links are  " + linksCount);
		
		///count of links 2nd option  
		int links2C  = linksOpes.findElements(By.tagName("a")).size();
		System.out.println("no of links are  " + links2C);
		
		
		//display all link names and href 
		//store into list  
		List<WebElement> AllLinks  = linksOpes.findElements(By.tagName("a"));
		 /////count  
		System.out.println(AllLinks.size());
		for(int i=0; i<AllLinks.size(); i++)
		{
			//capture link Name 
			String linkName = AllLinks.get(i).getText();
			System.out.println( i + "  link name  is    " + linkName);
		/*	if(linkName.length()>1)
			{
				WebElement myEle = linksOpes.findElement(By.linkText(linkName));
				myEle.click();
				Thread.sleep(10000);
				linksOpes.navigate().back();
				Thread.sleep(3000);
			}*/
			
			///capture href 
			String  linkHref = AllLinks.get(i).getAttribute("href");
			System.out.println(linkHref);
			Thread.sleep(100);
		}
		
		//click on specific link 
		///identify the forgot password  
		WebElement forgotPwdLink= linksOpes.findElement(By.linkText("Forgot Password?"));
		forgotPwdLink.click();
		Thread.sleep(5000);
		///identify the recovery email  
		WebElement  recEmail  = linksOpes.findElement(By.id("identify_email"));
		//enter data  
		 recEmail.sendKeys("vanitester@abc.com");
		String capt=recEmail.getAttribute("value");
		//wait some time  
		Thread.sleep(5000);
		///back
		linksOpes.navigate().back();
		
		
		
		
		Thread.sleep(10000);
		/////close driver  
		linksOpes.close();
		///quit driver  
		linksOpes.quit();

	}

}
