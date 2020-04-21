package com.rahul.dao;


import java.util.List;

import com.rahul.entities.Item;

public interface ItemDao {

	void addItem(Item item);
	void updateItem(Item item);
	List<Item> fetchAll();
	Item findItem(int id);
	boolean removeItem(int id);
}
