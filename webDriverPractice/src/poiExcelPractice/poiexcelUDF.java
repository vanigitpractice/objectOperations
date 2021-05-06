package poiExcelPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;



public class poiexcelUDF {
	//data read from poiexcel,
	//identify file name,identify the excel,identify the workbook,identify the sheet,identify the row and column(cell),
	///read data    , close file  
	
      public static String celldata;
      public static String fnreadfrompoiexcel(String filename, String sheetname,int row,int column ) throws IOException, InvalidFormatException
      {
			//identify file name
			File myfile=new File(filename);
			///identify the  input file  
			 FileInputStream  myInFile  = new FileInputStream(myfile);
			 
			 ///identify the excel workbook as with extension xlsx or xls 
			 ///check the extension  
			 HSSFWorkbook mybook;  ///for xls  
			 XSSFWorkbook mybookx ; ///for xlsx
			 			 
			/* if((myfile.getAbsolutePath()).contains("xlsx"))
				{
				 	///create  workbook  --> xlsx 
				  mybookx = new  XSSFWorkbook(myfile);
				  ///identify the sheet  
				   mysheet = mybookx.getSheet(sheetname);
				}
			 else if( (myfile.getAbsolutePath()).contains("xls"))
			 {
				 ///create workbook  
				   mybook =  new  HSSFWorkbook(myInFile);
				   ///identify the sheet  
				    mysheet= mybook.getSheet(sheetname);
			 }*/
			 
			 mybookx = new  XSSFWorkbook(myfile);
			  ///identify the sheet  
			 Sheet mysheet = mybookx.getSheet(sheetname);
		
			 ///identfy the row and col   and read data  
			 celldata= mysheet.getRow(row).getCell(column).getStringCellValue();
			 ///close file 
			  myInFile.close();	 
			
			
			
			 return celldata;
			 
      }
      //sheet count, row count, column count
      //sheetcount
      //identify the file,identedify the input file,identify the create workbook, sheet count
      
          public static int sheetcount;
          public static int fnexcelsheetcount(String filename) throws IOException
          {
		          File myfile=new File(filename);
		          FileInputStream inputs=new FileInputStream(myfile);
		          //identify the workbook
		          Workbook mybook = new XSSFWorkbook(inputs);
		          ///sheet count  
		           sheetcount = mybook.getNumberOfSheets();
		          
		          return sheetcount;
          }
          
          //row count
          //identify the file,identify the input file,identify and create workbook,identify the sheet,row count
          
          public static int rowcount;
          public static int fnrowcount(String filename,String sheetname) throws Exception
          {
        	  //identify the file
        	  File myfile=new File(filename);
        	  //identify input file
        	  FileInputStream inputs=new FileInputStream(myfile);
        	  //identify workbook
        	  Workbook mybook=new XSSFWorkbook(inputs);
        	  //identify sheet
        	  Sheet mysheet=mybook.getSheet(sheetname);
        	  ///row count  
        	   rowcount = mysheet.getLastRowNum();
        	   return rowcount;
          }
          //column count
          //identify the file,identify the input file,identify the create workbook, identify the sheet,column count
          public static int columncount;
          public static int fncolumncount(String filename,String sheetname) throws IOException
          {
        	  //identify the file
        	  File myfile=new File(filename);
        	  //identify input file
        	  FileInputStream inputs=new FileInputStream(myfile);
        	  //identify workbook
        	  Workbook mybook=new XSSFWorkbook(inputs);
        	  //identify the sheet
        	  Sheet mysheet=mybook.getSheet(sheetname);
        	  //column count in specific row 
        	  columncount=mysheet.getRow(1).getLastCellNum();
        	 
        	   return columncount;
          }
          //data write in excel single column
          //identify filename,identify input file,identify create workbook,identify writable sheet
          //identify the file
          public static void fnwriteinexcel(String filename,String sheetname, int row, int col, String celldata) throws IOException
          {
        	  ///identify the file
        	  File myfile=new File(filename);
        	  //identify inpiut file
        	  FileInputStream inputs=new FileInputStream(myfile);
        	  //identify the workbook
        	  XSSFWorkbook mybook=new XSSFWorkbook(inputs);
        	  ///identify the sheet  
        	  XSSFSheet  mysheet  = mybook.getSheet(sheetname);
        	  
        	   //idiedtientify the row
        	   Row myrow  = mysheet.getRow(row);
        	   ///identify the cell  
        	   Cell myCell  = myrow.getCell(col);
        	   if(myCell==null)
        	   {
        		   myCell= myrow.createCell(col, CellType.STRING);
        	   }
        	   
        	   
        	   myCell.setCellValue(celldata);
        	   ///close file  
        	   	inputs.close();
        	   
        	   ///output file and write data 
        	   
        	   FileOutputStream myFileOut  = new FileOutputStream(myfile);
        	  // myFileOut.w
        	   mybook.write(myFileOut);
        	    ///close file  
        	    myFileOut.close();        	 
        	 }
        	   
        	//////data write in excel with multiple column
          public static void fnwriteinexcelwithmutiple(String filename,String sheetname,String Objective,String expected,String Actual,String Status) throws IOException
          { 
        	  //identify the file
        	  File myfile=new File(filename);
        	  FileInputStream inputs=new FileInputStream(myfile);
        	  XSSFWorkbook mybook=new XSSFWorkbook(inputs);
        	  Sheet mysheet=mybook.getSheet(sheetname);
        	  int   rowcount=mysheet.getLastRowNum();
        	  
        	  //create new row
        	  Row myrow=mysheet.createRow(rowcount+1);
        	  //identify the cell (create cell )
        	  Cell mycell=myrow.createCell(0);
        	  //set value
        	  mycell.setCellValue(Objective);
        	  
        	  mycell= myrow.createCell(1);
        	  mycell.setCellValue(expected);
        	  
        	  mycell = myrow.createCell(2);
        	  mycell.setCellValue(Actual);
        	  
        	  mycell = myrow.createCell(3);
        	  mycell.setCellValue(Status);
        	  
        	  
        	 
        	  
        	  
        	  ///close file  
        	  inputs.close();
        	  
        	  FileOutputStream myout  = new FileOutputStream(myfile);
        	  mybook.write(myout);
        	  ///close file  
        	   mybook.close(); 	   
        	  
        	  
        	  
        	  
        	  
        	  
          }
          
 }		  
          
          
          
          
          
          
