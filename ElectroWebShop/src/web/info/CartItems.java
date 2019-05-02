package web.info;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web.entitites.ItemBean;
import web.entitites.ProductBean;

/**
 * Servlet implementation class CartItems
 */
@WebServlet("/CartItems")
public class CartItems extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CartItems() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		ProductBean product = new ProductBean();
		
		ItemBean cart = new ItemBean();
		cart.setProduct(product);
		
		product.setProductID(request.getParameter("productID"));
		

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
