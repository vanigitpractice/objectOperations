package parameterization;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatareadfromDatabase {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//download sql connecter and associate with the project 
		//load mysql jdbc driver
		//create connection
		//create statement object
		//execute sql query and store in result in resultset
		 String dbURL ="jdbc:mysql://localhost:3306/facebook?useSSL=false";
		 String dbUserName="root";
		 String dbPwd ="root";
		 //load sql driver
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 
		 ///create connection  
		 Connection condb  = DriverManager.getConnection(dbURL, dbUserName, dbPwd);
		 ///create statemtn object  
		 Statement myst  = condb.createStatement();
		 
		 //// sql statement  
		 String  mySQlStatement= "Select * from facebook.createacc where FirstName  Like  'S%'";
		 
		 ///execut sql statement and store result in resultset  
		 ResultSet rs  = myst.executeQuery(mySQlStatement);
		 while(rs.next())
		 {
			 System.out.println(rs.getString("FirstName"));
			 System.out.println(rs.getString("LastName"));
			 System.out.println(rs.getString("Email"));
			 System.out.println(rs.getString("Password"));
			 System.out.println(rs.getString("DOB"));
		 }
		 
		 
		 ///close db
		 condb.close();
		

	}

}
