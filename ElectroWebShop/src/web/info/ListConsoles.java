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

@WebServlet("/ListConsoles")
public class ListConsoles extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ListConsoles() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try
		{	    
			List<ProductBean> allConsoles = ProductDao.findAllConsoles();
			request.setAttribute("allConsoles", allConsoles);
			//response.sendRedirect("phones.jsp");
			RequestDispatcher dispatcher = request.getRequestDispatcher("consoles.jsp");
			dispatcher.forward(request, response);		   		    
		} 
				
		catch (Throwable theException) 	    
		{
		     System.out.println(theException); 
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
