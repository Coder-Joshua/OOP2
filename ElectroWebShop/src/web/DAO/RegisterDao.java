package web.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import web.entitites.ContactBean;
import web.entitites.CreditCardBean;
import web.entitites.RegisterBean;
import web.entitites.RepairBean;
import web.entitites.SubscribeBean;

public class RegisterDao {

	static Connection currentCon = null;

	public static RegisterBean add(RegisterBean customer) {
		Statement stmt = null;

		String addQuery = "insert into customer (firstName, lastName, adress, email, gender, securityAns, userID, password) values('"
				+ customer.getFirstName() + "', '" + customer.getLastname() + "', '" + customer.getAddress() + "', '"
				+ customer.getEmail() + "', '" + customer.getGender() + "', '" + customer.getSecurityAns() + "', '"
				+ customer.getUserID() + "', '" + customer.getPassword() + "')";
		try {
			currentCon = DbConnection.getConnection();
			stmt = currentCon.createStatement();
			stmt.executeUpdate(addQuery);
			currentCon.close();
		} catch (Exception ex) {
			System.out.println("Register failed: An Exception has occurred! " + ex);
		}

		return customer;
	}

	public static RepairBean add(RepairBean repairs) {
		Statement stmt = null;

		String repairsQuery = "insert into repairs (Name,Email,Address,RepairDescription) values('" + repairs.getName()
				+ "', '" + repairs.getEmail() + "', '" + repairs.getAddress() + "', '" + repairs.getDescription()
				+ "')";
		try {
			currentCon = DbConnection.getConnection();
			stmt = currentCon.createStatement();
			stmt.executeUpdate(repairsQuery);
			currentCon.close();
		} catch (Exception ex) {
			System.out.println("Registery of repairs form failed: An Exception has occurred! " + ex);
		}
		System.out.println("Query addded succesfully");
		return repairs;

	}

	public static SubscribeBean add(SubscribeBean subscribe) {
		Statement stmt = null;

		String subscribeQuery = "insert into subscriptions (email) values('" + subscribe.getEmail() + "')";
		try {
			currentCon = DbConnection.getConnection();
			stmt = currentCon.createStatement();
			stmt.executeUpdate(subscribeQuery);
			currentCon.close();
		} catch (Exception ex) {
			System.out.println("Registery of repairs form failed: An Exception has occurred! " + ex);
		}
		System.out.println("Query added succesfully");
		return subscribe;

	}

	public static ContactBean add(ContactBean contact) {
		Statement stmt = null;
		

		String contactQuery = "insert into contact (Name,Email,Subject,Message) values('" + contact.getName() + "','"
				+ contact.getEmail() + "','" + contact.getSubject() + "','" + contact.getMessage() + "')";
		try {
			currentCon = DbConnection.getConnection();
			stmt = currentCon.createStatement();
			stmt.executeUpdate(contactQuery);
			currentCon.close();
		} catch (Exception ex) {
			System.out.println("Registery of contact details failed: An Exception has occurred! " + ex);
		}
		System.out.println("Query added succesfully");
		return contact;
	}

	public static CreditCardBean add(CreditCardBean creditcard) {
		Statement stmt = null;
		String CreditcardQuery = "insert into creditcards(cardNumber,cardCVC,cardExpM,cardExpY,cardUserName) values('"
				+ creditcard.getCardNumber() + "','" + creditcard.getCardcvc() + "','" + creditcard.getExp_month() + "','"+creditcard.getExp_year()+"','"+creditcard.getUser()+"')";
		try {
			currentCon = DbConnection.getConnection();
			stmt = currentCon.createStatement();
			stmt.executeUpdate(CreditcardQuery);
			currentCon.close();
		} catch (Exception ex) {
			System.out.println("Adding creditcard to database failed!");
		}
		System.out.println("CreditCard added succesfully to Database!");
		return creditcard;

	}

	public static List<RegisterBean> view(String userID) {

		List<RegisterBean> customer = new ArrayList<>();
		Statement stmt = null;
		String viewQuery = "select firstName,lastname,adress,email,gender from customer where userID='" + userID + "'";
		try {
			currentCon = DbConnection.getConnection();
			stmt = currentCon.createStatement();
			ResultSet result = stmt.executeQuery(viewQuery);
			while (result.next()) {
				RegisterBean acc = new RegisterBean();
				acc.setFirstName(result.getString("firstName"));
				acc.setLastname(result.getString("lastName"));
				acc.setAddress(result.getString("adress"));
				acc.setEmail(result.getString("email"));
				acc.setGender(result.getString("gender"));
				customer.add(acc);
			}

			currentCon.close();
		} catch (Exception ex) {
			System.out.println("Failed: An Exception has occurred! " + ex);
		}

		return customer;
	}
}
