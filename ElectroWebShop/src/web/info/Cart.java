package web.info;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import web.DAO.CartDao;
import web.entitites.ItemBean;

@WebServlet("/Cart")
public class Cart extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Cart() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try 
		{	
			String action = request.getParameter("action");
			if (action == null) 
			{
				doGet_DisplayCart(request, response);
			} 
			else 
			{
				if (action.equalsIgnoreCase("buy")) 
				{
					doGet_Buy(request, response);
				} 
				else if (action.equalsIgnoreCase("remove")) 
				{
					doGet_Remove(request, response);
				}
			}
		}
		
		catch (Throwable theException) 	    
		{
		     System.out.println(theException); 
		}
	}
	
	protected void doGet_DisplayCart(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		request.getRequestDispatcher("cart/index.jsp").forward(request, response);
	}
	
	@SuppressWarnings("unchecked")
	protected void doGet_Remove(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HttpSession session = request.getSession();
		List<ItemBean> cart = (List<ItemBean>) session.getAttribute("cart");
		int index = isExisting(request.getParameter("id"), cart);
		cart.remove(index);
		session.setAttribute("cart", cart);
		response.sendRedirect("cart");
	}
	
	@SuppressWarnings("unchecked")
	protected void doGet_Buy(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		CartDao cartItem = new CartDao();
		HttpSession session = request.getSession();
		
		if (session.getAttribute("cart") == null) 
		{
			List<ItemBean> cart = new ArrayList<ItemBean>();
			cart.add(new ItemBean(CartDao.find(request.getParameter("id")), 1));
			session.setAttribute("cart", cart);
		} 
		else 
		{
			List<ItemBean> cart = (List<ItemBean>) session.getAttribute("cart");
			int index = isExisting(request.getParameter("id"), cart);
			
			if (index == -1) 
			{
				cart.add(new ItemBean(CartDao.find(request.getParameter("id")), 1));
			} 
			else 
			{
				int quantity = cart.get(index).getQuantity() + 1;
				cart.get(index).setQuantity(quantity);
			}
			session.setAttribute("cart", cart);
		}
		response.sendRedirect("cart");
	}

	private int isExisting(int id, List<ItemBean> cart) 
	{
		for (int i = 0; i < cart.size(); i++) 
		{
			if (cart.get(i).getProduct().getProductID().equalsIgnoreCase(id)) 
			{
				return i;
			}
		}
		return -1;
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
