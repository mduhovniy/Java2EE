package items.copy;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Item {
	private String name;
	private float price;
	
	public Item(){}
	
	public Item(String name, float price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public boolean equals(Object o) {
		if(o instanceof Item)
		return name.equals(((Item)o).getName().equals(name)&&((Item)o).getPrice()==price);
		throw new ClassCastException();
	}
	@Override
	public String toString() {
		return "Item: "+name+" "+price;
	}
	
}
