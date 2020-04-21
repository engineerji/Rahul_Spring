package com.rahul.dto;

public class Itemdto {

	private String itemName;
	private String brand;
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Itemdto [itemName=" + itemName + ", brand=" + brand + "]";
	}
	
}
