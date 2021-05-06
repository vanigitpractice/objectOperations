package ObjectOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobuttonOperations {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//create browser path
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		//create browser instance
		WebDriver radioOp=new ChromeDriver();
		//maximize chrome browser
		radioOp.manage().window().maximize();
		//open application
		radioOp.get("http://www.facebook.com");
		Thread.sleep(3000);
		//identify the create new account link
		WebElement CreateNewAccount=radioOp.findElement(By.linkText("Create New Account"));
		//click on link
		CreateNewAccount.click();
		Thread.sleep(5000);
		//radio button object count
		int radioButtonCount=radioOp.findElements(By.xpath("//input[@type='radio']")).size();
		System.out.println("radio buttons are" + radioButtonCount);
		
		///identify the female radio button
		WebElement femaleRB = radioOp.findElement(By.xpath("//input[@value='1']"));
		
		//exist or not  
		if((femaleRB.isDisplayed())==true)
		{
			System.out.println("female radio button  is displayed");
		}
		else
		{
			System.out.println("female radio button is not displayed");
		}
		
		///enabled or not  
		if((femaleRB.isEnabled())==true)
		{
			System.out.println("female radio button is enabled");
		}
		else
		{
			System.out.println("female radio button is dissablee  / not enabled");
		}
		///verify default status  
		if((femaleRB.isSelected())==true)
		{
			System.out.println("female radio button isdefault  selected  ");
		}
		else
		{
			System.out.println("female radio button is default  not selected");
		}
		
		
		//select  radio button  
		
		femaleRB.click();
		Thread.sleep(200);
		///verify status
		if((femaleRB.isSelected())==true)
		{
			System.out.println("now female radio button selected");
		}
		else
		{
			System.out.println("now femae radio button is not selected");
		}
		//identify male radio button
		WebElement maleg=radioOp.findElement(By.xpath("//input[@value='2']"));
		//exist or not
		if((maleg.isDisplayed()) ==true)
		{
			System.out.println("male gender is displayed");
		}
		else
		{
			System.out.println("male gender is not displayed");
		}
		//enable or not
		if((maleg.isEnabled())==true)
		{
			System.out.println("male gender is enabled");
		}
		else
		{
			System.out.println("male gender is not enabled");
		}
		//verify default select male gender
		if((maleg.isSelected())==true)
		{
			System.out.println("male gender is slected");
		}
		else
		{
			System.out.println("male gender is not selected");
		}
		maleg.click();
		//verify satus
		if((maleg.isSelected())==true)
		{
			System.out.println("now male radio buttuon is selected");
		}
		else
		{
			System.out.println("now male radio button is not selected");
		}
		//identify custom gender
		WebElement customg=radioOp.findElement(By.xpath("//input[@value='-1']"));
		//exist or not
		if((customg.isDisplayed())==true)
		{
			System.out.println("custom gender is displayed");
		}
		else
		{
			System.out.println("custom gender is not displayed");
		}
		//verify default status
		if((customg.isSelected())==true)
		{
			System.out.println("custom gender is selected");
		}
		else
		{
			System.out.println("custom gender is not selected");
		}
		//select custom radio button
		customg.click();
		//verify satus
		if((customg.isSelected())==true)
		{
			System.out.println("custom gender is selected");
		}
		else
		{
			System.out.println("custom gender is not selected");
		}
		
		//////custome list box
		
		///close browser  
		radioOp.close();
		///quit driver  
		radioOp.quit();

	}

}
