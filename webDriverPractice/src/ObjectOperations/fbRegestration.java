package ObjectOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fbRegestration {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		///set browser path
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		
		//create browser instance
		WebDriver fbRegi = new ChromeDriver();
		//maximize the browser
		fbRegi.manage().window().maximize();
		
		//open test application
		fbRegi.get("http://www.facebook.com");
		//fbRegi.navigate().to("http://www.facebook.com");
		Thread.sleep(5000);
		//identify the create new account link
		WebElement CreateAccLink = fbRegi.findElement(By.linkText("Create New Account"));
		
		
		//click on link 
		CreateAccLink.click();
		
		Thread.sleep(2000);
		//identify the first name
		WebElement firstname= fbRegi.findElement(By.name("firstname"));
		//enter data in first name
		firstname.sendKeys("vani");
		//identify the last name
		WebElement lastname=fbRegi.findElement(By.name("lastname"));
		//enter data in last name
		lastname.sendKeys("b");
		//enter email
		WebElement email=fbRegi.findElement(By.name("reg_email__"));
		//enter data email
		email.sendKeys("vani123@gmail.com");
		//Re_enter email
		WebElement reenteremail=fbRegi.findElement(By.name("reg_email_confirmation__"));
		//Re_ enter email data
		reenteremail.sendKeys("vani123@gamil.com");
		//identify the password
		WebElement password=fbRegi.findElement(By.name("reg_passwd__"));
		//enter password data
		password.sendKeys("sanjana");
		//identify the month
		WebElement month=fbRegi.findElement(By.name("birthday_month"));
		//enter month
		month.sendKeys("may");
		//identify date
		WebElement date=fbRegi.findElement(By.name("birthday_day"));
		//enter date
		date.sendKeys("28");
		//identify year
		WebElement year=fbRegi.findElement(By.name("birthday_year"));
		//enter year
		year.sendKeys("1989");
		//select gender
		WebElement gender=fbRegi.findElement(By.xpath("//input[@value='1']"));
		//enter data
		gender.click();
		Thread.sleep(5000);
		//identify the male radio button
		WebElement malegender=fbRegi.findElement(By.xpath("//input[@value='2']"));
		malegender.click();
	     //identify the custom radio button
		WebElement customgender=fbRegi.findElement(By.xpath("//input[@value='-1']"));
		customgender.click();
		
		fbRegi.quit();
		fbRegi.close();
		
		

	}

}
