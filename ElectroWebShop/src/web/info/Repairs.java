package web.info;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web.DAO.RegisterDao;
import web.entitites.*;
@WebServlet("/Repairs")
public class Repairs extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Repairs() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		RepairBean repairs = new RepairBean();
		repairs.setName(request.getParameter("name"));
		repairs.setEmail(request.getParameter("email"));
		repairs.setAddress(request.getParameter("address"));
		repairs.setDescription(request.getParameter("description"));
		
		
		
		repairs = RegisterDao.add(repairs);
		response.sendRedirect("repairs-added.jsp");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
