package web.info;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import web.DAO.LoginDao;
import web.entitites.PaymentBean;

/**
 * Servlet implementation class Checkout
 */
@WebServlet("/Checkout")
public class Checkout extends HttpServlet {
	private static final long serialVersionUID = 1L;
	HttpSession session;
	PaymentBean p = new PaymentBean();

	public Checkout() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		session = request.getSession(true);
		String user = (String)session.getAttribute("currentSessionUser");
		try {
			p.setCnumber(request.getParameter("cnumber"));
			p.setCvc(Integer.parseInt(request.getParameter("cvc")));
			p.setExp_m(Integer.parseInt(request.getParameter("exp-month")));
			p.setExp_y(Integer.parseInt(request.getParameter("exp-year")));
			p.setUser(user);
			
			p = LoginDao.payment(p);
			if (p.isValid()) {
				session = request.getSession(true);
				session.setAttribute("cardNumber", p.getCnumber());
				session.setAttribute("shop", null);
				response.sendRedirect("checkoutValid.jsp");
				
			} else {
				response.sendRedirect("cardError.jsp"); // error page
				System.out.println("Incorrect card info. Please try again");
			}
		} catch (Throwable theException) {
			System.out.println(theException);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
