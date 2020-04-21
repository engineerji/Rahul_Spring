package com.rahul.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.rahul.service.ItemServiceImpl;

@Controller
public class ItemController {
	@Autowired
	private ItemServiceImpl serve;
	
	@GetMapping("/")
	public ModelAndView home() {
		return new ModelAndView("homepage");
	}
}
