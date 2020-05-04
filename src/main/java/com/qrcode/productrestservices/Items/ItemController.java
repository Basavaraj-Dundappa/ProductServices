package com.qrcode.productrestservices.Items;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class ItemController {

	@Autowired
	private ItemService itemService;

	@GetMapping("/allitems")
	public HashMap<String, List<Items>> getAllTodos() {
		return itemService.findAll();

	}

	@GetMapping("/allitems/{itemId}")
	public HashMap<String, Items> getOneProduct(@PathVariable String itemId) {
		return itemService.findById(itemId);

	}

}
