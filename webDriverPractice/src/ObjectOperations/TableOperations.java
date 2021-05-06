package ObjectOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import MyWebDriver.WebDriverInitialization;

public class TableOperations {

	public static void main(String[] args) {
		
		String url="file:///C:/Users/sures/Desktop/Testin/testtable.html";
		WebDriverInitialization WD=new WebDriverInitialization();
		
		WebDriver tableopera=WD.GetWebDriver(url);
		
		int tablecount=tableopera.findElements(By.xpath("//table")).size();
		System.out.println("no of tables are"+ tablecount);
		//row count
		int rowcount=tableopera.findElements(By.xpath("//tr")).size();
		System.out.println("no of rows are"+rowcount);
		//colum  count
		int columcount=tableopera.findElements(By.xpath("//td")).size();
		System.out.println("no of colums are" + columcount);
		
		
		///specific table row count
		int SpecificTableRowCount  = tableopera.findElements(By.xpath("//table[@id='table1']/tbody/tr")).size();
		System.out.println("table rows are  " + SpecificTableRowCount);
		
		//specific table colum count
		int specificcolumcount=tableopera.findElements(By.xpath("//table[@id='table1']/tbody/tr[4]/td")).size();
		System.out.println("table colums are"+specificcolumcount);
		
		///capture specific cell data (row-5, col-3)
		WebElement specificCell  = tableopera.findElement(By.xpath("//table[@id='table1']/tbody/tr[5]/td[3]"));
		String CellData = specificCell.getText();
		System.out.println("specific cell data is  " + CellData);
		
		
		//capture all cells data 
		for(int  i=1; i<=SpecificTableRowCount; i++)
		{
			for(int j=2; j<=specificcolumcount; j++)
			{
				///identify the cell
				WebElement defineCell  = tableopera.findElement(By.xpath("//table[@id='table1']/tbody/tr["+i+"]/td["+j+"]"));
				///capture data  
				String myCellData = defineCell.getText();
				System.out.println("row is  " + i +"   and col is   " + j + "  and cell data   is   "  + myCellData );
			}
		}
		
		
		////capture  specific column data  ( col- 5)
		///count of kbs ablow 100, above 100 ND EQUAL TO 100
		int below100kb =0;
		int equalto100kb =0;
		int above100kb =0;
		for(int i=2; i<= SpecificTableRowCount; i++)
		{
			
			///5 column cell 
			WebElement  cellOf5 = tableopera.findElement(By.xpath("//table[@id='table1']/tbody/tr["+i+"]/td[5]"));
			///capture data  
			String myColumn5data  = cellOf5.getText();
			System.out.println(myColumn5data);
			///split  at kb 
			String[] splitData = myColumn5data.split("kb");
			///convert to  numaric  
			int numData = Integer.parseInt(splitData[0].trim());
			if(numData==100)
			{
				equalto100kb=equalto100kb+1;
			}
			else if(numData>100)
			{
				above100kb = above100kb+1;
			}
			else if(numData<100)
			{
				below100kb= below100kb+1;
			}
			else
			{
				System.out.println("not applicable");
			}
		}
		 
		 //print  
		 System.out.println("below  100 kbs is   " + below100kb);
		 System.out.println("abobve  100 kb  is  "+ above100kb);
		 System.out.println("equal to 100 kb is  " + equalto100kb);

	}

}
