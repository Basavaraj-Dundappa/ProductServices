package com.qrcode.productrestservices.Products;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	private static List<Products> products = new ArrayList<>();
	HashMap<String, List<Products>> returnProducts = new HashMap<>();
	HashMap<String, Products> returnProduct = new HashMap<>();

	static {
		products.add(new Products("6308130",
				"Mens Swiss Automatic HyperChrome Captain Cook Blue Fabric Strap Watch 45mm", "Single item", "Rado",
				"A hardened titanium body and blue fabric strap are durable accompaniments", 2400d, 45, "Watches",
				"Blue", "https://slimages.macysassets.com/rado/...", "Extra 25% off use: FORYOU"));
		products.add(new Products("10923975", "Charge 4 Rosewood Band Touchscreen Smart Watch 22.6mm", "Single item",
				"Fitbit", "With Fitbit Charge 4, there's no limit to how far you can go ", 149.95d, 22, "Watches",
				"Black", "https://slimages.macysassets.com/fitbit/...", "$29.99 Diamond Bonus Buy"));
		products.add(new Products("8920018", "Unisex Galaxy Fit Black Elastomer Strap Touchscreen Smart Watch",
				"Single item", "Samsung",
				"Samsung's sleek touchscreen smart watch will appeal to your practical nature with a host of features",
				99.99d, 95, "Watches", "Black", "https://slimages.macysassets.com/samsung/...",
				"$29.99 Diamond Bonus Buy"));

	}

	public HashMap<String, List<Products>> findAll() {

		returnProducts.put("Products", products);
		return returnProducts;
	}

	public HashMap<String, Products> findById(String productId) {
		for (Products product : products) {
			if (product.getProduct_Id().equals(productId)) {
				returnProduct.put("Products", product);
				return returnProduct;

			}

		}

		return null;
	}

}
