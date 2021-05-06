package ObjectOperations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkOperationPractice {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//chrome path
		System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver.exe");
		//create browser instance
		WebDriver linkPra=new ChromeDriver();
		//maximize window
		linkPra.manage().window().maximize();
		//open application
		linkPra.get("http://www.yahoo.com");
		//open signin link
		WebElement signin=linkPra.findElement(By.linkText("Sign in"));
		signin.click();
		//open create an account link
		WebElement createAcc=linkPra.findElement(By.linkText("Create an account"));
		createAcc.click();
		Thread.sleep(2000);
		//count links
		int linksCount=linkPra.findElements(By.xpath("//a")).size();
		System.out.println("no of links are" + linksCount);
		//links names
		//links store in list
		List<WebElement> totallinks=linkPra.findElements(By.tagName("a"));
		//all links count
		System.out.println(totallinks.size());
		for (int i=0; i<totallinks.size(); i++)
		//capture link names 
		{
		String TotalNames = totallinks.get(i).getText();
		System.out.println(i+"link name " + TotalNames);
		//capture href
		String linkHref=totallinks.get(i).getAttribute("href");
		System.out.println(linkHref);
		}
		//close driver
        linkPra.close();
        linkPra.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
