package ObjectOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableOperations2 {

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
		
		for(int row=2; row<=rowcount2; row++)
		{
			
				/// read prices
				WebElement myPrice  = tableopera.findElement(By.xpath("//table[@id='table2']/tbody/tr["+row+"]/td[2]"));
				System.out.println(myPrice.getText());
				
				String[] PriceSplit =(myPrice.getText()).split("Rs.");
				System.out.println(PriceSplit[0]);
				System.out.println(PriceSplit[1]);
				///price split [1] convert to int  
				int itemPrice  = Integer.parseInt(PriceSplit[1].trim());
				
				//read qty  
				WebElement myquantity=tableopera.findElement(By.xpath("//table[@id='table2']/tbody/tr["+row+"]/td[3]"));
				System.out.println(myquantity.getText());
				////qty conver t to int  
				int qty = Integer.parseInt(myquantity.getText());
				
				///read total
				WebElement total=tableopera.findElement(By.xpath("//table[@id='table2']/tbody/tr["+row+"]/td[4]"));
				System.out.println(total.getText());
				
				///split total  at Rs. 
				String[] splitTotal  = (total.getText()).split("Rs.");
				System.out.println(splitTotal[0]);
				System.out.println(splitTotal[1]);
				///total convert to int  
				int myTotal  = Integer.parseInt(splitTotal[1].trim());
				/////verify the total   and,  qty and  price
				if(qty*itemPrice ==myTotal)
				{
					System.out.println(("item price is  " + itemPrice  +"quantity  "+ qty +" and total is  " + myTotal));
				}
				
				
			
		}

	}

}
