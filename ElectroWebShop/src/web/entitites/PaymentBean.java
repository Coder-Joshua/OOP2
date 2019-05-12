package web.entitites;

public class PaymentBean {
	String cnumber;
	int cvc;
	int exp_y;
	int exp_m;
	String User;
	boolean isValid;
	
	public void setCnumber(String cnumber) {
		this.cnumber = cnumber;
	}
	public String getCnumber() {
		return cnumber;
	}
	public void setCvc(int cvc) {
		this.cvc = cvc;
	}
	public int getCvc() {
		return cvc;
	}
	public void setExp_m(int exp_m) {
		this.exp_m = exp_m;
	}
	public int getExp_m() {
		return exp_m;
	}
	public void setExp_y(int exp_y) {
		this.exp_y = exp_y;
	}
	public int getExp_y() {
		return exp_y;
	}
	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}
	public boolean isValid() {
		return isValid;
	}
	public void setUser(String user) {
		User = user;
	}
	public String getUser() {
		return User;
	}
	
}
