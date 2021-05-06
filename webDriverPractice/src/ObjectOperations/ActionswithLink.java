package ObjectOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import net.bytebuddy.description.annotation.AnnotationDescription.Builder;

public class ActionswithLink {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
         System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver.exe");
         //browser instance
         WebDriver actionopt=new ChromeDriver();
         //maximize browser
         actionopt.manage().window().maximize();
         actionopt.get("http://www.cricinfo.com");
         Thread.sleep(15000);
       //capture model window
         String modelwin=actionopt.getWindowHandle();
         //switch to window
         actionopt.switchTo().window(modelwin);
         //identify not now
         WebElement notnow=actionopt.findElement(By.id("wzrk-cancel"));
         notnow.click();
         actionopt.switchTo().defaultContent();
         
         //identify the teams link
         WebElement teamslink=actionopt.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul[1]/li[3]/a"));
          ///define Actions  
        Actions myAct  = new Actions(actionopt);
         myAct.moveToElement(teamslink).perform();
         Thread.sleep(4000);
         ///move to required objects and click
         WebElement counsel=actionopt.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul[1]/li[3]/div/div/ul[1]/li[4]/a"));
         myAct.moveToElement(counsel).click().build().perform();
         
        // myAct.moveToElement(teamslink).moveToElement(counsel).click().build().perform();
         
      
         
         
         
         
         
         
         
         
         
         
         
         
   
         
        
      
     
         
         
         
        
         
         
         
         
        
         
         
         
         
         
         
         
      
        
      
	}

}
