package web.entitites;

import java.util.ArrayList;

public class ShoppingCart {
	private static ArrayList<ProductBean> items;
	
	public ShoppingCart() {
		items= new ArrayList<ProductBean>();
	}
	public void ins(ProductBean p) {
		items.add(p);
	}
	public void remove(ProductBean p) {
		items.remove(p);
	}
	public int getSize(){
		return items.size();
	}
	public ArrayList<ProductBean> getIt(){
		return items;
	}
}
