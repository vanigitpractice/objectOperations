package ObjectOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StudentTablePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver.exe");
		//browser instance
		WebDriver tableopera= new ChromeDriver();
		//maximize
		tableopera.manage().window().maximize();
		//open app
		tableopera.get("file:///C:/Users/sures/Desktop/Testin/Studenttable.html");
		//row count
		int Rowcount=tableopera.findElements(By.xpath("//table[@id='table2']/tbody/tr")).size();
		//colum count
		int ColumCount=tableopera.findElements(By.xpath("//table[@id='table2']/tbody/tr[1]/td")).size();
		int a=0;
		for(int row=2; row<=Rowcount; row++)	
		{
			for(int col=1; col<=ColumCount; col++)
			{
	
				WebElement Rowlist1=tableopera.findElement(By.xpath("//table[@id='table2']/tbody/tr["+row+"]/td["+col+"]"));
				String Tableadd=Rowlist1.getText();
				int marksCount=Integer.parseInt(Tableadd);
				a=a+marksCount;
			
			}
				System.out.println("Total marks count"+a);
				a=0;
		}
		
	}

}
