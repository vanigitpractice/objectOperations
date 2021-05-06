package parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RandomData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		///alphabets  
		 String myAlphabets  = GenerateRandomData.randomAlphabets(20);
		 System.out.println(myAlphabets);
		 
		 ///change to upper chars  
		 System.out.println(myAlphabets.toUpperCase());
		 
		 ///change to lowerchas  
		 System.out.println(myAlphabets.toLowerCase());
		 
		 ///email 
		 System.out.println(myAlphabets.toLowerCase()+"@mycompany.com");
		 
		 
		 ///alphanumeric
		 
		 String myAlphaNumeric = GenerateRandomData.randomAlphaNumeric(15);
		 System.out.println(myAlphaNumeric);
		 
		 ///numeric  
		  String myNumeric  = GenerateRandomData.randomNumeric(10);
		  System.out.println(myNumeric);
		  
		  
		  ///any chars  
		   String myAnyChars = GenerateRandomData.randomAnyCharacters(30);
		   System.out.println(myAnyChars);
		   System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
			
			//create browser instance
			WebDriver randata = new ChromeDriver();
			//maximize the browser
			randata.manage().window().maximize();
			
			//open test application
			randata.get("http://www.facebook.com");
			WebElement myeamil=randata.findElement(By.name("email"));
			String inputdata=GenerateRandomData.randomAlphabets(10);
			myeamil.sendKeys(inputdata);
			WebElement mypwd=randata.findElement(By.name("pass"));
			String inputpwd=GenerateRandomData.randomAlphaNumeric(6);
			mypwd.sendKeys(inputpwd);
			

	}

}
