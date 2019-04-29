package web.entitites;

public class StockBean {
	int productID;
	int availableStock;
	int preOrderQ;
	
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public int getAvailableStock() {
		return availableStock;
	}
	public void setAvailableStock(int availableStock) {
		this.availableStock = availableStock;
	}
	public int getPreOrderQ() {
		return preOrderQ;
	}
	public void setPreOrderQ(int preOrderQ) {
		this.preOrderQ = preOrderQ;
	}
}
