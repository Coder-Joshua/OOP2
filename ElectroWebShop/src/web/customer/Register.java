package web.customer;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import web.DAO.RegisterDao;
import web.entitites.RegisterBean;

@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Register() 
    {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try
		{	
			 RegisterBean customer = new RegisterBean();
		     customer.setFirstName(request.getParameter("fname"));
		     customer.setLastname(request.getParameter("lname"));
		     customer.setEmail(request.getParameter("email"));
		     customer.setAddress(request.getParameter("ad"));
		     customer.setSecurityAns(request.getParameter("ans"));
		     customer.setGender(request.getParameter("g"));
		     customer.setUserID(request.getParameter("uname"));
		     customer.setPassword(request.getParameter("pass"));
		     
		     customer = RegisterDao.add(customer);
		  		     
		     HttpSession session = request.getSession(true);	    
		     session.setAttribute("currentSessionUser",customer); 
		     response.sendRedirect("login.jsp"); //logged-in page      		
		}		
		catch (Throwable theException) 	    
		{
			 response.sendRedirect("register.jsp");
		     System.out.println(theException); 
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
