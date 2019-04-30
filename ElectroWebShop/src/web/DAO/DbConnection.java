package web.DAO;

import java.sql.*;

public class DbConnection 
{
	static Connection con;
	static String url;
	            
	public static Connection getConnection()
	{
		try
	    {
			String url = "jdbc:mysql://localhost:3306/estore"; 
	        Class.forName("com.mysql.cj.jdbc.Driver");
	            
	            try
	            {            	
	               con = DriverManager.getConnection(url,"root","root");      
	            }
	            
	            catch (SQLException ex)
	            {
	               ex.printStackTrace();
	            }
	    }
		catch(ClassNotFoundException e)
	    {
			System.out.println(e);
	    }

		return con;
	}
}
