package ObjectOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class generalOperations {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		///set browser path
				System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
				
				//create browser instance
				WebDriver FBGeneral = new ChromeDriver();
				//maximize the browser
				FBGeneral.manage().window().maximize();
				
				//open test application
				FBGeneral.get("http://www.facebook.com");
				//fbRegi.navigate().to("http://www.facebook.com");
				Thread.sleep(5000);
				
				//capture title
				String bTitle=FBGeneral.getTitle();
				System.out.println(bTitle);
				//verify title  
				if(bTitle.equalsIgnoreCase("Facebook - Log In or Sign Up"))
				{
					System.out.println("required web page is dsplayed");
				}
				else
				{
					System.out.println("other page is displayed");
				}
				
				///capture Url
				String BUrl=FBGeneral.getCurrentUrl();
				System.out.println(BUrl);
				//forms count
				int formsCount=FBGeneral.findElements(By.xpath("//form")).size();
				System.out.println(formsCount);
				//frame count
				int frameCount=FBGeneral.findElements(By.xpath("//frame")).size();
				System.out.println(frameCount);
				//iframe count
				int iframeCount=FBGeneral.findElements(By.xpath("//iframe")).size();
				System.out.println(iframeCount);
				//span count
				int spanCount=FBGeneral.findElements(By.xpath("//span")).size();
				System.out.println(spanCount);
				//div count
				int divCount=FBGeneral.findElements(By.xpath("//div")).size();
				System.out.println(divCount);
				//table count
				int tableCount=FBGeneral.findElements(By.xpath("//table")).size();
				System.out.println("table count is" + tableCount);
				//row count
				int rowCount=FBGeneral.findElements(By.xpath("//tr")).size();
				System.out.println("row count is" + rowCount);
				//colum count
				int ColumCount=FBGeneral.findElements(By.xpath("//td")).size();
				System.out.println("colum count is" + ColumCount);

	}

}
