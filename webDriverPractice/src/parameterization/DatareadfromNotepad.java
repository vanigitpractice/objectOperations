package parameterization;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatareadfromNotepad {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//browser path
		System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver.exe");
		
		///noteped file address  
		String fileName = "C:\\Users\\sures\\OneDrive\\Documents\\Testing\\ReadfromNotepad.txt";
		
		///read data  
		String myData = NotepadUDF.fnReadFromNP(fileName);
		System.out.println(myData);
		////split the data at  ,
		String[] mySplitData = myData.split(",");
		
		
		//browser instance
		WebDriver notepadE=new ChromeDriver();
		//maximize
		notepadE.manage().window().maximize();
		notepadE.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//open app
		notepadE.get("http://www.facebook.com");
		WebElement myemail=notepadE.findElement(By.name("email"));
		myemail.sendKeys(mySplitData[0]);
		WebElement mypwd=notepadE.findElement(By.name("pass"));
		mypwd.sendKeys(mySplitData[1]);
		WebElement createacc=notepadE.findElement(By.linkText("Create New Account"));
		createacc.click();
		WebElement myname=notepadE.findElement(By.name("firstname"));
		myname.sendKeys(mySplitData[2]);
		WebElement lname=notepadE.findElement(By.name("lastname"));
		lname.sendKeys(mySplitData[3]);
		WebElement regemail=notepadE.findElement(By.name("reg_email__"));
		regemail.sendKeys(mySplitData[4]);
		WebElement regpwd=notepadE.findElement(By.name("reg_passwd__"));
		regpwd.sendKeys(mySplitData[5]);
		
		WebElement mon=notepadE.findElement(By.name("birthday_month"));
		//convert to select categoery
		Select monthselect=new Select(mon);
		monthselect.selectByVisibleText(mySplitData[6]);
		
		WebElement day=notepadE.findElement(By.name("birthday_day"));
		Select dayselect=new Select(day);
		dayselect.selectByVisibleText(mySplitData[7]);
		WebElement myyear=notepadE.findElement(By.name("birthday_year"));
		Select yearselect=new Select(myyear);
		yearselect.selectByVisibleText(mySplitData[8]);
		

	}

}
