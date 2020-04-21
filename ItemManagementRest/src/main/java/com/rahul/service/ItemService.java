package com.rahul.service;

import java.util.List;

import com.rahul.entities.Item;

public interface ItemService {
	void addItem(Item item);
	void updateItem(Item item);
	List<Item> fetchAll();
	Item findItem(int id);
	boolean removeItem(int id);
}
