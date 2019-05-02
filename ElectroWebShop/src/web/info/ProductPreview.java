package web.info;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import web.DAO.ProductDao;
import web.entitites.ProductBean;

import java.util.List;

@WebServlet("/ProductPreview")
public class ProductPreview extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ProductPreview() {
		super();

	}

	HttpSession session;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		session = request.getSession(true);
		String action = (String) session.getAttribute("action");

		switch (action) {
		case "Asus":
			List<ProductBean> search = ProductDao.find("Asus");
			request.setAttribute("search", search);
			RequestDispatcher dispatcher = request.getRequestDispatcher("itemPreview.jsp");
			dispatcher.forward(request, response);
			break;
		case "Alienware":
			List<ProductBean> search1 = ProductDao.find("Alienware");
			request.setAttribute("search", search1);
			RequestDispatcher dispatcher1 = request.getRequestDispatcher("itemPreview.jsp");
			dispatcher1.forward(request, response);
			break;
		case "HP":
			List<ProductBean> search2 = ProductDao.find("HP Omen");
			request.setAttribute("search", search2);
			RequestDispatcher dispatcher2 = request.getRequestDispatcher("itemPreview.jsp");
			dispatcher2.forward(request, response);
			break;
		case "Acer":
			List<ProductBean> search3 = ProductDao.find("Acer");
			request.setAttribute("search", search3);
			RequestDispatcher dispatcher3 = request.getRequestDispatcher("itemPreview.jsp");
			dispatcher3.forward(request, response);
			break;
		case "Xbox":
			List<ProductBean> search4 = ProductDao.find("Xbox One");
			request.setAttribute("search", search4);
			RequestDispatcher dispatcher4 = request.getRequestDispatcher("itemPreview.jsp");
			dispatcher4.forward(request, response);
			break;
		case "Playstation":
			List<ProductBean> search5 = ProductDao.find("Playstation");
			request.setAttribute("search", search5);
			RequestDispatcher dispatcher5 = request.getRequestDispatcher("itemPreview.jsp");
			dispatcher5.forward(request, response);
			break;
		case "Elegoo":
			List<ProductBean> search6 = ProductDao.find("Elegoo");
			request.setAttribute("search", search6);
			RequestDispatcher dispatcher6 = request.getRequestDispatcher("itemPreview.jsp");
			dispatcher6.forward(request, response);
			break;
		case "EVGA":
			List<ProductBean> search7 = ProductDao.find("EVGA GTX 1080");
			request.setAttribute("search", search7);
			RequestDispatcher dispatcher7 = request.getRequestDispatcher("itemPreview.jsp");
			dispatcher7.forward(request, response);
			break;
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
