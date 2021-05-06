package parameterization;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.ArrayList;

public class NotepadUDF {
	////data read from notepad single line  
	///idnetify the file as inputfile, data reader  ,  buffered read  until line exist, close file
	public static String lineData;
	public static String fnReadFromNP(String fileName) throws IOException
	{
		///identify the file as input  
		FileInputStream fstream  = new FileInputStream(fileName);
		///data stream  
		DataInputStream DataS = new DataInputStream(fstream);
		
		///buffered reader
		String dataline ="";
		BufferedReader bread  = new BufferedReader(new  InputStreamReader(DataS));
		while((dataline =bread.readLine())!=null)
		{
			//print data
			//System.out.println(dataline);
			lineData=dataline;
			
			
		}
		
		DataS.close();
		return lineData;
		
	}
	
	
	
	
	
	
	////data read from notepad multiple line  
	///idnetify the file as inputfile, data reader  ,  buffered read  until line exist, close file
	public static String mlineData;
	public static ArrayList<String> fnReadFromNPMultiple(String fileName) throws IOException
	{
		///identify the file as input  
		FileInputStream fstream  = new FileInputStream(fileName);
		///data stream  
		DataInputStream DataS = new DataInputStream(fstream);
		
		///buffered reader
		String dataline ="";
		ArrayList<String> tdata  = new ArrayList<>();
		BufferedReader bread  = new BufferedReader(new  InputStreamReader(DataS));
		
		while((dataline =bread.readLine())!=null)
		{
			//print data
			//System.out.println(dataline);
			mlineData=mlineData +"\n"+ dataline;
			tdata.add(dataline);
			
			
			
			
		}
		
		DataS.close();
		return tdata;
		
	}
	
	////data write in notepad
	//identify the file,identify the writable file,buffered writer,count of line number,go to new line,write data,close file
	public static void fndataWriteinNotepad(String filename,String Ndata) throws Exception
	{
		//identify the file
		File myfile=new File(filename);
		//identify the writable file
		FileWriter myWritablefile=new FileWriter(myfile, true);
		//buffered writer
		BufferedWriter notepadwrite=new BufferedWriter(myWritablefile);
		//count of line number
		LineNumberReader lineread=new LineNumberReader(new FileReader(myfile));
		for(int i=1; i<=lineread.getLineNumber(); i++)
		{
			notepadwrite.newLine();
		}
		//add new line  
		notepadwrite.newLine();
		
		///write data  
		 notepadwrite.write(Ndata);
		 //close file  
		 notepadwrite.close();
				
	}
	
	

}
