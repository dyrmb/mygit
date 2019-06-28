package com.jt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jt.service.Itemservice;
import com.jt.vo.EasyUIData;

/***
 * http://localhost:8091/item/query?page=1&rows=20
 * 
 * 
 * 
 * */
@RestController
@RequestMapping("/item")
public class ItemController {
	@Autowired
	private Itemservice itemService;
	
	@RequestMapping("/query")
public EasyUIData findItem(Integer page,Integer rows) {
		return itemService.findItem(page,rows);
		
}
	
}
