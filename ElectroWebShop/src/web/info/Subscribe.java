package web.info;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import web.DAO.RegisterDao;
import web.entitites.SubscribeBean;

/**
 * Servlet implementation class Subscribe
 */
@WebServlet("/Subscribe")
public class Subscribe extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Subscribe() {
		super();

	}

	HttpSession session;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		SubscribeBean subscribe = new SubscribeBean();
		subscribe.setEmail(request.getParameter("email"));

		subscribe = RegisterDao.add(subscribe);
		
		session = request.getSession(true);
		if (session.getAttribute("currentSessionUser") != null ) {
			response.sendRedirect("home.jsp");
		}else { response.sendRedirect("Start.jsp");}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
