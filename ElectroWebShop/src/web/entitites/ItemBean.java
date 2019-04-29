package web.entitites;

public class ItemBean {

		private ProductBean product;
		private int quantity;

		public ItemBean() {
		}

		public ItemBean(ProductBean product, int quantity) {
			this.product = product;
			this.quantity = quantity;
		}

		public ProductBean getProduct() {
			return product;
		}

		public void setProduct(ProductBean product) {
			this.product = product;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
}
