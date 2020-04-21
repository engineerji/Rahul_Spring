package com.rahul.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.rahul.entities.Item;

@Repository
public class ItemDaoImpl implements ItemDao{

	private Map<Integer, Item> store= new HashMap<Integer, Item>();
	
	@Override
	public void addItem(Item item) {
		int id= generateId();
		item.setItemId(id);
		store.put(id,item);
		System.out.println("Added");
	}

	@Override
	public void updateItem(Item item) {
		store.replace(item.getItemId(), item);
		
	}

	@Override
	public List<Item> fetchAll() {
		Collection<Item> collect=store.values();
		List<Item> itemList = new ArrayList<Item>(collect);
		return itemList;
	}

	@Override
	public Item findItem(int id) {
		Item item =  store.get(id);
		return item;
	}

	@Override
	public boolean removeItem(int id) {
		store.remove(id);
		return true;
		
	}
	private int id;
	public int generateId() {
		id++;
		return id;
	}

}
