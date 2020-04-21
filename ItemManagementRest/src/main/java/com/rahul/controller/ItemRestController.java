package com.rahul.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rahul.dto.Itemdto;
import com.rahul.entities.Item;
import com.rahul.service.ItemServiceImpl;

@RestController
public class ItemRestController {

	@Autowired
	private ItemServiceImpl serviceimpl;
	
	@PostMapping("/items/add")
	public ResponseEntity<Item> addItem(@RequestBody Itemdto itemdto){
		Item item = convert(itemdto);
		serviceimpl.addItem(item);
		ResponseEntity<Item> response = new ResponseEntity<Item>(item,HttpStatus.OK);
		return response;
	}
	
	@GetMapping("/itemslist")
	public ResponseEntity<List<Item>> fetchAllItem(){
		List<Item> itemList = serviceimpl.fetchAll();
		System.out.println(itemList);
		ResponseEntity<List<Item>> response = new ResponseEntity<List<Item>>(itemList,HttpStatus.OK);
		return response;
	}
	
	@GetMapping("/items/find/{id}")
    public ResponseEntity<Item>findById(@PathVariable("id") int id){
     Item item=serviceimpl.findItem(id);
     ResponseEntity<Item>response=new ResponseEntity<>(item,HttpStatus.OK);
     return response;
    }

    @PutMapping("/items/update/{id}")
    public ResponseEntity<Item>update(@RequestBody Itemdto dto, @PathVariable("id") int id){
        Item item=convert(dto);
        item.setItemId(id);
        serviceimpl.updateItem(item);
        ResponseEntity<Item>response=new ResponseEntity<>(item,HttpStatus.OK);
        return response;
    }

    @DeleteMapping("/items/delete/{id}")
    public ResponseEntity<Boolean>delete(@PathVariable("id")int id){
        boolean result= serviceimpl.removeItem(id);
        ResponseEntity<Boolean>response=new ResponseEntity<>(result,HttpStatus.OK);
        return response;
    }
	
	  public Item convert(Itemdto dto){
	       	Item item =new Item();
	        item.setName(dto.getItemName());
	        item.setBrand(dto.getBrand());
	        return item;
	    }
}
