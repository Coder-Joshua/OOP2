package web.info;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Base64;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import web.DAO.DbConnection;
import web.DAO.RegisterDao;
import web.entitites.ProductBean;
import web.entitites.ShoppingCart;


/**
 * Servlet implementation class SetDetails
 */
@WebServlet("/SetDetails")
public class SetDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SetDetails() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		ShoppingCart shop = (ShoppingCart) session.getAttribute("shop");
		if(shop == null){
			shop = new ShoppingCart();
			session.setAttribute("shop", shop);
		}
		String name = request.getParameter("product");
		Connection cn = DbConnection.getConnection();
		InputStream inputStream = null;
		OutputStream outputStream = null;
		try {
			Statement st= cn.createStatement();
			ResultSet rs= st.executeQuery("select * from product where productID="+name+"");
			while(rs.next()) {
				ProductBean p = new ProductBean();
				p.setProductID(rs.getInt(1));
				p.setProductName(rs.getString(2));
				p.setProductDetails(rs.getString(5));
				p.setProductPrice(rs.getFloat(4));
				
				Blob blob = rs.getBlob(6);
				inputStream = blob.getBinaryStream();
				outputStream = new ByteArrayOutputStream();
				byte[] buffer = new byte[4096];
				int bytesRead = -1;

				while ((bytesRead = inputStream.read(buffer)) != -1) {
					outputStream.write(buffer, 0, bytesRead);
				}

				byte[] imageBytes = ((ByteArrayOutputStream) outputStream).toByteArray();
				String base64Image = Base64.getEncoder().encodeToString(imageBytes);
				p.setBase64image(base64Image);
				
				
				System.out.println(p.getProductName()+":"+p.getProductPrice());
				shop.ins(p);
				response.sendRedirect("viewcart.jsp");
			}
			
		}catch(SQLException ex){
			ex.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
