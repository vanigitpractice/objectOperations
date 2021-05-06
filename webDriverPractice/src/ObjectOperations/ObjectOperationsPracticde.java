package ObjectOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ObjectOperationsPracticde  {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//browser path
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		//create browser instance
		WebDriver rfReg = new ChromeDriver();
		//maximize the browser
		rfReg.manage().window().maximize();
		//open application
		rfReg.get("http://www.rediff.com");
		Thread.sleep(5000);
        //identify the create new account link
	    WebElement CreateNewAccount=rfReg.findElement(By.linkText("Create Account"));
	    //click link
	    CreateNewAccount.click();
	    
	    Thread.sleep(2000);
	    //identify firstname
	    WebElement firstname= rfReg.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
	    //enter firstname
	    firstname.sendKeys("Sanjana");
	   // identify email
	    WebElement email=rfReg.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]"));
	    //enter eamail data
	    email.sendKeys("practice99");
	    //identify password
	    WebElement password=rfReg.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[9]/td[3]/input"));
	    //enter password data
	    password.sendKeys("anagha");
	    //identify retype password
	    WebElement retypepassword=rfReg.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[9]/td[3]/input"));
	    //enter data
	    retypepassword.sendKeys("anagha");
	    //identify alternate email address
	    WebElement alternateemail=rfReg.findElement(By.xpath("//*[@id=\"div_altemail\"]/table/tbody/tr[1]/td[3]/input"));
	    //enter alternate email
	    alternateemail.sendKeys("Spoorthi");
	    Thread.sleep(10000);
	    //////identify the check box  
	     WebElement  myCheckBox  = rfReg.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input"));	     													  
	     
	     System.out.println(myCheckBox.isSelected());
	     if((myCheckBox.isSelected())==false)
	     {
	
		     ///select check box  
		      myCheckBox.click();
		      Thread.sleep(2000);
		      System.out.println("enter in if condition");
	     }
	    
	    //identify mobile no
	    WebElement mobileno=rfReg.findElement(By.id("mobno"));
	    //enter mobile no
	    mobileno.sendKeys("7564389393");
	    //identify day
	    WebElement day=rfReg.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[1]"));
	    
	    //day object convert to select category
	    Select myDay  = new Select(day);
	    
	    //select day by value  / visible  text/ index
	    
	    ///value  
	    myDay.selectByValue("16");
	    
	    Thread.sleep(5000);
	    ///visible text
	    myDay.selectByVisibleText("20");
	    Thread.sleep(5000);
	    
	    //index  
	     myDay.selectByIndex(8);
	     Thread.sleep(2000);
	    
	    //identify month
	    WebElement month=rfReg.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[2]"));
	    
	    //////month object convert to select category 
	    Select myMonth  = new Select(month);
	    //select month visibe text 
	    myMonth.selectByVisibleText("JUN");
	    Thread.sleep(3000);
	    ///select value  
	    myMonth.selectByValue("08");
	    Thread.sleep(3000);
	    //select  by index  
	    myMonth.selectByIndex(5);
	    //identify year
	    WebElement year=rfReg.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[3]"));
	    year.sendKeys("1989");
	    //identify gender
	    WebElement gender=rfReg.findElement(By.xpath("//input[@value='m']"));
	    gender.click();
	    //identify fgender
	   WebElement fgender=rfReg.findElement(By.xpath("//input[@value='f']"));
	   fgender.click();
	   //identify country
	   WebElement country=rfReg.findElement(By.xpath("//select[@id='country']"));
	   ///country webelement convert to select category 
	   Select myCountry  = new Select(country);
	   //select country
	   myCountry.selectByVisibleText("India");
	   Thread.sleep(3000);
	   
	   System.out.println(country.isSelected());
	   //identify city
	  
	   WebElement city=rfReg.findElement(By.xpath("//*[@id='div_city']/table/tbody/tr[1]/td[3]/select"));
	   ///city webelement convert to select category 
	   Select myCity  = new Select(city);
	   
	   //select or not  verify 
	   System.out.println(city.isSelected());
	   myCity.selectByVisibleText("Cochin");
	   
	   System.out.println(city.isSelected());
	   
	   
	   
	   
	    
		
	}

}
