package com.orderfood.model;

public class Menu {
	
	private String itemId;
	private String itemName;
	private String description;
	private String itemType;
	private String price;
	
	public Menu() {
		
	}
	
	public Menu(String itemId, String itemName, String description, String itemType, String price) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.description = description;
		this.itemType = itemType;
		this.price = price;
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getItemType() {
		return itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Menu [itemId=" + itemId + ", itemName=" + itemName + ", description=" + description + ", itemType="
				+ itemType + ", price=" + price + "]";
	}

	
	
}
