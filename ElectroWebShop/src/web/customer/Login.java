package web.customer;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import web.DAO.LoginDao;
import web.entitites.LoginBean;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	HttpSession session;
	LoginBean user = new LoginBean();

	public Login() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			user.setUserID(request.getParameter("uname"));
			user.setPassword(request.getParameter("password"));

			user = LoginDao.login(user);

			if (user.isValid()) {
				session = request.getSession(true);
				session.setAttribute("currentSessionUser", user.getUserID());
				response.sendRedirect("home.jsp"); // logged-in page
			}

			else {
				response.sendRedirect("loginError.jsp"); // error page\
				System.out.println("Incorrect login. Please try again");
			}
		}

		catch (Throwable theException) {
			System.out.println(theException);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
