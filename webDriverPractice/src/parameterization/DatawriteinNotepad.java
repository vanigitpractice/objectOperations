package parameterization;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatawriteinNotepad {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver.exe");
		
		///noteped file address  
		String fileName = "C:\\Users\\sures\\OneDrive\\Documents\\Testing\\WriteData.txt";
		
		
		//browser instance
		WebDriver notepadE=new ChromeDriver();
		NotepadUDF.fndataWriteinNotepad(fileName, "Create browser instance");
		//maximize
		notepadE.manage().window().maximize();
		notepadE.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//open app
		notepadE.get("http://www.facebook.com");
		NotepadUDF.fndataWriteinNotepad(fileName, "url entered");
		WebElement myemail=notepadE.findElement(By.name("email"));
		NotepadUDF.fndataWriteinNotepad(fileName, "email identified");
		myemail.sendKeys("tester");
		NotepadUDF.fndataWriteinNotepad(fileName, "email entered");
		WebElement mypwd=notepadE.findElement(By.name("pass"));
		mypwd.sendKeys("pwd123");
		WebElement createacc=notepadE.findElement(By.linkText("Create New Account"));
		createacc.click();
		
		WebElement myname=notepadE.findElement(By.name("firstname"));
		myname.sendKeys("mySplitDa");
		WebElement lname=notepadE.findElement(By.name("lastname"));
		lname.sendKeys("tester");
		WebElement regemail=notepadE.findElement(By.name("reg_email__"));
		regemail.sendKeys("teste@gmail.com");
		WebElement regpwd=notepadE.findElement(By.name("reg_passwd__"));
		regpwd.sendKeys("manager");
		
		WebElement mon=notepadE.findElement(By.name("birthday_month"));
		//convert to select categoery
		Select monthselect=new Select(mon);
		monthselect.selectByVisibleText("May");
		
		WebElement day=notepadE.findElement(By.name("birthday_day"));
		Select dayselect=new Select(day);
		dayselect.selectByVisibleText("10");
		WebElement myyear=notepadE.findElement(By.name("birthday_year"));
		Select yearselect=new Select(myyear);
		yearselect.selectByVisibleText("1980");
		


	}

}
