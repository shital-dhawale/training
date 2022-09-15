package com.stream.api1_1;

import java.time.LocalDateTime;
import java.util.Comparator;

public class Item {
	int itemId;
	String itemName;
	LocalDateTime date_of_manufacturing, date_of_expiry;
	float price;
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public LocalDateTime getDate_of_manufacturing() {
		return date_of_manufacturing;
	}
	public void setDate_of_manufacturing(LocalDateTime date_of_manufacturing) {
		this.date_of_manufacturing = date_of_manufacturing;
	}
	public LocalDateTime getDate_of_expiry() {
		return date_of_expiry;
	}
	public void setDate_of_expiry(LocalDateTime date_of_expiry) {
		this.date_of_expiry = date_of_expiry;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Item(int itemId, String itemName, LocalDateTime date_of_manufacturing, LocalDateTime date_of_expiry,
			float price) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.date_of_manufacturing = date_of_manufacturing;
		this.date_of_expiry = date_of_expiry;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", date_of_manufacturing=" + date_of_manufacturing
				+ ", date_of_expiry=" + date_of_expiry + ", price=" + price + "]";
	}
	
	
}
