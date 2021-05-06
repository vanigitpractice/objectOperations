package parameterization;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatafromDB {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		///Sql driver Name  
		 String DriverName  = "com.mysql.cj.jdbc.Driver";
		 ///DB Url , user name ,pwd   
		 String dbURL ="jdbc:mysql://localhost:3306/facebook?useSSL=false";
		 String dbUserName="root";
		 String dbPwd ="root";
		 
		 ///Sql Statement  
		  String SqlSt = "Select * From facebook.createacc Where FirstName='Sanjana'";
		  
		  //read data 
		   ResultSet myRs=DatabaseUDF.fnReadFromDB(DriverName, dbURL, dbUserName, dbPwd,SqlSt);
		   
		   
		   ////display the information  
		    String birth= "";
		    String first="";
		    String last="";
		    String email="";
		    String pwd="";
		   
		    while (myRs.next()) 
		    	{
		    		 first=myRs.getString("FirstName");
		    	      last=myRs.getString("LastName");
		    		 email=myRs.getString("Email");
		    		 pwd=myRs.getString("Password");
		    		  birth=myRs.getString("DOB");
		    		//disply
		    		System.out.println("FirstName" +first);
		    		System.out.println("LastName" + last);
		    		System.out.println(email);
		    		System.out.println(pwd);
		    		System.out.println(birth);
		    	}
		    		
				      //split dob  
		            String[]  myDOB  = birth.split("-");
		            System.out.println(myDOB[0]);
		            System.out.println(myDOB[1]);//month
		             System.out.println(myDOB[2]);//date 
		             int Month =Integer.parseInt(myDOB[1]);
		             if(Month<10)
		             {
		            	 myDOB[1]= myDOB[1].substring(1,2);
		             }
		             
		    		
		    	
				System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver.exe");
				WebDriver databread=new ChromeDriver();
				databread.manage().window().maximize();
				databread.get("http://www.facebook.com");
				databread.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				WebElement createacc=databread.findElement(By.linkText("Create New Account"));
				createacc.click();
				WebElement fname=databread.findElement(By.name("firstname"));
				fname.sendKeys(first);
				WebElement lname=databread.findElement(By.name("lastname"));
				lname.sendKeys(last);
				WebElement myemail=databread.findElement(By.name("reg_email__"));
				myemail.sendKeys(email);
				WebElement mypwd=databread.findElement(By.name("reg_passwd__"));
				mypwd.sendKeys(pwd);
				WebElement yeardata=databread.findElement(By.name("birthday_year"));
				Select yearselect=new Select(yeardata);
				yearselect.selectByVisibleText(myDOB[0]);
				
				WebElement date=databread.findElement(By.name("birthday_day"));
				Select dateselect=new Select(date);
				dateselect.selectByValue(myDOB[2]);
				
				WebElement monthname=databread.findElement(By.name("birthday_month"));
				Select monthselect=new Select(monthname);
				monthselect.selectByValue(myDOB[1]);
				
				
				
			
		    

	}

}
