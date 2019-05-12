package web.DAO;

import web.entitites.LoginBean;
import web.entitites.PaymentBean;

import java.sql.*;

import javax.servlet.http.HttpSession;

import com.mysql.cj.Session;

public class LoginDao {
	static Connection currentCon = null;
	static ResultSet rs = null;

	public static LoginBean login(LoginBean bean) {
		Statement stmt = null;

		String username = bean.getUserID();
		String password = bean.getPassword();

		String searchQuery = "select userID, password from customer where userID='" + username + "' AND password='"
				+ password + "'";

		System.out.println("Your user name is " + username);
		System.out.println("Your password is " + password);
		System.out.println("Query: " + searchQuery);

		try {
			currentCon = DbConnection.getConnection();
			stmt = currentCon.createStatement();
			rs = stmt.executeQuery(searchQuery);
			boolean more = rs.next();

			if (!more) {
				System.out.println("Sorry, you are not a registered user! Please sign up first");
				bean.setValid(false);
			}

			else if (more) {

				System.out.println("Welcome " + username);

				bean.setValid(true);
			}
		} catch (Exception ex) {
			System.out.println("Log In failed: An Exception has occurred! " + ex);
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
				}

				rs = null;
			}

			if (stmt != null) {
				try {
					stmt.close();
				} catch (Exception e) {
				}
				stmt = null;
			}

			if (currentCon != null) {
				try {
					currentCon.close();
				} catch (Exception e) {
				}
				currentCon = null;
			}
		}

		return bean;

	}
	public static PaymentBean payment(PaymentBean pay) {
		Statement stmt = null;
	
		String cardnumber = pay.getCnumber();
		int cvc = pay.getCvc();
		int exp_month = pay.getExp_m();
		int exp_year = pay.getExp_y();
		String user = pay.getUser();
		
		String searchQuery = "select cardNumber, cardCVC, cardExpM, cardExpY, cardUserName from creditcards where cardNumber='" + cardnumber + "'and cardCVC='"+cvc+"'"
				+ "and cardExpM='"+exp_month+"'and cardExpY='"+exp_year+"'and cardUserName='"+user+"'";

		System.out.println("Your cardNumber is " +cardnumber);
		System.out.println("Query: " + searchQuery);

		try {
			currentCon = DbConnection.getConnection();
			stmt = currentCon.createStatement();
			rs = stmt.executeQuery(searchQuery);
			boolean more = rs.next();

			if (!more) {
				System.out.println("Sorry, your crad is not a registered! Please register first");
				pay.setValid(false);
			}

			else if (more) {

				System.out.println("Card is Valid " + cardnumber);

				pay.setValid(true);
			}
		} catch (Exception ex) {
			System.out.println("failed: An Exception has occurred! " + ex);
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
				}

				rs = null;
			}

			if (stmt != null) {
				try {
					stmt.close();
				} catch (Exception e) {
				}
				stmt = null;
			}

			if (currentCon != null) {
				try {
					currentCon.close();
				} catch (Exception e) {
				}
				currentCon = null;
			}
		}

		return pay;

	}
}
