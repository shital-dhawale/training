package com.exception1_4;

public class ItemBought {
	int itemid;
	int itemqty;
	public int getItemid() {
	    return itemid;
	}
	public void setItemid(int itemid) {
	    this.itemid = itemid;
	}
	public int getItemqty() {
	    return itemqty;
	}
	public void setItemqty(int itemqty) {
	    this.itemqty = itemqty;
	}



	public ItemBought(int itemid, int itemqty) {
	    super();
	    this.itemid = itemid;
	    this.itemqty = itemqty;
	}
	@Override
	public String toString() {
	    return "ItemBought [itemid=" + itemid + ", itemqty=" + itemqty + "]";
	}


}
