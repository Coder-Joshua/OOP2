package web.info;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import web.DAO.RegisterDao;
import web.entitites.LoginBean;
import web.entitites.RegisterBean;

@WebServlet("/Profile")
public class Profile extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Profile() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try
		{	HttpSession session = request.getSession(true);
			String name = (String) session.getAttribute("currentSessionUser");
			//LoginBean user =new LoginBean();
			
			List<RegisterBean> profile = RegisterDao.view(name);
			request.setAttribute("profile", profile);
		
			RequestDispatcher dispatcher = request.getRequestDispatcher("profile.jsp");
			dispatcher.forward(request, response);		   		    
		} 
				
		catch (Throwable theException) 	    
		{
		     System.out.println(theException); 
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
