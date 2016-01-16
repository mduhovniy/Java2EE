package items.copy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ItemCart {
	private List<Item> cart;
	
	public ItemCart(){
		cart=new ArrayList<Item>();
	}
	
	public void addItem(Item i){
		cart.add(i);
	}
	
	public void removeItem(String name){
		Iterator<Item> i=cart.iterator();
		while(i.hasNext()){
			Item curr=i.next();
			if(curr.getName().equals(name)){
				i.remove();
				//break;
			}
		}
	}
	
	public List<Item> getAll(){
		return cart;
	}
	
	public Item getItem(String name){
		Iterator<Item> i=cart.iterator();
		while(i.hasNext()){
			Item curr=i.next();
			if(curr.getName().equals(name)){
				return curr;
			}
		}
	    return null;
	}
}
