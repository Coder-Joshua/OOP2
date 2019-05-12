package web.entitites;

public class CreditCardBean {
	String CardNumber;
	int Cardcvc;
	int exp_year;
	int exp_month;
	String User;
	
	public void setCardcvc(int cardcvc) {
		Cardcvc = cardcvc;
	}
	public int getCardcvc() {
		return Cardcvc;
	}
	public void setCardNumber(String cardNumber) {
		CardNumber = cardNumber;
	}
	public String getCardNumber() {
		return CardNumber;
	}
	public void setExp_month(int exp_month) {
		this.exp_month = exp_month;
	}
	public int getExp_month() {
		return exp_month;
	}
	public void setExp_year(int exp_year) {
		this.exp_year = exp_year;
	}
	public int getExp_year() {
		return exp_year;
	}
	public void setUser(String user) {
		User = user;
	}
	public String getUser() {
		return User;
	}
}
