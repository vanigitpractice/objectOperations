package ObjectOperations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listboxOperationPractice {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//create browser path
		System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver.exe");
		//create browser instance
		WebDriver listBoxPra =new ChromeDriver();
		//maximize browser
		listBoxPra.manage().window().maximize();
		//open app
		listBoxPra.get("http://www.facebook.com");
		//open create acc
		WebElement createAcc=listBoxPra.findElement(By.linkText("Create New Account"));
		createAcc.click();
		Thread.sleep(2000);
		//list boxes count
		int listboxCount=listBoxPra.findElements(By.xpath("//select")).size();
		System.out.println("total list boxes are" + listboxCount);
		//identify month object
		WebElement monthname=listBoxPra.findElement(By.id("month"));
		//month exist or not
		if((monthname.isDisplayed())==true)
		{
			System.out.println("month is displayed");
		}
		else
		{
			System.out.println("month is not displayed");
		}
		//month exist or not
		if((monthname.isEnabled())==true)
		{
			System.out.println("month is enabled");
		}
		else
		{
			System.out.println("month is not enabled");
		}
		//capture month data
		String monthdata=monthname.getText();
		System.out.println(monthdata);
		//month object convert to select category
		Select monthlist=new Select(monthname);
		//store all month items
		List<WebElement> allmonthlist=monthlist.getOptions();
		System.out.println(allmonthlist.size());
		//select month by visible text
		monthlist.selectByVisibleText("Jan");
		String month=monthname.getAttribute("value");
		System.out.println(month);
		Thread.sleep(2000);
		monthlist.selectByValue("4");
		String month1=monthname.getAttribute("value");
		System.out.println(month1);
		//select one by one with label name and value
		for (int i=0;i<allmonthlist.size();i++)
		{
			String Myvalue =allmonthlist.get(i).getAttribute("Value");
			System.out.println("selected values are" + Myvalue);
		}
		//identify day object
		WebElement dayobj=listBoxPra.findElement(By.id("day"));
		Select dayselect=new Select(dayobj);
		List<WebElement> daylist=dayselect.getOptions();
		dayselect.selectByValue("2");
		Thread.sleep(2000);
		dayselect.selectByVisibleText("5");
		for(int i=0; i<daylist.size(); i++)
		{
			String dayvalues=daylist.get(i).getAttribute("value");
			System.out.println(i+dayvalues);
		}
		
	}   

}
