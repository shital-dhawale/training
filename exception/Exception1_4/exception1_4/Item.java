package com.exception1_4;

public class Item {
	String itemname;
	int price;
	int maxNumberOfItemCanBought;
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getMaxNumberOfItemCanBought() {
		return maxNumberOfItemCanBought;
	}
	public void setMaxNumberOfItemCanBought(int maxNumberOfItemCanBought) {
		this.maxNumberOfItemCanBought = maxNumberOfItemCanBought;
	}
	public Item(String itemname, int price, int maxNumberOfItemCanBought) {
		super();
		this.itemname = itemname;
		this.price = price;
		this.maxNumberOfItemCanBought = maxNumberOfItemCanBought;
	}
	@Override
	public String toString() {
		return "Item [itemname=" + itemname + ", price=" + price + ", maxNumberOfItemCanBought="
				+ maxNumberOfItemCanBought + "]";
	}
	

}
