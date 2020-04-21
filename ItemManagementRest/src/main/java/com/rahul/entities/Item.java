package com.rahul.entities;

public class Item {

	private int itemId;
	private String name;
	private String brand;
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", name=" + name + ", brand=" + brand + "]";
	}
	
}
