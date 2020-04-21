package com.rahul.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rahul.dao.ItemDaoImpl;
import com.rahul.entities.Item;

@Service
public class ItemServiceImpl implements ItemService{
	
	private ItemDaoImpl itemdao;
	

	public ItemDaoImpl getItemdao() {
		return itemdao;
	}
	
	@Autowired
	public void setItemdao(ItemDaoImpl itemdao) {
		this.itemdao = itemdao;
	}

	@Override
	public void addItem(Item item) {
		itemdao.addItem(item);
	}

	@Override
	public void updateItem(Item item) {
		itemdao.updateItem(item);
		
	}

	@Override
	public List<Item> fetchAll() {
		List<Item> itemList = itemdao.fetchAll();
		return itemList;
	}

	@Override
	public Item findItem(int id) {
		Item item = itemdao.findItem(id);
		return item;
	}

	@Override
	public boolean removeItem(int id) {
		boolean result = itemdao.removeItem(id);
		return result;
	}

}
