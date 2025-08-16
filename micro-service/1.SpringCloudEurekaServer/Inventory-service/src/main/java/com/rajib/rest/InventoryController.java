package com.rajib.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

	@Value("${server.port}")
	private String port;
	
	@GetMapping("/items")
	public List<String> items(){
		return List.of("book","pen","pencil","served-by :: "+port);
	}
}
