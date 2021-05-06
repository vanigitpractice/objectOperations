package ObjectOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class buttonOperation {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//browser path
		System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver.exe");
		//create browser instance
		WebDriver buttonops=new ChromeDriver();
		//browser maximize
		buttonops.manage().window().maximize();
		//open app
		buttonops.get("http://www.rediff.com");
		//open create acc link
		WebElement createAcclink=buttonops.findElement(By.linkText("Create Account"));
		//click on link
		createAcclink.click();
		Thread.sleep(2000);
		//identify radio button
		WebElement mradioButton=buttonops.findElement(By.xpath("//input[@value='m']"));
		//radio button exist or not
		if((mradioButton.isDisplayed())==true)
		{
			System.out.println("radio button is displayed");
		}
		else
		{
			System.out.println("radio button is not displayed");
		}
		//radio button enable or not
		if((mradioButton.isEnabled())==true)
		{
			System.out.println("radio button is enabled");
		}
		else
		{
			System.out.println("radio button is not enabled");
		}
		//radio button count
		int radioCount=buttonops.findElements(By.xpath("//input[@type='radio']")).size();
		System.out.println("total radio buttons are" + radioCount);
		//verify male radio button default select
		if((mradioButton.isSelected())==true)
		{
			System.out.println("radio button is default selected");
		}
		else
		{
			System.out.println("radio button is not default selected");
		}
		//selct male radio button
         mradioButton.click();
         Thread.sleep(2000);
         //verify status
         if((mradioButton.isSelected())==true)
         {
        	 System.out.println("male radio button is slected");
         }
         else
         {
        	 System.out.println("male radio button is not selected");
         }
	    //deselect radio buttun
         mradioButton.click();
         Thread.sleep(2000);
 
        //verify status
         if((mradioButton.isSelected())==false)
         {
        	 System.out.println("male radio button is deselected");
         }
         else
         {
        	 System.out.println("male radio button is not selected");
         }
         //identify female radio button
         WebElement fradiobutton=buttonops.findElement(By.xpath("//input[@value='f']"));
         //click on female radio button
         fradiobutton.click();
         buttonops.quit();
         buttonops.close();

		

	}

}
