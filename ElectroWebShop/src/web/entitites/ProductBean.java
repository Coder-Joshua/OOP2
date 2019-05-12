package web.entitites;

public class ProductBean 
{
	int productID;
	String productName;
	int productCategoryId;
	float productPrice;
	String productDetails;
	int brandID;
	String base64image;
	
	public ProductBean(){
	}
	
	public ProductBean(int productID, String productName, String base64image, float productPrice) 
	{
		this.productID = productID;
		this.productName = productName;
		this.productPrice = productPrice;
		this.base64image= base64image;
	}

	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductCategoryId() {
		return productCategoryId;
	}
	public void setProductCategoryId(int productCategoryId) {
		this.productCategoryId = productCategoryId;
	}
	public float getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductDetails() {
		return productDetails;
	}
	public void setProductDetails(String productDetails) {
		this.productDetails = productDetails;
	}
	public int getBrandID() {
		return brandID;
	}
	public void setBrandID(int brandID) {
		this.brandID = brandID;
	}
	public String getBase64image() {
		return base64image;
	}
	public void setBase64image(String base64image) {
		this.base64image = base64image;
	}

	
	
}
