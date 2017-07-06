package com.mivim.admin.dto;

public class AdminAddItemDto {
	
	private int itemId; 
	private int unitPrice; 
	private int inventary;
	private int status; 
	private String itemName; 
	private String itemDescription; 
	
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public int getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getInventary() {
		return inventary;
	}
	public void setInventary(int inventary) {
		this.inventary = inventary;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
}
