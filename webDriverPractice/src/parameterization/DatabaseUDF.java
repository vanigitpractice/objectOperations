package parameterization;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseUDF {
	///data read from database  
	//// load  sql driver, create connection  ( url  ,  username, pwd) create statement and sql statement   , create resultset and execute query  nt
	//return resultset  
	
	public static  ResultSet rs; 
	public static ResultSet fnReadFromDB(String DriverName, String dbURL, String dbUserName, String dbPwd,String sqlstatement) throws ClassNotFoundException, SQLException
	{
		
		///load driver  
		Class.forName(DriverName);
		
		///create connection 
		Connection  dbcon  = DriverManager.getConnection(dbURL, dbUserName, dbPwd);
		
		///create statment  
		Statement myStatement  = dbcon.createStatement();
		///execute sql statement  
		 rs = myStatement.executeQuery(sqlstatement);
		
		
		
		 return  rs;
	}
	

}
