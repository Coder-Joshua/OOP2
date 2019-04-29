package web.info;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import web.DAO.ProductDao;
import web.entitites.ProductBean;

@WebServlet("/ListPhones")
public class ListPhones extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

    public ListPhones() 
    {    	
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try
		{	    
			List<ProductBean> allPhones = ProductDao.findAllPhones();
			request.setAttribute("allPhones", allPhones);
			//response.sendRedirect("phones.jsp");
			RequestDispatcher dispatcher = request.getRequestDispatcher("phones.jsp");
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
