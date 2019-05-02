package web.DAO;

import web.entitites.ProductBean;
import web.entitites.SetDetails;
import web.entitites.ShoppingCartBean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class CartDao 
{
	private HashMap <String, ShoppingCartBean> items	= null;
	int numberOfItems	= 0;

	public CartDao() 
	{
		items = new HashMap<String, ShoppingCartBean>();
	}

	public synchronized void add(String itemID, SetDetails setItems) 
	{
		if (items.containsKey(itemID)) 
		{
			ShoppingCartBean scitem = (ShoppingCartBean) items.get(itemID);
			scitem.incrementQuantity();
			System.out.println("quantity  " + scitem.getQuantity());
		} 
		else 
		{
			ShoppingCartBean newItem = new ShoppingCartBean(setItems);
			items.put(itemID, newItem);
			System.out.println("quantity is " + newItem.getQuantity());
		}
	}

	public synchronized List<ShoppingCartBean> getItems() 
	{
		List<ShoppingCartBean> results = new ArrayList<ShoppingCartBean>();
		results.addAll(this.items.values());

		return results;
	}

	public synchronized int getNumberOfItems() 
	{
		numberOfItems = 0;

		for (Iterator<ShoppingCartBean> i = getItems().iterator(); i.hasNext();) 
		{
			ShoppingCartBean item = i.next();
			numberOfItems += item.getQuantity();
			//System.out.println("number of items is " + numberOfItems);
		}

		return numberOfItems;
	}

	public synchronized void remove(String itemID) 
	{
		if (items.containsKey(itemID)) 
		{
			ShoppingCartBean scitem = (ShoppingCartBean) items.get(itemID);
			scitem.decrementQuantity();

			if (scitem.getQuantity() <= 0) 
			{
				items.remove(itemID);
			}

			numberOfItems--;
		}
	}

	public synchronized void clear() 
	{
		System.err.println("Clearing cart.");
		items.clear();
		numberOfItems = 0;
	}

	public synchronized double getTotal() 
	{	
		double amount = 0.0;
				
		for(Iterator<ShoppingCartBean> i = getItems().iterator();i.hasNext();) 
		{
			ShoppingCartBean item = (ShoppingCartBean)i.next();
			SetDetails s = (SetDetails)item.getItems();
				
			amount += (item.getQuantity() * s.getSetPrice());
		}
		return amount;
	}

	public static ProductBean find(String parameter) {
		// TODO Auto-generated method stub
		return null;
	}
}

			

