package SimpleExcelFramework;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class ExcelUDFS {
		///data read from excel sheet 
		///identify the file,  identify the excel, open excel file , identify the sheet, identify the cell( row and column), read data
		///return statement  
		public static String CellData; 
		
		public static String fnReadFromExcel(String fileName, String sheetName, int row, int col) throws BiffException, IOException
		{
			///identify the file  
			File myFile  = new  File(fileName);
			///identify the excel and open  
			Workbook myBook  = Workbook.getWorkbook(myFile);
			Sheet mySheet  = myBook.getSheet(sheetName);
			///identify the  cell  and read data  
			Cell myCell  = mySheet.getCell(col, row);
			///read data  
			CellData = myCell.getContents(); 	
			
			return CellData;
		}
		
		///sheet count in excel    
		///identify the file, identify the excel , open excel  file, count of sheets
		 //return statement  
		public static  int sheetCount;
		public static int fnSheetCountInExcel(String  fileName) throws BiffException, IOException
		{
			System.out.println(fileName);
			///identify the file  
			File myFile  = new File(fileName);

			///identify the excel  
			Workbook myBook = Workbook.getWorkbook(myFile);
			////count of sheets
			sheetCount = myBook.getNumberOfSheets();
					
			return sheetCount;
		}
		
		/////row count in excel sheet
		////identify the file, identify the excel, open excel, identify the sheet, row count
		///return statment row count  (int)
		public static  int rowCount;
		public static int fnRowCountInExclSheet(String fileName, String sheetName) throws BiffException, IOException
		{
			///identify the file  
			File myFile  = new File(fileName);
			///identify the  excel 
			Workbook myBook  = Workbook.getWorkbook(myFile);
			///identify the sheet  
			Sheet mySheet  = myBook.getSheet(sheetName);
			///row count  
			 rowCount= mySheet.getRows();
			
			return rowCount;
		}
		
		/////column  count in excel sheet
		///identify the file,  identify the excel,  open excel, identify the sheet, column count  
		//return  statement  column count  (int)
		public  static  int colCount;
		public static int fnColCountInExcelSheet(String fileName, String sheetName) throws BiffException, IOException
		{
			///identify the file  
			File myFile  = new File(fileName);
			///identify the excel  
			Workbook myBook  = Workbook.getWorkbook(myFile);
			////identify the sheet  
			Sheet mySheet = myBook.getSheet(sheetName);
			///column count  
			colCount = mySheet.getColumns();
			
			return  colCount;
		}
		
		///data write in excel single cell 
		///identify the file , identify the excel, identify the writableworkbook, identify the writable sheet, identify the cell (label), write data
		////save file  close file
		public static void fnwriteInExcelSingleColumn(String fileName, String sheetName, int row, int col, String cData) throws WriteException, IOException, BiffException
		{
			///identify the file  
			File myFile  = new File(fileName);
			
			///identify the excel  
			Workbook myBook  = Workbook.getWorkbook(myFile);
			
			/////identify the writable workbook
			WritableWorkbook myWriteBook  = Workbook.createWorkbook(myFile, myBook);
			
			////identify the writable sheet  
			WritableSheet  myWritesheet  = myWriteBook.getSheet(sheetName);
			
			/////identify the cell  (label)
			Label myCell  = new Label(col, row, cData);
			
			///write data  
			myWritesheet.addCell(myCell);
			
			myWriteBook.write();
			
			///close file  
			myWriteBook.close();
		}
		
		///data write in excel multiple  cell 
		///identify the file , identify the excel, identify the writableworkbook, identify the writable sheet, 
		///rowcount  //set row  identify the cells (label), write data save file  close file
		public static void fnWriteMultipleCols(String fileName, String sheetName, String Objective, String ExpectedResult, String ActualResult, String Status) throws WriteException, IOException, BiffException
		{
			///identify the file  
			File myfile = new   File(fileName);
			//identify the excel
			Workbook mybook=Workbook.getWorkbook(myfile);
			//identify the writable workbook
			WritableWorkbook  mywritable=Workbook.createWorkbook(myfile, mybook);
			//identify the writable sheet
			WritableSheet mywritesheet=mywritable.getSheet(sheetName);
			//row count
			int rowcount=mywritesheet.getRows();
			//set the rows
			//identify the label
			Label mycell=new Label(0, rowcount, Objective);
			//write data
			mywritesheet.addCell(mycell);
			mycell=new Label(1, rowcount, ExpectedResult);
		    //write data
			mywritesheet.addCell(mycell);
			mycell=new Label(2, rowcount, ActualResult);
			//write data
			mywritesheet.addCell(mycell);
			mycell=new Label(3, rowcount, Status);
			//write data
			mywritesheet.addCell(mycell);
			//write and save
			mywritable.write();
			//close file
			mywritable.close();
			
			
		}
			
		

	}
