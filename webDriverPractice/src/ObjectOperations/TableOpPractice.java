package ObjectOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableOpPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver.exe");
		//browser instance
		WebDriver tableopera= new ChromeDriver();
		//maximize
		tableopera.manage().window().maximize();
		//open app 
		tableopera.get("file:///C:/Users/sures/Desktop/Testin/testtable.html");
		//row count in table 2
		int rowcount2=tableopera.findElements(By.xpath("//table[@id='table2']/tbody/tr")).size();
		System.out.println(rowcount2);
		//colum count
		int columcount2=tableopera.findElements(By.xpath("//table[@id='table2']/tbody/tr[1]/td")).size();
		System.out.println(columcount2);
		
		int TotalcolCount=0;
		
		for(int row=2; row<=rowcount2; row++)
		{
		 //rows add
			//read row
			WebElement Col2add=tableopera.findElement(By.xpath("//table[@id='table2']/tbody/tr["+row+"]/td[2]"));
			WebElement Col3add=tableopera.findElement(By.xpath("//table[@id='table2']/tbody/tr["+row+"]/td[3]"));
			String coladd1=Col2add.getText();
			String coladd2=Col3add.getText();
			//split
			String[] col1split=coladd1.split("Rs.");
			int xyz=Integer.parseInt(col1split[1].trim());
			int abc=Integer.parseInt(coladd2);
			TotalcolCount=xyz+abc;
			System.out.println(TotalcolCount);
			
	        
		}
			
		
	}

}
