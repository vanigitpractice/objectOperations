package ObjectOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class editboxPractice  {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//create browser path
		System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver.exe");
		//create browser instance
		WebDriver editPra=new ChromeDriver();
		//maximize browser
		editPra.manage().window().maximize();
		//open application
		editPra.get("http://www.yahoo.com");
		//identify sign in link
		WebElement singnIn=editPra.findElement(By.linkText("Sign in"));
		//open link
		singnIn.click();
		Thread.sleep(2000);
		//identify create new account link
		WebElement CreateNewAcc=editPra.findElement(By.linkText("Create an account"));
		CreateNewAcc.click();
		//input boxes count
		int inputboxCount=editPra.findElements(By.xpath("//input")).size();
		{
			System.out.println("input boxes are" + inputboxCount);
		}
		//edit box count
		int editBoxCount=editPra.findElements(By.xpath("//input[@type='text']")).size();
		System.out.println("total edit boxes are" + editBoxCount);
         Thread.sleep(2000);
         //identify first name
         WebElement firstName=editPra.findElement(By.name("firstName"));
         //exist or not
         if(firstName.isDisplayed()==true)
         {
          System.out.println("first name is displayed"); 
         }
         else
         {
        	 System.out.println("first name is not displayed");
         }
         //enable or not
         if((firstName.isEnabled())==true)
         {
        	 System.out.println("first name is enabled");
         }
         else
         {
        	System.out.println(" first name is not enabled");
         }
         //enter data
         firstName.sendKeys("Ishitha");
         //clear data
         firstName.clear();
         Thread.sleep(2000);
         firstName.sendKeys("hamsini");
         //capture data
         String name=firstName.getAttribute("value");
         {
        	 System.out.println("entered first name is" + name);
         }
         //identify month
         WebElement monthN=editPra.findElement(By.id("usernamereg-month"));
         //month object convert to select category
         Select mymonth=new Select(monthN);
         //select month by value
         mymonth.selectByValue("4");
         Thread.sleep(3000);
         //select month by visible text
         mymonth.selectByVisibleText("February");
         Thread.sleep(3000);
         //select by index
         mymonth.selectByIndex(6);
         //identify radio button
         Thread.sleep(2000);
         WebElement gender=editPra.findElement(By.name("freeformGender"));
         //enter gender
         gender.sendKeys("female");
         
       
         
         
	}

}
