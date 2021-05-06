package ObjectOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxOperations {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
          //set browser path
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		//create browser instance
		WebDriver CheckboxOp=new ChromeDriver();
		//maximize browser
		CheckboxOp.manage().window().maximize();
		//Open Test application
		CheckboxOp .get("http://www.rediff.com");
		//identify sign in link
		WebElement signIn=CheckboxOp.findElement(By.linkText("Sign in"));
		//click on link
		signIn.click();
		//check box count
		Thread.sleep(2000);
		int checkboxCount =CheckboxOp.findElements(By.xpath("//input[@type='checkbox']")).size();
		System.out.println("check bobxes are" + checkboxCount);
		//identify the checkbox
		WebElement checkBox=CheckboxOp.findElement(By.id("remember"));
		//exist or not
		if((checkBox.isDisplayed())==true)
		{
			System.out.println("check box is displayed");
		}
		else
		{
			System.out.println("check box is not displayed");
		}
		//enable or not
		if((checkBox.isEnabled())==true)
		{
		System.out.println("check box is enabled");
		}
		else
		{
			System.out.println(  "check box is not enabled");
		}
		//verify default status
		if((checkBox.isSelected())==true)
		{
			System.out.println(" defalut check box status is selected");
		}
		else
		{
			System.out.println("default check box status is not selected ");
		}
		//select check box
		checkBox.click();
		//verify status
		if((checkBox.isSelected())==true)
		{
			System.out.println("check box is selected");
		}
		else
		{
			System.out.println("check box is not selected");
		}
		//deselect check box
		checkBox.click();
		//verify status
		if((checkBox.isSelected())==false)
		{
			System.out.println("check box is deselected");
		}
		else
		{
			System.out.println("check box is not deselected");
		}
		
		CheckboxOp.close();
		
		CheckboxOp.quit();
		
		
	}

}
