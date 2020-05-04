package com.qrcode.productrestservices.Items;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ItemService {

	private static List<Items> items = new ArrayList<>();
	HashMap<String, List<Items>> returnItems = new HashMap<>();
	HashMap<String, Items> returnItem = new HashMap<>();

	static {
		items.add(new Items("6308130", "Mens Swiss Automatic HyperChrome Captain Cook Blue Fabric Strap Watch 45mm",
				"Rado", 2400d, "https://slimages.macysassets.com/rado/..."));
		items.add(new Items("10923975", "Charge 4 Rosewood Band Touchscreen Smart Watch 22.6mm", "FitBit", 149.95d,
				"https://slimages.macysassets.com/fitbit/..."));
		items.add(new Items("8920018", "Unisex Galaxy Fit Black Elastomer Strap Touchscreen Smart Watch", "Samsung",
				99.99d, "https://slimages.macysassets.com/samsung/..."));
	}

	public HashMap<String, List<Items>> findAll() {

		returnItems.put("Items", items);
		return returnItems;
	}

	public HashMap<String, Items> findById(String itemId) {
		for (Items item : items) {
			// System.out.println(product.getProduct_Id());
			if (item.getProduct_Id().equals(itemId)) {
				returnItem.put("Items", item);
				return returnItem;

			}

		}

		return null;
	}

}
