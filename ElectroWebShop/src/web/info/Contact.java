package web.info;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import web.DAO.RegisterDao;
import web.entitites.ContactBean;

/**
 * Servlet implementation class Contact
 */
@WebServlet("/Contact")
public class Contact extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Contact() {
		super();

	}

	HttpSession session;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ContactBean contact = new ContactBean();
		contact.setName(request.getParameter("Name"));
		contact.setEmail(request.getParameter("Email"));
		contact.setSubject(request.getParameter("Subject"));
		contact.setMessage(request.getParameter("Message"));

		contact = RegisterDao.add(contact);
		session = request.getSession(true);
		if (session.getAttribute("currentSessionUser") != null) {
			response.sendRedirect("home.jsp");
		} else {
			response.sendRedirect("Start.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
