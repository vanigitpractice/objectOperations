package ObjectOperations;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listboxOperations {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//set browser path
		System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver.exe");
		
		//create browser instance
		WebDriver listOps=new ChromeDriver();
		//maximize chrome browser
		listOps.manage().window().maximize();
		//open application
		listOps.get("http://www.facebook.com");
		//open create new account
		WebElement createNewAcc=listOps.findElement(By.linkText("Create New Account"));
		createNewAcc.click();
		Thread.sleep(2000);
		//count of list boxes
		int listboxCount=listOps.findElements(By.xpath("//select")).size();
		System.out.println("no of list boxes are  " + listboxCount);
		
		///2nd method 
		int list2C  = listOps.findElements(By.tagName("select")).size();
		System.out.println(list2C);
		
		///identfy the month object  
		WebElement monthObj = listOps.findElement(By.id("month"));
		
		/////exist or not  
		
		///enabled or not
		
		
		///capture month data 
		 String monthData = monthObj.getText();
		 System.out.println(monthData);
		
		 //convert to select category  
		 Select monthSelect  = new Select(monthObj);
		//count month items 
		 ///store all month items  
		 List<WebElement> monthItems  = monthSelect.getOptions();
		 ///count  
		  System.out.println(monthItems.size());
		
		 
		
		 
		
		////select label  / value  / index  / select any index
		  ///select visible text  / label  
		  monthSelect.selectByVisibleText("Oct");
		  Thread.sleep(4000);
		  
		  /////select by value  
		   monthSelect.selectByValue("5");
		   Thread.sleep(3000);
		   String SelectedMOnthValue = monthObj.getAttribute("value");
		   System.out.println(SelectedMOnthValue);
		   ///select by index  
		   monthSelect.selectByIndex(8);
		   Thread.sleep(3000);
		   
		   ///select any index (random position)
		   //define random 
		   Random myRan = new Random();
		   
		   //range and select
		   int selectedRandom  = myRan.nextInt(monthItems.size()-1);
		   System.out.println("selected random position is  " + selectedRandom);
		   
		   monthSelect.selectByIndex(selectedRandom);
		   Thread.sleep(3000);
		   
		   
		   ///select one by one and capture lable and value    
		   for(int i=0; i<monthItems.size();  i++)
		   {
			   monthSelect.selectByIndex(i);
			   Thread.sleep(500);
			   String mlabel = monthItems.get(i).getAttribute("label");
			   System.out.println("selected label is  -----> " + mlabel);
			   
			   String mValue  = monthItems.get(i).getAttribute("value");
			   System.out.println("selected month value is  ---> " + mValue);
		   }
		   
		      listOps.quit(); 
		      listOps.close();          
		      
		      
		      
		      
		      
		   
		
	
		 
		
	

	}

}
