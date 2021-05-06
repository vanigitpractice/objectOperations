package poiExcelPractice;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public class DatareadfromPoiExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		////excel file address  
		 String filename ="C:\\Users\\sures\\OneDrive\\Documents\\Testing\\Mydata.xlsx";
		 ///excel sheet name  
		  String sheetname="Sheet2";
		  
		  ////sheet count  
		  int mySheets  = poiexcelUDF.fnexcelsheetcount(filename);
		  System.out.println("no of sheets are  " + mySheets);
		  
		  ////row count  
		  int myRows  = poiexcelUDF.fnrowcount(filename, sheetname);
		  System.out.println("no of rows are  " + myRows);
		  
		  ///column count  
		   int myCols  = poiexcelUDF.fncolumncount(filename, sheetname);
		   System.out.println("no of columns are  " + myCols);
		  
		  
		   ///read data  
		   String mycelldata  = poiexcelUDF.fnreadfrompoiexcel(filename, sheetname, 1, 0);
		   String mycelldata1=poiexcelUDF.fnreadfrompoiexcel(filename, sheetname, 1, 1);
		   String mycelldata2=poiexcelUDF.fnreadfrompoiexcel(filename, sheetname, 1, 2);
		   System.out.println(mycelldata2);

	}

}
