package parameterization;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatareadfromNPMlines {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String fileName = "C:\\Users\\sures\\OneDrive\\Documents\\Testing\\multipleline.txt";
		
		ArrayList<String> MynotepadData  = NotepadUDF.fnReadFromNPMultiple(fileName);
		
		System.out.println(MynotepadData.get(0));
		
		System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver.exe");

		WebDriver notepadE=new ChromeDriver();
				//maximize
				notepadE.manage().window().maximize();
				notepadE.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				//open app
				notepadE.get("http://www.facebook.com");
				WebElement createacc=notepadE.findElement(By.linkText("Create New Account"));
				createacc.click();
				WebElement myname=notepadE.findElement(By.name("firstname"));
				myname.sendKeys(MynotepadData.get(0));
				WebElement lname=notepadE.findElement(By.name("lastname"));
				lname.sendKeys(MynotepadData.get(1));
				WebElement regemail=notepadE.findElement(By.name("reg_email__"));
				regemail.sendKeys(MynotepadData.get(2));
				WebElement regpwd=notepadE.findElement(By.name("reg_passwd__"));
				regpwd.sendKeys(MynotepadData.get(3));
				WebElement mon=notepadE.findElement(By.name("birthday_month"));
				//convert to select category
				Select monthselect=new Select(mon);
				monthselect.selectByVisibleText(MynotepadData.get(4));
				
				WebElement day=notepadE.findElement(By.name("birthday_day"));
				Select dayselect=new Select(day);
				dayselect.selectByVisibleText(MynotepadData.get(5));
				WebElement myyear=notepadE.findElement(By.name("birthday_year"));
				Select yearselect=new Select(myyear);
				yearselect.selectByVisibleText(MynotepadData.get(6));
				
				
				
				
		
		
	}

}
