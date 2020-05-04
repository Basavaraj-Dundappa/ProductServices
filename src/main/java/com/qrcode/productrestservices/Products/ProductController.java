package com.qrcode.productrestservices.Products;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping("/allproducts")
	public HashMap<String, List<Products>> getAllTodos() {
		return productService.findAll();

	}

	@GetMapping("/allproducts/{productId}")
	public HashMap<String, Products> getOneProduct(@PathVariable String productId) {
		return productService.findById(productId);

	}

}
