package project;
import java.sql.*;
public class ConnectionProvider {
	public static Connection getCon()
	{
		Connection con=null;
		System.out.println(con);
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecom1","root","root");
			 return con;
		}
		catch (Exception e) 
		{
			e.getStackTrace();
		}	
		return con;
	}
}
