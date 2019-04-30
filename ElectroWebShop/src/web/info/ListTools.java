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

/**
 * Servlet implementation class ListTools
 */
@WebServlet("/ListTools")
public class ListTools extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ListTools() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			List<ProductBean> allTools = ProductDao.findAllTools();
			request.setAttribute("allTools", allTools);
			// response.sendRedirect("phones.jsp");
			RequestDispatcher dispatcher = request.getRequestDispatcher("tools.jsp");
			dispatcher.forward(request, response);
		}

		catch (Throwable theException) {
			System.out.println(theException);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
