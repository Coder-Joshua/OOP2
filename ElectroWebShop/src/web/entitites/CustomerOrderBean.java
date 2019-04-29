package web.entitites;

//import java.util.Date;

public class CustomerOrderBean {
	int orderID;
	int coID;
	int customerID;
	int productID;
	int orderQ;
	//Date orderDate;
	boolean payment;
	boolean deliveryStatus;
	
	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public int getCoID() {
		return coID;
	}
	public void setCoID(int coID) {
		this.coID = coID;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public int getOrderQ() {
		return orderQ;
	}
	public void setOrderQ(int orderQ) {
		this.orderQ = orderQ;
	}
	/*public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}*/
	public boolean isPayment() {
		return payment;
	}
	public void setPayment(boolean payment) {
		this.payment = payment;
	}
	public boolean isDeliveryStatus() {
		return deliveryStatus;
	}
	public void setDeliveryStatus(boolean deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}
	
	
}
