package web.DAO;

import web.entitites.LoginBean;

import java.sql.*;

public class LoginDao 
{
	static Connection currentCon = null;
	static ResultSet rs = null;  
	public static LoginBean login(LoginBean bean) 
	{
	         Statement stmt = null;    
		
	         String username = bean.getUserID();    
	         String password = bean.getPassword();   
		    
	         String searchQuery =
	               "select userID, password from customer where userID='"
	                        + username
	                        + "' AND password='"
	                        + password
	                        + "'";

	      System.out.println("Your user name is " + username);          
	      System.out.println("Your password is " + password);
	      System.out.println("Query: "+searchQuery);
		    
	      try 
	      {
	         currentCon = DbConnection.getConnection();
	         stmt=currentCon.createStatement();
	         rs = stmt.executeQuery(searchQuery);	        
	         boolean more = rs.next();
		  
	         if (!more) 
	         {
	            System.out.println("Sorry, you are not a registered user! Please sign up first");
	            bean.setValid(false);
	         } 
		        
	         else if (more) 
	         {
	            /*String firstName = rs.getString("FirstName");
	            String lastName = rs.getString("LastName");*/
		     	
	            System.out.println("Welcome " + username);
	           /* bean.setFirstName(firstName);
	            bean.setLastName(lastName);*/
	            bean.setValid(true);
	         }
	      }
	      catch (Exception ex) 
	      {
	         System.out.println("Log In failed: An Exception has occurred! " + ex);
	      } 
	      finally 
	      {
	         if (rs != null)	
	         {
	            try 
	            {
	               rs.close();
	            } 
	            catch (Exception e) {
	            }
	            
	            rs = null;
	         }
		
	         if (stmt != null) 
	         {
	            try 
	            {
	               stmt.close();
	            } 
	            catch (Exception e) {
	            }
	            stmt = null;
	            }
		
	         if (currentCon != null) 
	         {
	            try 
	            {
	               currentCon.close();
	            } 
	            catch (Exception e) {
	            }
	            currentCon = null;
	         }
	      }

	return bean;
		
	}	
}


